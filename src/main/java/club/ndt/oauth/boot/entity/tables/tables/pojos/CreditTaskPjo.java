/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;

import javax.annotation.Generated;


/**
 * 信用任务设置
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CreditTaskPjo implements Serializable {

    private static final long serialVersionUID = 1896060433;

    private BigDecimal id;
    private Integer    userType;
    private Short      index;
    private String     name;
    private Integer    score;
    private String     toLink;

    public CreditTaskPjo() {}

    public CreditTaskPjo(CreditTaskPjo value) {
        this.id = value.id;
        this.userType = value.userType;
        this.index = value.index;
        this.name = value.name;
        this.score = value.score;
        this.toLink = value.toLink;
    }

    public CreditTaskPjo(
        BigDecimal id,
        Integer    userType,
        Short      index,
        String     name,
        Integer    score,
        String     toLink
    ) {
        this.id = id;
        this.userType = userType;
        this.index = index;
        this.name = name;
        this.score = score;
        this.toLink = toLink;
    }

    public BigDecimal getId() {
        return this.id;
    }

    public CreditTaskPjo setId(BigDecimal id) {
        this.id = id;
        return this;
    }

    public Integer getUserType() {
        return this.userType;
    }

    public CreditTaskPjo setUserType(Integer userType) {
        this.userType = userType;
        return this;
    }

    public Short getIndex() {
        return this.index;
    }

    public CreditTaskPjo setIndex(Short index) {
        this.index = index;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public CreditTaskPjo setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getScore() {
        return this.score;
    }

    public CreditTaskPjo setScore(Integer score) {
        this.score = score;
        return this;
    }

    public String getToLink() {
        return this.toLink;
    }

    public CreditTaskPjo setToLink(String toLink) {
        this.toLink = toLink;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CreditTaskPjo (");

        sb.append(id);
        sb.append(", ").append(userType);
        sb.append(", ").append(index);
        sb.append(", ").append(name);
        sb.append(", ").append(score);
        sb.append(", ").append(toLink);

        sb.append(")");
        return sb.toString();
    }
}
