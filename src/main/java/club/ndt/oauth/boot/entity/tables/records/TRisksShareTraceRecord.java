/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables.records;


import club.ndt.oauth.boot.entity.tables.TRisksShareTrace;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


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
public class TRisksShareTraceRecord extends UpdatableRecordImpl<TRisksShareTraceRecord> implements Record7<Long, BigDecimal, String, Timestamp, Integer, Short, String> {

    private static final long serialVersionUID = 675692974;

    /**
     * Setter for <code>ndt.t_risks_share_trace.id</code>. 自增id
     */
    public TRisksShareTraceRecord setId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_risks_share_trace.id</code>. 自增id
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>ndt.t_risks_share_trace.loan_id</code>. 对应t_loan_done放款id
     */
    public TRisksShareTraceRecord setLoanId(BigDecimal value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_risks_share_trace.loan_id</code>. 对应t_loan_done放款id
     */
    public BigDecimal getLoanId() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>ndt.t_risks_share_trace.user_id</code>. 用户操作者id
     */
    public TRisksShareTraceRecord setUserId(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_risks_share_trace.user_id</code>. 用户操作者id
     */
    public String getUserId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ndt.t_risks_share_trace.create_time</code>. 创建时间
     */
    public TRisksShareTraceRecord setCreateTime(Timestamp value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_risks_share_trace.create_time</code>. 创建时间
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>ndt.t_risks_share_trace.state</code>. 所处的状态码,对应c_dict_type
     */
    public TRisksShareTraceRecord setState(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_risks_share_trace.state</code>. 所处的状态码,对应c_dict_type
     */
    public Integer getState() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>ndt.t_risks_share_trace.valid</code>. 1有效,2无效
     */
    public TRisksShareTraceRecord setValid(Short value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_risks_share_trace.valid</code>. 1有效,2无效
     */
    public Short getValid() {
        return (Short) get(5);
    }

    /**
     * Setter for <code>ndt.t_risks_share_trace.attach_data</code>. 每次提交的附加数据json存储
     */
    public TRisksShareTraceRecord setAttachData(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_risks_share_trace.attach_data</code>. 每次提交的附加数据json存储
     */
    public String getAttachData() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, BigDecimal, String, Timestamp, Integer, Short, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, BigDecimal, String, Timestamp, Integer, Short, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TRisksShareTrace.T_RISKS_SHARE_TRACE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field2() {
        return TRisksShareTrace.T_RISKS_SHARE_TRACE.LOAN_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TRisksShareTrace.T_RISKS_SHARE_TRACE.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return TRisksShareTrace.T_RISKS_SHARE_TRACE.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return TRisksShareTrace.T_RISKS_SHARE_TRACE.STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field6() {
        return TRisksShareTrace.T_RISKS_SHARE_TRACE.VALID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TRisksShareTrace.T_RISKS_SHARE_TRACE.ATTACH_DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component2() {
        return getLoanId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component6() {
        return getValid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getAttachData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value2() {
        return getLoanId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value6() {
        return getValid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getAttachData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRisksShareTraceRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRisksShareTraceRecord value2(BigDecimal value) {
        setLoanId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRisksShareTraceRecord value3(String value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRisksShareTraceRecord value4(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRisksShareTraceRecord value5(Integer value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRisksShareTraceRecord value6(Short value) {
        setValid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRisksShareTraceRecord value7(String value) {
        setAttachData(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRisksShareTraceRecord values(Long value1, BigDecimal value2, String value3, Timestamp value4, Integer value5, Short value6, String value7) {
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
     * Create a detached TRisksShareTraceRecord
     */
    public TRisksShareTraceRecord() {
        super(TRisksShareTrace.T_RISKS_SHARE_TRACE);
    }

    /**
     * Create a detached, initialised TRisksShareTraceRecord
     */
    public TRisksShareTraceRecord(Long id, BigDecimal loanId, String userId, Timestamp createTime, Integer state, Short valid, String attachData) {
        super(TRisksShareTrace.T_RISKS_SHARE_TRACE);

        set(0, id);
        set(1, loanId);
        set(2, userId);
        set(3, createTime);
        set(4, state);
        set(5, valid);
        set(6, attachData);
    }
}
