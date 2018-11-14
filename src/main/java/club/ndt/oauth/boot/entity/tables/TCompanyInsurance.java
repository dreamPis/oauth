/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables;


import com.ndt.sms.entity.Indexes;
import com.ndt.sms.entity.Keys;
import com.ndt.sms.entity.Ndt;
import com.ndt.sms.entity.tables.records.TCompanyInsuranceRecord;

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
 * 公司参保信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TCompanyInsurance extends TableImpl<TCompanyInsuranceRecord> {

    private static final long serialVersionUID = 1071170321;

    /**
     * The reference instance of <code>ndt.t_company_insurance</code>
     */
    public static final TCompanyInsurance T_COMPANY_INSURANCE = new TCompanyInsurance();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TCompanyInsuranceRecord> getRecordType() {
        return TCompanyInsuranceRecord.class;
    }

    /**
     * The column <code>ndt.t_company_insurance.id</code>.
     */
    public final TableField<TCompanyInsuranceRecord, BigDecimal> ID = createField("id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>ndt.t_company_insurance.company_detail_id</code>. 公司详情ID
     */
    public final TableField<TCompanyInsuranceRecord, BigDecimal> COMPANY_DETAIL_ID = createField("company_detail_id", org.jooq.impl.SQLDataType.NUMERIC, this, "公司详情ID");

    /**
     * The column <code>ndt.t_company_insurance.insurance_name</code>. 保险名称
     */
    public final TableField<TCompanyInsuranceRecord, String> INSURANCE_NAME = createField("insurance_name", org.jooq.impl.SQLDataType.VARCHAR(200), this, "保险名称");

    /**
     * The column <code>ndt.t_company_insurance.insurance_type</code>. 保险类型
     */
    public final TableField<TCompanyInsuranceRecord, String> INSURANCE_TYPE = createField("insurance_type", org.jooq.impl.SQLDataType.VARCHAR(50), this, "保险类型");

    /**
     * The column <code>ndt.t_company_insurance.beneficiary</code>. 第一受益人
     */
    public final TableField<TCompanyInsuranceRecord, String> BENEFICIARY = createField("beneficiary", org.jooq.impl.SQLDataType.VARCHAR(60), this, "第一受益人");

    /**
     * The column <code>ndt.t_company_insurance.insurance_amt</code>. 保险金额
     */
    public final TableField<TCompanyInsuranceRecord, BigDecimal> INSURANCE_AMT = createField("insurance_amt", org.jooq.impl.SQLDataType.NUMERIC, this, "保险金额");

    /**
     * The column <code>ndt.t_company_insurance.status</code>.
     */
    public final TableField<TCompanyInsuranceRecord, Short> STATUS = createField("status", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>ndt.t_company_insurance.create_by</code>.
     */
    public final TableField<TCompanyInsuranceRecord, BigDecimal> CREATE_BY = createField("create_by", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>ndt.t_company_insurance.create_at</code>.
     */
    public final TableField<TCompanyInsuranceRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>ndt.t_company_insurance.update_by</code>.
     */
    public final TableField<TCompanyInsuranceRecord, BigDecimal> UPDATE_BY = createField("update_by", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>ndt.t_company_insurance.update_at</code>.
     */
    public final TableField<TCompanyInsuranceRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>ndt.t_company_insurance</code> table reference
     */
    public TCompanyInsurance() {
        this(DSL.name("t_company_insurance"), null);
    }

    /**
     * Create an aliased <code>ndt.t_company_insurance</code> table reference
     */
    public TCompanyInsurance(String alias) {
        this(DSL.name(alias), T_COMPANY_INSURANCE);
    }

    /**
     * Create an aliased <code>ndt.t_company_insurance</code> table reference
     */
    public TCompanyInsurance(Name alias) {
        this(alias, T_COMPANY_INSURANCE);
    }

    private TCompanyInsurance(Name alias, Table<TCompanyInsuranceRecord> aliased) {
        this(alias, aliased, null);
    }

    private TCompanyInsurance(Name alias, Table<TCompanyInsuranceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "公司参保信息");
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
        return Arrays.<Index>asList(Indexes.T_COMPANY_INSURANCE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TCompanyInsuranceRecord> getPrimaryKey() {
        return Keys.T_COMPANY_INSURANCE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TCompanyInsuranceRecord>> getKeys() {
        return Arrays.<UniqueKey<TCompanyInsuranceRecord>>asList(Keys.T_COMPANY_INSURANCE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCompanyInsurance as(String alias) {
        return new TCompanyInsurance(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCompanyInsurance as(Name alias) {
        return new TCompanyInsurance(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TCompanyInsurance rename(String name) {
        return new TCompanyInsurance(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TCompanyInsurance rename(Name name) {
        return new TCompanyInsurance(name, null);
    }
}