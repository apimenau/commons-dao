/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.jooq.tables.records;


import com.epam.ta.reportportal.jooq.tables.JIntegration;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


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
public class JIntegrationRecord extends UpdatableRecordImpl<JIntegrationRecord> implements Record6<Integer, Long, Integer, Boolean, Object, Timestamp> {

    private static final long serialVersionUID = -1726884148;

    /**
     * Setter for <code>public.integration.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.integration.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.integration.project_id</code>.
     */
    public void setProjectId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.integration.project_id</code>.
     */
    public Long getProjectId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.integration.type</code>.
     */
    public void setType(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.integration.type</code>.
     */
    public Integer getType() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>public.integration.enabled</code>.
     */
    public void setEnabled(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.integration.enabled</code>.
     */
    public Boolean getEnabled() {
        return (Boolean) get(3);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public void setParams(Object value) {
        set(4, value);
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public Object getParams() {
        return get(4);
    }

    /**
     * Setter for <code>public.integration.creation_date</code>.
     */
    public void setCreationDate(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.integration.creation_date</code>.
     */
    public Timestamp getCreationDate() {
        return (Timestamp) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Long, Integer, Boolean, Object, Timestamp> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Long, Integer, Boolean, Object, Timestamp> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return JIntegration.INTEGRATION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return JIntegration.INTEGRATION.PROJECT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return JIntegration.INTEGRATION.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field4() {
        return JIntegration.INTEGRATION.ENABLED;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Field<Object> field5() {
        return JIntegration.INTEGRATION.PARAMS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return JIntegration.INTEGRATION.CREATION_DATE;
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
    public Long component2() {
        return getProjectId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component4() {
        return getEnabled();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object component5() {
        return getParams();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getCreationDate();
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
    public Long value2() {
        return getProjectId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value4() {
        return getEnabled();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public Object value5() {
        return getParams();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getCreationDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JIntegrationRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JIntegrationRecord value2(Long value) {
        setProjectId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JIntegrationRecord value3(Integer value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JIntegrationRecord value4(Boolean value) {
        setEnabled(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    @Override
    public JIntegrationRecord value5(Object value) {
        setParams(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JIntegrationRecord value6(Timestamp value) {
        setCreationDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JIntegrationRecord values(Integer value1, Long value2, Integer value3, Boolean value4, Object value5, Timestamp value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JIntegrationRecord
     */
    public JIntegrationRecord() {
        super(JIntegration.INTEGRATION);
    }

    /**
     * Create a detached, initialised JIntegrationRecord
     */
    public JIntegrationRecord(Integer id, Long projectId, Integer type, Boolean enabled, Object params, Timestamp creationDate) {
        super(JIntegration.INTEGRATION);

        set(0, id);
        set(1, projectId);
        set(2, type);
        set(3, enabled);
        set(4, params);
        set(5, creationDate);
    }
}
