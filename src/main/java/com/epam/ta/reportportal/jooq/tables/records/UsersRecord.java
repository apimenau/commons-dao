/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.jooq.tables.records;

import com.epam.ta.reportportal.jooq.enums.UserRoleEnum;
import com.epam.ta.reportportal.jooq.enums.UserTypeEnum;
import com.epam.ta.reportportal.jooq.tables.Users;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import javax.persistence.*;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Entity
@Table(name = "users", schema = "public", indexes = {
    @Index(name = "users_login_key", unique = true, columnList = "login ASC"),
    @Index(name = "users_pk", unique = true, columnList = "id ASC")
})
public class UsersRecord extends UpdatableRecordImpl<UsersRecord> implements Record9<Integer, String, String, String, UserRoleEnum, UserTypeEnum, Integer, String, Object> {

    private static final long serialVersionUID = 449622794;

    /**
     * Setter for <code>public.users.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.users.id</code>.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false, precision = 32)
    public Integer getId() {
        return (Integer) get(0);
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
    @Column(name = "login", unique = true, nullable = false)
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
    @Column(name = "password", nullable = false)
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
    @Column(name = "email", nullable = false)
    public String getEmail() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.users.role</code>.
     */
    public void setRole(UserRoleEnum value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.users.role</code>.
     */
    @Column(name = "role", nullable = false)
    public UserRoleEnum getRole() {
        return (UserRoleEnum) get(4);
    }

    /**
     * Setter for <code>public.users.type</code>.
     */
    public void setType(UserTypeEnum value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.users.type</code>.
     */
    @Column(name = "type", nullable = false)
    public UserTypeEnum getType() {
        return (UserTypeEnum) get(5);
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
    @Column(name = "default_project_id", precision = 32)
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
    @Column(name = "full_name", nullable = false)
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
    @Column(name = "metadata")
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
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, String, String, String, UserRoleEnum, UserTypeEnum, Integer, String, Object> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<Integer, String, String, String, UserRoleEnum, UserTypeEnum, Integer, String, Object> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Users.USERS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Users.USERS.LOGIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Users.USERS.PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Users.USERS.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UserRoleEnum> field5() {
        return Users.USERS.ROLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UserTypeEnum> field6() {
        return Users.USERS.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Users.USERS.DEFAULT_PROJECT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Users.USERS.FULL_NAME;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Field<Object> field9() {
        return Users.USERS.METADATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
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
    public UserRoleEnum component5() {
        return getRole();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserTypeEnum component6() {
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
    public Integer value1() {
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
    public UserRoleEnum value5() {
        return getRole();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserTypeEnum value6() {
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
    public UsersRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value2(String value) {
        setLogin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value3(String value) {
        setPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value4(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value5(UserRoleEnum value) {
        setRole(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value6(UserTypeEnum value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value7(Integer value) {
        setDefaultProjectId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord value8(String value) {
        setFullName(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public UsersRecord value9(Object value) {
        setMetadata(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UsersRecord values(Integer value1, String value2, String value3, String value4, UserRoleEnum value5, UserTypeEnum value6, Integer value7, String value8, Object value9) {
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
     * Create a detached UsersRecord
     */
    public UsersRecord() {
        super(Users.USERS);
    }

    /**
     * Create a detached, initialised UsersRecord
     */
    public UsersRecord(Integer id, String login, String password, String email, UserRoleEnum role, UserTypeEnum type, Integer defaultProjectId, String fullName, Object metadata) {
        super(Users.USERS);

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