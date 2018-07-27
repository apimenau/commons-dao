/*
 *
 *  * Copyright (C) 2018 EPAM Systems
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  * http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.epam.ta.reportportal.filesystem.distributed;

import com.epam.ta.reportportal.exception.ReportPortalException;
import com.github.dockerjava.api.command.CreateContainerCmd;
import com.github.dockerjava.api.model.PortBinding;
import com.google.common.base.Charsets;
import org.apache.commons.io.IOUtils;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Ignore;
import org.junit.Test;
import org.lokra.seaweedfs.core.FileSource;
import org.testcontainers.containers.GenericContainer;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.util.function.Consumer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@Ignore
public class SeaweedDataStoreTest {

	private static final String TEST_FILE = "test-file.txt";

	private SeaweedDataStore dataStore;
	private static final Integer port = getFreePort();
	@ClassRule
	public static GenericContainer seaweedMaster = new GenericContainer("chrislusf/seaweedfs:latest").withCommand(
			String.format("server -master.port=%d", port)).withCreateContainerCmdModifier(new Consumer<CreateContainerCmd>() {
		@Override
		public void accept(CreateContainerCmd cmd) {
			cmd.withHostName("localhost");
			cmd.withPortBindings(PortBinding.parse("0.0.0.0:" + port + ":" + port));
		}
	});

	@Before
	public void setUp() throws Exception {

		FileSource fileSource = new FileSource();

		fileSource.setHost(seaweedMaster.getContainerIpAddress());
		fileSource.setPort(port);
		fileSource.startup();

		dataStore = new SeaweedDataStore(fileSource);

	}

	@Test
	public void save_load_delete() throws Exception {

		String savedFilePath = dataStore.save(TEST_FILE, new ByteArrayInputStream("test text".getBytes(Charsets.UTF_8)));

		//		and: load it back
		InputStream loaded = dataStore.load(savedFilePath);

		//		then: saved and loaded files should be the same
		byte[] bytes = IOUtils.toByteArray(loaded);
		String result = new String(bytes, Charsets.UTF_8);
		assertEquals("saved and loaded files should be the same", "test text", result);

		//		when: delete saved file
		dataStore.delete(savedFilePath);

		//		and: load file again
		boolean isNotFound = false;
		try {

			dataStore.load(savedFilePath);
		} catch (ReportPortalException e) {

			isNotFound = true;
		}

		//		then: deleted file should not be found
		assertTrue("deleted file should not be found", isNotFound);
	}

	private static Integer getFreePort() {
		try {
			return new ServerSocket(0).getLocalPort();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}