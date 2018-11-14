/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables.records;


import club.ndt.oauth.boot.entity.tables.TLoginLog;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


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
public class TLoginLogRecord extends UpdatableRecordImpl<TLoginLogRecord> implements Record6<BigDecimal, BigDecimal, String, String, Timestamp, Short> {

    private static final long serialVersionUID = -2123212510;

    /**
     * Setter for <code>ndt.t_login_log.id</code>. 主键
     */
    public TLoginLogRecord setId(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_login_log.id</code>. 主键
     */
    public BigDecimal getId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>ndt.t_login_log.user_id</code>. 用户ID
     */
    public TLoginLogRecord setUserId(BigDecimal value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_login_log.user_id</code>. 用户ID
     */
    public BigDecimal getUserId() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>ndt.t_login_log.user_name</code>. 用户名称
     */
    public TLoginLogRecord setUserName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_login_log.user_name</code>. 用户名称
     */
    public String getUserName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ndt.t_login_log.ip</code>. ip地址
     */
    public TLoginLogRecord setIp(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_login_log.ip</code>. ip地址
     */
    public String getIp() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ndt.t_login_log.login_date</code>. 时间
     */
    public TLoginLogRecord setLoginDate(Timestamp value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_login_log.login_date</code>. 时间
     */
    public Timestamp getLoginDate() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>ndt.t_login_log.type</code>. 类型(1，登录、2，登出)
     */
    public TLoginLogRecord setType(Short value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_login_log.type</code>. 类型(1，登录、2，登出)
     */
    public Short getType() {
        return (Short) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<BigDecimal> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<BigDecimal, BigDecimal, String, String, Timestamp, Short> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<BigDecimal, BigDecimal, String, String, Timestamp, Short> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field1() {
        return TLoginLog.T_LOGIN_LOG.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field2() {
        return TLoginLog.T_LOGIN_LOG.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TLoginLog.T_LOGIN_LOG.USER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TLoginLog.T_LOGIN_LOG.IP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return TLoginLog.T_LOGIN_LOG.LOGIN_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field6() {
        return TLoginLog.T_LOGIN_LOG.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component2() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getLoginDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component6() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value2() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getLoginDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value6() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TLoginLogRecord value1(BigDecimal value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TLoginLogRecord value2(BigDecimal value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TLoginLogRecord value3(String value) {
        setUserName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TLoginLogRecord value4(String value) {
        setIp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TLoginLogRecord value5(Timestamp value) {
        setLoginDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TLoginLogRecord value6(Short value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TLoginLogRecord values(BigDecimal value1, BigDecimal value2, String value3, String value4, Timestamp value5, Short value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TLoginLogRecord
     */
    public TLoginLogRecord() {
        super(TLoginLog.T_LOGIN_LOG);
    }

    /**
     * Create a detached, initialised TLoginLogRecord
     */
    public TLoginLogRecord(BigDecimal id, BigDecimal userId, String userName, String ip, Timestamp loginDate, Short type) {
        super(TLoginLog.T_LOGIN_LOG);

        set(0, id);
        set(1, userId);
        set(2, userName);
        set(3, ip);
        set(4, loginDate);
        set(5, type);
    }
}
