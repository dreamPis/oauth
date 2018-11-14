/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;


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
public class FinancialApplyPjo implements Serializable {

    private static final long serialVersionUID = -858785466;

    private BigDecimal id;
    private BigDecimal userId;
    private BigDecimal companyId;
    private BigDecimal orgId;
    private BigDecimal productId;
    private BigDecimal amount;
    private Integer    period;
    private Timestamp  acceptTime;
    private Timestamp  lastUpdateTime;
    private Integer    state;
    private BigDecimal createBy;
    private Integer    sourceId;
    private BigDecimal diviisonId;
    private String     divisionName;
    private BigDecimal acceptAmount;
    private BigDecimal bankOrgId;
    private Timestamp  applyTime;
    private Integer    bankAcceptState;
    private Integer    bankAcceptPeriod;
    private Integer    applyPurpost;
    private Integer    applyTerm;
    private String     remark;
    private Integer    applyType;
    private BigDecimal bankAcceptAmount;

    public FinancialApplyPjo() {}

    public FinancialApplyPjo(FinancialApplyPjo value) {
        this.id = value.id;
        this.userId = value.userId;
        this.companyId = value.companyId;
        this.orgId = value.orgId;
        this.productId = value.productId;
        this.amount = value.amount;
        this.period = value.period;
        this.acceptTime = value.acceptTime;
        this.lastUpdateTime = value.lastUpdateTime;
        this.state = value.state;
        this.createBy = value.createBy;
        this.sourceId = value.sourceId;
        this.diviisonId = value.diviisonId;
        this.divisionName = value.divisionName;
        this.acceptAmount = value.acceptAmount;
        this.bankOrgId = value.bankOrgId;
        this.applyTime = value.applyTime;
        this.bankAcceptState = value.bankAcceptState;
        this.bankAcceptPeriod = value.bankAcceptPeriod;
        this.applyPurpost = value.applyPurpost;
        this.applyTerm = value.applyTerm;
        this.remark = value.remark;
        this.applyType = value.applyType;
        this.bankAcceptAmount = value.bankAcceptAmount;
    }

    public FinancialApplyPjo(
        BigDecimal id,
        BigDecimal userId,
        BigDecimal companyId,
        BigDecimal orgId,
        BigDecimal productId,
        BigDecimal amount,
        Integer    period,
        Timestamp  acceptTime,
        Timestamp  lastUpdateTime,
        Integer    state,
        BigDecimal createBy,
        Integer    sourceId,
        BigDecimal diviisonId,
        String     divisionName,
        BigDecimal acceptAmount,
        BigDecimal bankOrgId,
        Timestamp  applyTime,
        Integer    bankAcceptState,
        Integer    bankAcceptPeriod,
        Integer    applyPurpost,
        Integer    applyTerm,
        String     remark,
        Integer    applyType,
        BigDecimal bankAcceptAmount
    ) {
        this.id = id;
        this.userId = userId;
        this.companyId = companyId;
        this.orgId = orgId;
        this.productId = productId;
        this.amount = amount;
        this.period = period;
        this.acceptTime = acceptTime;
        this.lastUpdateTime = lastUpdateTime;
        this.state = state;
        this.createBy = createBy;
        this.sourceId = sourceId;
        this.diviisonId = diviisonId;
        this.divisionName = divisionName;
        this.acceptAmount = acceptAmount;
        this.bankOrgId = bankOrgId;
        this.applyTime = applyTime;
        this.bankAcceptState = bankAcceptState;
        this.bankAcceptPeriod = bankAcceptPeriod;
        this.applyPurpost = applyPurpost;
        this.applyTerm = applyTerm;
        this.remark = remark;
        this.applyType = applyType;
        this.bankAcceptAmount = bankAcceptAmount;
    }

    public BigDecimal getId() {
        return this.id;
    }

    public FinancialApplyPjo setId(BigDecimal id) {
        this.id = id;
        return this;
    }

    public BigDecimal getUserId() {
        return this.userId;
    }

    public FinancialApplyPjo setUserId(BigDecimal userId) {
        this.userId = userId;
        return this;
    }

    public BigDecimal getCompanyId() {
        return this.companyId;
    }

    public FinancialApplyPjo setCompanyId(BigDecimal companyId) {
        this.companyId = companyId;
        return this;
    }

    public BigDecimal getOrgId() {
        return this.orgId;
    }

    public FinancialApplyPjo setOrgId(BigDecimal orgId) {
        this.orgId = orgId;
        return this;
    }

    public BigDecimal getProductId() {
        return this.productId;
    }

