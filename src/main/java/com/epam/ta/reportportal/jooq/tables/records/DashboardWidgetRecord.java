/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.jooq.tables.records;

import com.epam.ta.reportportal.jooq.tables.DashboardWidget;
import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record7;
import org.jooq.Row7;
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
@Table(name = "dashboard_widget", schema = "public", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"dashboard_id", "widget_id"}),
    @UniqueConstraint(columnNames = {"dashboard_id", "widget_name"})
}, indexes = {
    @Index(name = "dashboard_widget_pk", unique = true, columnList = "dashboard_id ASC, widget_id ASC"),
    @Index(name = "widget_on_dashboard_unq", unique = true, columnList = "dashboard_id ASC, widget_name ASC")
})
public class DashboardWidgetRecord extends UpdatableRecordImpl<DashboardWidgetRecord> implements Record7<Integer, Integer, String, Integer, Integer, Integer, Integer> {

    private static final long serialVersionUID = 1763513397;

    /**
     * Setter for <code>public.dashboard_widget.dashboard_id</code>.
     */
    public void setDashboardId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.dashboard_widget.dashboard_id</code>.
     */
    @Column(name = "dashboard_id", nullable = false, precision = 32)
    public Integer getDashboardId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.dashboard_widget.widget_id</code>.
     */
    public void setWidgetId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.dashboard_widget.widget_id</code>.
     */
    @Column(name = "widget_id", nullable = false, precision = 32)
    public Integer getWidgetId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.dashboard_widget.widget_name</code>.
     */
    public void setWidgetName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.dashboard_widget.widget_name</code>.
     */
    @Column(name = "widget_name", nullable = false)
    public String getWidgetName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.dashboard_widget.wdiget_width</code>.
     */
    public void setWdigetWidth(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.dashboard_widget.wdiget_width</code>.
     */
    @Column(name = "wdiget_width", nullable = false, precision = 32)
    public Integer getWdigetWidth() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.dashboard_widget.widget_heigth</code>.
     */
    public void setWidgetHeigth(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.dashboard_widget.widget_heigth</code>.
     */
    @Column(name = "widget_heigth", nullable = false, precision = 32)
    public Integer getWidgetHeigth() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>public.dashboard_widget.widget_position_x</code>.
     */
    public void setWidgetPositionX(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>public.dashboard_widget.widget_position_x</code>.
     */
    @Column(name = "widget_position_x", nullable = false, precision = 32)
    public Integer getWidgetPositionX() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>public.dashboard_widget.widget_position_y</code>.
     */
    public void setWidgetPositionY(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>public.dashboard_widget.widget_position_y</code>.
     */
    @Column(name = "widget_position_y", nullable = false, precision = 32)
    public Integer getWidgetPositionY() {
        return (Integer) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Integer, Integer> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, String, Integer, Integer, Integer, Integer> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, Integer, String, Integer, Integer, Integer, Integer> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return DashboardWidget.DASHBOARD_WIDGET.DASHBOARD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return DashboardWidget.DASHBOARD_WIDGET.WIDGET_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return DashboardWidget.DASHBOARD_WIDGET.WIDGET_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return DashboardWidget.DASHBOARD_WIDGET.WDIGET_WIDTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return DashboardWidget.DASHBOARD_WIDGET.WIDGET_HEIGTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return DashboardWidget.DASHBOARD_WIDGET.WIDGET_POSITION_X;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return DashboardWidget.DASHBOARD_WIDGET.WIDGET_POSITION_Y;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getDashboardId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getWidgetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getWidgetName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getWdigetWidth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getWidgetHeigth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getWidgetPositionX();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getWidgetPositionY();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getDashboardId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getWidgetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getWidgetName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getWdigetWidth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getWidgetHeigth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getWidgetPositionX();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getWidgetPositionY();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DashboardWidgetRecord value1(Integer value) {
        setDashboardId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DashboardWidgetRecord value2(Integer value) {
        setWidgetId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DashboardWidgetRecord value3(String value) {
        setWidgetName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DashboardWidgetRecord value4(Integer value) {
        setWdigetWidth(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DashboardWidgetRecord value5(Integer value) {
        setWidgetHeigth(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DashboardWidgetRecord value6(Integer value) {
        setWidgetPositionX(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DashboardWidgetRecord value7(Integer value) {
        setWidgetPositionY(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DashboardWidgetRecord values(Integer value1, Integer value2, String value3, Integer value4, Integer value5, Integer value6, Integer value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DashboardWidgetRecord
     */
    public DashboardWidgetRecord() {
        super(DashboardWidget.DASHBOARD_WIDGET);
    }

    /**
     * Create a detached, initialised DashboardWidgetRecord
     */
    public DashboardWidgetRecord(Integer dashboardId, Integer widgetId, String widgetName, Integer wdigetWidth, Integer widgetHeigth, Integer widgetPositionX, Integer widgetPositionY) {
        super(DashboardWidget.DASHBOARD_WIDGET);

        set(0, dashboardId);
        set(1, widgetId);
        set(2, widgetName);
        set(3, wdigetWidth);
        set(4, widgetHeigth);
        set(5, widgetPositionX);
        set(6, widgetPositionY);
    }
}