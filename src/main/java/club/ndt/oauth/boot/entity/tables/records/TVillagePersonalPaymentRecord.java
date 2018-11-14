/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables.records;


import club.ndt.oauth.boot.entity.tables.TVillagePersonalPayment;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 水电气费缴费情况
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TVillagePersonalPaymentRecord extends UpdatableRecordImpl<TVillagePersonalPaymentRecord> implements Record12<BigDecimal, BigDecimal, String, BigDecimal, String, String, String, Short, BigDecimal, Timestamp, BigDecimal, Timestamp> {

    private static final long serialVersionUID = 1554845057;

    /**
     * Setter for <code>ndt.t_village_personal_payment.id</code>.
     */
    public TVillagePersonalPaymentRecord setId(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_payment.id</code>.
     */
    public BigDecimal getId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>ndt.t_village_personal_payment.baseinfo_id</code>. 对应用户基本信息id
     */
    public TVillagePersonalPaymentRecord setBaseinfoId(BigDecimal value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_payment.baseinfo_id</code>. 对应用户基本信息id
     */
    public BigDecimal getBaseinfoId() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>ndt.t_village_personal_payment.payment_month</code>. 缴费月份
     */
    public TVillagePersonalPaymentRecord setPaymentMonth(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_payment.payment_month</code>. 缴费月份
     */
    public String getPaymentMonth() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ndt.t_village_personal_payment.payment_amount</code>. 缴费金额
     */
    public TVillagePersonalPaymentRecord setPaymentAmount(BigDecimal value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_payment.payment_amount</code>. 缴费金额
     */
    public BigDecimal getPaymentAmount() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>ndt.t_village_personal_payment.payment_type</code>. 缴费类型
     */
    public TVillagePersonalPaymentRecord setPaymentType(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_payment.payment_type</code>. 缴费类型
     */
    public String getPaymentType() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ndt.t_village_personal_payment.use_num</code>. 用量
     */
    public TVillagePersonalPaymentRecord setUseNum(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_payment.use_num</code>. 用量
     */
    public String getUseNum() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ndt.t_village_personal_payment.pay_image_url</code>. 缴费相关图片路径
     */
    public TVillagePersonalPaymentRecord setPayImageUrl(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_payment.pay_image_url</code>. 缴费相关图片路径
     */
    public String getPayImageUrl() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ndt.t_village_personal_payment.status</code>.
     */
    public TVillagePersonalPaymentRecord setStatus(Short value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_payment.status</code>.
     */
    public Short getStatus() {
        return (Short) get(7);
    }

    /**
     * Setter for <code>ndt.t_village_personal_payment.create_user</code>.
     */
    public TVillagePersonalPaymentRecord setCreateUser(BigDecimal value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_payment.create_user</code>.
     */
    public BigDecimal getCreateUser() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>ndt.t_village_personal_payment.create_time</code>.
     */
    public TVillagePersonalPaymentRecord setCreateTime(Timestamp value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_payment.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>ndt.t_village_personal_payment.update_user</code>.
     */
    public TVillagePersonalPaymentRecord setUpdateUser(BigDecimal value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_payment.update_user</code>.
     */
    public BigDecimal getUpdateUser() {
        return (BigDecimal) get(10);
    }

    /**
     * Setter for <code>ndt.t_village_personal_payment.update_time</code>.
     */
    public TVillagePersonalPaymentRecord setUpdateTime(Timestamp value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_payment.update_time</code>.
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
    public Row12<BigDecimal, BigDecimal, String, BigDecimal, String, String, String, Short, BigDecimal, Timestamp, BigDecimal, Timestamp> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<BigDecimal, BigDecimal, String, BigDecimal, String, String, String, Short, BigDecimal, Timestamp, BigDecimal, Timestamp> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field1() {
        return TVillagePersonalPayment.T_VILLAGE_PERSONAL_PAYMENT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field2() {
        return TVillagePersonalPayment.T_VILLAGE_PERSONAL_PAYMENT.BASEINFO_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TVillagePersonalPayment.T_VILLAGE_PERSONAL_PAYMENT.PAYMENT_MONTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return TVillagePersonalPayment.T_VILLAGE_PERSONAL_PAYMENT.PAYMENT_AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TVillagePersonalPayment.T_VILLAGE_PERSONAL_PAYMENT.PAYMENT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TVillagePersonalPayment.T_VILLAGE_PERSONAL_PAYMENT.USE_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TVillagePersonalPayment.T_VILLAGE_PERSONAL_PAYMENT.PAY_IMAGE_URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field8() {
        return TVillagePersonalPayment.T_VILLAGE_PERSONAL_PAYMENT.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field9() {
        return TVillagePersonalPayment.T_VILLAGE_PERSONAL_PAYMENT.CREATE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return TVillagePersonalPayment.T_VILLAGE_PERSONAL_PAYMENT.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field11() {
        return TVillagePersonalPayment.T_VILLAGE_PERSONAL_PAYMENT.UPDATE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return TVillagePersonalPayment.T_VILLAGE_PERSONAL_PAYMENT.UPDATE_TIME;
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
        return getBaseinfoId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getPaymentMonth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component4() {
        return getPaymentAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getPaymentType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getUseNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getPayImageUrl();
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
        return getBaseinfoId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPaymentMonth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getPaymentAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getPaymentType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getUseNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getPayImageUrl();
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
    public TVillagePersonalPaymentRecord value1(BigDecimal value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalPaymentRecord value2(BigDecimal value) {
        setBaseinfoId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalPaymentRecord value3(String value) {
        setPaymentMonth(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalPaymentRecord value4(BigDecimal value) {
        setPaymentAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalPaymentRecord value5(String value) {
        setPaymentType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalPaymentRecord value6(String value) {
        setUseNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalPaymentRecord value7(String value) {
        setPayImageUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalPaymentRecord value8(Short value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalPaymentRecord value9(BigDecimal value) {
        setCreateUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalPaymentRecord value10(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalPaymentRecord value11(BigDecimal value) {
        setUpdateUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalPaymentRecord value12(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalPaymentRecord values(BigDecimal value1, BigDecimal value2, String value3, BigDecimal value4, String value5, String value6, String value7, Short value8, BigDecimal value9, Timestamp value10, BigDecimal value11, Timestamp value12) {
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
     * Create a detached TVillagePersonalPaymentRecord
     */
    public TVillagePersonalPaymentRecord() {
        super(TVillagePersonalPayment.T_VILLAGE_PERSONAL_PAYMENT);
    }

    /**
     * Create a detached, initialised TVillagePersonalPaymentRecord
     */
    public TVillagePersonalPaymentRecord(BigDecimal id, BigDecimal baseinfoId, String paymentMonth, BigDecimal paymentAmount, String paymentType, String useNum, String payImageUrl, Short status, BigDecimal createUser, Timestamp createTime, BigDecimal updateUser, Timestamp updateTime) {
        super(TVillagePersonalPayment.T_VILLAGE_PERSONAL_PAYMENT);

        set(0, id);
        set(1, baseinfoId);
        set(2, paymentMonth);
        set(3, paymentAmount);
        set(4, paymentType);
        set(5, useNum);
        set(6, payImageUrl);
        set(7, status);
        set(8, createUser);
        set(9, createTime);
        set(10, updateUser);
        set(11, updateTime);
    }
}
