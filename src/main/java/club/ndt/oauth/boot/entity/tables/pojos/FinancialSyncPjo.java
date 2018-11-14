/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.pojos;


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
public class FinancialSyncPjo implements Serializable {

    private static final long serialVersionUID = -2061044840;

    private BigDecimal id;
    private BigDecimal applyId;
    private Integer    applyState;
    private String     applyStateName;
    private Timestamp  syncTime;
    private BigDecimal userId;
    private Timestamp  createAt;
    private BigDecimal createBy;
    private Timestamp  updateAt;
    private BigDecimal updateBy;
    private Integer    status;
    private BigDecimal amount;
    private String     remark;

    public FinancialSyncPjo() {}

    public FinancialSyncPjo(FinancialSyncPjo value) {
        this.id = value.id;
        this.applyId = value.applyId;
        this.applyState = value.applyState;
        this.applyStateName = value.applyStateName;
        this.syncTime = value.syncTime;
        this.userId = value.userId;
        this.createAt = value.createAt;
        this.createBy = value.createBy;
        this.updateAt = value.updateAt;
        this.updateBy = value.updateBy;
        this.status = value.status;
        this.amount = value.amount;
        this.remark = value.remark;
    }

    public FinancialSyncPjo(
        BigDecimal id,
        BigDecimal applyId,
        Integer    applyState,
        String     applyStateName,
        Timestamp  syncTime,
        BigDecimal userId,
        Timestamp  createAt,
        BigDecimal createBy,
        Timestamp  updateAt,
        BigDecimal updateBy,
        Integer    status,
        BigDecimal amount,
        String     remark
    ) {
        this.id = id;
        this.applyId = applyId;
        this.applyState = applyState;
        this.applyStateName = applyStateName;
        this.syncTime = syncTime;
        this.userId = userId;
        this.createAt = createAt;
        this.createBy = createBy;
        this.updateAt = updateAt;
        this.updateBy = updateBy;
        this.status = status;
        this.amount = amount;
        this.remark = remark;
    }

    public BigDecimal getId() {
        return this.id;
    }

    public FinancialSyncPjo setId(BigDecimal id) {
        this.id = id;
        return this;
    }

    public BigDecimal getApplyId() {
        return this.applyId;
    }

    public FinancialSyncPjo setApplyId(BigDecimal applyId) {
        this.applyId = applyId;
        return this;
    }

    public Integer getApplyState() {
        return this.applyState;
    }

    public FinancialSyncPjo setApplyState(Integer applyState) {
        this.applyState = applyState;
        return this;
    }

    public String getApplyStateName() {
        return this.applyStateName;
    }

    public FinancialSyncPjo setApplyStateName(String applyStateName) {
        this.applyStateName = applyStateName;
        return this;
    }

    public Timestamp getSyncTime() {
        return this.syncTime;
    }

    public FinancialSyncPjo setSyncTime(Timestamp syncTime) {
        this.syncTime = syncTime;
        return this;
    }

    public BigDecimal getUserId() {
        return this.userId;
    }

    public FinancialSyncPjo setUserId(BigDecimal userId) {
        this.userId = userId;
        return this;
    }

    public Timestamp getCreateAt() {
        return this.createAt;
    }

    public FinancialSyncPjo setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
        return this;
    }

    public BigDecimal getCreateBy() {
        return this.createBy;
    }

    public FinancialSyncPjo setCreateBy(BigDecimal createBy) {
        this.createBy = createBy;
        return this;
    }

    public Timestamp getUpdateAt() {
        return this.updateAt;
    }

    public FinancialSyncPjo setUpdateAt(Timestamp updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    public BigDecimal getUpdateBy() {
        return this.updateBy;
    }

    public FinancialSyncPjo setUpdateBy(BigDecimal updateBy) {
        this.updateBy = updateBy;
        return this;
    }

    public Integer getStatus() {
        return this.status;
    }

    public FinancialSyncPjo setStatus(Integer status) {
        this.status = status;
        return this;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public FinancialSyncPjo setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    public String getRemark() {
        return this.remark;
    }

    public FinancialSyncPjo setRemark(String remark) {
        this.remark = remark;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("FinancialSyncPjo (");

        sb.append(id);
        sb.append(", ").append(applyId);
        sb.append(", ").append(applyState);
        sb.append(", ").append(applyStateName);
        sb.append(", ").append(syncTime);
        sb.append(", ").append(userId);
        sb.append(", ").append(createAt);
        sb.append(", ").append(createBy);
        sb.append(", ").append(updateAt);
        sb.append(", ").append(updateBy);
        sb.append(", ").append(status);
        sb.append(", ").append(amount);
        sb.append(", ").append(remark);

        sb.append(")");
        return sb.toString();
    }
}
