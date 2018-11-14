/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.records;


import com.ndt.sms.entity.tables.ActRuExecution;

import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record17;
import org.jooq.Row17;
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
public class ActRuExecutionRecord extends UpdatableRecordImpl<ActRuExecutionRecord> implements Record17<String, Integer, String, String, String, String, String, String, Boolean, Boolean, Boolean, Boolean, Integer, Integer, String, String, Timestamp> {

    private static final long serialVersionUID = -454784920;

    /**
     * Setter for <code>ndt.act_ru_execution.id_</code>.
     */
    public ActRuExecutionRecord setId_(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_ru_execution.id_</code>.
     */
    public String getId_() {
        return (String) get(0);
    }

    /**
     * Setter for <code>ndt.act_ru_execution.rev_</code>.
     */
    public ActRuExecutionRecord setRev_(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_ru_execution.rev_</code>.
     */
    public Integer getRev_() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>ndt.act_ru_execution.proc_inst_id_</code>.
     */
    public ActRuExecutionRecord setProcInstId_(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_ru_execution.proc_inst_id_</code>.
     */
    public String getProcInstId_() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ndt.act_ru_execution.business_key_</code>.
     */
    public ActRuExecutionRecord setBusinessKey_(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_ru_execution.business_key_</code>.
     */
    public String getBusinessKey_() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ndt.act_ru_execution.parent_id_</code>.
     */
    public ActRuExecutionRecord setParentId_(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_ru_execution.parent_id_</code>.
     */
    public String getParentId_() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ndt.act_ru_execution.proc_def_id_</code>.
     */
    public ActRuExecutionRecord setProcDefId_(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_ru_execution.proc_def_id_</code>.
     */
    public String getProcDefId_() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ndt.act_ru_execution.super_exec_</code>.
     */
    public ActRuExecutionRecord setSuperExec_(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_ru_execution.super_exec_</code>.
     */
    public String getSuperExec_() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ndt.act_ru_execution.act_id_</code>.
     */
    public ActRuExecutionRecord setActId_(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_ru_execution.act_id_</code>.
     */
    public String getActId_() {
        return (String) get(7);
    }

    /**
     * Setter for <code>ndt.act_ru_execution.is_active_</code>.
     */
    public ActRuExecutionRecord setIsActive_(Boolean value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_ru_execution.is_active_</code>.
     */
    public Boolean getIsActive_() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>ndt.act_ru_execution.is_concurrent_</code>.
     */
    public ActRuExecutionRecord setIsConcurrent_(Boolean value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_ru_execution.is_concurrent_</code>.
     */
    public Boolean getIsConcurrent_() {
        return (Boolean) get(9);
    }

    /**
     * Setter for <code>ndt.act_ru_execution.is_scope_</code>.
     */
    public ActRuExecutionRecord setIsScope_(Boolean value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_ru_execution.is_scope_</code>.
     */
    public Boolean getIsScope_() {
        return (Boolean) get(10);
    }

    /**
     * Setter for <code>ndt.act_ru_execution.is_event_scope_</code>.
     */
    public ActRuExecutionRecord setIsEventScope_(Boolean value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_ru_execution.is_event_scope_</code>.
     */
    public Boolean getIsEventScope_() {
        return (Boolean) get(11);
    }

    /**
     * Setter for <code>ndt.act_ru_execution.suspension_state_</code>.
     */
    public ActRuExecutionRecord setSuspensionState_(Integer value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_ru_execution.suspension_state_</code>.
     */
    public Integer getSuspensionState_() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>ndt.act_ru_execution.cached_ent_state_</code>.
     */
    public ActRuExecutionRecord setCachedEntState_(Integer value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_ru_execution.cached_ent_state_</code>.
     */
    public Integer getCachedEntState_() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>ndt.act_ru_execution.tenant_id_</code>.
     */
    public ActRuExecutionRecord setTenantId_(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_ru_execution.tenant_id_</code>.
     */
    public String getTenantId_() {
        return (String) get(14);
    }

    /**
     * Setter for <code>ndt.act_ru_execution.name_</code>.
     */
    public ActRuExecutionRecord setName_(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_ru_execution.name_</code>.
     */
    public String getName_() {
        return (String) get(15);
    }

    /**
     * Setter for <code>ndt.act_ru_execution.lock_time_</code>.
     */
    public ActRuExecutionRecord setLockTime_(Timestamp value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_ru_execution.lock_time_</code>.
     */
    public Timestamp getLockTime_() {
        return (Timestamp) get(16);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record17 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<String, Integer, String, String, String, String, String, String, Boolean, Boolean, Boolean, Boolean, Integer, Integer, String, String, Timestamp> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<String, Integer, String, String, String, String, String, String, Boolean, Boolean, Boolean, Boolean, Integer, Integer, String, String, Timestamp> valuesRow() {
        return (Row17) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return ActRuExecution.ACT_RU_EXECUTION.ID_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ActRuExecution.ACT_RU_EXECUTION.REV_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ActRuExecution.ACT_RU_EXECUTION.PROC_INST_ID_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ActRuExecution.ACT_RU_EXECUTION.BUSINESS_KEY_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ActRuExecution.ACT_RU_EXECUTION.PARENT_ID_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ActRuExecution.ACT_RU_EXECUTION.PROC_DEF_ID_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ActRuExecution.ACT_RU_EXECUTION.SUPER_EXEC_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return ActRuExecution.ACT_RU_EXECUTION.ACT_ID_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field9() {
        return ActRuExecution.ACT_RU_EXECUTION.IS_ACTIVE_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field10() {
        return ActRuExecution.ACT_RU_EXECUTION.IS_CONCURRENT_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field11() {
        return ActRuExecution.ACT_RU_EXECUTION.IS_SCOPE_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field12() {
        return ActRuExecution.ACT_RU_EXECUTION.IS_EVENT_SCOPE_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field13() {
        return ActRuExecution.ACT_RU_EXECUTION.SUSPENSION_STATE_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field14() {
        return ActRuExecution.ACT_RU_EXECUTION.CACHED_ENT_STATE_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return ActRuExecution.ACT_RU_EXECUTION.TENANT_ID_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return ActRuExecution.ACT_RU_EXECUTION.NAME_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field17() {
        return ActRuExecution.ACT_RU_EXECUTION.LOCK_TIME_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getRev_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getProcInstId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getBusinessKey_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getParentId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getProcDefId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getSuperExec_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getActId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component9() {
        return getIsActive_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component10() {
        return getIsConcurrent_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component11() {
        return getIsScope_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component12() {
        return getIsEventScope_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component13() {
        return getSuspensionState_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component14() {
        return getCachedEntState_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getTenantId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getName_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component17() {
        return getLockTime_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getRev_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getProcInstId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getBusinessKey_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getParentId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getProcDefId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getSuperExec_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getActId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value9() {
        return getIsActive_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value10() {
        return getIsConcurrent_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value11() {
        return getIsScope_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value12() {
        return getIsEventScope_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value13() {
        return getSuspensionState_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value14() {
        return getCachedEntState_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getTenantId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getName_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value17() {
        return getLockTime_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuExecutionRecord value1(String value) {
        setId_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuExecutionRecord value2(Integer value) {
        setRev_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuExecutionRecord value3(String value) {
        setProcInstId_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuExecutionRecord value4(String value) {
        setBusinessKey_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuExecutionRecord value5(String value) {
        setParentId_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuExecutionRecord value6(String value) {
        setProcDefId_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuExecutionRecord value7(String value) {
        setSuperExec_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuExecutionRecord value8(String value) {
        setActId_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuExecutionRecord value9(Boolean value) {
        setIsActive_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuExecutionRecord value10(Boolean value) {
        setIsConcurrent_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuExecutionRecord value11(Boolean value) {
        setIsScope_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuExecutionRecord value12(Boolean value) {
        setIsEventScope_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuExecutionRecord value13(Integer value) {
        setSuspensionState_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuExecutionRecord value14(Integer value) {
        setCachedEntState_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuExecutionRecord value15(String value) {
        setTenantId_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuExecutionRecord value16(String value) {
        setName_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuExecutionRecord value17(Timestamp value) {
        setLockTime_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuExecutionRecord values(String value1, Integer value2, String value3, String value4, String value5, String value6, String value7, String value8, Boolean value9, Boolean value10, Boolean value11, Boolean value12, Integer value13, Integer value14, String value15, String value16, Timestamp value17) {
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
        value15(value15);
        value16(value16);
        value17(value17);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ActRuExecutionRecord
     */
    public ActRuExecutionRecord() {
        super(ActRuExecution.ACT_RU_EXECUTION);
    }

    /**
     * Create a detached, initialised ActRuExecutionRecord
     */
    public ActRuExecutionRecord(String id_, Integer rev_, String procInstId_, String businessKey_, String parentId_, String procDefId_, String superExec_, String actId_, Boolean isActive_, Boolean isConcurrent_, Boolean isScope_, Boolean isEventScope_, Integer suspensionState_, Integer cachedEntState_, String tenantId_, String name_, Timestamp lockTime_) {
        super(ActRuExecution.ACT_RU_EXECUTION);

        set(0, id_);
        set(1, rev_);
        set(2, procInstId_);
        set(3, businessKey_);
        set(4, parentId_);
        set(5, procDefId_);
        set(6, superExec_);
        set(7, actId_);
        set(8, isActive_);
        set(9, isConcurrent_);
        set(10, isScope_);
        set(11, isEventScope_);
        set(12, suspensionState_);
        set(13, cachedEntState_);
        set(14, tenantId_);
        set(15, name_);
        set(16, lockTime_);
    }
}
