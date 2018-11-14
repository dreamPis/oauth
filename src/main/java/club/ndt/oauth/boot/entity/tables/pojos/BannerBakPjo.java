/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * t_banner_bak
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BannerBakPjo implements Serializable {

    private static final long serialVersionUID = -182225311;

    private String     divisionCode;
    private Short      column;
    private BigDecimal id;
    private String     title;
    private Short      type;
    private String     imgUrl;
    private String     href;
    private Short      status;
    private BigDecimal createUser;
    private Timestamp  createTime;
    private BigDecimal updateUser;
    private Timestamp  updateTime;
    private BigDecimal modelId;
    private Integer    oldSort;
    private Integer    sort;

    public BannerBakPjo() {}

    public BannerBakPjo(BannerBakPjo value) {
        this.divisionCode = value.divisionCode;
        this.column = value.column;
        this.id = value.id;
        this.title = value.title;
        this.type = value.type;
        this.imgUrl = value.imgUrl;
        this.href = value.href;
        this.status = value.status;
        this.createUser = value.createUser;
        this.createTime = value.createTime;
        this.updateUser = value.updateUser;
        this.updateTime = value.updateTime;
        this.modelId = value.modelId;
        this.oldSort = value.oldSort;
        this.sort = value.sort;
    }

    public BannerBakPjo(
        String     divisionCode,
        Short      column,
        BigDecimal id,
        String     title,
        Short      type,
        String     imgUrl,
        String     href,
        Short      status,
        BigDecimal createUser,
        Timestamp  createTime,
        BigDecimal updateUser,
        Timestamp  updateTime,
        BigDecimal modelId,
        Integer    oldSort,
        Integer    sort
    ) {
        this.divisionCode = divisionCode;
        this.column = column;
        this.id = id;
        this.title = title;
        this.type = type;
        this.imgUrl = imgUrl;
        this.href = href;
        this.status = status;
        this.createUser = createUser;
        this.createTime = createTime;
        this.updateUser = updateUser;
        this.updateTime = updateTime;
        this.modelId = modelId;
        this.oldSort = oldSort;
        this.sort = sort;
    }

    public String getDivisionCode() {
        return this.divisionCode;
    }

    public BannerBakPjo setDivisionCode(String divisionCode) {
        this.divisionCode = divisionCode;
        return this;
    }

    public Short getColumn() {
        return this.column;
    }

    public BannerBakPjo setColumn(Short column) {
        this.column = column;
        return this;
    }

    public BigDecimal getId() {
        return this.id;
    }

    public BannerBakPjo setId(BigDecimal id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return this.title;
    }

    public BannerBakPjo setTitle(String title) {
        this.title = title;
        return this;
    }

    public Short getType() {
        return this.type;
    }

    public BannerBakPjo setType(Short type) {
        this.type = type;
        return this;
    }

    public String getImgUrl() {
        return this.imgUrl;
    }

    public BannerBakPjo setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
        return this;
    }

    public String getHref() {
        return this.href;
    }

    public BannerBakPjo setHref(String href) {
        this.href = href;
        return this;
    }

    public Short getStatus() {
        return this.status;
    }

    public BannerBakPjo setStatus(Short status) {
        this.status = status;
        return this;
    }

    public BigDecimal getCreateUser() {
        return this.createUser;
    }

    public BannerBakPjo setCreateUser(BigDecimal createUser) {
        this.createUser = createUser;
        return this;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public BannerBakPjo setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
        return this;
    }

    public BigDecimal getUpdateUser() {
        return this.updateUser;
    }

    public BannerBakPjo setUpdateUser(BigDecimal updateUser) {
        this.updateUser = updateUser;
        return this;
    }

    public Timestamp getUpdateTime() {
        return this.updateTime;
    }

    public BannerBakPjo setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    public BigDecimal getModelId() {
        return this.modelId;
    }

    public BannerBakPjo setModelId(BigDecimal modelId) {
        this.modelId = modelId;
        return this;
    }

    public Integer getOldSort() {
        return this.oldSort;
    }

    public BannerBakPjo setOldSort(Integer oldSort) {
        this.oldSort = oldSort;
        return this;
    }

    public Integer getSort() {
        return this.sort;
    }

    public BannerBakPjo setSort(Integer sort) {
        this.sort = sort;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("BannerBakPjo (");

        sb.append(divisionCode);
        sb.append(", ").append(column);
        sb.append(", ").append(id);
        sb.append(", ").append(title);
        sb.append(", ").append(type);
        sb.append(", ").append(imgUrl);
        sb.append(", ").append(href);
        sb.append(", ").append(status);
        sb.append(", ").append(createUser);
        sb.append(", ").append(createTime);
        sb.append(", ").append(updateUser);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(modelId);
        sb.append(", ").append(oldSort);
        sb.append(", ").append(sort);

        sb.append(")");
        return sb.toString();
    }
}