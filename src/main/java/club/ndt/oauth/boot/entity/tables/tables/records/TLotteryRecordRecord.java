/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables.records;


import club.ndt.oauth.boot.entity.tables.TLotteryRecord;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 抽奖记录表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TLotteryRecordRecord extends UpdatableRecordImpl<TLotteryRecordRecord> implements Record7<BigDecimal, Short, Short, BigDecimal, Integer, Timestamp, BigDecimal> {

    private static final long serialVersionUID = -604251825;

    /**
     * Setter for <code>ndt.t_lottery_record.user_id</code>. 用户ID
     */
    public TLotteryRecordRecord setUserId(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_lottery_record.user_id</code>. 用户ID
     */
    public BigDecimal getUserId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>ndt.t_lottery_record.is_win</code>. 是否中奖(1, 中奖、2, 未中奖)
     */
    public TLotteryRecordRecord setIsWin(Short value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_lottery_record.is_win</code>. 是否中奖(1, 中奖、2, 未中奖)
     */
    public Short getIsWin() {
        return (Short) get(1);
    }

    /**
     * Setter for <code>ndt.t_lottery_record.is_integral</code>. 是否是积分（1, 是、2, 不是）
     */
    public TLotteryRecordRecord setIsIntegral(Short value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_lottery_record.is_integral</code>. 是否是积分（1, 是、2, 不是）
     */
    public Short getIsIntegral() {
        return (Short) get(2);
    }

    /**
     * Setter for <code>ndt.t_lottery_record.ware_id</code>. 实物ID
     */
    public TLotteryRecordRecord setWareId(BigDecimal value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_lottery_record.ware_id</code>. 实物ID
     */
    public BigDecimal getWareId() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>ndt.t_lottery_record.integral_score</code>. 积分
     */
    public TLotteryRecordRecord setIntegralScore(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_lottery_record.integral_score</code>. 积分
     */
    public Integer getIntegralScore() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>ndt.t_lottery_record.record_date</code>. 记录时间
     */
    public TLotteryRecordRecord setRecordDate(Timestamp value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_lottery_record.record_date</code>. 记录时间
     */
    public Timestamp getRecordDate() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>ndt.t_lottery_record.id</code>. id
     */
    public TLotteryRecordRecord setId(BigDecimal value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_lottery_record.id</code>. id
     */
    public BigDecimal getId() {
        return (BigDecimal) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<BigDecimal, Short, Short, BigDecimal, Integer, Timestamp, BigDecimal> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<BigDecimal, Short, Short, BigDecimal, Integer, Timestamp, BigDecimal> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field1() {
        return TLotteryRecord.T_LOTTERY_RECORD.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field2() {
        return TLotteryRecord.T_LOTTERY_RECORD.IS_WIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field3() {
        return TLotteryRecord.T_LOTTERY_RECORD.IS_INTEGRAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return TLotteryRecord.T_LOTTERY_RECORD.WARE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return TLotteryRecord.T_LOTTERY_RECORD.INTEGRAL_SCORE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return TLotteryRecord.T_LOTTERY_RECORD.RECORD_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field7() {
        return TLotteryRecord.T_LOTTERY_RECORD.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component1() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component2() {
        return getIsWin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component3() {
        return getIsIntegral();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component4() {
        return getWareId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getIntegralScore();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getRecordDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component7() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value1() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value2() {
        return getIsWin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value3() {
        return getIsIntegral();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getWareId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getIntegralScore();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getRecordDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value7() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TLotteryRecordRecord value1(BigDecimal value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TLotteryRecordRecord value2(Short value) {
        setIsWin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TLotteryRecordRecord value3(Short value) {
        setIsIntegral(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TLotteryRecordRecord value4(BigDecimal value) {
        setWareId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TLotteryRecordRecord value5(Integer value) {
        setIntegralScore(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TLotteryRecordRecord value6(Timestamp value) {
        setRecordDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TLotteryRecordRecord value7(BigDecimal value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TLotteryRecordRecord values(BigDecimal value1, Short value2, Short value3, BigDecimal value4, Integer value5, Timestamp value6, BigDecimal value7) {
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
     * Create a detached TLotteryRecordRecord
     */
    public TLotteryRecordRecord() {
        super(TLotteryRecord.T_LOTTERY_RECORD);
    }

    /**
     * Create a detached, initialised TLotteryRecordRecord
     */
    public TLotteryRecordRecord(BigDecimal userId, Short isWin, Short isIntegral, BigDecimal wareId, Integer integralScore, Timestamp recordDate, BigDecimal id) {
        super(TLotteryRecord.T_LOTTERY_RECORD);

        set(0, userId);
        set(1, isWin);
        set(2, isIntegral);
        set(3, wareId);
        set(4, integralScore);
        set(5, recordDate);
        set(6, id);
    }
}