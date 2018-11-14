/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables.records;


import club.ndt.oauth.boot.entity.tables.TLeadingEnterprise;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 龙头企业信息表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TLeadingEnterpriseRecord extends UpdatableRecordImpl<TLeadingEnterpriseRecord> {

    private static final long serialVersionUID = 506597349;

    /**
     * Setter for <code>ndt.t_leading_enterprise.id</code>.
     */
    public TLeadingEnterpriseRecord setId(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_leading_enterprise.id</code>.
     */
    public BigDecimal getId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>ndt.t_leading_enterprise.index</code>. 区（市）县
     */
    public TLeadingEnterpriseRecord setIndex(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_leading_enterprise.index</code>. 区（市）县
     */
    public String getIndex() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ndt.t_leading_enterprise.county</code>. 区市县
     */
    public TLeadingEnterpriseRecord setCounty(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_leading_enterprise.county</code>. 区市县
     */
    public String getCounty() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ndt.t_leading_enterprise.county_code</code>. 区市县id
     */
    public TLeadingEnterpriseRecord setCountyCode(BigDecimal value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_leading_enterprise.county_code</code>. 区市县id
     */
    public BigDecimal getCountyCode() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>ndt.t_leading_enterprise.company_name</code>. 企业名称
     */
    public TLeadingEnterpriseRecord setCompanyName(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_leading_enterprise.company_name</code>. 企业名称
     */
    public String getCompanyName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ndt.t_leading_enterprise.register_address</code>. 注册地址
     */
    public TLeadingEnterpriseRecord setRegisterAddress(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_leading_enterprise.register_address</code>. 注册地址
     */
    public String getRegisterAddress() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ndt.t_leading_enterprise.industry_type</code>. 产业类型,参考码表66
     */
    public TLeadingEnterpriseRecord setIndustryType(Integer value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_leading_enterprise.industry_type</code>. 产业类型,参考码表66
     */
    public Integer getIndustryType() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>ndt.t_leading_enterprise.company_type</code>. 企业类型，参考码表67
     */
    public TLeadingEnterpriseRecord setCompanyType(Integer value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_leading_enterprise.company_type</code>. 企业类型，参考码表67
     */
    public Integer getCompanyType() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>ndt.t_leading_enterprise.major_product_name</code>. 主营产品名
     */
    public TLeadingEnterpriseRecord setMajorProductName(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_leading_enterprise.major_product_name</code>. 主营产品名
     */
    public String getMajorProductName() {
        return (String) get(8);
    }

    /**
     * Setter for <code>ndt.t_leading_enterprise.level</code>. 级别，参考码表68
     */
    public TLeadingEnterpriseRecord setLevel(Integer value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_leading_enterprise.level</code>. 级别，参考码表68
     */
    public Integer getLevel() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>ndt.t_leading_enterprise.credit_code</code>. 信用代码
     */
    public TLeadingEnterpriseRecord setCreditCode(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_leading_enterprise.credit_code</code>. 信用代码
     */
    public String getCreditCode() {
        return (String) get(10);
    }

    /**
     * Setter for <code>ndt.t_leading_enterprise.registration_no</code>. 注册号
     */
    public TLeadingEnterpriseRecord setRegistrationNo(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_leading_enterprise.registration_no</code>. 注册号
     */
    public String getRegistrationNo() {
        return (String) get(11);
    }

    /**
     * Setter for <code>ndt.t_leading_enterprise.legal_person</code>. 法人
     */
    public TLeadingEnterpriseRecord setLegalPerson(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_leading_enterprise.legal_person</code>. 法人
     */
    public String getLegalPerson() {
        return (String) get(12);
    }

    /**
     * Setter for <code>ndt.t_leading_enterprise.creation_time</code>. 创建时间
     */
    public TLeadingEnterpriseRecord setCreationTime(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_leading_enterprise.creation_time</code>. 创建时间
     */
    public String getCreationTime() {
        return (String) get(13);
    }

    /**
     * Setter for <code>ndt.t_leading_enterprise.remark</code>. 备注
     */
    public TLeadingEnterpriseRecord setRemark(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_leading_enterprise.remark</code>. 备注
     */
    public String getRemark() {
        return (String) get(14);
    }

    /**
     * Setter for <code>ndt.t_leading_enterprise.state</code>. 1、未审核，2、审核通过，3、审核不通过
     */
    public TLeadingEnterpriseRecord setState(Short value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_leading_enterprise.state</code>. 1、未审核，2、审核通过，3、审核不通过
     */
    public Short getState() {
        return (Short) get(15);
    }

    /**
     * Setter for <code>ndt.t_leading_enterprise.status</code>. 记录状态
     */
    public TLeadingEnterpriseRecord setStatus(Short value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_leading_enterprise.status</code>. 记录状态
     */
    public Short getStatus() {
        return (Short) get(16);
    }

    /**
     * Setter for <code>ndt.t_leading_enterprise.create_user</code>.
     */
    public TLeadingEnterpriseRecord setCreateUser(BigDecimal value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_leading_enterprise.create_user</code>.
     */
    public BigDecimal getCreateUser() {
        return (BigDecimal) get(17);
    }

    /**
     * Setter for <code>ndt.t_leading_enterprise.create_time</code>.
     */
    public TLeadingEnterpriseRecord setCreateTime(Timestamp value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_leading_enterprise.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(18);
    }

    /**
     * Setter for <code>ndt.t_leading_enterprise.update_user</code>.
     */
    public TLeadingEnterpriseRecord setUpdateUser(BigDecimal value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_leading_enterprise.update_user</code>.
     */
    public BigDecimal getUpdateUser() {
        return (BigDecimal) get(19);
    }

    /**
     * Setter for <code>ndt.t_leading_enterprise.update_time</code>.
     */
    public TLeadingEnterpriseRecord setUpdateTime(Timestamp value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_leading_enterprise.update_time</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(20);
    }

    /**
     * Setter for <code>ndt.t_leading_enterprise.is_major</code>. 是否新型经营主体
     */
    public TLeadingEnterpriseRecord setIsMajor(Boolean value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_leading_enterprise.is_major</code>. 是否新型经营主体
     */
    public Boolean getIsMajor() {
        return (Boolean) get(21);
    }

    /**
     * Setter for <code>ndt.t_leading_enterprise.is_credit</code>. 是否信用主体
     */
    public TLeadingEnterpriseRecord setIsCredit(Boolean value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_leading_enterprise.is_credit</code>. 是否信用主体
     */
    public Boolean getIsCredit() {
        return (Boolean) get(22);
    }

    /**
     * Setter for <code>ndt.t_leading_enterprise.town</code>. 乡镇名称
     */
    public TLeadingEnterpriseRecord setTown(String value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_leading_enterprise.town</code>. 乡镇名称
     */
    public String getTown() {
        return (String) get(23);
    }

    /**
     * Setter for <code>ndt.t_leading_enterprise.town_code</code>. 乡镇ID
     */
    public TLeadingEnterpriseRecord setTownCode(BigDecimal value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_leading_enterprise.town_code</code>. 乡镇ID
     */
    public BigDecimal getTownCode() {
        return (BigDecimal) get(24);
    }

    /**
     * Setter for <code>ndt.t_leading_enterprise.community</code>. 村站
     */
    public TLeadingEnterpriseRecord setCommunity(String value) {
        set(25, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_leading_enterprise.community</code>. 村站
     */
    public String getCommunity() {
        return (String) get(25);
    }

    /**
     * Setter for <code>ndt.t_leading_enterprise.community_id</code>. 村站ID
     */
    public TLeadingEnterpriseRecord setCommunityId(BigDecimal value) {
        set(26, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_leading_enterprise.community_id</code>. 村站ID
     */
    public BigDecimal getCommunityId() {
        return (BigDecimal) get(26);
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
     * Create a detached TLeadingEnterpriseRecord
     */
    public TLeadingEnterpriseRecord() {
        super(TLeadingEnterprise.T_LEADING_ENTERPRISE);
    }

    /**
     * Create a detached, initialised TLeadingEnterpriseRecord
     */
    public TLeadingEnterpriseRecord(BigDecimal id, String index, String county, BigDecimal countyCode, String companyName, String registerAddress, Integer industryType, Integer companyType, String majorProductName, Integer level, String creditCode, String registrationNo, String legalPerson, String creationTime, String remark, Short state, Short status, BigDecimal createUser, Timestamp createTime, BigDecimal updateUser, Timestamp updateTime, Boolean isMajor, Boolean isCredit, String town, BigDecimal townCode, String community, BigDecimal communityId) {
        super(TLeadingEnterprise.T_LEADING_ENTERPRISE);

        set(0, id);
        set(1, index);
        set(2, county);
        set(3, countyCode);
        set(4, companyName);
        set(5, registerAddress);
        set(6, industryType);
        set(7, companyType);
        set(8, majorProductName);
        set(9, level);
        set(10, creditCode);
        set(11, registrationNo);
        set(12, legalPerson);
        set(13, creationTime);
        set(14, remark);
        set(15, state);
        set(16, status);
        set(17, createUser);
        set(18, createTime);
        set(19, updateUser);
        set(20, updateTime);
        set(21, isMajor);
        set(22, isCredit);
        set(23, town);
        set(24, townCode);
        set(25, community);
        set(26, communityId);
    }
}
