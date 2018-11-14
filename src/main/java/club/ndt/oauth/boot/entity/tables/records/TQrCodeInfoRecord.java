/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.records;


import com.ndt.sms.entity.tables.TQrCodeInfo;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 二维码扫码推广注册详细信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TQrCodeInfoRecord extends UpdatableRecordImpl<TQrCodeInfoRecord> implements Record9<BigDecimal, BigDecimal, BigDecimal, Timestamp, Integer, Short, BigDecimal, BigDecimal, Integer> {

    private static final long serialVersionUID = -117259305;

    /**
     * Setter for <code>ndt.t_qr_code_info.id</code>. 主键
     */
    public TQrCodeInfoRecord setId(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_qr_code_info.id</code>. 主键
     */
    public BigDecimal getId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>ndt.t_qr_code_info.registered_user_id</code>. 注册人用户ID
     */
    public TQrCodeInfoRecord setRegisteredUserId(BigDecimal value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_qr_code_info.registered_user_id</code>. 注册人用户ID
     */
    public BigDecimal getRegisteredUserId() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>ndt.t_qr_code_info.promotion_user_id</code>. 推广人ID
     */
    public TQrCodeInfoRecord setPromotionUserId(BigDecimal value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_qr_code_info.promotion_user_id</code>. 推广人ID
     */
    public BigDecimal getPromotionUserId() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for <code>ndt.t_qr_code_info.create_at</code>. 注册时间
     */
    public TQrCodeInfoRecord setCreateAt(Timestamp value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_qr_code_info.create_at</code>. 注册时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>ndt.t_qr_code_info.source</code>. 来源
     */
    public TQrCodeInfoRecord setSource(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_qr_code_info.source</code>. 来源
     */
    public Integer getSource() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>ndt.t_qr_code_info.promotion_type</code>. 1、注册，2、贷款
     */
    public TQrCodeInfoRecord setPromotionType(Short value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_qr_code_info.promotion_type</code>. 1、注册，2、贷款
     */
    public Short getPromotionType() {
        return (Short) get(5);
    }

    /**
     * Setter for <code>ndt.t_qr_code_info.product_id</code>. 产品ID
     */
    public TQrCodeInfoRecord setProductId(BigDecimal value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_qr_code_info.product_id</code>. 产品ID
     */
    public BigDecimal getProductId() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>ndt.t_qr_code_info.invitation_id</code>. 贷款邀约ID
     */
    public TQrCodeInfoRecord setInvitationId(BigDecimal value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_qr_code_info.invitation_id</code>. 贷款邀约ID
     */
    public BigDecimal getInvitationId() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>ndt.t_qr_code_info.product_type</code>. 产品类型
     */
    public TQrCodeInfoRecord setProductType(Integer value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_qr_code_info.product_type</code>. 产品类型
     */
    public Integer getProductType() {
        return (Integer) get(8);
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
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<BigDecimal, BigDecimal, BigDecimal, Timestamp, Integer, Short, BigDecimal, BigDecimal, Integer> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<BigDecimal, BigDecimal, BigDecimal, Timestamp, Integer, Short, BigDecimal, BigDecimal, Integer> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field1() {
        return TQrCodeInfo.T_QR_CODE_INFO.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field2() {
        return TQrCodeInfo.T_QR_CODE_INFO.REGISTERED_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field3() {
        return TQrCodeInfo.T_QR_CODE_INFO.PROMOTION_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return TQrCodeInfo.T_QR_CODE_INFO.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return TQrCodeInfo.T_QR_CODE_INFO.SOURCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field6() {
        return TQrCodeInfo.T_QR_CODE_INFO.PROMOTION_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field7() {
        return TQrCodeInfo.T_QR_CODE_INFO.PRODUCT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field8() {
        return TQrCodeInfo.T_QR_CODE_INFO.INVITATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return TQrCodeInfo.T_QR_CODE_INFO.PRODUCT_TYPE;
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
        return getRegisteredUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component3() {
        return getPromotionUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getSource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component6() {
        return getPromotionType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component7() {
        return getProductId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component8() {
        return getInvitationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getProductType();
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
        return getRegisteredUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value3() {
        return getPromotionUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getSource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value6() {
        return getPromotionType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value7() {
        return getProductId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value8() {
        return getInvitationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getProductType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQrCodeInfoRecord value1(BigDecimal value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQrCodeInfoRecord value2(BigDecimal value) {
        setRegisteredUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQrCodeInfoRecord value3(BigDecimal value) {
        setPromotionUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQrCodeInfoRecord value4(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQrCodeInfoRecord value5(Integer value) {
        setSource(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQrCodeInfoRecord value6(Short value) {
        setPromotionType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQrCodeInfoRecord value7(BigDecimal value) {
        setProductId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQrCodeInfoRecord value8(BigDecimal value) {
        setInvitationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQrCodeInfoRecord value9(Integer value) {
        setProductType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TQrCodeInfoRecord values(BigDecimal value1, BigDecimal value2, BigDecimal value3, Timestamp value4, Integer value5, Short value6, BigDecimal value7, BigDecimal value8, Integer value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TQrCodeInfoRecord
     */
    public TQrCodeInfoRecord() {
        super(TQrCodeInfo.T_QR_CODE_INFO);
    }

    /**
     * Create a detached, initialised TQrCodeInfoRecord
     */
    public TQrCodeInfoRecord(BigDecimal id, BigDecimal registeredUserId, BigDecimal promotionUserId, Timestamp createAt, Integer source, Short promotionType, BigDecimal productId, BigDecimal invitationId, Integer productType) {
        super(TQrCodeInfo.T_QR_CODE_INFO);

        set(0, id);
        set(1, registeredUserId);
        set(2, promotionUserId);
        set(3, createAt);
        set(4, source);
        set(5, promotionType);
        set(6, productId);
        set(7, invitationId);
        set(8, productType);
    }
}
