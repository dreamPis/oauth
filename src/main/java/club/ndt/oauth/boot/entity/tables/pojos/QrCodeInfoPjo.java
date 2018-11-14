/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 二维码扫码推广注册详细信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class QrCodeInfoPjo implements Serializable {

    private static final long serialVersionUID = 985646524;

    private BigDecimal id;
    private BigDecimal registeredUserId;
    private BigDecimal promotionUserId;
    private Timestamp  createAt;
    private Integer    source;
    private Short      promotionType;
    private BigDecimal productId;
    private BigDecimal invitationId;
    private Integer    productType;

    public QrCodeInfoPjo() {}

    public QrCodeInfoPjo(QrCodeInfoPjo value) {
        this.id = value.id;
        this.registeredUserId = value.registeredUserId;
        this.promotionUserId = value.promotionUserId;
        this.createAt = value.createAt;
        this.source = value.source;
        this.promotionType = value.promotionType;
        this.productId = value.productId;
        this.invitationId = value.invitationId;
        this.productType = value.productType;
    }

    public QrCodeInfoPjo(
        BigDecimal id,
        BigDecimal registeredUserId,
        BigDecimal promotionUserId,
        Timestamp  createAt,
        Integer    source,
        Short      promotionType,
        BigDecimal productId,
        BigDecimal invitationId,
        Integer    productType
    ) {
        this.id = id;
        this.registeredUserId = registeredUserId;
        this.promotionUserId = promotionUserId;
        this.createAt = createAt;
        this.source = source;
        this.promotionType = promotionType;
        this.productId = productId;
        this.invitationId = invitationId;
        this.productType = productType;
    }

    public BigDecimal getId() {
        return this.id;
    }

    public QrCodeInfoPjo setId(BigDecimal id) {
        this.id = id;
        return this;
    }

    public BigDecimal getRegisteredUserId() {
        return this.registeredUserId;
    }

    public QrCodeInfoPjo setRegisteredUserId(BigDecimal registeredUserId) {
        this.registeredUserId = registeredUserId;
        return this;
    }

    public BigDecimal getPromotionUserId() {
        return this.promotionUserId;
    }

    public QrCodeInfoPjo setPromotionUserId(BigDecimal promotionUserId) {
        this.promotionUserId = promotionUserId;
        return this;
    }

    public Timestamp getCreateAt() {
        return this.createAt;
    }

    public QrCodeInfoPjo setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
        return this;
    }

    public Integer getSource() {
        return this.source;
    }

    public QrCodeInfoPjo setSource(Integer source) {
        this.source = source;
        return this;
    }

    public Short getPromotionType() {
        return this.promotionType;
    }

    public QrCodeInfoPjo setPromotionType(Short promotionType) {
        this.promotionType = promotionType;
        return this;
    }

    public BigDecimal getProductId() {
        return this.productId;
    }

    public QrCodeInfoPjo setProductId(BigDecimal productId) {
        this.productId = productId;
        return this;
    }

    public BigDecimal getInvitationId() {
        return this.invitationId;
    }

    public QrCodeInfoPjo setInvitationId(BigDecimal invitationId) {
        this.invitationId = invitationId;
        return this;
    }

    public Integer getProductType() {
        return this.productType;
    }

    public QrCodeInfoPjo setProductType(Integer productType) {
        this.productType = productType;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("QrCodeInfoPjo (");

        sb.append(id);
        sb.append(", ").append(registeredUserId);
        sb.append(", ").append(promotionUserId);
        sb.append(", ").append(createAt);
        sb.append(", ").append(source);
        sb.append(", ").append(promotionType);
        sb.append(", ").append(productId);
        sb.append(", ").append(invitationId);
        sb.append(", ").append(productType);

        sb.append(")");
        return sb.toString();
    }
}