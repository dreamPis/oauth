/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables.records;


import club.ndt.oauth.boot.entity.tables.TCompanyDetail;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 企业用户信息表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TCompanyDetailRecord extends UpdatableRecordImpl<TCompanyDetailRecord> {

    private static final long serialVersionUID = 821662545;

    /**
     * Setter for <code>ndt.t_company_detail.id</code>.
     */
    public TCompanyDetailRecord setId(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_company_detail.id</code>.
     */
    public BigDecimal getId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>ndt.t_company_detail.contact_id</code>. 联系人用户id
     */
    public TCompanyDetailRecord setContactId(BigDecimal value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_company_detail.contact_id</code>. 联系人用户id
     */
    public BigDecimal getContactId() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>ndt.t_company_detail.certificate_type</code>. 证件类型
     */
    public TCompanyDetailRecord setCertificateType(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_company_detail.certificate_type</code>. 证件类型
     */
    public Integer getCertificateType() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>ndt.t_company_detail.name</code>. 企业名称
     */
    public TCompanyDetailRecord setName(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_company_detail.name</code>. 企业名称
     */
    public String getName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ndt.t_company_detail.code</code>. 统一社会信用代码或注册号
     */
    public TCompanyDetailRecord setCode(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_company_detail.code</code>. 统一社会信用代码或注册号
     */
    public String getCode() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ndt.t_company_detail.address</code>. 注册地址
     */
    public TCompanyDetailRecord setAddress(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_company_detail.address</code>. 注册地址
     */
    public String getAddress() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ndt.t_company_detail.company_type</code>. 企业类型
     */
    public TCompanyDetailRecord setCompanyType(Integer value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_company_detail.company_type</code>. 企业类型
     */
    public Integer getCompanyType() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>ndt.t_company_detail.industry_type</code>. 所属行业
     */
    public TCompanyDetailRecord setIndustryType(Integer value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_company_detail.industry_type</code>. 所属行业
     */
    public Integer getIndustryType() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>ndt.t_company_detail.setup_time</code>. 成立时间
     */
    public TCompanyDetailRecord setSetupTime(Timestamp value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_company_detail.setup_time</code>. 成立时间
     */
    public Timestamp getSetupTime() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>ndt.t_company_detail.business_scope</code>. 经营范围
     */
    public TCompanyDetailRecord setBusinessScope(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_company_detail.business_scope</code>. 经营范围
     */
    public String getBusinessScope() {
        return (String) get(9);
    }

    /**
     * Setter for <code>ndt.t_company_detail.business_deadline</code>. 经营期限
     */
    public TCompanyDetailRecord setBusinessDeadline(Timestamp value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_company_detail.business_deadline</code>. 经营期限
     */
    public Timestamp getBusinessDeadline() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>ndt.t_company_detail.registered_capital</code>. 注册资本
     */
    public TCompanyDetailRecord setRegisteredCapital(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_company_detail.registered_capital</code>. 注册资本
     */
    public String getRegisteredCapital() {
        return (String) get(11);
    }

    /**
     * Setter for <code>ndt.t_company_detail.is_emerging</code>. 是否为新兴经营主体
     */
    public TCompanyDetailRecord setIsEmerging(Boolean value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_company_detail.is_emerging</code>. 是否为新兴经营主体
     */
    public Boolean getIsEmerging() {
        return (Boolean) get(12);
    }

    /**
     * Setter for <code>ndt.t_company_detail.legal_person</code>. 法人
     */
    public TCompanyDetailRecord setLegalPerson(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_company_detail.legal_person</code>. 法人
     */
    public String getLegalPerson() {
        return (String) get(13);
    }

    /**
     * Setter for <code>ndt.t_company_detail.legal_person_identity_id</code>. 法人身份证
     */
    public TCompanyDetailRecord setLegalPersonIdentityId(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_company_detail.legal_person_identity_id</code>. 法人身份证
     */
    public String getLegalPersonIdentityId() {
        return (String) get(14);
    }

    /**
     * Setter for <code>ndt.t_company_detail.legal_person_id_deadline</code>. 法人身份证截止时间
     */
    public TCompanyDetailRecord setLegalPersonIdDeadline(Timestamp value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_company_detail.legal_person_id_deadline</code>. 法人身份证截止时间
     */
    public Timestamp getLegalPersonIdDeadline() {
        return (Timestamp) get(15);
    }

    /**
     * Setter for <code>ndt.t_company_detail.related_img_urls</code>. 相关照片
     */
    public TCompanyDetailRecord setRelatedImgUrls(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_company_detail.related_img_urls</code>. 相关照片
     */
    public String getRelatedImgUrls() {
        return (String) get(16);
    }

    /**
     * Setter for <code>ndt.t_company_detail.status</code>. 记录状态
     */
    public TCompanyDetailRecord setStatus(Short value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_company_detail.status</code>. 记录状态
     */
    public Short getStatus() {
        return (Short) get(17);
    }

    /**
     * Setter for <code>ndt.t_company_detail.update_by</code>. 更新人
     */
    public TCompanyDetailRecord setUpdateBy(BigDecimal value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_company_detail.update_by</code>. 更新人
     */
    public BigDecimal getUpdateBy() {
        return (BigDecimal) get(18);
    }

    /**
     * Setter for <code>ndt.t_company_detail.update_at</code>. 更新时间
     */
    public TCompanyDetailRecord setUpdateAt(Timestamp value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_company_detail.update_at</code>. 更新时间
     */
    public Timestamp getUpdateAt() {
        return (Timestamp) get(19);
    }

    /**
     * Setter for <code>ndt.t_company_detail.contact_name</code>. 联系人姓名
     */
    public TCompanyDetailRecord setContactName(String value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_company_detail.contact_name</code>. 联系人姓名
     */
    public String getContactName() {
        return (String) get(20);
    }

    /**
     * Setter for <code>ndt.t_company_detail.contact_identity_id</code>. 联系人身份证
     */
    public TCompanyDetailRecord setContactIdentityId(String value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_company_detail.contact_identity_id</code>. 联系人身份证
     */
    public String getContactIdentityId() {
        return (String) get(21);
    }

    /**
     * Setter for <code>ndt.t_company_detail.division_id</code>. 企业注册地址
     */
    public TCompanyDetailRecord setDivisionId(BigDecimal value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_company_detail.division_id</code>. 企业注册地址
     */
    public BigDecimal getDivisionId() {
        return (BigDecimal) get(22);
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
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TCompanyDetailRecord
     */
    public TCompanyDetailRecord() {
        super(TCompanyDetail.T_COMPANY_DETAIL);
    }

    /**
     * Create a detached, initialised TCompanyDetailRecord
     */
    public TCompanyDetailRecord(BigDecimal id, BigDecimal contactId, Integer certificateType, String name, String code, String address, Integer companyType, Integer industryType, Timestamp setupTime, String businessScope, Timestamp businessDeadline, String registeredCapital, Boolean isEmerging, String legalPerson, String legalPersonIdentityId, Timestamp legalPersonIdDeadline, String relatedImgUrls, Short status, BigDecimal updateBy, Timestamp updateAt, String contactName, String contactIdentityId, BigDecimal divisionId) {
        super(TCompanyDetail.T_COMPANY_DETAIL);

        set(0, id);
        set(1, contactId);
        set(2, certificateType);
        set(3, name);
        set(4, code);
        set(5, address);
        set(6, companyType);
        set(7, industryType);
        set(8, setupTime);
        set(9, businessScope);
        set(10, businessDeadline);
        set(11, registeredCapital);
        set(12, isEmerging);
        set(13, legalPerson);
        set(14, legalPersonIdentityId);
        set(15, legalPersonIdDeadline);
        set(16, relatedImgUrls);
        set(17, status);
        set(18, updateBy);
        set(19, updateAt);
        set(20, contactName);
        set(21, contactIdentityId);
        set(22, divisionId);
    }
}