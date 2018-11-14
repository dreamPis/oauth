/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;

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
public class LoanRaidBsPjo implements Serializable {

    private static final long serialVersionUID = 1036205920;

    private String     value;
    private Long       ccount;
    private BigDecimal sumamount;

    public LoanRaidBsPjo() {}

    public LoanRaidBsPjo(LoanRaidBsPjo value) {
        this.value = value.value;
        this.ccount = value.ccount;
        this.sumamount = value.sumamount;
    }

    public LoanRaidBsPjo(
        String     value,
        Long       ccount,
        BigDecimal sumamount
    ) {
        this.value = value;
        this.ccount = ccount;
        this.sumamount = sumamount;
    }

    public String getValue() {
        return this.value;
    }

    public LoanRaidBsPjo setValue(String value) {
        this.value = value;
        return this;
    }

    public Long getCcount() {
        return this.ccount;
    }

    public LoanRaidBsPjo setCcount(Long ccount) {
        this.ccount = ccount;
        return this;
    }

    public BigDecimal getSumamount() {
        return this.sumamount;
    }

    public LoanRaidBsPjo setSumamount(BigDecimal sumamount) {
        this.sumamount = sumamount;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("LoanRaidBsPjo (");

        sb.append(value);
        sb.append(", ").append(ccount);
        sb.append(", ").append(sumamount);

        sb.append(")");
        return sb.toString();
    }
}
