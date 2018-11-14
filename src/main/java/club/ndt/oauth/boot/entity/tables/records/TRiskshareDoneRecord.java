/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables.records;


import club.ndt.oauth.boot.entity.tables.TRiskshareDone;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 风险分担结果
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TRiskshareDoneRecord extends UpdatableRecordImpl<TRiskshareDoneRecord> implements Record10<BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, Integer, BigDecimal, BigDecimal, Timestamp, Short> {

    private static final long serialVersionUID = -870074183;

    /**
     * Setter for <code>ndt.t_riskshare_done.id</code>.
     */
    public TRiskshareDoneRecord setId(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_riskshare_done.id</code>.
     */
    public BigDecimal getId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>ndt.t_riskshare_done.riskshare_apply_id</code>. 风险分担申请ID
     */
    public TRiskshareDoneRecord setRiskshareApplyId(BigDecimal value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_riskshare_done.riskshare_apply_id</code>. 风险分担申请ID
     */
    public BigDecimal getRiskshareApplyId() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>ndt.t_riskshare_done.amount</code>. 风险分担金额
     */
    public TRiskshareDoneRecord setAmount(BigDecimal value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_riskshare_done.amount</code>. 风险分担金额
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for <code>ndt.t_riskshare_done.org_id</code>. 风险分担申请机构ID
     */
    public TRiskshareDoneRecord setOrgId(BigDecimal value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_riskshare_done.org_id</code>. 风险分担申请机构ID
     */
    public BigDecimal getOrgId() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>ndt.t_riskshare_done.invitation_user_id</code>. 风险分担贷款主体ID
     */
    public TRiskshareDoneRecord setInvitationUserId(BigDecimal value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_riskshare_done.invitation_user_id</code>. 风险分担贷款主体ID
     */
    public BigDecimal getInvitationUserId() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>ndt.t_riskshare_done.invitation_user_type</code>. 风险分担贷款主体类型
     */
    public TRiskshareDoneRecord setInvitationUserType(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_riskshare_done.invitation_user_type</code>. 风险分担贷款主体类型
     */
    public Integer getInvitationUserType() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>ndt.t_riskshare_done.user_admindivision_id</code>. 风险分担贷款主体所处行政区域
     */
    public TRiskshareDoneRecord setUserAdmindivisionId(BigDecimal value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_riskshare_done.user_admindivision_id</code>. 风险分担贷款主体所处行政区域
     */
    public BigDecimal getUserAdmindivisionId() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>ndt.t_riskshare_done.create_user</code>.
     */
    public TRiskshareDoneRecord setCreateUser(BigDecimal value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_riskshare_done.create_user</code>.
     */
    public BigDecimal getCreateUser() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>ndt.t_riskshare_done.create_time</code>.
     */
    public TRiskshareDoneRecord setCreateTime(Timestamp value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_riskshare_done.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>ndt.t_riskshare_done.status</code>.
     */
    public TRiskshareDoneRecord setStatus(Short value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_riskshare_done.status</code>.
     */
    public Short getStatus() {
        return (Short) get(9);
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
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, Integer, BigDecimal, BigDecimal, Timestamp, Short> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, Integer, BigDecimal, BigDecimal, Timestamp, Short> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field1() {
        return TRiskshareDone.T_RISKSHARE_DONE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field2() {
        return TRiskshareDone.T_RISKSHARE_DONE.RISKSHARE_APPLY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field3() {
        return TRiskshareDone.T_RISKSHARE_DONE.AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return TRiskshareDone.T_RISKSHARE_DONE.ORG_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return TRiskshareDone.T_RISKSHARE_DONE.INVITATION_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return TRiskshareDone.T_RISKSHARE_DONE.INVITATION_USER_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field7() {
        return TRiskshareDone.T_RISKSHARE_DONE.USER_ADMINDIVISION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field8() {
        return TRiskshareDone.T_RISKSHARE_DONE.CREATE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return TRiskshareDone.T_RISKSHARE_DONE.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field10() {
        return TRiskshareDone.T_RISKSHARE_DONE.STATUS;
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
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component4() {
        return getOrgId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component5() {
        return getInvitationUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getInvitationUserType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component7() {
        return getUserAdmindivisionId();
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
    public Short component10() {
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
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getOrgId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getInvitationUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getInvitationUserType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value7() {
        return getUserAdmindivisionId();
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
    public Short value10() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRiskshareDoneRecord value1(BigDecimal value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRiskshareDoneRecord value2(BigDecimal value) {
        setRiskshareApplyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRiskshareDoneRecord value3(BigDecimal value) {
        setAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRiskshareDoneRecord value4(BigDecimal value) {
        setOrgId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRiskshareDoneRecord value5(BigDecimal value) {
        setInvitationUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRiskshareDoneRecord value6(Integer value) {
        setInvitationUserType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRiskshareDoneRecord value7(BigDecimal value) {
        setUserAdmindivisionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRiskshareDoneRecord value8(BigDecimal value) {
        setCreateUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRiskshareDoneRecord value9(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRiskshareDoneRecord value10(Short value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRiskshareDoneRecord values(BigDecimal value1, BigDecimal value2, BigDecimal value3, BigDecimal value4, BigDecimal value5, Integer value6, BigDecimal value7, BigDecimal value8, Timestamp value9, Short value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TRiskshareDoneRecord
     */
    public TRiskshareDoneRecord() {
        super(TRiskshareDone.T_RISKSHARE_DONE);
    }

    /**
     * Create a detached, initialised TRiskshareDoneRecord
     */
    public TRiskshareDoneRecord(BigDecimal id, BigDecimal riskshareApplyId, BigDecimal amount, BigDecimal orgId, BigDecimal invitationUserId, Integer invitationUserType, BigDecimal userAdmindivisionId, BigDecimal createUser, Timestamp createTime, Short status) {
        super(TRiskshareDone.T_RISKSHARE_DONE);

        set(0, id);
        set(1, riskshareApplyId);
        set(2, amount);
        set(3, orgId);
        set(4, invitationUserId);
        set(5, invitationUserType);
        set(6, userAdmindivisionId);
        set(7, createUser);
        set(8, createTime);
        set(9, status);
    }
}
