/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables.records;


import club.ndt.oauth.boot.entity.tables.TRiskshareApplyProcess;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 风险分担申请处理
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TRiskshareApplyProcessRecord extends UpdatableRecordImpl<TRiskshareApplyProcessRecord> implements Record11<BigDecimal, BigDecimal, BigDecimal, String, BigDecimal, String, String, Integer, BigDecimal, Timestamp, Short> {

    private static final long serialVersionUID = -1899798560;

    /**
     * Setter for <code>ndt.t_riskshare_apply_process.id</code>.
     */
    public TRiskshareApplyProcessRecord setId(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_riskshare_apply_process.id</code>.
     */
    public BigDecimal getId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>ndt.t_riskshare_apply_process.riskshare_apply_id</code>. 风险分担申请ID
     */
    public TRiskshareApplyProcessRecord setRiskshareApplyId(BigDecimal value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_riskshare_apply_process.riskshare_apply_id</code>. 风险分担申请ID
     */
    public BigDecimal getRiskshareApplyId() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>ndt.t_riskshare_apply_process.handler_id</code>. 风险分担处理人ID
     */
    public TRiskshareApplyProcessRecord setHandlerId(BigDecimal value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_riskshare_apply_process.handler_id</code>. 风险分担处理人ID
     */
    public BigDecimal getHandlerId() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for <code>ndt.t_riskshare_apply_process.handler_name</code>. 风险分担处理人名称
     */
    public TRiskshareApplyProcessRecord setHandlerName(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_riskshare_apply_process.handler_name</code>. 风险分担处理人名称
     */
    public String getHandlerName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ndt.t_riskshare_apply_process.amount</code>. 风险分担阶段决定的金额
     */
    public TRiskshareApplyProcessRecord setAmount(BigDecimal value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_riskshare_apply_process.amount</code>. 风险分担阶段决定的金额
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>ndt.t_riskshare_apply_process.msg</code>.
     */
    public TRiskshareApplyProcessRecord setMsg(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_riskshare_apply_process.msg</code>.
     */
    public String getMsg() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ndt.t_riskshare_apply_process.handler_files</code>. 风险分担处理提供文件
     */
    public TRiskshareApplyProcessRecord setHandlerFiles(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_riskshare_apply_process.handler_files</code>. 风险分担处理提供文件
     */
    public String getHandlerFiles() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ndt.t_riskshare_apply_process.state</code>. 分担申请所处阶段
     */
    public TRiskshareApplyProcessRecord setState(Integer value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_riskshare_apply_process.state</code>. 分担申请所处阶段
     */
    public Integer getState() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>ndt.t_riskshare_apply_process.create_user</code>.
     */
    public TRiskshareApplyProcessRecord setCreateUser(BigDecimal value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_riskshare_apply_process.create_user</code>.
     */
    public BigDecimal getCreateUser() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>ndt.t_riskshare_apply_process.create_time</code>.
     */
    public TRiskshareApplyProcessRecord setCreateTime(Timestamp value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_riskshare_apply_process.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>ndt.t_riskshare_apply_process.status</code>.
     */
    public TRiskshareApplyProcessRecord setStatus(Short value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_riskshare_apply_process.status</code>.
     */
    public Short getStatus() {
        return (Short) get(10);
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
    public Row11<BigDecimal, BigDecimal, BigDecimal, String, BigDecimal, String, String, Integer, BigDecimal, Timestamp, Short> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<BigDecimal, BigDecimal, BigDecimal, String, BigDecimal, String, String, Integer, BigDecimal, Timestamp, Short> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field1() {
        return TRiskshareApplyProcess.T_RISKSHARE_APPLY_PROCESS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field2() {
        return TRiskshareApplyProcess.T_RISKSHARE_APPLY_PROCESS.RISKSHARE_APPLY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field3() {
        return TRiskshareApplyProcess.T_RISKSHARE_APPLY_PROCESS.HANDLER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TRiskshareApplyProcess.T_RISKSHARE_APPLY_PROCESS.HANDLER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return TRiskshareApplyProcess.T_RISKSHARE_APPLY_PROCESS.AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TRiskshareApplyProcess.T_RISKSHARE_APPLY_PROCESS.MSG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TRiskshareApplyProcess.T_RISKSHARE_APPLY_PROCESS.HANDLER_FILES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return TRiskshareApplyProcess.T_RISKSHARE_APPLY_PROCESS.STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field9() {
        return TRiskshareApplyProcess.T_RISKSHARE_APPLY_PROCESS.CREATE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return TRiskshareApplyProcess.T_RISKSHARE_APPLY_PROCESS.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field11() {
        return TRiskshareApplyProcess.T_RISKSHARE_APPLY_PROCESS.STATUS;
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
        return getRiskshareApplyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component3() {
        return getHandlerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getHandlerName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component5() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getMsg();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getHandlerFiles();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getState();
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
    public Short component11() {
        return getStatus();
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
        return getRiskshareApplyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value3() {
        return getHandlerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getHandlerName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getMsg();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getHandlerFiles();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getState();
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
    public Short value11() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRiskshareApplyProcessRecord value1(BigDecimal value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRiskshareApplyProcessRecord value2(BigDecimal value) {
        setRiskshareApplyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRiskshareApplyProcessRecord value3(BigDecimal value) {
        setHandlerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRiskshareApplyProcessRecord value4(String value) {
        setHandlerName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRiskshareApplyProcessRecord value5(BigDecimal value) {
        setAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRiskshareApplyProcessRecord value6(String value) {
        setMsg(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRiskshareApplyProcessRecord value7(String value) {
        setHandlerFiles(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRiskshareApplyProcessRecord value8(Integer value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRiskshareApplyProcessRecord value9(BigDecimal value) {
        setCreateUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRiskshareApplyProcessRecord value10(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRiskshareApplyProcessRecord value11(Short value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRiskshareApplyProcessRecord values(BigDecimal value1, BigDecimal value2, BigDecimal value3, String value4, BigDecimal value5, String value6, String value7, Integer value8, BigDecimal value9, Timestamp value10, Short value11) {
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
     * Create a detached TRiskshareApplyProcessRecord
     */
    public TRiskshareApplyProcessRecord() {
        super(TRiskshareApplyProcess.T_RISKSHARE_APPLY_PROCESS);
    }

    /**
     * Create a detached, initialised TRiskshareApplyProcessRecord
     */
    public TRiskshareApplyProcessRecord(BigDecimal id, BigDecimal riskshareApplyId, BigDecimal handlerId, String handlerName, BigDecimal amount, String msg, String handlerFiles, Integer state, BigDecimal createUser, Timestamp createTime, Short status) {
        super(TRiskshareApplyProcess.T_RISKSHARE_APPLY_PROCESS);

        set(0, id);
        set(1, riskshareApplyId);
        set(2, handlerId);
        set(3, handlerName);
        set(4, amount);
        set(5, msg);
        set(6, handlerFiles);
        set(7, state);
        set(8, createUser);
        set(9, createTime);
        set(10, status);
    }
}
