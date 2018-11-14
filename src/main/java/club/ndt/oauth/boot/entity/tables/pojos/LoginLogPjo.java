/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 用户登录日志表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class LoginLogPjo implements Serializable {

    private static final long serialVersionUID = -165431384;

    private BigDecimal id;
    private BigDecimal userId;
    private String     userName;
    private String     ip;
    private Timestamp  loginDate;
    private Short      type;

    public LoginLogPjo() {}

    public LoginLogPjo(LoginLogPjo value) {
        this.id = value.id;
        this.userId = value.userId;
        this.userName = value.userName;
        this.ip = value.ip;
        this.loginDate = value.loginDate;
        this.type = value.type;
    }

    public LoginLogPjo(
        BigDecimal id,
        BigDecimal userId,
        String     userName,
        String     ip,
        Timestamp  loginDate,
        Short      type
    ) {
        this.id = id;
        this.userId = userId;
        this.userName = userName;
        this.ip = ip;
        this.loginDate = loginDate;
        this.type = type;
    }

    public BigDecimal getId() {
        return this.id;
    }

    public LoginLogPjo setId(BigDecimal id) {
        this.id = id;
        return this;
    }

    public BigDecimal getUserId() {
        return this.userId;
    }

    public LoginLogPjo setUserId(BigDecimal userId) {
        this.userId = userId;
        return this;
    }

    public String getUserName() {
        return this.userName;
    }

    public LoginLogPjo setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getIp() {
        return this.ip;
    }

    public LoginLogPjo setIp(String ip) {
        this.ip = ip;
        return this;
    }

    public Timestamp getLoginDate() {
        return this.loginDate;
    }

    public LoginLogPjo setLoginDate(Timestamp loginDate) {
        this.loginDate = loginDate;
        return this;
    }

    public Short getType() {
        return this.type;
    }

    public LoginLogPjo setType(Short type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("LoginLogPjo (");

        sb.append(id);
        sb.append(", ").append(userId);
        sb.append(", ").append(userName);
        sb.append(", ").append(ip);
        sb.append(", ").append(loginDate);
        sb.append(", ").append(type);

        sb.append(")");
        return sb.toString();
    }
}