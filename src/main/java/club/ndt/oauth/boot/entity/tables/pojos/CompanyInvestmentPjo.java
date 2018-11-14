/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 公司投资信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CompanyInvestmentPjo implements Serializable {

    private static final long serialVersionUID = -1926052121;

    private BigDecimal id;
    private BigDecimal companyDetailId;
    private String     investmentUnit;
    private BigDecimal investmentAmt;
    private Timestamp  investmentDate;
    private Timestamp  backOutDate;
    private Short      status;
    private BigDecimal createBy;
    private Timestamp  createAt;
    private BigDecimal updateBy;
    private Timestamp  updateAt;

    public CompanyInvestmentPjo() {}

    public CompanyInvestmentPjo(CompanyInvestmentPjo value) {
        this.id = value.id;
        this.companyDetailId = value.companyDetailId;
        this.investmentUnit = value.investmentUnit;
        this.investmentAmt = value.investmentAmt;
        this.investmentDate = value.investmentDate;
        this.backOutDate = value.backOutDate;
        this.status = value.status;
        this.createBy = value.createBy;
        this.createAt = value.createAt;
        this.updateBy = value.updateBy;
        this.updateAt = value.updateAt;
    }

    public CompanyInvestmentPjo(
        BigDecimal id,
        BigDecimal companyDetailId,
        String     investmentUnit,
        BigDecimal investmentAmt,
        Timestamp  investmentDate,
        Timestamp  backOutDate,
        Short      status,
        BigDecimal createBy,
        Timestamp  createAt,
        BigDecimal updateBy,
        Timestamp  updateAt
    ) {
        this.id = id;
        this.companyDetailId = companyDetailId;
        this.investmentUnit = investmentUnit;
        this.investmentAmt = investmentAmt;
        this.investmentDate = investmentDate;
        this.backOutDate = backOutDate;
        this.status = status;
        this.createBy = createBy;
        this.createAt = createAt;
        this.updateBy = updateBy;
        this.updateAt = updateAt;
    }

    public BigDecimal getId() {
        return this.id;
    }

    public CompanyInvestmentPjo setId(BigDecimal id) {
        this.id = id;
        return this;
    }

    public BigDecimal getCompanyDetailId() {
        return this.companyDetailId;
    }

    public CompanyInvestmentPjo setCompanyDetailId(BigDecimal companyDetailId) {
        this.companyDetailId = companyDetailId;
        return this;
    }

    public String getInvestmentUnit() {
        return this.investmentUnit;
    }

    public CompanyInvestmentPjo setInvestmentUnit(String investmentUnit) {
        this.investmentUnit = investmentUnit;
        return this;
    }

    public BigDecimal getInvestmentAmt() {
        return this.investmentAmt;
    }

    public CompanyInvestmentPjo setInvestmentAmt(BigDecimal investmentAmt) {
        this.investmentAmt = investmentAmt;
        return this;
    }

    public Timestamp getInvestmentDate() {
        return this.investmentDate;
    }

    public CompanyInvestmentPjo setInvestmentDate(Timestamp investmentDate) {
        this.investmentDate = investmentDate;
        return this;
    }

    public Timestamp getBackOutDate() {
        return this.backOutDate;
    }

    public CompanyInvestmentPjo setBackOutDate(Timestamp backOutDate) {
        this.backOutDate = backOutDate;
        return this;
    }

    public Short getStatus() {
        return this.status;
    }

    public CompanyInvestmentPjo setStatus(Short status) {
        this.status = status;
        return this;
    }

    public BigDecimal getCreateBy() {
        return this.createBy;
    }

    public CompanyInvestmentPjo setCreateBy(BigDecimal createBy) {
        this.createBy = createBy;
        return this;
    }

    public Timestamp getCreateAt() {
        return this.createAt;
    }

    public CompanyInvestmentPjo setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
        return this;
    }

    public BigDecimal getUpdateBy() {
        return this.updateBy;
    }

    public CompanyInvestmentPjo setUpdateBy(BigDecimal updateBy) {
        this.updateBy = updateBy;
        return this;
    }

    public Timestamp getUpdateAt() {
        return this.updateAt;
    }

    public CompanyInvestmentPjo setUpdateAt(Timestamp updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CompanyInvestmentPjo (");

        sb.append(id);
        sb.append(", ").append(companyDetailId);
        sb.append(", ").append(investmentUnit);
        sb.append(", ").append(investmentAmt);
        sb.append(", ").append(investmentDate);
        sb.append(", ").append(backOutDate);
        sb.append(", ").append(status);
        sb.append(", ").append(createBy);
        sb.append(", ").append(createAt);
        sb.append(", ").append(updateBy);
        sb.append(", ").append(updateAt);

        sb.append(")");
        return sb.toString();
    }
}
