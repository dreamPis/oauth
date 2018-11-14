/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 村站采集的公司信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VillageCompanyBaseinfoPjo implements Serializable {

    private static final long serialVersionUID = -254472809;

    private BigDecimal id;
    private Integer    certificateType;
    private String     name;
    private String     code;
    private String     address;
    private Integer    companyType;
    private Integer    productionType;
    private Integer    memberTotal;
    private BigDecimal divisionId;
    private Integer    industryType;
    private Timestamp  setupTime;
    private String     businessScope;
    private BigDecimal businessSize;
    private Integer    businessSizeUnit;
    private BigDecimal businessIncome;
    private String     businessIncomeUnit;
    private Timestamp  businessDeadline;
    private String     registeredCapital;
    private Boolean    isEmerging;
    private String     legalPerson;
    private String     legalPersonIdentityId;
    private String     legalPersonPhone;
    private Timestamp  legalPersonIdDeadline;
    private String     relatedImgUrls;
    private Integer    workerTotal;
    private String     workerTime;
    private String     workerMoney;
    private Integer    socialMorality;
    private String     operatingHistory;
    private Integer    operationSituation;
    private Boolean    isCourtBlacklist;
    private Boolean    isBusinessBlacklist;
    private Boolean    isCourtEnforcement;
    private Integer    state;
    private Short      status;
    private BigDecimal createUser;
    private Timestamp  createTime;
    private BigDecimal updateUser;
    private Timestamp  updateTime;

    public VillageCompanyBaseinfoPjo() {}

    public VillageCompanyBaseinfoPjo(VillageCompanyBaseinfoPjo value) {
        this.id = value.id;
        this.certificateType = value.certificateType;
        this.name = value.name;
        this.code = value.code;
        this.address = value.address;
        this.companyType = value.companyType;
        this.productionType = value.productionType;
        this.memberTotal = value.memberTotal;
        this.divisionId = value.divisionId;
        this.industryType = value.industryType;
        this.setupTime = value.setupTime;
        this.businessScope = value.businessScope;
        this.businessSize = value.businessSize;
        this.businessSizeUnit = value.businessSizeUnit;
        this.businessIncome = value.businessIncome;
        this.businessIncomeUnit = value.businessIncomeUnit;
        this.businessDeadline = value.businessDeadline;
        this.registeredCapital = value.registeredCapital;
        this.isEmerging = value.isEmerging;
        this.legalPerson = value.legalPerson;
        this.legalPersonIdentityId = value.legalPersonIdentityId;
        this.legalPersonPhone = value.legalPersonPhone;
        this.legalPersonIdDeadline = value.legalPersonIdDeadline;
        this.relatedImgUrls = value.relatedImgUrls;
        this.workerTotal = value.workerTotal;
        this.workerTime = value.workerTime;
        this.workerMoney = value.workerMoney;
        this.socialMorality = value.socialMorality;
        this.operatingHistory = value.operatingHistory;
        this.operationSituation = value.operationSituation;
        this.isCourtBlacklist = value.isCourtBlacklist;
        this.isBusinessBlacklist = value.isBusinessBlacklist;
        this.isCourtEnforcement = value.isCourtEnforcement;
        this.state = value.state;
        this.status = value.status;
        this.createUser = value.createUser;
        this.createTime = value.createTime;
        this.updateUser = value.updateUser;
        this.updateTime = value.updateTime;
    }

    public VillageCompanyBaseinfoPjo(
        BigDecimal id,
        Integer    certificateType,
        String     name,
        String     code,
        String     address,
        Integer    companyType,
        Integer    productionType,
        Integer    memberTotal,
        BigDecimal divisionId,
        Integer    industryType,
        Timestamp  setupTime,
        String     businessScope,
        BigDecimal businessSize,
        Integer    businessSizeUnit,
        BigDecimal businessIncome,
        String     businessIncomeUnit,
        Timestamp  businessDeadline,
        String     registeredCapital,
        Boolean    isEmerging,
        String     legalPerson,
        String     legalPersonIdentityId,
        String     legalPersonPhone,
        Timestamp  legalPersonIdDeadline,
        String     relatedImgUrls,
        Integer    workerTotal,
        String     workerTime,
        String     workerMoney,
        Integer    socialMorality,
        String     operatingHistory,
        Integer    operationSituation,
        Boolean    isCourtBlacklist,
        Boolean    isBusinessBlacklist,
        Boolean    isCourtEnforcement,
        Integer    state,
        Short      status,
        BigDecimal createUser,
        Timestamp  createTime,
        BigDecimal updateUser,
        Timestamp  updateTime
    ) {
        this.id = id;
        this.certificateType = certificateType;
        this.name = name;
        this.code = code;
        this.address = address;
        this.companyType = companyType;
        this.productionType = productionType;
        this.memberTotal = memberTotal;
        this.divisionId = divisionId;
        this.industryType = industryType;
        this.setupTime = setupTime;
        this.businessScope = businessScope;
        this.businessSize = businessSize;
        this.businessSizeUnit = businessSizeUnit;
        this.businessIncome = businessIncome;
        this.businessIncomeUnit = businessIncomeUnit;
        this.businessDeadline = businessDeadline;
        this.registeredCapital = registeredCapital;
        this.isEmerging = isEmerging;
        this.legalPerson = legalPerson;
        this.legalPersonIdentityId = legalPersonIdentityId;
        this.legalPersonPhone = legalPersonPhone;
        this.legalPersonIdDeadline = legalPersonIdDeadline;
        this.relatedImgUrls = relatedImgUrls;
        this.workerTotal = workerTotal;
        this.workerTime = workerTime;
        this.workerMoney = workerMoney;
        this.socialMorality = socialMorality;
        this.operatingHistory = operatingHistory;
        this.operationSituation = operationSituation;
        this.isCourtBlacklist = isCourtBlacklist;
        this.isBusinessBlacklist = isBusinessBlacklist;
        this.isCourtEnforcement = isCourtEnforcement;
        this.state = state;
        this.status = status;
        this.createUser = createUser;
        this.createTime = createTime;
        this.updateUser = updateUser;
        this.updateTime = updateTime;
    }

    public BigDecimal getId() {
        return this.id;
    }

    public VillageCompanyBaseinfoPjo setId(BigDecimal id) {
        this.id = id;
        return this;
    }

    public Integer getCertificateType() {
        return this.certificateType;
    }

    public VillageCompanyBaseinfoPjo setCertificateType(Integer certificateType) {
        this.certificateType = certificateType;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public VillageCompanyBaseinfoPjo setName(String name) {
        this.name = name;
        return this;
    }

    public String getCode() {
        return this.code;
    }

    public VillageCompanyBaseinfoPjo setCode(String code) {
        this.code = code;
        return this;
    }

    public String getAddress() {
        return this.address;
    }

    public VillageCompanyBaseinfoPjo setAddress(String address) {
        this.address = address;
        return this;
    }

    public Integer getCompanyType() {
        return this.companyType;
    }

    public VillageCompanyBaseinfoPjo setCompanyType(Integer companyType) {
        this.companyType = companyType;
        return this;
    }

    public Integer getProductionType() {
        return this.productionType;
    }

    public VillageCompanyBaseinfoPjo setProductionType(Integer productionType) {
        this.productionType = productionType;
        return this;
    }

    public Integer getMemberTotal() {
        return this.memberTotal;
    }

    public VillageCompanyBaseinfoPjo setMemberTotal(Integer memberTotal) {
        this.memberTotal = memberTotal;
        return this;
    }

    public BigDecimal getDivisionId() {
        return this.divisionId;
    }

    public VillageCompanyBaseinfoPjo setDivisionId(BigDecimal divisionId) {
        this.divisionId = divisionId;
        return this;
    }

    public Integer getIndustryType() {
        return this.industryType;
    }

    public VillageCompanyBaseinfoPjo setIndustryType(Integer industryType) {
        this.industryType = industryType;
        return this;
    }

    public Timestamp getSetupTime() {
        return this.setupTime;
    }

    public VillageCompanyBaseinfoPjo setSetupTime(Timestamp setupTime) {
        this.setupTime = setupTime;
        return this;
    }

    public String getBusinessScope() {
        return this.businessScope;
    }

    public VillageCompanyBaseinfoPjo setBusinessScope(String businessScope) {
        this.businessScope = businessScope;
        return this;
    }

    public BigDecimal getBusinessSize() {
        return this.businessSize;
    }

    public VillageCompanyBaseinfoPjo setBusinessSize(BigDecimal businessSize) {
        this.businessSize = businessSize;
        return this;
    }

    public Integer getBusinessSizeUnit() {
        return this.businessSizeUnit;
    }

    public VillageCompanyBaseinfoPjo setBusinessSizeUnit(Integer businessSizeUnit) {
        this.businessSizeUnit = businessSizeUnit;
        return this;
    }

    public BigDecimal getBusinessIncome() {
        return this.businessIncome;
    }

    public VillageCompanyBaseinfoPjo setBusinessIncome(BigDecimal businessIncome) {
        this.businessIncome = businessIncome;
        return this;
    }

    public String getBusinessIncomeUnit() {
        return this.businessIncomeUnit;
    }

    public VillageCompanyBaseinfoPjo setBusinessIncomeUnit(String businessIncomeUnit) {
        this.businessIncomeUnit = businessIncomeUnit;
        return this;
    }

    public Timestamp getBusinessDeadline() {
        return this.businessDeadline;
    }

    public VillageCompanyBaseinfoPjo setBusinessDeadline(Timestamp businessDeadline) {
        this.businessDeadline = businessDeadline;
        return this;
    }

    public String getRegisteredCapital() {
        return this.registeredCapital;
    }

    public VillageCompanyBaseinfoPjo setRegisteredCapital(String registeredCapital) {
        this.registeredCapital = registeredCapital;
        return this;
    }

    public Boolean getIsEmerging() {
        return this.isEmerging;
    }

    public VillageCompanyBaseinfoPjo setIsEmerging(Boolean isEmerging) {
        this.isEmerging = isEmerging;
        return this;
    }

    public String getLegalPerson() {
        return this.legalPerson;
    }

    public VillageCompanyBaseinfoPjo setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
        return this;
    }

    public String getLegalPersonIdentityId() {
        return this.legalPersonIdentityId;
    }

    public VillageCompanyBaseinfoPjo setLegalPersonIdentityId(String legalPersonIdentityId) {
        this.legalPersonIdentityId = legalPersonIdentityId;
        return this;
    }

    public String getLegalPersonPhone() {
        return this.legalPersonPhone;
    }

    public VillageCompanyBaseinfoPjo setLegalPersonPhone(String legalPersonPhone) {
        this.legalPersonPhone = legalPersonPhone;
        return this;
    }

    public Timestamp getLegalPersonIdDeadline() {
        return this.legalPersonIdDeadline;
    }

    public VillageCompanyBaseinfoPjo setLegalPersonIdDeadline(Timestamp legalPersonIdDeadline) {
        this.legalPersonIdDeadline = legalPersonIdDeadline;
        return this;
    }

    public String getRelatedImgUrls() {
        return this.relatedImgUrls;
    }

    public VillageCompanyBaseinfoPjo setRelatedImgUrls(String relatedImgUrls) {
        this.relatedImgUrls = relatedImgUrls;
        return this;
    }

    public Integer getWorkerTotal() {
        return this.workerTotal;
    }

    public VillageCompanyBaseinfoPjo setWorkerTotal(Integer workerTotal) {
        this.workerTotal = workerTotal;
        return this;
    }

    public String getWorkerTime() {
        return this.workerTime;
    }

    public VillageCompanyBaseinfoPjo setWorkerTime(String workerTime) {
        this.workerTime = workerTime;
        return this;
    }

    public String getWorkerMoney() {
        return this.workerMoney;
    }

    public VillageCompanyBaseinfoPjo setWorkerMoney(String workerMoney) {
        this.workerMoney = workerMoney;
        return this;
    }

    public Integer getSocialMorality() {
        return this.socialMorality;
    }

    public VillageCompanyBaseinfoPjo setSocialMorality(Integer socialMorality) {
        this.socialMorality = socialMorality;
        return this;
    }

    public String getOperatingHistory() {
        return this.operatingHistory;
    }

    public VillageCompanyBaseinfoPjo setOperatingHistory(String operatingHistory) {
        this.operatingHistory = operatingHistory;
        return this;
    }

    public Integer getOperationSituation() {
        return this.operationSituation;
    }

    public VillageCompanyBaseinfoPjo setOperationSituation(Integer operationSituation) {
        this.operationSituation = operationSituation;
        return this;
    }

    public Boolean getIsCourtBlacklist() {
        return this.isCourtBlacklist;
    }

    public VillageCompanyBaseinfoPjo setIsCourtBlacklist(Boolean isCourtBlacklist) {
        this.isCourtBlacklist = isCourtBlacklist;
        return this;
    }

    public Boolean getIsBusinessBlacklist() {
        return this.isBusinessBlacklist;
    }

    public VillageCompanyBaseinfoPjo setIsBusinessBlacklist(Boolean isBusinessBlacklist) {
        this.isBusinessBlacklist = isBusinessBlacklist;
        return this;
    }

    public Boolean getIsCourtEnforcement() {
        return this.isCourtEnforcement;
    }

    public VillageCompanyBaseinfoPjo setIsCourtEnforcement(Boolean isCourtEnforcement) {
        this.isCourtEnforcement = isCourtEnforcement;
        return this;
    }

    public Integer getState() {
        return this.state;
    }

    public VillageCompanyBaseinfoPjo setState(Integer state) {
        this.state = state;
        return this;
    }

    public Short getStatus() {
        return this.status;
    }

    public VillageCompanyBaseinfoPjo setStatus(Short status) {
        this.status = status;
        return this;
    }

    public BigDecimal getCreateUser() {
        return this.createUser;
    }

    public VillageCompanyBaseinfoPjo setCreateUser(BigDecimal createUser) {
        this.createUser = createUser;
        return this;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public VillageCompanyBaseinfoPjo setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
        return this;
    }

    public BigDecimal getUpdateUser() {
        return this.updateUser;
    }

    public VillageCompanyBaseinfoPjo setUpdateUser(BigDecimal updateUser) {
        this.updateUser = updateUser;
        return this;
    }

    public Timestamp getUpdateTime() {
        return this.updateTime;
    }

    public VillageCompanyBaseinfoPjo setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("VillageCompanyBaseinfoPjo (");

        sb.append(id);
        sb.append(", ").append(certificateType);
        sb.append(", ").append(name);
        sb.append(", ").append(code);
        sb.append(", ").append(address);
        sb.append(", ").append(companyType);
        sb.append(", ").append(productionType);
        sb.append(", ").append(memberTotal);
        sb.append(", ").append(divisionId);
        sb.append(", ").append(industryType);
        sb.append(", ").append(setupTime);
        sb.append(", ").append(businessScope);
        sb.append(", ").append(businessSize);
        sb.append(", ").append(businessSizeUnit);
        sb.append(", ").append(businessIncome);
        sb.append(", ").append(businessIncomeUnit);
        sb.append(", ").append(businessDeadline);
        sb.append(", ").append(registeredCapital);
        sb.append(", ").append(isEmerging);
        sb.append(", ").append(legalPerson);
        sb.append(", ").append(legalPersonIdentityId);
        sb.append(", ").append(legalPersonPhone);
        sb.append(", ").append(legalPersonIdDeadline);
        sb.append(", ").append(relatedImgUrls);
        sb.append(", ").append(workerTotal);
        sb.append(", ").append(workerTime);
        sb.append(", ").append(workerMoney);
        sb.append(", ").append(socialMorality);
        sb.append(", ").append(operatingHistory);
        sb.append(", ").append(operationSituation);
        sb.append(", ").append(isCourtBlacklist);
        sb.append(", ").append(isBusinessBlacklist);
        sb.append(", ").append(isCourtEnforcement);
        sb.append(", ").append(state);
        sb.append(", ").append(status);
        sb.append(", ").append(createUser);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateUser);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}
