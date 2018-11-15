/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables.records;


import club.ndt.oauth.boot.entity.tables.TVillageCompanyLoan;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 村站采集的公司贷款信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TVillageCompanyLoanRecord extends UpdatableRecordImpl<TVillageCompanyLoanRecord> implements Record13<BigDecimal, BigDecimal, String, BigDecimal, Timestamp, Timestamp, String, BigDecimal, Short, BigDecimal, Timestamp, BigDecimal, Timestamp> {

    private static final long serialVersionUID = -1452326799;

    /**
     * Setter for <code>ndt.t_village_company_loan.id</code>.
     */
    public TVillageCompanyLoanRecord setId(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_loan.id</code>.
     */
    public BigDecimal getId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>ndt.t_village_company_loan.village_company_info_id</code>. 公司详情ID
     */
    public TVillageCompanyLoanRecord setVillageCompanyInfoId(BigDecimal value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_loan.village_company_info_id</code>. 公司详情ID
     */
    public BigDecimal getVillageCompanyInfoId() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>ndt.t_village_company_loan.loan_org_name</code>. 贷款机构名称
     */
    public TVillageCompanyLoanRecord setLoanOrgName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_loan.loan_org_name</code>. 贷款机构名称
     */
    public String getLoanOrgName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ndt.t_village_company_loan.loan_balance</code>. 贷款余额（万元）
     */
    public TVillageCompanyLoanRecord setLoanBalance(BigDecimal value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_loan.loan_balance</code>. 贷款余额（万元）
     */
    public BigDecimal getLoanBalance() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>ndt.t_village_company_loan.loan_start_date</code>. 贷款起始时间
     */
    public TVillageCompanyLoanRecord setLoanStartDate(Timestamp value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_loan.loan_start_date</code>. 贷款起始时间
     */
    public Timestamp getLoanStartDate() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>ndt.t_village_company_loan.loan_end_date</code>. 贷款结束时间
     */
    public TVillageCompanyLoanRecord setLoanEndDate(Timestamp value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_loan.loan_end_date</code>. 贷款结束时间
     */
    public Timestamp getLoanEndDate() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>ndt.t_village_company_loan.loan_mortgage</code>. 贷款抵、质押物品
     */
    public TVillageCompanyLoanRecord setLoanMortgage(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_loan.loan_mortgage</code>. 贷款抵、质押物品
     */
    public String getLoanMortgage() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ndt.t_village_company_loan.loan_rate</code>. 年利率
     */
    public TVillageCompanyLoanRecord setLoanRate(BigDecimal value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_loan.loan_rate</code>. 年利率
     */
    public BigDecimal getLoanRate() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>ndt.t_village_company_loan.status</code>.
     */
    public TVillageCompanyLoanRecord setStatus(Short value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_loan.status</code>.
     */
    public Short getStatus() {
        return (Short) get(8);
    }

    /**
     * Setter for <code>ndt.t_village_company_loan.create_user</code>.
     */
    public TVillageCompanyLoanRecord setCreateUser(BigDecimal value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_loan.create_user</code>.
     */
    public BigDecimal getCreateUser() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>ndt.t_village_company_loan.create_time</code>.
     */
    public TVillageCompanyLoanRecord setCreateTime(Timestamp value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_loan.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>ndt.t_village_company_loan.update_user</code>.
     */
    public TVillageCompanyLoanRecord setUpdateUser(BigDecimal value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_loan.update_user</code>.
     */
    public BigDecimal getUpdateUser() {
        return (BigDecimal) get(11);
    }

    /**
     * Setter for <code>ndt.t_village_company_loan.update_time</code>.
     */
    public TVillageCompanyLoanRecord setUpdateTime(Timestamp value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_loan.update_time</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(12);
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
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<BigDecimal, BigDecimal, String, BigDecimal, Timestamp, Timestamp, String, BigDecimal, Short, BigDecimal, Timestamp, BigDecimal, Timestamp> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<BigDecimal, BigDecimal, String, BigDecimal, Timestamp, Timestamp, String, BigDecimal, Short, BigDecimal, Timestamp, BigDecimal, Timestamp> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field1() {
        return TVillageCompanyLoan.T_VILLAGE_COMPANY_LOAN.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field2() {
        return TVillageCompanyLoan.T_VILLAGE_COMPANY_LOAN.VILLAGE_COMPANY_INFO_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TVillageCompanyLoan.T_VILLAGE_COMPANY_LOAN.LOAN_ORG_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return TVillageCompanyLoan.T_VILLAGE_COMPANY_LOAN.LOAN_BALANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return TVillageCompanyLoan.T_VILLAGE_COMPANY_LOAN.LOAN_START_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return TVillageCompanyLoan.T_VILLAGE_COMPANY_LOAN.LOAN_END_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TVillageCompanyLoan.T_VILLAGE_COMPANY_LOAN.LOAN_MORTGAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field8() {
        return TVillageCompanyLoan.T_VILLAGE_COMPANY_LOAN.LOAN_RATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field9() {
        return TVillageCompanyLoan.T_VILLAGE_COMPANY_LOAN.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field10() {
        return TVillageCompanyLoan.T_VILLAGE_COMPANY_LOAN.CREATE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return TVillageCompanyLoan.T_VILLAGE_COMPANY_LOAN.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field12() {
        return TVillageCompanyLoan.T_VILLAGE_COMPANY_LOAN.UPDATE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field13() {
        return TVillageCompanyLoan.T_VILLAGE_COMPANY_LOAN.UPDATE_TIME;
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
        return getVillageCompanyInfoId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getLoanOrgName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component4() {
        return getLoanBalance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getLoanStartDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getLoanEndDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getLoanMortgage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component8() {
        return getLoanRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component9() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component10() {
        return getCreateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component12() {
        return getUpdateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component13() {
        return getUpdateTime();
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
        return getVillageCompanyInfoId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getLoanOrgName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getLoanBalance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getLoanStartDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getLoanEndDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getLoanMortgage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value8() {
        return getLoanRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value9() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value10() {
        return getCreateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value12() {
        return getUpdateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value13() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyLoanRecord value1(BigDecimal value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyLoanRecord value2(BigDecimal value) {
        setVillageCompanyInfoId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyLoanRecord value3(String value) {
        setLoanOrgName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyLoanRecord value4(BigDecimal value) {
        setLoanBalance(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyLoanRecord value5(Timestamp value) {
        setLoanStartDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyLoanRecord value6(Timestamp value) {
        setLoanEndDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyLoanRecord value7(String value) {
        setLoanMortgage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyLoanRecord value8(BigDecimal value) {
        setLoanRate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyLoanRecord value9(Short value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyLoanRecord value10(BigDecimal value) {
        setCreateUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyLoanRecord value11(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyLoanRecord value12(BigDecimal value) {
        setUpdateUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyLoanRecord value13(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyLoanRecord values(BigDecimal value1, BigDecimal value2, String value3, BigDecimal value4, Timestamp value5, Timestamp value6, String value7, BigDecimal value8, Short value9, BigDecimal value10, Timestamp value11, BigDecimal value12, Timestamp value13) {
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
        value12(value12);
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TVillageCompanyLoanRecord
     */
    public TVillageCompanyLoanRecord() {
        super(TVillageCompanyLoan.T_VILLAGE_COMPANY_LOAN);
    }

    /**
     * Create a detached, initialised TVillageCompanyLoanRecord
     */
    public TVillageCompanyLoanRecord(BigDecimal id, BigDecimal villageCompanyInfoId, String loanOrgName, BigDecimal loanBalance, Timestamp loanStartDate, Timestamp loanEndDate, String loanMortgage, BigDecimal loanRate, Short status, BigDecimal createUser, Timestamp createTime, BigDecimal updateUser, Timestamp updateTime) {
        super(TVillageCompanyLoan.T_VILLAGE_COMPANY_LOAN);

        set(0, id);
        set(1, villageCompanyInfoId);
        set(2, loanOrgName);
        set(3, loanBalance);
        set(4, loanStartDate);
        set(5, loanEndDate);
        set(6, loanMortgage);
        set(7, loanRate);
        set(8, status);
        set(9, createUser);
        set(10, createTime);
        set(11, updateUser);
        set(12, updateTime);
    }
}
