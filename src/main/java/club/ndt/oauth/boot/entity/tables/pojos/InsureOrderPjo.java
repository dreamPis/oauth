/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 保险订单
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InsureOrderPjo implements Serializable {

    private static final long serialVersionUID = 960562579;

    private BigDecimal id;
    private BigDecimal uId;
    private String     identityCard;
    private Timestamp  createTime;
    private Integer    applyWay;
    private String     policyTo;
    private String     phone;
    private String     policyHolder;
    private Integer    relationship;
    private BigDecimal productId;
    private Integer    status;

    public InsureOrderPjo() {}

    public InsureOrderPjo(InsureOrderPjo value) {
        this.id = value.id;
        this.uId = value.uId;
        this.identityCard = value.identityCard;
        this.createTime = value.createTime;
        this.applyWay = value.applyWay;
        this.policyTo = value.policyTo;
        this.phone = value.phone;
        this.policyHolder = value.policyHolder;
        this.relationship = value.relationship;
        this.productId = value.productId;
        this.status = value.status;
    }

    public InsureOrderPjo(
        BigDecimal id,
        BigDecimal uId,
        String     identityCard,
        Timestamp  createTime,
        Integer    applyWay,
        String     policyTo,
        String     phone,
        String     policyHolder,
        Integer    relationship,
        BigDecimal productId,
        Integer    status
    ) {
        this.id = id;
        this.uId = uId;
        this.identityCard = identityCard;
        this.createTime = createTime;
        this.applyWay = applyWay;
        this.policyTo = policyTo;
        this.phone = phone;
        this.policyHolder = policyHolder;
        this.relationship = relationship;
        this.productId = productId;
        this.status = status;
    }

    public BigDecimal getId() {
        return this.id;
    }

    public InsureOrderPjo setId(BigDecimal id) {
        this.id = id;
        return this;
    }

    public BigDecimal getUId() {
        return this.uId;
    }

    public InsureOrderPjo setUId(BigDecimal uId) {
        this.uId = uId;
        return this;
    }

    public String getIdentityCard() {
        return this.identityCard;
    }

    public InsureOrderPjo setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
        return this;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public InsureOrderPjo setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
        return this;
    }

    public Integer getApplyWay() {
        return this.applyWay;
    }

    public InsureOrderPjo setApplyWay(Integer applyWay) {
        this.applyWay = applyWay;
        return this;
    }

    public String getPolicyTo() {
        return this.policyTo;
    }

    public InsureOrderPjo setPolicyTo(String policyTo) {
        this.policyTo = policyTo;
        return this;
    }

    public String getPhone() {
        return this.phone;
    }

    public InsureOrderPjo setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getPolicyHolder() {
        return this.policyHolder;
    }

    public InsureOrderPjo setPolicyHolder(String policyHolder) {
        this.policyHolder = policyHolder;
        return this;
    }

    public Integer getRelationship() {
        return this.relationship;
    }

    public InsureOrderPjo setRelationship(Integer relationship) {
        this.relationship = relationship;
        return this;
    }

    public BigDecimal getProductId() {
        return this.productId;
    }

    public InsureOrderPjo setProductId(BigDecimal productId) {
        this.productId = productId;
        return this;
    }

    public Integer getStatus() {
        return this.status;
    }

    public InsureOrderPjo setStatus(Integer status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("InsureOrderPjo (");

        sb.append(id);
        sb.append(", ").append(uId);
        sb.append(", ").append(identityCard);
        sb.append(", ").append(createTime);
        sb.append(", ").append(applyWay);
        sb.append(", ").append(policyTo);
        sb.append(", ").append(phone);
        sb.append(", ").append(policyHolder);
        sb.append(", ").append(relationship);
        sb.append(", ").append(productId);
        sb.append(", ").append(status);

        sb.append(")");
        return sb.toString();
    }
}
