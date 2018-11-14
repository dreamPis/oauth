/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables;


import com.ndt.sms.entity.Indexes;
import com.ndt.sms.entity.Keys;
import com.ndt.sms.entity.Ndt;
import com.ndt.sms.entity.tables.records.TCreditDivisionRecord;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
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
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TCreditDivision extends TableImpl<TCreditDivisionRecord> {

    private static final long serialVersionUID = 2037870344;

    /**
     * The reference instance of <code>ndt.t_credit_division</code>
     */
    public static final TCreditDivision T_CREDIT_DIVISION = new TCreditDivision();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TCreditDivisionRecord> getRecordType() {
        return TCreditDivisionRecord.class;
    }

    /**
     * The column <code>ndt.t_credit_division.id</code>. 主键
     */
    public final TableField<TCreditDivisionRecord, BigDecimal> ID = createField("id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "主键");

    /**
     * The column <code>ndt.t_credit_division.division_id</code>. 区域ID
     */
    public final TableField<TCreditDivisionRecord, BigDecimal> DIVISION_ID = createField("division_id", org.jooq.impl.SQLDataType.NUMERIC, this, "区域ID");

    /**
     * The column <code>ndt.t_credit_division.is_credit</code>. 是否信用乡镇村
     */
    public final TableField<TCreditDivisionRecord, Boolean> IS_CREDIT = createField("is_credit", org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("false", org.jooq.impl.SQLDataType.BOOLEAN)), this, "是否信用乡镇村");

    /**
     * The column <code>ndt.t_credit_division.credit_year</code>. 年份
     */
    public final TableField<TCreditDivisionRecord, String> CREDIT_YEAR = createField("credit_year", org.jooq.impl.SQLDataType.VARCHAR(10), this, "年份");

    /**
     * The column <code>ndt.t_credit_division.create_user</code>.
     */
    public final TableField<TCreditDivisionRecord, BigDecimal> CREATE_USER = createField("create_user", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>ndt.t_credit_division.create_time</code>.
     */
    public final TableField<TCreditDivisionRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>ndt.t_credit_division.update_user</code>.
     */
    public final TableField<TCreditDivisionRecord, BigDecimal> UPDATE_USER = createField("update_user", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>ndt.t_credit_division.update_time</code>.
     */
    public final TableField<TCreditDivisionRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>ndt.t_credit_division</code> table reference
     */
    public TCreditDivision() {
        this(DSL.name("t_credit_division"), null);
    }

    /**
     * Create an aliased <code>ndt.t_credit_division</code> table reference
     */
    public TCreditDivision(String alias) {
        this(DSL.name(alias), T_CREDIT_DIVISION);
    }

    /**
     * Create an aliased <code>ndt.t_credit_division</code> table reference
     */
    public TCreditDivision(Name alias) {
        this(alias, T_CREDIT_DIVISION);
    }

    private TCreditDivision(Name alias, Table<TCreditDivisionRecord> aliased) {
        this(alias, aliased, null);
    }

    private TCreditDivision(Name alias, Table<TCreditDivisionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Ndt.NDT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.T_CREDIT_DIVISION_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TCreditDivisionRecord> getPrimaryKey() {
        return Keys.T_CREDIT_DIVISION_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TCreditDivisionRecord>> getKeys() {
        return Arrays.<UniqueKey<TCreditDivisionRecord>>asList(Keys.T_CREDIT_DIVISION_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCreditDivision as(String alias) {
        return new TCreditDivision(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCreditDivision as(Name alias) {
        return new TCreditDivision(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TCreditDivision rename(String name) {
        return new TCreditDivision(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TCreditDivision rename(Name name) {
        return new TCreditDivision(name, null);
    }
}
