/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables.records;


import club.ndt.oauth.boot.entity.tables.TVillageCompanyEmployment;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 村站采集的公司用工信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TVillageCompanyEmploymentRecord extends UpdatableRecordImpl<TVillageCompanyEmploymentRecord> implements Record11<BigDecimal, BigDecimal, String, String, Integer, BigDecimal, Short, BigDecimal, Timestamp, BigDecimal, Timestamp> {

    private static final long serialVersionUID = 122584279;

    /**
     * Setter for <code>ndt.t_village_company_employment.id</code>.
     */
    public TVillageCompanyEmploymentRecord setId(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_employment.id</code>.
     */
    public BigDecimal getId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>ndt.t_village_company_employment.village_company_info_id</code>. 公司详情ID
     */
    public TVillageCompanyEmploymentRecord setVillageCompanyInfoId(BigDecimal value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_employment.village_company_info_id</code>. 公司详情ID
     */
    public BigDecimal getVillageCompanyInfoId() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>ndt.t_village_company_employment.employment_year</code>. 年度
     */
    public TVillageCompanyEmploymentRecord setEmploymentYear(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_employment.employment_year</code>. 年度
     */
    public String getEmploymentYear() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ndt.t_village_company_employment.employment_stage</code>. 用工阶段
     */
    public TVillageCompanyEmploymentRecord setEmploymentStage(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_employment.employment_stage</code>. 用工阶段
     */
    public String getEmploymentStage() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ndt.t_village_company_employment.employment_num</code>. 用工人数
     */
    public TVillageCompanyEmploymentRecord setEmploymentNum(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_employment.employment_num</code>. 用工人数
     */
    public Integer getEmploymentNum() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>ndt.t_village_company_employment.employment_total_cost</code>. 用工总成本（万元）
     */
    public TVillageCompanyEmploymentRecord setEmploymentTotalCost(BigDecimal value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_employment.employment_total_cost</code>. 用工总成本（万元）
     */
    public BigDecimal getEmploymentTotalCost() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>ndt.t_village_company_employment.status</code>.
     */
    public TVillageCompanyEmploymentRecord setStatus(Short value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_employment.status</code>.
     */
    public Short getStatus() {
        return (Short) get(6);
    }

    /**
     * Setter for <code>ndt.t_village_company_employment.create_user</code>.
     */
    public TVillageCompanyEmploymentRecord setCreateUser(BigDecimal value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_employment.create_user</code>.
     */
    public BigDecimal getCreateUser() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>ndt.t_village_company_employment.create_time</code>.
     */
    public TVillageCompanyEmploymentRecord setCreateTime(Timestamp value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_employment.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>ndt.t_village_company_employment.update_user</code>.
     */
    public TVillageCompanyEmploymentRecord setUpdateUser(BigDecimal value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_employment.update_user</code>.
     */
    public BigDecimal getUpdateUser() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>ndt.t_village_company_employment.update_time</code>.
     */
    public TVillageCompanyEmploymentRecord setUpdateTime(Timestamp value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_employment.update_time</code>.
     */
    public Timestamp getUpdateTime() {
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
    public Row11<BigDecimal, BigDecimal, String, String, Integer, BigDecimal, Short, BigDecimal, Timestamp, BigDecimal, Timestamp> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<BigDecimal, BigDecimal, String, String, Integer, BigDecimal, Short, BigDecimal, Timestamp, BigDecimal, Timestamp> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field1() {
        return TVillageCompanyEmployment.T_VILLAGE_COMPANY_EMPLOYMENT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field2() {
        return TVillageCompanyEmployment.T_VILLAGE_COMPANY_EMPLOYMENT.VILLAGE_COMPANY_INFO_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TVillageCompanyEmployment.T_VILLAGE_COMPANY_EMPLOYMENT.EMPLOYMENT_YEAR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TVillageCompanyEmployment.T_VILLAGE_COMPANY_EMPLOYMENT.EMPLOYMENT_STAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return TVillageCompanyEmployment.T_VILLAGE_COMPANY_EMPLOYMENT.EMPLOYMENT_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return TVillageCompanyEmployment.T_VILLAGE_COMPANY_EMPLOYMENT.EMPLOYMENT_TOTAL_COST;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field7() {
        return TVillageCompanyEmployment.T_VILLAGE_COMPANY_EMPLOYMENT.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field8() {
        return TVillageCompanyEmployment.T_VILLAGE_COMPANY_EMPLOYMENT.CREATE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return TVillageCompanyEmployment.T_VILLAGE_COMPANY_EMPLOYMENT.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field10() {
        return TVillageCompanyEmployment.T_VILLAGE_COMPANY_EMPLOYMENT.UPDATE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return TVillageCompanyEmployment.T_VILLAGE_COMPANY_EMPLOYMENT.UPDATE_TIME;
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
        return getEmploymentYear();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getEmploymentStage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getEmploymentNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component6() {
        return getEmploymentTotalCost();
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
        return getCreateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component10() {
        return getUpdateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
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
        return getEmploymentYear();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getEmploymentStage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getEmploymentNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getEmploymentTotalCost();
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
        return getCreateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value10() {
        return getUpdateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyEmploymentRecord value1(BigDecimal value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyEmploymentRecord value2(BigDecimal value) {
        setVillageCompanyInfoId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyEmploymentRecord value3(String value) {
        setEmploymentYear(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyEmploymentRecord value4(String value) {
        setEmploymentStage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyEmploymentRecord value5(Integer value) {
        setEmploymentNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyEmploymentRecord value6(BigDecimal value) {
        setEmploymentTotalCost(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyEmploymentRecord value7(Short value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyEmploymentRecord value8(BigDecimal value) {
        setCreateUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyEmploymentRecord value9(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyEmploymentRecord value10(BigDecimal value) {
        setUpdateUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyEmploymentRecord value11(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyEmploymentRecord values(BigDecimal value1, BigDecimal value2, String value3, String value4, Integer value5, BigDecimal value6, Short value7, BigDecimal value8, Timestamp value9, BigDecimal value10, Timestamp value11) {
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
     * Create a detached TVillageCompanyEmploymentRecord
     */
    public TVillageCompanyEmploymentRecord() {
        super(TVillageCompanyEmployment.T_VILLAGE_COMPANY_EMPLOYMENT);
    }

    /**
     * Create a detached, initialised TVillageCompanyEmploymentRecord
     */
    public TVillageCompanyEmploymentRecord(BigDecimal id, BigDecimal villageCompanyInfoId, String employmentYear, String employmentStage, Integer employmentNum, BigDecimal employmentTotalCost, Short status, BigDecimal createUser, Timestamp createTime, BigDecimal updateUser, Timestamp updateTime) {
        super(TVillageCompanyEmployment.T_VILLAGE_COMPANY_EMPLOYMENT);

        set(0, id);
        set(1, villageCompanyInfoId);
        set(2, employmentYear);
        set(3, employmentStage);
        set(4, employmentNum);
        set(5, employmentTotalCost);
        set(6, status);
        set(7, createUser);
        set(8, createTime);
        set(9, updateUser);
        set(10, updateTime);
    }
}
