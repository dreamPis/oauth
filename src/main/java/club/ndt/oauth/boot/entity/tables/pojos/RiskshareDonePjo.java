/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 风险分担结果
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RiskshareDonePjo implements Serializable {

    private static final long serialVersionUID = 135186859;

    private BigDecimal id;
    private BigDecimal riskshareApplyId;
    private BigDecimal amount;
    private BigDecimal orgId;
    private BigDecimal invitationUserId;
    private Integer    invitationUserType;
    private BigDecimal userAdmindivisionId;
    private BigDecimal createUser;
    private Timestamp  createTime;
    private Short      status;

    public RiskshareDonePjo() {}

    public RiskshareDonePjo(RiskshareDonePjo value) {
        this.id = value.id;
        this.riskshareApplyId = value.riskshareApplyId;
        this.amount = value.amount;
        this.orgId = value.orgId;
        this.invitationUserId = value.invitationUserId;
        this.invitationUserType = value.invitationUserType;
        this.userAdmindivisionId = value.userAdmindivisionId;
        this.createUser = value.createUser;
        this.createTime = value.createTime;
        this.status = value.status;
    }

    public RiskshareDonePjo(
        BigDecimal id,
        BigDecimal riskshareApplyId,
        BigDecimal amount,
        BigDecimal orgId,
        BigDecimal invitationUserId,
        Integer    invitationUserType,
        BigDecimal userAdmindivisionId,
        BigDecimal createUser,
        Timestamp  createTime,
        Short      status
    ) {
        this.id = id;
        this.riskshareApplyId = riskshareApplyId;
        this.amount = amount;
        this.orgId = orgId;
        this.invitationUserId = invitationUserId;
        this.invitationUserType = invitationUserType;
        this.userAdmindivisionId = userAdmindivisionId;
        this.createUser = createUser;
        this.createTime = createTime;
        this.status = status;
    }

    public BigDecimal getId() {
        return this.id;
    }

    public RiskshareDonePjo setId(BigDecimal id) {
        this.id = id;
        return this;
    }

    public BigDecimal getRiskshareApplyId() {
        return this.riskshareApplyId;
    }

    public RiskshareDonePjo setRiskshareApplyId(BigDecimal riskshareApplyId) {
        this.riskshareApplyId = riskshareApplyId;
        return this;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public RiskshareDonePjo setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    public BigDecimal getOrgId() {
        return this.orgId;
    }

    public RiskshareDonePjo setOrgId(BigDecimal orgId) {
        this.orgId = orgId;
        return this;
    }

    public BigDecimal getInvitationUserId() {
        return this.invitationUserId;
    }

    public RiskshareDonePjo setInvitationUserId(BigDecimal invitationUserId) {
        this.invitationUserId = invitationUserId;
        return this;
    }

    public Integer getInvitationUserType() {
        return this.invitationUserType;
    }

    public RiskshareDonePjo setInvitationUserType(Integer invitationUserType) {
        this.invitationUserType = invitationUserType;
        return this;
    }

    public BigDecimal getUserAdmindivisionId() {
        return this.userAdmindivisionId;
    }

    public RiskshareDonePjo setUserAdmindivisionId(BigDecimal userAdmindivisionId) {
        this.userAdmindivisionId = userAdmindivisionId;
        return this;
    }

    public BigDecimal getCreateUser() {
        return this.createUser;
    }

    public RiskshareDonePjo setCreateUser(BigDecimal createUser) {
        this.createUser = createUser;
        return this;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public RiskshareDonePjo setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
        return this;
    }

    public Short getStatus() {
        return this.status;
    }

    public RiskshareDonePjo setStatus(Short status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("RiskshareDonePjo (");

        sb.append(id);
        sb.append(", ").append(riskshareApplyId);
        sb.append(", ").append(amount);
        sb.append(", ").append(orgId);
        sb.append(", ").append(invitationUserId);
        sb.append(", ").append(invitationUserType);
        sb.append(", ").append(userAdmindivisionId);
        sb.append(", ").append(createUser);
        sb.append(", ").append(createTime);
        sb.append(", ").append(status);

        sb.append(")");
        return sb.toString();
    }
}
