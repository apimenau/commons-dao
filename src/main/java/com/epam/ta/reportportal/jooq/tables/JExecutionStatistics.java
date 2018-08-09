/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.jooq.tables;


import com.epam.ta.reportportal.jooq.Indexes;
import com.epam.ta.reportportal.jooq.JPublic;
import com.epam.ta.reportportal.jooq.Keys;
import com.epam.ta.reportportal.jooq.tables.records.JExecutionStatisticsRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class JExecutionStatistics extends TableImpl<JExecutionStatisticsRecord> {

    private static final long serialVersionUID = 744198301;

    /**
     * The reference instance of <code>public.execution_statistics</code>
     */
    public static final JExecutionStatistics EXECUTION_STATISTICS = new JExecutionStatistics();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JExecutionStatisticsRecord> getRecordType() {
        return JExecutionStatisticsRecord.class;
    }

    /**
     * The column <code>public.execution_statistics.es_id</code>.
     */
    public final TableField<JExecutionStatisticsRecord, Long> ES_ID = createField("es_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('execution_statistics_es_id_seq'::regclass)", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.execution_statistics.es_counter</code>.
     */
    public final TableField<JExecutionStatisticsRecord, Integer> ES_COUNTER = createField("es_counter", org.jooq.impl.SQLDataType.INTEGER.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.execution_statistics.es_status</code>.
     */
    public final TableField<JExecutionStatisticsRecord, String> ES_STATUS = createField("es_status", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.execution_statistics.positive</code>.
     */
    public final TableField<JExecutionStatisticsRecord, Boolean> POSITIVE = createField("positive", org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.execution_statistics.item_id</code>.
     */
    public final TableField<JExecutionStatisticsRecord, Long> ITEM_ID = createField("item_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.execution_statistics.launch_id</code>.
     */
    public final TableField<JExecutionStatisticsRecord, Long> LAUNCH_ID = createField("launch_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>public.execution_statistics</code> table reference
     */
    public JExecutionStatistics() {
        this(DSL.name("execution_statistics"), null);
    }

    /**
     * Create an aliased <code>public.execution_statistics</code> table reference
     */
    public JExecutionStatistics(String alias) {
        this(DSL.name(alias), EXECUTION_STATISTICS);
    }

    /**
     * Create an aliased <code>public.execution_statistics</code> table reference
     */
    public JExecutionStatistics(Name alias) {
        this(alias, EXECUTION_STATISTICS);
    }

    private JExecutionStatistics(Name alias, Table<JExecutionStatisticsRecord> aliased) {
        this(alias, aliased, null);
    }

    private JExecutionStatistics(Name alias, Table<JExecutionStatisticsRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.PK_EXECUTION_STATISTICS, Indexes.UNIQUE_STATUS_ITEM, Indexes.UNIQUE_STATUS_LAUNCH);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<JExecutionStatisticsRecord, Long> getIdentity() {
        return Keys.IDENTITY_EXECUTION_STATISTICS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<JExecutionStatisticsRecord> getPrimaryKey() {
        return Keys.PK_EXECUTION_STATISTICS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<JExecutionStatisticsRecord>> getKeys() {
        return Arrays.<UniqueKey<JExecutionStatisticsRecord>>asList(Keys.PK_EXECUTION_STATISTICS, Keys.UNIQUE_STATUS_ITEM, Keys.UNIQUE_STATUS_LAUNCH);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<JExecutionStatisticsRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<JExecutionStatisticsRecord, ?>>asList(Keys.EXECUTION_STATISTICS__EXECUTION_STATISTICS_ITEM_ID_FKEY, Keys.EXECUTION_STATISTICS__EXECUTION_STATISTICS_LAUNCH_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JExecutionStatistics as(String alias) {
        return new JExecutionStatistics(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JExecutionStatistics as(Name alias) {
        return new JExecutionStatistics(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JExecutionStatistics rename(String name) {
        return new JExecutionStatistics(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JExecutionStatistics rename(Name name) {
        return new JExecutionStatistics(name, null);
    }
}