    public FinancialApplyPjo setProductId(BigDecimal productId) {
        this.productId = productId;
        return this;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public FinancialApplyPjo setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    public Integer getPeriod() {
        return this.period;
    }

    public FinancialApplyPjo setPeriod(Integer period) {
        this.period = period;
        return this;
    }

    public Timestamp getAcceptTime() {
        return this.acceptTime;
    }

    public FinancialApplyPjo setAcceptTime(Timestamp acceptTime) {
        this.acceptTime = acceptTime;
        return this;
    }

    public Timestamp getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    public FinancialApplyPjo setLastUpdateTime(Timestamp lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    public Integer getState() {
        return this.state;
    }

    public FinancialApplyPjo setState(Integer state) {
        this.state = state;
        return this;
    }

    public BigDecimal getCreateBy() {
        return this.createBy;
    }

    public FinancialApplyPjo setCreateBy(BigDecimal createBy) {
        this.createBy = createBy;
        return this;
    }

    public Integer getSourceId() {
        return this.sourceId;
    }

    public FinancialApplyPjo setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    public BigDecimal getDiviisonId() {
        return this.diviisonId;
    }

    public FinancialApplyPjo setDiviisonId(BigDecimal diviisonId) {
        this.diviisonId = diviisonId;
        return this;
    }

    public String getDivisionName() {
        return this.divisionName;
    }

    public FinancialApplyPjo setDivisionName(String divisionName) {
        this.divisionName = divisionName;
        return this;
    }

    public BigDecimal getAcceptAmount() {
        return this.acceptAmount;
    }

    public FinancialApplyPjo setAcceptAmount(BigDecimal acceptAmount) {
        this.acceptAmount = acceptAmount;
        return this;
    }

    public BigDecimal getBankOrgId() {
        return this.bankOrgId;
    }

    public FinancialApplyPjo setBankOrgId(BigDecimal bankOrgId) {
        this.bankOrgId = bankOrgId;
        return this;
    }

    public Timestamp getApplyTime() {
        return this.applyTime;
    }

    public FinancialApplyPjo setApplyTime(Timestamp applyTime) {
        this.applyTime = applyTime;
        return this;
    }

    public Integer getBankAcceptState() {
        return this.bankAcceptState;
    }

    public FinancialApplyPjo setBankAcceptState(Integer bankAcceptState) {
        this.bankAcceptState = bankAcceptState;
        return this;
    }

    public Integer getBankAcceptPeriod() {
        return this.bankAcceptPeriod;
    }

    public FinancialApplyPjo setBankAcceptPeriod(Integer bankAcceptPeriod) {
        this.bankAcceptPeriod = bankAcceptPeriod;
        return this;
    }

    public Integer getApplyPurpost() {
        return this.applyPurpost;
    }

    public FinancialApplyPjo setApplyPurpost(Integer applyPurpost) {
        this.applyPurpost = applyPurpost;
        return this;
    }

    public Integer getApplyTerm() {
        return this.applyTerm;
    }

    public FinancialApplyPjo setApplyTerm(Integer applyTerm) {
        this.applyTerm = applyTerm;
        return this;
    }

    public String getRemark() {
        return this.remark;
    }

    public FinancialApplyPjo setRemark(String remark) {
        this.remark = remark;
        return this;
    }

    public Integer getApplyType() {
        return this.applyType;
    }

    public FinancialApplyPjo setApplyType(Integer applyType) {
        this.applyType = applyType;
        return this;
    }

    public BigDecimal getBankAcceptAmount() {
        return this.bankAcceptAmount;
    }

    public FinancialApplyPjo setBankAcceptAmount(BigDecimal bankAcceptAmount) {
        this.bankAcceptAmount = bankAcceptAmount;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("FinancialApplyPjo (");

        sb.append(id);
        sb.append(", ").append(userId);
        sb.append(", ").append(companyId);
        sb.append(", ").append(orgId);
        sb.append(", ").append(productId);
        sb.append(", ").append(amount);
        sb.append(", ").append(period);
        sb.append(", ").append(acceptTime);
        sb.append(", ").append(lastUpdateTime);
        sb.append(", ").append(state);
        sb.append(", ").append(createBy);
        sb.append(", ").append(sourceId);
        sb.append(", ").append(diviisonId);
        sb.append(", ").append(divisionName);
        sb.append(", ").append(acceptAmount);
        sb.append(", ").append(bankOrgId);
        sb.append(", ").append(applyTime);
        sb.append(", ").append(bankAcceptState);
        sb.append(", ").append(bankAcceptPeriod);
        sb.append(", ").append(applyPurpost);
        sb.append(", ").append(applyTerm);
        sb.append(", ").append(remark);
        sb.append(", ").append(applyType);
        sb.append(", ").append(bankAcceptAmount);

        sb.append(")");
        return sb.toString();
    }
}
