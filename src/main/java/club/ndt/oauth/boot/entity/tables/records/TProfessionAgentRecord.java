/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.records;


import com.ndt.sms.entity.tables.TProfessionAgent;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 农业职业经纪人
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TProfessionAgentRecord extends UpdatableRecordImpl<TProfessionAgentRecord> {

    private static final long serialVersionUID = -1232890872;

    /**
     * Setter for <code>ndt.t_profession_agent.id</code>. 主键
     */
    public TProfessionAgentRecord setId(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_profession_agent.id</code>. 主键
     */
    public BigDecimal getId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>ndt.t_profession_agent.name</code>. 姓名
     */
    public TProfessionAgentRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_profession_agent.name</code>. 姓名
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ndt.t_profession_agent.identity_id</code>. 身份证号码
     */
    public TProfessionAgentRecord setIdentityId(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_profession_agent.identity_id</code>. 身份证号码
     */
    public String getIdentityId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ndt.t_profession_agent.county</code>. 区县
     */
    public TProfessionAgentRecord setCounty(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_profession_agent.county</code>. 区县
     */
    public String getCounty() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ndt.t_profession_agent.county_code</code>.
     */
    public TProfessionAgentRecord setCountyCode(BigDecimal value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_profession_agent.county_code</code>.
     */
    public BigDecimal getCountyCode() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>ndt.t_profession_agent.town</code>. 乡镇
     */
    public TProfessionAgentRecord setTown(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_profession_agent.town</code>. 乡镇
     */
    public String getTown() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ndt.t_profession_agent.town_code</code>.
     */
    public TProfessionAgentRecord setTownCode(BigDecimal value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_profession_agent.town_code</code>.
     */
    public BigDecimal getTownCode() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>ndt.t_profession_agent.community</code>. 村站
     */
    public TProfessionAgentRecord setCommunity(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_profession_agent.community</code>. 村站
     */
    public String getCommunity() {
        return (String) get(7);
    }

    /**
     * Setter for <code>ndt.t_profession_agent.community_code</code>.
     */
    public TProfessionAgentRecord setCommunityCode(BigDecimal value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_profession_agent.community_code</code>.
     */
    public BigDecimal getCommunityCode() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>ndt.t_profession_agent.sex</code>. 性别
     */
    public TProfessionAgentRecord setSex(Integer value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_profession_agent.sex</code>. 性别
     */
    public Integer getSex() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>ndt.t_profession_agent.company_name</code>. 单位名称
     */
    public TProfessionAgentRecord setCompanyName(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_profession_agent.company_name</code>. 单位名称
     */
    public String getCompanyName() {
        return (String) get(10);
    }

    /**
     * Setter for <code>ndt.t_profession_agent.position</code>. 职务
     */
    public TProfessionAgentRecord setPosition(String value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_profession_agent.position</code>. 职务
     */
    public String getPosition() {
        return (String) get(11);
    }

    /**
     * Setter for <code>ndt.t_profession_agent.start_date</code>. 从事农业起始时间
     */
    public TProfessionAgentRecord setStartDate(String value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_profession_agent.start_date</code>. 从事农业起始时间
     */
    public String getStartDate() {
        return (String) get(12);
    }

    /**
     * Setter for <code>ndt.t_profession_agent.industry_type</code>. 产业类别
     */
    public TProfessionAgentRecord setIndustryType(String value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_profession_agent.industry_type</code>. 产业类别
     */
    public String getIndustryType() {
        return (String) get(13);
    }

    /**
     * Setter for <code>ndt.t_profession_agent.scope</code>. 规模
     */
    public TProfessionAgentRecord setScope(String value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_profession_agent.scope</code>. 规模
     */
    public String getScope() {
        return (String) get(14);
    }

    /**
     * Setter for <code>ndt.t_profession_agent.certificate_no</code>. 证书编号
     */
    public TProfessionAgentRecord setCertificateNo(String value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_profession_agent.certificate_no</code>. 证书编号
     */
    public String getCertificateNo() {
        return (String) get(15);
    }

    /**
     * Setter for <code>ndt.t_profession_agent.phone</code>. 联系电话
     */
    public TProfessionAgentRecord setPhone(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_profession_agent.phone</code>. 联系电话
     */
    public String getPhone() {
        return (String) get(16);
    }

    /**
     * Setter for <code>ndt.t_profession_agent.remark</code>. 备注
     */
    public TProfessionAgentRecord setRemark(String value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_profession_agent.remark</code>. 备注
     */
    public String getRemark() {
        return (String) get(17);
    }

    /**
     * Setter for <code>ndt.t_profession_agent.rating</code>. 评级
     */
    public TProfessionAgentRecord setRating(String value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_profession_agent.rating</code>. 评级
     */
    public String getRating() {
        return (String) get(18);
    }

    /**
     * Setter for <code>ndt.t_profession_agent.create_time</code>.
     */
    public TProfessionAgentRecord setCreateTime(Timestamp value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_profession_agent.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(19);
    }

    /**
     * Setter for <code>ndt.t_profession_agent.create_user</code>.
     */
    public TProfessionAgentRecord setCreateUser(BigDecimal value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_profession_agent.create_user</code>.
     */
    public BigDecimal getCreateUser() {
        return (BigDecimal) get(20);
    }

    /**
     * Setter for <code>ndt.t_profession_agent.update_time</code>.
     */
    public TProfessionAgentRecord setUpdateTime(Timestamp value) {
        set(21, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_profession_agent.update_time</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(21);
    }

    /**
     * Setter for <code>ndt.t_profession_agent.update_user</code>.
     */
    public TProfessionAgentRecord setUpdateUser(BigDecimal value) {
        set(22, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_profession_agent.update_user</code>.
     */
    public BigDecimal getUpdateUser() {
        return (BigDecimal) get(22);
    }

    /**
     * Setter for <code>ndt.t_profession_agent.state</code>. 1、未审核，2、审核通过，3、审核不通过
     */
    public TProfessionAgentRecord setState(Short value) {
        set(23, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_profession_agent.state</code>. 1、未审核，2、审核通过，3、审核不通过
     */
    public Short getState() {
        return (Short) get(23);
    }

    /**
     * Setter for <code>ndt.t_profession_agent.is_major</code>.
     */
    public TProfessionAgentRecord setIsMajor(Boolean value) {
        set(24, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_profession_agent.is_major</code>.
     */
    public Boolean getIsMajor() {
        return (Boolean) get(24);
    }

    /**
     * Setter for <code>ndt.t_profession_agent.is_credit</code>.
     */
    public TProfessionAgentRecord setIsCredit(Boolean value) {
        set(25, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_profession_agent.is_credit</code>.
     */
    public Boolean getIsCredit() {
        return (Boolean) get(25);
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
     * Create a detached TProfessionAgentRecord
     */
    public TProfessionAgentRecord() {
        super(TProfessionAgent.T_PROFESSION_AGENT);
    }

    /**
     * Create a detached, initialised TProfessionAgentRecord
     */
    public TProfessionAgentRecord(BigDecimal id, String name, String identityId, String county, BigDecimal countyCode, String town, BigDecimal townCode, String community, BigDecimal communityCode, Integer sex, String companyName, String position, String startDate, String industryType, String scope, String certificateNo, String phone, String remark, String rating, Timestamp createTime, BigDecimal createUser, Timestamp updateTime, BigDecimal updateUser, Short state, Boolean isMajor, Boolean isCredit) {
        super(TProfessionAgent.T_PROFESSION_AGENT);

        set(0, id);
        set(1, name);
        set(2, identityId);
        set(3, county);
        set(4, countyCode);
        set(5, town);
        set(6, townCode);
        set(7, community);
        set(8, communityCode);
        set(9, sex);
        set(10, companyName);
        set(11, position);
        set(12, startDate);
        set(13, industryType);
        set(14, scope);
        set(15, certificateNo);
        set(16, phone);
        set(17, remark);
        set(18, rating);
        set(19, createTime);
        set(20, createUser);
        set(21, updateTime);
        set(22, updateUser);
        set(23, state);
        set(24, isMajor);
        set(25, isCredit);
    }
}