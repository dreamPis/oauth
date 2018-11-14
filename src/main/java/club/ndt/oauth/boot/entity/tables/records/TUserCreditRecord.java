/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables.records;


import club.ndt.oauth.boot.entity.tables.TUserCredit;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 用户信用分数
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TUserCreditRecord extends UpdatableRecordImpl<TUserCreditRecord> implements Record14<BigDecimal, Integer, BigDecimal, Integer, Integer, Integer, Integer, Integer, Integer, Short, BigDecimal, Timestamp, BigDecimal, Timestamp> {

    private static final long serialVersionUID = 1907307006;

    /**
     * Setter for <code>ndt.t_user_credit.id</code>.
     */
    public TUserCreditRecord setId(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_user_credit.id</code>.
     */
    public BigDecimal getId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>ndt.t_user_credit.user_type</code>. 用户类型
     */
    public TUserCreditRecord setUserType(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_user_credit.user_type</code>. 用户类型
     */
    public Integer getUserType() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>ndt.t_user_credit.user_id</code>. 用户id
     */
    public TUserCreditRecord setUserId(BigDecimal value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_user_credit.user_id</code>. 用户id
     */
    public BigDecimal getUserId() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for <code>ndt.t_user_credit.contractual_capacity_score</code>. 履约能力分数
     */
    public TUserCreditRecord setContractualCapacityScore(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_user_credit.contractual_capacity_score</code>. 履约能力分数
     */
    public Integer getContractualCapacityScore() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>ndt.t_user_credit.credit_history_score</code>. 信用历史分数
     */
    public TUserCreditRecord setCreditHistoryScore(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_user_credit.credit_history_score</code>. 信用历史分数
     */
    public Integer getCreditHistoryScore() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>ndt.t_user_credit.info_score</code>. 用户信息分数
     */
    public TUserCreditRecord setInfoScore(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_user_credit.info_score</code>. 用户信息分数
     */
    public Integer getInfoScore() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>ndt.t_user_credit.ndt_score</code>. 平台分数
     */
    public TUserCreditRecord setNdtScore(Integer value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_user_credit.ndt_score</code>. 平台分数
     */
    public Integer getNdtScore() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>ndt.t_user_credit.total_score</code>. 总分数
     */
    public TUserCreditRecord setTotalScore(Integer value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_user_credit.total_score</code>. 总分数
     */
    public Integer getTotalScore() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>ndt.t_user_credit.level</code>. 等级,参考码表45
     */
    public TUserCreditRecord setLevel(Integer value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_user_credit.level</code>. 等级,参考码表45
     */
    public Integer getLevel() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>ndt.t_user_credit.status</code>.
     */
    public TUserCreditRecord setStatus(Short value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_user_credit.status</code>.
     */
    public Short getStatus() {
        return (Short) get(9);
    }

    /**
     * Setter for <code>ndt.t_user_credit.create_user</code>.
     */
    public TUserCreditRecord setCreateUser(BigDecimal value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_user_credit.create_user</code>.
     */
    public BigDecimal getCreateUser() {
        return (BigDecimal) get(10);
    }

    /**
     * Setter for <code>ndt.t_user_credit.create_time</code>.
     */
    public TUserCreditRecord setCreateTime(Timestamp value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_user_credit.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>ndt.t_user_credit.update_user</code>.
     */
    public TUserCreditRecord setUpdateUser(BigDecimal value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_user_credit.update_user</code>.
     */
    public BigDecimal getUpdateUser() {
        return (BigDecimal) get(12);
    }

    /**
     * Setter for <code>ndt.t_user_credit.update_time</code>.
     */
    public TUserCreditRecord setUpdateTime(Timestamp value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_user_credit.update_time</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(13);
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
    // Record14 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<BigDecimal, Integer, BigDecimal, Integer, Integer, Integer, Integer, Integer, Integer, Short, BigDecimal, Timestamp, BigDecimal, Timestamp> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<BigDecimal, Integer, BigDecimal, Integer, Integer, Integer, Integer, Integer, Integer, Short, BigDecimal, Timestamp, BigDecimal, Timestamp> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field1() {
        return TUserCredit.T_USER_CREDIT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return TUserCredit.T_USER_CREDIT.USER_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field3() {
        return TUserCredit.T_USER_CREDIT.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return TUserCredit.T_USER_CREDIT.CONTRACTUAL_CAPACITY_SCORE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return TUserCredit.T_USER_CREDIT.CREDIT_HISTORY_SCORE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return TUserCredit.T_USER_CREDIT.INFO_SCORE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return TUserCredit.T_USER_CREDIT.NDT_SCORE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return TUserCredit.T_USER_CREDIT.TOTAL_SCORE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return TUserCredit.T_USER_CREDIT.LEVEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field10() {
        return TUserCredit.T_USER_CREDIT.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field11() {
        return TUserCredit.T_USER_CREDIT.CREATE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return TUserCredit.T_USER_CREDIT.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field13() {
        return TUserCredit.T_USER_CREDIT.UPDATE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field14() {
        return TUserCredit.T_USER_CREDIT.UPDATE_TIME;
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
    public Integer component2() {
        return getUserType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component3() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getContractualCapacityScore();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getCreditHistoryScore();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getInfoScore();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getNdtScore();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getTotalScore();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getLevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component10() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component11() {
        return getCreateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component12() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component13() {
        return getUpdateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component14() {
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
    public Integer value2() {
        return getUserType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value3() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getContractualCapacityScore();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getCreditHistoryScore();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getInfoScore();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getNdtScore();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getTotalScore();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getLevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value10() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value11() {
        return getCreateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value13() {
        return getUpdateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value14() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserCreditRecord value1(BigDecimal value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserCreditRecord value2(Integer value) {
        setUserType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserCreditRecord value3(BigDecimal value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserCreditRecord value4(Integer value) {
        setContractualCapacityScore(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserCreditRecord value5(Integer value) {
        setCreditHistoryScore(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserCreditRecord value6(Integer value) {
        setInfoScore(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserCreditRecord value7(Integer value) {
        setNdtScore(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserCreditRecord value8(Integer value) {
        setTotalScore(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserCreditRecord value9(Integer value) {
        setLevel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserCreditRecord value10(Short value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserCreditRecord value11(BigDecimal value) {
        setCreateUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserCreditRecord value12(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserCreditRecord value13(BigDecimal value) {
        setUpdateUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserCreditRecord value14(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserCreditRecord values(BigDecimal value1, Integer value2, BigDecimal value3, Integer value4, Integer value5, Integer value6, Integer value7, Integer value8, Integer value9, Short value10, BigDecimal value11, Timestamp value12, BigDecimal value13, Timestamp value14) {
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
        value14(value14);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TUserCreditRecord
     */
    public TUserCreditRecord() {
        super(TUserCredit.T_USER_CREDIT);
    }

    /**
     * Create a detached, initialised TUserCreditRecord
     */
    public TUserCreditRecord(BigDecimal id, Integer userType, BigDecimal userId, Integer contractualCapacityScore, Integer creditHistoryScore, Integer infoScore, Integer ndtScore, Integer totalScore, Integer level, Short status, BigDecimal createUser, Timestamp createTime, BigDecimal updateUser, Timestamp updateTime) {
        super(TUserCredit.T_USER_CREDIT);

        set(0, id);
        set(1, userType);
        set(2, userId);
        set(3, contractualCapacityScore);
        set(4, creditHistoryScore);
        set(5, infoScore);
        set(6, ndtScore);
        set(7, totalScore);
        set(8, level);
        set(9, status);
        set(10, createUser);
        set(11, createTime);
        set(12, updateUser);
        set(13, updateTime);
    }
}
