/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 好人贷申请
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LoanHaorenApplyPjo implements Serializable {

    private static final long serialVersionUID = 1848364360;

    private BigDecimal id;
    private BigDecimal userId;
    private BigDecimal productId;
    private Timestamp  applyTime;

    public LoanHaorenApplyPjo() {}

    public LoanHaorenApplyPjo(LoanHaorenApplyPjo value) {
        this.id = value.id;
        this.userId = value.userId;
        this.productId = value.productId;
        this.applyTime = value.applyTime;
    }

    public LoanHaorenApplyPjo(
        BigDecimal id,
        BigDecimal userId,
        BigDecimal productId,
        Timestamp  applyTime
    ) {
        this.id = id;
        this.userId = userId;
        this.productId = productId;
        this.applyTime = applyTime;
    }

    public BigDecimal getId() {
        return this.id;
    }

    public LoanHaorenApplyPjo setId(BigDecimal id) {
        this.id = id;
        return this;
    }

    public BigDecimal getUserId() {
        return this.userId;
    }

    public LoanHaorenApplyPjo setUserId(BigDecimal userId) {
        this.userId = userId;
        return this;
    }

    public BigDecimal getProductId() {
        return this.productId;
    }

    public LoanHaorenApplyPjo setProductId(BigDecimal productId) {
        this.productId = productId;
        return this;
    }

    public Timestamp getApplyTime() {
        return this.applyTime;
    }

    public LoanHaorenApplyPjo setApplyTime(Timestamp applyTime) {
        this.applyTime = applyTime;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("LoanHaorenApplyPjo (");

        sb.append(id);
        sb.append(", ").append(userId);
        sb.append(", ").append(productId);
        sb.append(", ").append(applyTime);

        sb.append(")");
        return sb.toString();
    }
}
