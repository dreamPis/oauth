/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;

import javax.annotation.Generated;


/**
 * 村站采集的公司信用称号信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class VillageCompanyCreditPjo implements Serializable {

    private static final long serialVersionUID = -503496891;

    private BigDecimal   id;
    private BigDecimal   villageCompanyInfoId;
    private String       situation;
    private String       year;
    private Short        status;
    private BigDecimal   createUser;
    private Timestamp    createTime;
    private BigDecimal   updateUser;
    private Timestamp    updateTime;
    private BigDecimal[] honorImg;

    public VillageCompanyCreditPjo() {}

    public VillageCompanyCreditPjo(VillageCompanyCreditPjo value) {
        this.id = value.id;
        this.villageCompanyInfoId = value.villageCompanyInfoId;
        this.situation = value.situation;
        this.year = value.year;
        this.status = value.status;
        this.createUser = value.createUser;
        this.createTime = value.createTime;
        this.updateUser = value.updateUser;
        this.updateTime = value.updateTime;
        this.honorImg = value.honorImg;
    }

    public VillageCompanyCreditPjo(
        BigDecimal   id,
        BigDecimal   villageCompanyInfoId,
        String       situation,
        String       year,
        Short        status,
        BigDecimal   createUser,
        Timestamp    createTime,
        BigDecimal   updateUser,
        Timestamp    updateTime,
        BigDecimal[] honorImg
    ) {
        this.id = id;
        this.villageCompanyInfoId = villageCompanyInfoId;
        this.situation = situation;
        this.year = year;
        this.status = status;
        this.createUser = createUser;
        this.createTime = createTime;
        this.updateUser = updateUser;
        this.updateTime = updateTime;
        this.honorImg = honorImg;
    }

    public BigDecimal getId() {
        return this.id;
    }

    public VillageCompanyCreditPjo setId(BigDecimal id) {
        this.id = id;
        return this;
    }

    public BigDecimal getVillageCompanyInfoId() {
        return this.villageCompanyInfoId;
    }

    public VillageCompanyCreditPjo setVillageCompanyInfoId(BigDecimal villageCompanyInfoId) {
        this.villageCompanyInfoId = villageCompanyInfoId;
        return this;
    }

    public String getSituation() {
        return this.situation;
    }

    public VillageCompanyCreditPjo setSituation(String situation) {
        this.situation = situation;
        return this;
    }

    public String getYear() {
        return this.year;
    }

    public VillageCompanyCreditPjo setYear(String year) {
        this.year = year;
        return this;
    }

    public Short getStatus() {
        return this.status;
    }

    public VillageCompanyCreditPjo setStatus(Short status) {
        this.status = status;
        return this;
    }

    public BigDecimal getCreateUser() {
        return this.createUser;
    }

    public VillageCompanyCreditPjo setCreateUser(BigDecimal createUser) {
        this.createUser = createUser;
        return this;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public VillageCompanyCreditPjo setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
        return this;
    }

    public BigDecimal getUpdateUser() {
        return this.updateUser;
    }

    public VillageCompanyCreditPjo setUpdateUser(BigDecimal updateUser) {
        this.updateUser = updateUser;
        return this;
    }

    public Timestamp getUpdateTime() {
        return this.updateTime;
    }

    public VillageCompanyCreditPjo setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public BigDecimal[] getHonorImg() {
        return this.honorImg;
    }

    public VillageCompanyCreditPjo setHonorImg(BigDecimal... honorImg) {
        this.honorImg = honorImg;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("VillageCompanyCreditPjo (");

        sb.append(id);
        sb.append(", ").append(villageCompanyInfoId);
        sb.append(", ").append(situation);
        sb.append(", ").append(year);
        sb.append(", ").append(status);
        sb.append(", ").append(createUser);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateUser);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(Arrays.toString(honorImg));

        sb.append(")");
        return sb.toString();
    }
}
