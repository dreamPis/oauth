/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 个人其他信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VillagePersonalOtherinfoPjo implements Serializable {

    private static final long serialVersionUID = -271705734;

    private BigDecimal id;
    private BigDecimal baseinfoId;
    private Integer    socialMoral;
    private String     businessHistory;
    private Integer    businessCase;
    private Boolean    isCourtBlackList;
    private Boolean    isBusinessBlackList;
    private Boolean    isCourtExecute;
    private Short      status;
    private BigDecimal createUser;
    private Timestamp  createTime;
    private BigDecimal updateUser;
    private Timestamp  updateTime;

    public VillagePersonalOtherinfoPjo() {}

    public VillagePersonalOtherinfoPjo(VillagePersonalOtherinfoPjo value) {
        this.id = value.id;
        this.baseinfoId = value.baseinfoId;
        this.socialMoral = value.socialMoral;
        this.businessHistory = value.businessHistory;
        this.businessCase = value.businessCase;
        this.isCourtBlackList = value.isCourtBlackList;
        this.isBusinessBlackList = value.isBusinessBlackList;
        this.isCourtExecute = value.isCourtExecute;
        this.status = value.status;
        this.createUser = value.createUser;
        this.createTime = value.createTime;
        this.updateUser = value.updateUser;
        this.updateTime = value.updateTime;
    }

    public VillagePersonalOtherinfoPjo(
        BigDecimal id,
        BigDecimal baseinfoId,
        Integer    socialMoral,
        String     businessHistory,
        Integer    businessCase,
        Boolean    isCourtBlackList,
        Boolean    isBusinessBlackList,
        Boolean    isCourtExecute,
        Short      status,
        BigDecimal createUser,
        Timestamp  createTime,
        BigDecimal updateUser,
        Timestamp  updateTime
    ) {
        this.id = id;
        this.baseinfoId = baseinfoId;
        this.socialMoral = socialMoral;
        this.businessHistory = businessHistory;
        this.businessCase = businessCase;
        this.isCourtBlackList = isCourtBlackList;
        this.isBusinessBlackList = isBusinessBlackList;
        this.isCourtExecute = isCourtExecute;
        this.status = status;
        this.createUser = createUser;
        this.createTime = createTime;
        this.updateUser = updateUser;
        this.updateTime = updateTime;
    }

    public BigDecimal getId() {
        return this.id;
    }

    public VillagePersonalOtherinfoPjo setId(BigDecimal id) {
        this.id = id;
        return this;
    }

    public BigDecimal getBaseinfoId() {
        return this.baseinfoId;
    }

    public VillagePersonalOtherinfoPjo setBaseinfoId(BigDecimal baseinfoId) {
        this.baseinfoId = baseinfoId;
        return this;
    }

    public Integer getSocialMoral() {
        return this.socialMoral;
    }

    public VillagePersonalOtherinfoPjo setSocialMoral(Integer socialMoral) {
        this.socialMoral = socialMoral;
        return this;
    }

    public String getBusinessHistory() {
        return this.businessHistory;
    }

    public VillagePersonalOtherinfoPjo setBusinessHistory(String businessHistory) {
        this.businessHistory = businessHistory;
        return this;
    }

    public Integer getBusinessCase() {
        return this.businessCase;
    }

    public VillagePersonalOtherinfoPjo setBusinessCase(Integer businessCase) {
        this.businessCase = businessCase;
        return this;
    }

    public Boolean getIsCourtBlackList() {
        return this.isCourtBlackList;
    }

    public VillagePersonalOtherinfoPjo setIsCourtBlackList(Boolean isCourtBlackList) {
        this.isCourtBlackList = isCourtBlackList;
        return this;
    }

    public Boolean getIsBusinessBlackList() {
        return this.isBusinessBlackList;
    }

    public VillagePersonalOtherinfoPjo setIsBusinessBlackList(Boolean isBusinessBlackList) {
        this.isBusinessBlackList = isBusinessBlackList;
        return this;
    }

    public Boolean getIsCourtExecute() {
        return this.isCourtExecute;
    }

    public VillagePersonalOtherinfoPjo setIsCourtExecute(Boolean isCourtExecute) {
        this.isCourtExecute = isCourtExecute;
        return this;
    }

    public Short getStatus() {
        return this.status;
    }

    public VillagePersonalOtherinfoPjo setStatus(Short status) {
        this.status = status;
        return this;
    }

    public BigDecimal getCreateUser() {
        return this.createUser;
    }

    public VillagePersonalOtherinfoPjo setCreateUser(BigDecimal createUser) {
        this.createUser = createUser;
        return this;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public VillagePersonalOtherinfoPjo setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
        return this;
    }

    public BigDecimal getUpdateUser() {
        return this.updateUser;
    }

    public VillagePersonalOtherinfoPjo setUpdateUser(BigDecimal updateUser) {
        this.updateUser = updateUser;
        return this;
    }

    public Timestamp getUpdateTime() {
        return this.updateTime;
    }

    public VillagePersonalOtherinfoPjo setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("VillagePersonalOtherinfoPjo (");

        sb.append(id);
        sb.append(", ").append(baseinfoId);
        sb.append(", ").append(socialMoral);
        sb.append(", ").append(businessHistory);
        sb.append(", ").append(businessCase);
        sb.append(", ").append(isCourtBlackList);
        sb.append(", ").append(isBusinessBlackList);
        sb.append(", ").append(isCourtExecute);
        sb.append(", ").append(status);
        sb.append(", ").append(createUser);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateUser);
        sb.append(", ").append(updateTime);

        sb.append(")");
        return sb.toString();
    }
}
