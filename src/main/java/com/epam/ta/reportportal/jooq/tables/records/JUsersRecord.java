/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.jooq.tables.records;

import com.epam.ta.reportportal.jooq.enums.JUserRoleEnum;
import com.epam.ta.reportportal.jooq.enums.JUserTypeEnum;
import com.epam.ta.reportportal.jooq.tables.JUsers;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;


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
public class JUsersRecord extends UpdatableRecordImpl<JUsersRecord>
		implements Record9<Long, String, String, String, JUserRoleEnum, JUserTypeEnum, Integer, String, Object> {

	private static final long serialVersionUID = -461624748;

    /**
     * Setter for <code>public.users.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.users.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.users.login</code>.
     */
    public void setLogin(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.users.login</code>.
     */
    public String getLogin() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.users.password</code>.
     */
    public void setPassword(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.users.password</code>.
     */
    public String getPassword() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.users.email</code>.
     */
    public void setEmail(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.users.email</code>.
     */
    public String getEmail() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.users.role</code>.
     */
    public void setRole(JUserRoleEnum value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.users.role</code>.
     */
    public JUserRoleEnum getRole() {
        return (JUserRoleEnum) get(4);
    }

    /**
     * Setter for <code>public.users.type</code>.
     */
    public void setType(JUserTypeEnum value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.users.type</code>.
     */
    public JUserTypeEnum getType() {
        return (JUserTypeEnum) get(5);
    }

    /**
     * Setter for <code>public.users.default_project_id</code>.
     */
    public void setDefaultProjectId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.users.default_project_id</code>.
     */
    public Integer getDefaultProjectId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>public.users.full_name</code>.
     */
    public void setFullName(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>public.users.full_name</code>.
     */
    public String getFullName() {
        return (String) get(7);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
	@java.lang.Deprecated
	public void setMetadata(Object value) {
        set(8, value);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
	@java.lang.Deprecated
	public Object getMetadata() {
        return get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Long, String, String, String, JUserRoleEnum, JUserTypeEnum, Integer, String, Object> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Long, String, String, String, JUserRoleEnum, JUserTypeEnum, Integer, String, Object> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return JUsers.USERS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return JUsers.USERS.LOGIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return JUsers.USERS.PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return JUsers.USERS.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<JUserRoleEnum> field5() {
        return JUsers.USERS.ROLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<JUserTypeEnum> field6() {
        return JUsers.USERS.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return JUsers.USERS.DEFAULT_PROJECT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return JUsers.USERS.FULL_NAME;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
	@java.lang.Deprecated
	@Override
    public Field<Object> field9() {
        return JUsers.USERS.METADATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getLogin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JUserRoleEnum component5() {
        return getRole();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JUserTypeEnum component6() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getDefaultProjectId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getFullName();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
	@java.lang.Deprecated
	@Override
    public Object component9() {
        return getMetadata();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getLogin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JUserRoleEnum value5() {
        return getRole();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JUserTypeEnum value6() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getDefaultProjectId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getFullName();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
	@java.lang.Deprecated
	@Override
    public Object value9() {
        return getMetadata();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JUsersRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JUsersRecord value2(String value) {
        setLogin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JUsersRecord value3(String value) {
        setPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JUsersRecord value4(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JUsersRecord value5(JUserRoleEnum value) {
        setRole(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JUsersRecord value6(JUserTypeEnum value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JUsersRecord value7(Integer value) {
        setDefaultProjectId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JUsersRecord value8(String value) {
        setFullName(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
	@java.lang.Deprecated
	@Override
    public JUsersRecord value9(Object value) {
        setMetadata(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JUsersRecord values(Long value1, String value2, String value3, String value4, JUserRoleEnum value5, JUserTypeEnum value6, Integer value7, String value8, Object value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JUsersRecord
     */
    public JUsersRecord() {
        super(JUsers.USERS);
    }

    /**
     * Create a detached, initialised JUsersRecord
     */
    public JUsersRecord(Long id, String login, String password, String email, JUserRoleEnum role, JUserTypeEnum type, Integer defaultProjectId, String fullName, Object metadata) {
        super(JUsers.USERS);

        set(0, id);
        set(1, login);
        set(2, password);
        set(3, email);
        set(4, role);
        set(5, type);
        set(6, defaultProjectId);
        set(7, fullName);
        set(8, metadata);
    }
}
