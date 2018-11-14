/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

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
public class LoanApplyPondPjo implements Serializable {

    private static final long serialVersionUID = -1483961428;

    private BigDecimal id;
    private String     name;
    private Integer    type;
    private BigDecimal amount;
    private String     code;
    private String     phone;
    private Timestamp  applyDate;
    private String     address;
    private String     bankName;

    public LoanApplyPondPjo() {}

    public LoanApplyPondPjo(LoanApplyPondPjo value) {
        this.id = value.id;
        this.name = value.name;
        this.type = value.type;
        this.amount = value.amount;
        this.code = value.code;
        this.phone = value.phone;
        this.applyDate = value.applyDate;
        this.address = value.address;
        this.bankName = value.bankName;
    }

    public LoanApplyPondPjo(
        BigDecimal id,
        String     name,
        Integer    type,
        BigDecimal amount,
        String     code,
        String     phone,
        Timestamp  applyDate,
        String     address,
        String     bankName
    ) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.amount = amount;
        this.code = code;
        this.phone = phone;
        this.applyDate = applyDate;
        this.address = address;
        this.bankName = bankName;
    }

    public BigDecimal getId() {
        return this.id;
    }

    public LoanApplyPondPjo setId(BigDecimal id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public LoanApplyPondPjo setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getType() {
        return this.type;
    }

    public LoanApplyPondPjo setType(Integer type) {
        this.type = type;
        return this;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public LoanApplyPondPjo setAmount(BigDecimal amount) {
        this.amount = amount;
        return this;
    }

    public String getCode() {
        return this.code;
    }

    public LoanApplyPondPjo setCode(String code) {
        this.code = code;
        return this;
    }

    public String getPhone() {
        return this.phone;
    }

    public LoanApplyPondPjo setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public Timestamp getApplyDate() {
        return this.applyDate;
    }

    public LoanApplyPondPjo setApplyDate(Timestamp applyDate) {
        this.applyDate = applyDate;
        return this;
    }

    public String getAddress() {
        return this.address;
    }

    public LoanApplyPondPjo setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getBankName() {
        return this.bankName;
    }

    public LoanApplyPondPjo setBankName(String bankName) {
        this.bankName = bankName;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("LoanApplyPondPjo (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(type);
        sb.append(", ").append(amount);
        sb.append(", ").append(code);
        sb.append(", ").append(phone);
        sb.append(", ").append(applyDate);
        sb.append(", ").append(address);
        sb.append(", ").append(bankName);

        sb.append(")");
        return sb.toString();
    }
}
