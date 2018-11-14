/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 个人公司账号绑定表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PersonCompanyUnbindRelPjo implements Serializable {

    private static final long serialVersionUID = 1223966398;

    private BigDecimal userId;
    private BigDecimal companyId;
    private BigDecimal id;
    private Short      isLegalPerson;
    private Timestamp  unbindDate;

    public PersonCompanyUnbindRelPjo() {}

    public PersonCompanyUnbindRelPjo(PersonCompanyUnbindRelPjo value) {
        this.userId = value.userId;
        this.companyId = value.companyId;
        this.id = value.id;
        this.isLegalPerson = value.isLegalPerson;
        this.unbindDate = value.unbindDate;
    }

    public PersonCompanyUnbindRelPjo(
        BigDecimal userId,
        BigDecimal companyId,
        BigDecimal id,
        Short      isLegalPerson,
        Timestamp  unbindDate
    ) {
        this.userId = userId;
        this.companyId = companyId;
        this.id = id;
        this.isLegalPerson = isLegalPerson;
        this.unbindDate = unbindDate;
    }

    public BigDecimal getUserId() {
        return this.userId;
    }

    public PersonCompanyUnbindRelPjo setUserId(BigDecimal userId) {
        this.userId = userId;
        return this;
    }

    public BigDecimal getCompanyId() {
        return this.companyId;
    }

    public PersonCompanyUnbindRelPjo setCompanyId(BigDecimal companyId) {
        this.companyId = companyId;
        return this;
    }

    public BigDecimal getId() {
        return this.id;
    }

    public PersonCompanyUnbindRelPjo setId(BigDecimal id) {
        this.id = id;
        return this;
    }

    public Short getIsLegalPerson() {
        return this.isLegalPerson;
    }

    public PersonCompanyUnbindRelPjo setIsLegalPerson(Short isLegalPerson) {
        this.isLegalPerson = isLegalPerson;
        return this;
    }

    public Timestamp getUnbindDate() {
        return this.unbindDate;
    }

    public PersonCompanyUnbindRelPjo setUnbindDate(Timestamp unbindDate) {
        this.unbindDate = unbindDate;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PersonCompanyUnbindRelPjo (");

        sb.append(userId);
        sb.append(", ").append(companyId);
        sb.append(", ").append(id);
        sb.append(", ").append(isLegalPerson);
        sb.append(", ").append(unbindDate);

        sb.append(")");
        return sb.toString();
    }
}
