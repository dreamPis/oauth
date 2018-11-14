/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.records;


import com.ndt.sms.entity.tables.TVillageCompanyReward;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 村站采集的公司奖励/处罚信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TVillageCompanyRewardRecord extends UpdatableRecordImpl<TVillageCompanyRewardRecord> implements Record12<BigDecimal, BigDecimal, Integer, String, String, String, Integer, Short, BigDecimal, Timestamp, BigDecimal, Timestamp> {

    private static final long serialVersionUID = 1212828392;

    /**
     * Setter for <code>ndt.t_village_company_reward.id</code>.
     */
    public TVillageCompanyRewardRecord setId(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_reward.id</code>.
     */
    public BigDecimal getId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>ndt.t_village_company_reward.village_company_info_id</code>. 公司详情ID
     */
    public TVillageCompanyRewardRecord setVillageCompanyInfoId(BigDecimal value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_reward.village_company_info_id</code>. 公司详情ID
     */
    public BigDecimal getVillageCompanyInfoId() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>ndt.t_village_company_reward.reorpu_type</code>. 类型（奖励或处罚 码表）
     */
    public TVillageCompanyRewardRecord setReorpuType(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_reward.reorpu_type</code>. 类型（奖励或处罚 码表）
     */
    public Integer getReorpuType() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>ndt.t_village_company_reward.type</code>. 类型
     */
    public TVillageCompanyRewardRecord setType(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_reward.type</code>. 类型
     */
    public String getType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ndt.t_village_company_reward.award_date</code>. 时间
     */
    public TVillageCompanyRewardRecord setAwardDate(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_reward.award_date</code>. 时间
     */
    public String getAwardDate() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ndt.t_village_company_reward.registration_number</code>. 登记号
     */
    public TVillageCompanyRewardRecord setRegistrationNumber(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_reward.registration_number</code>. 登记号
     */
    public String getRegistrationNumber() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ndt.t_village_company_reward.state</code>.
     */
    public TVillageCompanyRewardRecord setState(Integer value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_reward.state</code>.
     */
    public Integer getState() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>ndt.t_village_company_reward.status</code>.
     */
    public TVillageCompanyRewardRecord setStatus(Short value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_reward.status</code>.
     */
    public Short getStatus() {
        return (Short) get(7);
    }

    /**
     * Setter for <code>ndt.t_village_company_reward.create_user</code>.
     */
    public TVillageCompanyRewardRecord setCreateUser(BigDecimal value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_reward.create_user</code>.
     */
    public BigDecimal getCreateUser() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>ndt.t_village_company_reward.create_time</code>.
     */
    public TVillageCompanyRewardRecord setCreateTime(Timestamp value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_reward.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>ndt.t_village_company_reward.update_user</code>.
     */
    public TVillageCompanyRewardRecord setUpdateUser(BigDecimal value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_reward.update_user</code>.
     */
    public BigDecimal getUpdateUser() {
        return (BigDecimal) get(10);
    }

    /**
     * Setter for <code>ndt.t_village_company_reward.update_time</code>.
     */
    public TVillageCompanyRewardRecord setUpdateTime(Timestamp value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_reward.update_time</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(11);
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
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<BigDecimal, BigDecimal, Integer, String, String, String, Integer, Short, BigDecimal, Timestamp, BigDecimal, Timestamp> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<BigDecimal, BigDecimal, Integer, String, String, String, Integer, Short, BigDecimal, Timestamp, BigDecimal, Timestamp> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field1() {
        return TVillageCompanyReward.T_VILLAGE_COMPANY_REWARD.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field2() {
        return TVillageCompanyReward.T_VILLAGE_COMPANY_REWARD.VILLAGE_COMPANY_INFO_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TVillageCompanyReward.T_VILLAGE_COMPANY_REWARD.REORPU_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TVillageCompanyReward.T_VILLAGE_COMPANY_REWARD.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TVillageCompanyReward.T_VILLAGE_COMPANY_REWARD.AWARD_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TVillageCompanyReward.T_VILLAGE_COMPANY_REWARD.REGISTRATION_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return TVillageCompanyReward.T_VILLAGE_COMPANY_REWARD.STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field8() {
        return TVillageCompanyReward.T_VILLAGE_COMPANY_REWARD.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field9() {
        return TVillageCompanyReward.T_VILLAGE_COMPANY_REWARD.CREATE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return TVillageCompanyReward.T_VILLAGE_COMPANY_REWARD.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field11() {
        return TVillageCompanyReward.T_VILLAGE_COMPANY_REWARD.UPDATE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return TVillageCompanyReward.T_VILLAGE_COMPANY_REWARD.UPDATE_TIME;
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
    public Integer component3() {
        return getReorpuType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getAwardDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getRegistrationNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component8() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component9() {
        return getCreateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component10() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component11() {
        return getUpdateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component12() {
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
    public Integer value3() {
        return getReorpuType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getAwardDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getRegistrationNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value8() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value9() {
        return getCreateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value11() {
        return getUpdateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyRewardRecord value1(BigDecimal value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyRewardRecord value2(BigDecimal value) {
        setVillageCompanyInfoId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyRewardRecord value3(Integer value) {
        setReorpuType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyRewardRecord value4(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyRewardRecord value5(String value) {
        setAwardDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyRewardRecord value6(String value) {
        setRegistrationNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyRewardRecord value7(Integer value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyRewardRecord value8(Short value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyRewardRecord value9(BigDecimal value) {
        setCreateUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyRewardRecord value10(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyRewardRecord value11(BigDecimal value) {
        setUpdateUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyRewardRecord value12(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyRewardRecord values(BigDecimal value1, BigDecimal value2, Integer value3, String value4, String value5, String value6, Integer value7, Short value8, BigDecimal value9, Timestamp value10, BigDecimal value11, Timestamp value12) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TVillageCompanyRewardRecord
     */
    public TVillageCompanyRewardRecord() {
        super(TVillageCompanyReward.T_VILLAGE_COMPANY_REWARD);
    }

    /**
     * Create a detached, initialised TVillageCompanyRewardRecord
     */
    public TVillageCompanyRewardRecord(BigDecimal id, BigDecimal villageCompanyInfoId, Integer reorpuType, String type, String awardDate, String registrationNumber, Integer state, Short status, BigDecimal createUser, Timestamp createTime, BigDecimal updateUser, Timestamp updateTime) {
        super(TVillageCompanyReward.T_VILLAGE_COMPANY_REWARD);

        set(0, id);
        set(1, villageCompanyInfoId);
        set(2, reorpuType);
        set(3, type);
        set(4, awardDate);
        set(5, registrationNumber);
        set(6, state);
        set(7, status);
        set(8, createUser);
        set(9, createTime);
        set(10, updateUser);
        set(11, updateTime);
    }
}
