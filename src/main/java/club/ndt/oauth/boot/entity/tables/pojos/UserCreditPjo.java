/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 用户信用分数
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserCreditPjo implements Serializable {

    private static final long serialVersionUID = -1605075377;

    private BigDecimal id;
    private Integer    userType;
    private BigDecimal userId;
    private Integer    contractualCapacityScore;
    private Integer    creditHistoryScore;
    private Integer    infoScore;
    private Integer    ndtScore;
    private Integer    totalScore;
    private Integer    level;
    private Short      status;
    private BigDecimal createUser;
    private Timestamp  createTime;
    private BigDecimal updateUser;
    private Timestamp  updateTime;

    public UserCreditPjo() {}

    public UserCreditPjo(UserCreditPjo value) {
        this.id = value.id;
        this.userType = value.userType;
        this.userId = value.userId;
        this.contractualCapacityScore = value.contractualCapacityScore;
        this.creditHistoryScore = value.creditHistoryScore;
        this.infoScore = value.infoScore;
        this.ndtScore = value.ndtScore;
        this.totalScore = value.totalScore;
        this.level = value.level;
        this.status = value.status;
        this.createUser = value.createUser;
        this.createTime = value.createTime;
        this.updateUser = value.updateUser;
        this.updateTime = value.updateTime;
    }

    public UserCreditPjo(
        BigDecimal id,
        Integer    userType,
        BigDecimal userId,
        Integer    contractualCapacityScore,
        Integer    creditHistoryScore,
        Integer    infoScore,
        Integer    ndtScore,
        Integer    totalScore,
        Integer    level,
        Short      status,
        BigDecimal createUser,
        Timestamp  createTime,
        BigDecimal updateUser,
        Timestamp  updateTime
    ) {
        this.id = id;
        this.userType = userType;
        this.userId = userId;
        this.contractualCapacityScore = contractualCapacityScore;
        this.creditHistoryScore = creditHistoryScore;
        this.infoScore = infoScore;
        this.ndtScore = ndtScore;
        this.totalScore = totalScore;
        this.level = level;
        this.status = status;
        this.createUser = createUser;
        this.createTime = createTime;
        this.updateUser = updateUser;
        this.updateTime = updateTime;
    }

    public BigDecimal getId() {
        return this.id;
    }

    public UserCreditPjo setId(BigDecimal id) {
        this.id = id;
        return this;
    }

    public Integer getUserType() {
        return this.userType;
    }

    public UserCreditPjo setUserType(Integer userType) {
        this.userType = userType;
        return this;
    }

    public BigDecimal getUserId() {
        return this.userId;
    }

    public UserCreditPjo setUserId(BigDecimal userId) {
        this.userId = userId;
        return this;
    }

    public Integer getContractualCapacityScore() {
        return this.contractualCapacityScore;
    }

    public UserCreditPjo setContractualCapacityScore(Integer contractualCapacityScore) {
        this.contractualCapacityScore = contractualCapacityScore;
        return this;
    }

    public Integer getCreditHistoryScore() {
        return this.creditHistoryScore;
    }

    public UserCreditPjo setCreditHistoryScore(Integer creditHistoryScore) {
        this.creditHistoryScore = creditHistoryScore;
        return this;
    }

    public Integer getInfoScore() {
        return this.infoScore;
    }

    public UserCreditPjo setInfoScore(Integer infoScore) {
        this.infoScore = infoScore;
        return this;
    }

    public Integer getNdtScore() {
        return this.ndtScore;
    }

    public UserCreditPjo setNdtScore(Integer ndtScore) {
        this.ndtScore = ndtScore;
        return this;
    }

    public Integer getTotalScore() {
        return this.totalScore;
    }

    public UserCreditPjo setTotalScore(Integer totalScore) {
        this.totalScore = totalScore;
        return this;
    }

    public Integer getLevel() {
        return this.level;
    }

    public UserCreditPjo setLevel(Integer level) {
        this.level = level;
        return this;
    }

    public Short getStatus() {
        return this.status;
    }

    public UserCreditPjo setStatus(Short status) {
        this.status = status;
        return this;
    }

    public BigDecimal getCreateUser() {
        return this.createUser;
    }

    public UserCreditPjo setCreateUser(BigDecimal createUser) {
        this.createUser = createUser;
        return this;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public UserCreditPjo setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
        return this;
    }

    public BigDecimal getUpdateUser() {
        return this.updateUser;
    }

    public UserCreditPjo setUpdateUser(BigDecimal updateUser) {
        this.updateUser = updateUser;
        return this;
    }

    public Timestamp getUpdateTime() {
        return this.updateTime;
    }

    public UserCreditPjo setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("UserCreditPjo (");

        sb.append(id);
        sb.append(", ").append(userType);
        sb.append(", ").append(userId);
        sb.append(", ").append(contractualCapacityScore);
        sb.append(", ").append(creditHistoryScore);
        sb.append(", ").append(infoScore);
        sb.append(", ").append(ndtScore);
        sb.append(", ").append(totalScore);
        sb.append(", ").append(level);
        sb.append(", ").append(status);
        sb.append(", ").append(createUser);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateUser);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}