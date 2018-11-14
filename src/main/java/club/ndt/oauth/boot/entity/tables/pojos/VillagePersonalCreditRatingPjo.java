/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 信用评价信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VillagePersonalCreditRatingPjo implements Serializable {

    private static final long serialVersionUID = 2075458160;

    private BigDecimal id;
    private BigDecimal baseinfoId;
    private Integer    creditRatingType;
    private String     creditRatingLevel;
    private String     creditRatingTime;
    private Short      status;
    private BigDecimal createUser;
    private Timestamp  createTime;
    private BigDecimal updateUser;
    private Timestamp  updateTime;

    public VillagePersonalCreditRatingPjo() {}

    public VillagePersonalCreditRatingPjo(VillagePersonalCreditRatingPjo value) {
        this.id = value.id;
        this.baseinfoId = value.baseinfoId;
        this.creditRatingType = value.creditRatingType;
        this.creditRatingLevel = value.creditRatingLevel;
        this.creditRatingTime = value.creditRatingTime;
        this.status = value.status;
        this.createUser = value.createUser;
        this.createTime = value.createTime;
        this.updateUser = value.updateUser;
        this.updateTime = value.updateTime;
    }

    public VillagePersonalCreditRatingPjo(
        BigDecimal id,
        BigDecimal baseinfoId,
        Integer    creditRatingType,
        String     creditRatingLevel,
        String     creditRatingTime,
        Short      status,
        BigDecimal createUser,
        Timestamp  createTime,
        BigDecimal updateUser,
        Timestamp  updateTime
    ) {
        this.id = id;
        this.baseinfoId = baseinfoId;
        this.creditRatingType = creditRatingType;
        this.creditRatingLevel = creditRatingLevel;
        this.creditRatingTime = creditRatingTime;
        this.status = status;
        this.createUser = createUser;
        this.createTime = createTime;
        this.updateUser = updateUser;
        this.updateTime = updateTime;
    }

    public BigDecimal getId() {
        return this.id;
    }

    public VillagePersonalCreditRatingPjo setId(BigDecimal id) {
        this.id = id;
        return this;
    }

    public BigDecimal getBaseinfoId() {
        return this.baseinfoId;
    }

    public VillagePersonalCreditRatingPjo setBaseinfoId(BigDecimal baseinfoId) {
        this.baseinfoId = baseinfoId;
        return this;
    }

    public Integer getCreditRatingType() {
        return this.creditRatingType;
    }

    public VillagePersonalCreditRatingPjo setCreditRatingType(Integer creditRatingType) {
        this.creditRatingType = creditRatingType;
        return this;
    }

    public String getCreditRatingLevel() {
        return this.creditRatingLevel;
    }

    public VillagePersonalCreditRatingPjo setCreditRatingLevel(String creditRatingLevel) {
        this.creditRatingLevel = creditRatingLevel;
        return this;
    }

    public String getCreditRatingTime() {
        return this.creditRatingTime;
    }

    public VillagePersonalCreditRatingPjo setCreditRatingTime(String creditRatingTime) {
        this.creditRatingTime = creditRatingTime;
        return this;
    }

    public Short getStatus() {
        return this.status;
    }

    public VillagePersonalCreditRatingPjo setStatus(Short status) {
        this.status = status;
        return this;
    }

    public BigDecimal getCreateUser() {
        return this.createUser;
    }

    public VillagePersonalCreditRatingPjo setCreateUser(BigDecimal createUser) {
        this.createUser = createUser;
        return this;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public VillagePersonalCreditRatingPjo setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
        return this;
    }

    public BigDecimal getUpdateUser() {
        return this.updateUser;
    }

    public VillagePersonalCreditRatingPjo setUpdateUser(BigDecimal updateUser) {
        this.updateUser = updateUser;
        return this;
    }

    public Timestamp getUpdateTime() {
        return this.updateTime;
    }

    public VillagePersonalCreditRatingPjo setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("VillagePersonalCreditRatingPjo (");

        sb.append(id);
        sb.append(", ").append(baseinfoId);
        sb.append(", ").append(creditRatingType);
        sb.append(", ").append(creditRatingLevel);
        sb.append(", ").append(creditRatingTime);
        sb.append(", ").append(status);
        sb.append(", ").append(createUser);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateUser);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}
