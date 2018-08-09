/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.jooq.tables;


import com.epam.ta.reportportal.jooq.Indexes;
import com.epam.ta.reportportal.jooq.JPublic;
import com.epam.ta.reportportal.jooq.Keys;
import com.epam.ta.reportportal.jooq.tables.records.JProjectRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JProject extends TableImpl<JProjectRecord> {

    private static final long serialVersionUID = -1050323661;

    /**
     * The reference instance of <code>public.project</code>
     */
    public static final JProject PROJECT = new JProject();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JProjectRecord> getRecordType() {
        return JProjectRecord.class;
    }

    /**
     * The column <code>public.project.id</code>.
     */
    public final TableField<JProjectRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('project_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.project.name</code>.
     */
    public final TableField<JProjectRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>public.project.additional_info</code>.
     */
    public final TableField<JProjectRecord, String> ADDITIONAL_INFO = createField("additional_info", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>public.project.creation_date</code>.
     */
    public final TableField<JProjectRecord, Timestamp> CREATION_DATE = createField("creation_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<JProjectRecord, Object> METADATA = createField("metadata", org.jooq.impl.DefaultDataType.getDefaultDataType("jsonb"), this, "");

    /**
     * Create a <code>public.project</code> table reference
     */
    public JProject() {
        this(DSL.name("project"), null);
    }

    /**
     * Create an aliased <code>public.project</code> table reference
     */
    public JProject(String alias) {
        this(DSL.name(alias), PROJECT);
    }

    /**
     * Create an aliased <code>public.project</code> table reference
     */
    public JProject(Name alias) {
        this(alias, PROJECT);
    }

    private JProject(Name alias, Table<JProjectRecord> aliased) {
        this(alias, aliased, null);
    }

    private JProject(Name alias, Table<JProjectRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return JPublic.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PROJECT_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<JProjectRecord, Long> getIdentity() {
        return Keys.IDENTITY_PROJECT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<JProjectRecord> getPrimaryKey() {
        return Keys.PROJECT_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<JProjectRecord>> getKeys() {
        return Arrays.<UniqueKey<JProjectRecord>>asList(Keys.PROJECT_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JProject as(String alias) {
        return new JProject(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JProject as(Name alias) {
        return new JProject(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JProject rename(String name) {
        return new JProject(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JProject rename(Name name) {
        return new JProject(name, null);
    }
}
