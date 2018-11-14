/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.records;


import com.ndt.sms.entity.tables.TVillageCompanyInvestment;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 村站采集的公司投资信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TVillageCompanyInvestmentRecord extends UpdatableRecordImpl<TVillageCompanyInvestmentRecord> implements Record11<BigDecimal, BigDecimal, String, BigDecimal, Timestamp, Timestamp, Short, BigDecimal, Timestamp, BigDecimal, Timestamp> {

    private static final long serialVersionUID = -1795839883;

    /**
     * Setter for <code>ndt.t_village_company_investment.id</code>.
     */
    public TVillageCompanyInvestmentRecord setId(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_investment.id</code>.
     */
    public BigDecimal getId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>ndt.t_village_company_investment.village_company_detail_id</code>. 村站采集的公司详情ID
     */
    public TVillageCompanyInvestmentRecord setVillageCompanyDetailId(BigDecimal value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_investment.village_company_detail_id</code>. 村站采集的公司详情ID
     */
    public BigDecimal getVillageCompanyDetailId() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>ndt.t_village_company_investment.investment_unit</code>. 投资单位
     */
    public TVillageCompanyInvestmentRecord setInvestmentUnit(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_investment.investment_unit</code>. 投资单位
     */
    public String getInvestmentUnit() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ndt.t_village_company_investment.investment_amt</code>. 投资金额
     */
    public TVillageCompanyInvestmentRecord setInvestmentAmt(BigDecimal value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_investment.investment_amt</code>. 投资金额
     */
    public BigDecimal getInvestmentAmt() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>ndt.t_village_company_investment.investment_date</code>. 投资日期
     */
    public TVillageCompanyInvestmentRecord setInvestmentDate(Timestamp value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_investment.investment_date</code>. 投资日期
     */
    public Timestamp getInvestmentDate() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>ndt.t_village_company_investment.back_out_date</code>. 退出日期
     */
    public TVillageCompanyInvestmentRecord setBackOutDate(Timestamp value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_investment.back_out_date</code>. 退出日期
     */
    public Timestamp getBackOutDate() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>ndt.t_village_company_investment.status</code>.
     */
    public TVillageCompanyInvestmentRecord setStatus(Short value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_investment.status</code>.
     */
    public Short getStatus() {
        return (Short) get(6);
    }

    /**
     * Setter for <code>ndt.t_village_company_investment.create_by</code>.
     */
    public TVillageCompanyInvestmentRecord setCreateBy(BigDecimal value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_investment.create_by</code>.
     */
    public BigDecimal getCreateBy() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>ndt.t_village_company_investment.create_at</code>.
     */
    public TVillageCompanyInvestmentRecord setCreateAt(Timestamp value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_investment.create_at</code>.
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>ndt.t_village_company_investment.update_by</code>.
     */
    public TVillageCompanyInvestmentRecord setUpdateBy(BigDecimal value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_investment.update_by</code>.
     */
    public BigDecimal getUpdateBy() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>ndt.t_village_company_investment.update_at</code>.
     */
    public TVillageCompanyInvestmentRecord setUpdateAt(Timestamp value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_investment.update_at</code>.
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<BigDecimal> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<BigDecimal, BigDecimal, String, BigDecimal, Timestamp, Timestamp, Short, BigDecimal, Timestamp, BigDecimal, Timestamp> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<BigDecimal, BigDecimal, String, BigDecimal, Timestamp, Timestamp, Short, BigDecimal, Timestamp, BigDecimal, Timestamp> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field1() {
        return TVillageCompanyInvestment.T_VILLAGE_COMPANY_INVESTMENT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field2() {
        return TVillageCompanyInvestment.T_VILLAGE_COMPANY_INVESTMENT.VILLAGE_COMPANY_DETAIL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TVillageCompanyInvestment.T_VILLAGE_COMPANY_INVESTMENT.INVESTMENT_UNIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return TVillageCompanyInvestment.T_VILLAGE_COMPANY_INVESTMENT.INVESTMENT_AMT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return TVillageCompanyInvestment.T_VILLAGE_COMPANY_INVESTMENT.INVESTMENT_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return TVillageCompanyInvestment.T_VILLAGE_COMPANY_INVESTMENT.BACK_OUT_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field7() {
        return TVillageCompanyInvestment.T_VILLAGE_COMPANY_INVESTMENT.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field8() {
        return TVillageCompanyInvestment.T_VILLAGE_COMPANY_INVESTMENT.CREATE_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return TVillageCompanyInvestment.T_VILLAGE_COMPANY_INVESTMENT.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field10() {
        return TVillageCompanyInvestment.T_VILLAGE_COMPANY_INVESTMENT.UPDATE_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return TVillageCompanyInvestment.T_VILLAGE_COMPANY_INVESTMENT.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component2() {
        return getVillageCompanyDetailId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getInvestmentUnit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component4() {
        return getInvestmentAmt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getInvestmentDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getBackOutDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component7() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component8() {
        return getCreateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component10() {
        return getUpdateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value2() {
        return getVillageCompanyDetailId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getInvestmentUnit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getInvestmentAmt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getInvestmentDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getBackOutDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value7() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value8() {
        return getCreateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value10() {
        return getUpdateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyInvestmentRecord value1(BigDecimal value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyInvestmentRecord value2(BigDecimal value) {
        setVillageCompanyDetailId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyInvestmentRecord value3(String value) {
        setInvestmentUnit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyInvestmentRecord value4(BigDecimal value) {
        setInvestmentAmt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyInvestmentRecord value5(Timestamp value) {
        setInvestmentDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyInvestmentRecord value6(Timestamp value) {
        setBackOutDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyInvestmentRecord value7(Short value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyInvestmentRecord value8(BigDecimal value) {
        setCreateBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyInvestmentRecord value9(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyInvestmentRecord value10(BigDecimal value) {
        setUpdateBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyInvestmentRecord value11(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyInvestmentRecord values(BigDecimal value1, BigDecimal value2, String value3, BigDecimal value4, Timestamp value5, Timestamp value6, Short value7, BigDecimal value8, Timestamp value9, BigDecimal value10, Timestamp value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TVillageCompanyInvestmentRecord
     */
    public TVillageCompanyInvestmentRecord() {
        super(TVillageCompanyInvestment.T_VILLAGE_COMPANY_INVESTMENT);
    }

    /**
     * Create a detached, initialised TVillageCompanyInvestmentRecord
     */
    public TVillageCompanyInvestmentRecord(BigDecimal id, BigDecimal villageCompanyDetailId, String investmentUnit, BigDecimal investmentAmt, Timestamp investmentDate, Timestamp backOutDate, Short status, BigDecimal createBy, Timestamp createAt, BigDecimal updateBy, Timestamp updateAt) {
        super(TVillageCompanyInvestment.T_VILLAGE_COMPANY_INVESTMENT);

        set(0, id);
        set(1, villageCompanyDetailId);
        set(2, investmentUnit);
        set(3, investmentAmt);
        set(4, investmentDate);
        set(5, backOutDate);
        set(6, status);
        set(7, createBy);
        set(8, createAt);
        set(9, updateBy);
        set(10, updateAt);
    }
}