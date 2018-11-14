/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 获得相关权证情况信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VillagePersonalWarrantinfoPjo implements Serializable {

    private static final long serialVersionUID = -385588504;

    private BigDecimal id;
    private BigDecimal baseinfoId;
    private Integer    warrantName;
    private String     warrantRemark;
    private String     warrantId;
    private String     getTime;
    private BigDecimal buyAmount;
    private Boolean    isPledge;
    private String     pledgeTime;
    private BigDecimal pledgeAmount;
    private String     imageUrl;
    private Short      status;
    private BigDecimal createUser;
    private Timestamp  createTime;
    private BigDecimal updateUser;
    private Timestamp  updateTime;

    public VillagePersonalWarrantinfoPjo() {}

    public VillagePersonalWarrantinfoPjo(VillagePersonalWarrantinfoPjo value) {
        this.id = value.id;
        this.baseinfoId = value.baseinfoId;
        this.warrantName = value.warrantName;
        this.warrantRemark = value.warrantRemark;
        this.warrantId = value.warrantId;
        this.getTime = value.getTime;
        this.buyAmount = value.buyAmount;
        this.isPledge = value.isPledge;
        this.pledgeTime = value.pledgeTime;
        this.pledgeAmount = value.pledgeAmount;
        this.imageUrl = value.imageUrl;
        this.status = value.status;
        this.createUser = value.createUser;
        this.createTime = value.createTime;
        this.updateUser = value.updateUser;
        this.updateTime = value.updateTime;
    }

    public VillagePersonalWarrantinfoPjo(
        BigDecimal id,
        BigDecimal baseinfoId,
        Integer    warrantName,
        String     warrantRemark,
        String     warrantId,
        String     getTime,
        BigDecimal buyAmount,
        Boolean    isPledge,
        String     pledgeTime,
        BigDecimal pledgeAmount,
        String     imageUrl,
        Short      status,
        BigDecimal createUser,
        Timestamp  createTime,
        BigDecimal updateUser,
        Timestamp  updateTime
    ) {
        this.id = id;
        this.baseinfoId = baseinfoId;
        this.warrantName = warrantName;
        this.warrantRemark = warrantRemark;
        this.warrantId = warrantId;
        this.getTime = getTime;
        this.buyAmount = buyAmount;
        this.isPledge = isPledge;
        this.pledgeTime = pledgeTime;
        this.pledgeAmount = pledgeAmount;
        this.imageUrl = imageUrl;
        this.status = status;
        this.createUser = createUser;
        this.createTime = createTime;
        this.updateUser = updateUser;
        this.updateTime = updateTime;
    }

    public BigDecimal getId() {
        return this.id;
    }

    public VillagePersonalWarrantinfoPjo setId(BigDecimal id) {
        this.id = id;
        return this;
    }

    public BigDecimal getBaseinfoId() {
        return this.baseinfoId;
    }

    public VillagePersonalWarrantinfoPjo setBaseinfoId(BigDecimal baseinfoId) {
        this.baseinfoId = baseinfoId;
        return this;
    }

    public Integer getWarrantName() {
        return this.warrantName;
    }

    public VillagePersonalWarrantinfoPjo setWarrantName(Integer warrantName) {
        this.warrantName = warrantName;
        return this;
    }

    public String getWarrantRemark() {
        return this.warrantRemark;
    }

    public VillagePersonalWarrantinfoPjo setWarrantRemark(String warrantRemark) {
        this.warrantRemark = warrantRemark;
        return this;
    }

    public String getWarrantId() {
        return this.warrantId;
    }

    public VillagePersonalWarrantinfoPjo setWarrantId(String warrantId) {
        this.warrantId = warrantId;
        return this;
    }

    public String getGetTime() {
        return this.getTime;
    }

    public VillagePersonalWarrantinfoPjo setGetTime(String getTime) {
        this.getTime = getTime;
        return this;
    }

    public BigDecimal getBuyAmount() {
        return this.buyAmount;
    }

    public VillagePersonalWarrantinfoPjo setBuyAmount(BigDecimal buyAmount) {
        this.buyAmount = buyAmount;
        return this;
    }

    public Boolean getIsPledge() {
        return this.isPledge;
    }

    public VillagePersonalWarrantinfoPjo setIsPledge(Boolean isPledge) {
        this.isPledge = isPledge;
        return this;
    }

    public String getPledgeTime() {
        return this.pledgeTime;
    }

    public VillagePersonalWarrantinfoPjo setPledgeTime(String pledgeTime) {
        this.pledgeTime = pledgeTime;
        return this;
    }

    public BigDecimal getPledgeAmount() {
        return this.pledgeAmount;
    }

    public VillagePersonalWarrantinfoPjo setPledgeAmount(BigDecimal pledgeAmount) {
        this.pledgeAmount = pledgeAmount;
        return this;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public VillagePersonalWarrantinfoPjo setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public Short getStatus() {
        return this.status;
    }

    public VillagePersonalWarrantinfoPjo setStatus(Short status) {
        this.status = status;
        return this;
    }

    public BigDecimal getCreateUser() {
        return this.createUser;
    }

    public VillagePersonalWarrantinfoPjo setCreateUser(BigDecimal createUser) {
        this.createUser = createUser;
        return this;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public VillagePersonalWarrantinfoPjo setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
        return this;
    }

    public BigDecimal getUpdateUser() {
        return this.updateUser;
    }

    public VillagePersonalWarrantinfoPjo setUpdateUser(BigDecimal updateUser) {
        this.updateUser = updateUser;
        return this;
    }

    public Timestamp getUpdateTime() {
        return this.updateTime;
    }

    public VillagePersonalWarrantinfoPjo setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("VillagePersonalWarrantinfoPjo (");

        sb.append(id);
        sb.append(", ").append(baseinfoId);
        sb.append(", ").append(warrantName);
        sb.append(", ").append(warrantRemark);
        sb.append(", ").append(warrantId);
        sb.append(", ").append(getTime);
        sb.append(", ").append(buyAmount);
        sb.append(", ").append(isPledge);
        sb.append(", ").append(pledgeTime);
        sb.append(", ").append(pledgeAmount);
        sb.append(", ").append(imageUrl);
        sb.append(", ").append(status);
        sb.append(", ").append(createUser);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateUser);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}
