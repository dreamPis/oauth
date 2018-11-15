/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables.records;


import club.ndt.oauth.boot.entity.tables.TPersonalDetail;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 个人用户详情表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TPersonalDetailRecord extends UpdatableRecordImpl<TPersonalDetailRecord> implements Record14<BigDecimal, String, Boolean, String, Integer, Integer, String, Boolean, Integer, Short, Short, Timestamp, BigDecimal, String> {

    private static final long serialVersionUID = 2132245523;

    /**
     * Setter for <code>ndt.t_personal_detail.id</code>.
     */
    public TPersonalDetailRecord setId(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_personal_detail.id</code>.
     */
    public BigDecimal getId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>ndt.t_personal_detail.identity_id</code>. 身份证
     */
    public TPersonalDetailRecord setIdentityId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_personal_detail.identity_id</code>. 身份证
     */
    public String getIdentityId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ndt.t_personal_detail.is_emerging</code>. 是否为新兴经营主体
     */
    public TPersonalDetailRecord setIsEmerging(Boolean value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_personal_detail.is_emerging</code>. 是否为新兴经营主体
     */
    public Boolean getIsEmerging() {
        return (Boolean) get(2);
    }

    /**
     * Setter for <code>ndt.t_personal_detail.address</code>. 地址
     */
    public TPersonalDetailRecord setAddress(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_personal_detail.address</code>. 地址
     */
    public String getAddress() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ndt.t_personal_detail.marital_status</code>. 婚姻状况
     */
    public TPersonalDetailRecord setMaritalStatus(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_personal_detail.marital_status</code>. 婚姻状况
     */
    public Integer getMaritalStatus() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>ndt.t_personal_detail.evaluate</code>. 道德评价
     */
    public TPersonalDetailRecord setEvaluate(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_personal_detail.evaluate</code>. 道德评价
     */
    public Integer getEvaluate() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>ndt.t_personal_detail.badhabits</code>. 不良嗜好
     */
    public TPersonalDetailRecord setBadhabits(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_personal_detail.badhabits</code>. 不良嗜好
     */
    public String getBadhabits() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ndt.t_personal_detail.is_crimed</code>. 是否有犯罪记录
     */
    public TPersonalDetailRecord setIsCrimed(Boolean value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_personal_detail.is_crimed</code>. 是否有犯罪记录
     */
    public Boolean getIsCrimed() {
        return (Boolean) get(7);
    }

    /**
     * Setter for <code>ndt.t_personal_detail.education</code>. 学历
     */
    public TPersonalDetailRecord setEducation(Integer value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_personal_detail.education</code>. 学历
     */
    public Integer getEducation() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>ndt.t_personal_detail.support_num</code>. 赡养人数
     */
    public TPersonalDetailRecord setSupportNum(Short value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_personal_detail.support_num</code>. 赡养人数
     */
    public Short getSupportNum() {
        return (Short) get(9);
    }

    /**
     * Setter for <code>ndt.t_personal_detail.monitor_children</code>. 未成年子女数
     */
    public TPersonalDetailRecord setMonitorChildren(Short value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_personal_detail.monitor_children</code>. 未成年子女数
     */
    public Short getMonitorChildren() {
        return (Short) get(10);
    }

    /**
     * Setter for <code>ndt.t_personal_detail.update_at</code>. 更新时间
     */
    public TPersonalDetailRecord setUpdateAt(Timestamp value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_personal_detail.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>ndt.t_personal_detail.update_by</code>. 更新人
     */
    public TPersonalDetailRecord setUpdateBy(BigDecimal value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_personal_detail.update_by</code>. 更新人
     */
    public BigDecimal getUpdateBy() {
        return (BigDecimal) get(12);
    }

    /**
     * Setter for <code>ndt.t_personal_detail.related_img_urls</code>. 相关照片
     */
    public TPersonalDetailRecord setRelatedImgUrls(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_personal_detail.related_img_urls</code>. 相关照片
     */
    public String getRelatedImgUrls() {
        return (String) get(13);
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
    public Row14<BigDecimal, String, Boolean, String, Integer, Integer, String, Boolean, Integer, Short, Short, Timestamp, BigDecimal, String> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<BigDecimal, String, Boolean, String, Integer, Integer, String, Boolean, Integer, Short, Short, Timestamp, BigDecimal, String> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field1() {
        return TPersonalDetail.T_PERSONAL_DETAIL.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TPersonalDetail.T_PERSONAL_DETAIL.IDENTITY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field3() {
        return TPersonalDetail.T_PERSONAL_DETAIL.IS_EMERGING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TPersonalDetail.T_PERSONAL_DETAIL.ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return TPersonalDetail.T_PERSONAL_DETAIL.MARITAL_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return TPersonalDetail.T_PERSONAL_DETAIL.EVALUATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TPersonalDetail.T_PERSONAL_DETAIL.BADHABITS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field8() {
        return TPersonalDetail.T_PERSONAL_DETAIL.IS_CRIMED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return TPersonalDetail.T_PERSONAL_DETAIL.EDUCATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field10() {
        return TPersonalDetail.T_PERSONAL_DETAIL.SUPPORT_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field11() {
        return TPersonalDetail.T_PERSONAL_DETAIL.MONITOR_CHILDREN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return TPersonalDetail.T_PERSONAL_DETAIL.UPDATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field13() {
        return TPersonalDetail.T_PERSONAL_DETAIL.UPDATE_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return TPersonalDetail.T_PERSONAL_DETAIL.RELATED_IMG_URLS;
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
    public String component2() {
        return getIdentityId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component3() {
        return getIsEmerging();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getMaritalStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getEvaluate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getBadhabits();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component8() {
        return getIsCrimed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getEducation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component10() {
        return getSupportNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component11() {
        return getMonitorChildren();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component12() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component13() {
        return getUpdateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getRelatedImgUrls();
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
    public String value2() {
        return getIdentityId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value3() {
        return getIsEmerging();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getMaritalStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getEvaluate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getBadhabits();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value8() {
        return getIsCrimed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getEducation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value10() {
        return getSupportNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value11() {
        return getMonitorChildren();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getUpdateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value13() {
        return getUpdateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getRelatedImgUrls();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPersonalDetailRecord value1(BigDecimal value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPersonalDetailRecord value2(String value) {
        setIdentityId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPersonalDetailRecord value3(Boolean value) {
        setIsEmerging(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPersonalDetailRecord value4(String value) {
        setAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPersonalDetailRecord value5(Integer value) {
        setMaritalStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPersonalDetailRecord value6(Integer value) {
        setEvaluate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPersonalDetailRecord value7(String value) {
        setBadhabits(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPersonalDetailRecord value8(Boolean value) {
        setIsCrimed(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPersonalDetailRecord value9(Integer value) {
        setEducation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPersonalDetailRecord value10(Short value) {
        setSupportNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPersonalDetailRecord value11(Short value) {
        setMonitorChildren(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPersonalDetailRecord value12(Timestamp value) {
        setUpdateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPersonalDetailRecord value13(BigDecimal value) {
        setUpdateBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPersonalDetailRecord value14(String value) {
        setRelatedImgUrls(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPersonalDetailRecord values(BigDecimal value1, String value2, Boolean value3, String value4, Integer value5, Integer value6, String value7, Boolean value8, Integer value9, Short value10, Short value11, Timestamp value12, BigDecimal value13, String value14) {
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
     * Create a detached TPersonalDetailRecord
     */
    public TPersonalDetailRecord() {
        super(TPersonalDetail.T_PERSONAL_DETAIL);
    }

    /**
     * Create a detached, initialised TPersonalDetailRecord
     */
    public TPersonalDetailRecord(BigDecimal id, String identityId, Boolean isEmerging, String address, Integer maritalStatus, Integer evaluate, String badhabits, Boolean isCrimed, Integer education, Short supportNum, Short monitorChildren, Timestamp updateAt, BigDecimal updateBy, String relatedImgUrls) {
        super(TPersonalDetail.T_PERSONAL_DETAIL);

        set(0, id);
        set(1, identityId);
        set(2, isEmerging);
        set(3, address);
        set(4, maritalStatus);
        set(5, evaluate);
        set(6, badhabits);
        set(7, isCrimed);
        set(8, education);
        set(9, supportNum);
        set(10, monitorChildren);
        set(11, updateAt);
        set(12, updateBy);
        set(13, relatedImgUrls);
    }
}
