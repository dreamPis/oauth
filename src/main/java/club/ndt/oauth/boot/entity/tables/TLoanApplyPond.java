/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables;


import com.ndt.sms.entity.Indexes;
import com.ndt.sms.entity.Keys;
import com.ndt.sms.entity.Ndt;
import com.ndt.sms.entity.tables.records.TLoanApplyPondRecord;

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
public class TLoanApplyPond extends TableImpl<TLoanApplyPondRecord> {

    private static final long serialVersionUID = 1716192020;

    /**
     * The reference instance of <code>ndt.t_loan_apply_pond</code>
     */
    public static final TLoanApplyPond T_LOAN_APPLY_POND = new TLoanApplyPond();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TLoanApplyPondRecord> getRecordType() {
        return TLoanApplyPondRecord.class;
    }

    /**
     * The column <code>ndt.t_loan_apply_pond.id</code>. 主键
     */
    public final TableField<TLoanApplyPondRecord, BigDecimal> ID = createField("id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "主键");

    /**
     * The column <code>ndt.t_loan_apply_pond.name</code>. 姓名
     */
    public final TableField<TLoanApplyPondRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(20), this, "姓名");

    /**
     * The column <code>ndt.t_loan_apply_pond.type</code>. 贷款类型(参照码表27)
     */
    public final TableField<TLoanApplyPondRecord, Integer> TYPE = createField("type", org.jooq.impl.SQLDataType.INTEGER, this, "贷款类型(参照码表27)");

    /**
     * The column <code>ndt.t_loan_apply_pond.amount</code>. 金额
     */
    public final TableField<TLoanApplyPondRecord, BigDecimal> AMOUNT = createField("amount", org.jooq.impl.SQLDataType.NUMERIC, this, "金额");

    /**
     * The column <code>ndt.t_loan_apply_pond.code</code>. 社会信用代码/身份证号码
     */
    public final TableField<TLoanApplyPondRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR(20), this, "社会信用代码/身份证号码");

    /**
     * The column <code>ndt.t_loan_apply_pond.phone</code>. 电话号码
     */
    public final TableField<TLoanApplyPondRecord, String> PHONE = createField("phone", org.jooq.impl.SQLDataType.VARCHAR(20), this, "电话号码");

    /**
     * The column <code>ndt.t_loan_apply_pond.apply_date</code>. 时间
     */
    public final TableField<TLoanApplyPondRecord, Timestamp> APPLY_DATE = createField("apply_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "时间");

    /**
     * The column <code>ndt.t_loan_apply_pond.address</code>. 联系地址
     */
    public final TableField<TLoanApplyPondRecord, String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR(40), this, "联系地址");

    /**
     * The column <code>ndt.t_loan_apply_pond.bank_name</code>. 意向银行
     */
    public final TableField<TLoanApplyPondRecord, String> BANK_NAME = createField("bank_name", org.jooq.impl.SQLDataType.VARCHAR(200), this, "意向银行");

    /**
     * Create a <code>ndt.t_loan_apply_pond</code> table reference
     */
    public TLoanApplyPond() {
        this(DSL.name("t_loan_apply_pond"), null);
    }

    /**
     * Create an aliased <code>ndt.t_loan_apply_pond</code> table reference
     */
    public TLoanApplyPond(String alias) {
        this(DSL.name(alias), T_LOAN_APPLY_POND);
    }

    /**
     * Create an aliased <code>ndt.t_loan_apply_pond</code> table reference
     */
    public TLoanApplyPond(Name alias) {
        this(alias, T_LOAN_APPLY_POND);
    }

    private TLoanApplyPond(Name alias, Table<TLoanApplyPondRecord> aliased) {
        this(alias, aliased, null);
    }

    private TLoanApplyPond(Name alias, Table<TLoanApplyPondRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.T_LOAN_APPLY_POND_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TLoanApplyPondRecord> getPrimaryKey() {
        return Keys.T_LOAN_APPLY_POND_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TLoanApplyPondRecord>> getKeys() {
        return Arrays.<UniqueKey<TLoanApplyPondRecord>>asList(Keys.T_LOAN_APPLY_POND_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TLoanApplyPond as(String alias) {
        return new TLoanApplyPond(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TLoanApplyPond as(Name alias) {
        return new TLoanApplyPond(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TLoanApplyPond rename(String name) {
        return new TLoanApplyPond(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TLoanApplyPond rename(Name name) {
        return new TLoanApplyPond(name, null);
    }
}