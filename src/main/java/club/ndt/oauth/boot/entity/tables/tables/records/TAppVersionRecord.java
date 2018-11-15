/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables.records;


import club.ndt.oauth.boot.entity.tables.TAppVersion;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * APP版本管理
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TAppVersionRecord extends UpdatableRecordImpl<TAppVersionRecord> implements Record11<BigDecimal, String, String, String, String, String[], String, BigDecimal, String, Timestamp, Boolean> {

    private static final long serialVersionUID = -1264664822;

    /**
     * Setter for <code>ndt.t_app_version.id</code>.
     */
    public TAppVersionRecord setId(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_app_version.id</code>.
     */
    public BigDecimal getId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>ndt.t_app_version.app_id</code>. 产品APP_ID
     */
    public TAppVersionRecord setAppId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_app_version.app_id</code>. 产品APP_ID
     */
    public String getAppId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ndt.t_app_version.app_name</code>. 产品APP_名称
     */
    public TAppVersionRecord setAppName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_app_version.app_name</code>. 产品APP_名称
     */
    public String getAppName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ndt.t_app_version.version_code</code>. 版本号
     */
    public TAppVersionRecord setVersionCode(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_app_version.version_code</code>. 版本号
     */
    public String getVersionCode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ndt.t_app_version.version_name</code>. 版本name
     */
    public TAppVersionRecord setVersionName(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_app_version.version_name</code>. 版本name
     */
    public String getVersionName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ndt.t_app_version.user_agent</code>. 各渠道版本 ，可升级多渠道
     */
    public TAppVersionRecord setUserAgent(String... value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_app_version.user_agent</code>. 各渠道版本 ，可升级多渠道
     */
    public String[] getUserAgent() {
        return (String[]) get(5);
    }

    /**
     * Setter for <code>ndt.t_app_version.download_url</code>. 下载url
     */
    public TAppVersionRecord setDownloadUrl(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_app_version.download_url</code>. 下载url
     */
    public String getDownloadUrl() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ndt.t_app_version.update_id</code>. 记录本次版本应该升级到最新版本号
     */
    public TAppVersionRecord setUpdateId(BigDecimal value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_app_version.update_id</code>. 记录本次版本应该升级到最新版本号
     */
    public BigDecimal getUpdateId() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>ndt.t_app_version.update_log</code>. 升级日志
     */
    public TAppVersionRecord setUpdateLog(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_app_version.update_log</code>. 升级日志
     */
    public String getUpdateLog() {
        return (String) get(8);
    }

    /**
     * Setter for <code>ndt.t_app_version.update_time</code>. 升级时间
     */
    public TAppVersionRecord setUpdateTime(Timestamp value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_app_version.update_time</code>. 升级时间
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(9);
    }

    /**
     * Setter for <code>ndt.t_app_version.update_install</code>. 是否强制安装
     */
    public TAppVersionRecord setUpdateInstall(Boolean value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_app_version.update_install</code>. 是否强制安装
     */
    public Boolean getUpdateInstall() {
        return (Boolean) get(10);
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
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<BigDecimal, String, String, String, String, String[], String, BigDecimal, String, Timestamp, Boolean> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<BigDecimal, String, String, String, String, String[], String, BigDecimal, String, Timestamp, Boolean> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field1() {
        return TAppVersion.T_APP_VERSION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TAppVersion.T_APP_VERSION.APP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TAppVersion.T_APP_VERSION.APP_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TAppVersion.T_APP_VERSION.VERSION_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TAppVersion.T_APP_VERSION.VERSION_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String[]> field6() {
        return TAppVersion.T_APP_VERSION.USER_AGENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TAppVersion.T_APP_VERSION.DOWNLOAD_URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field8() {
        return TAppVersion.T_APP_VERSION.UPDATE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return TAppVersion.T_APP_VERSION.UPDATE_LOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return TAppVersion.T_APP_VERSION.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field11() {
        return TAppVersion.T_APP_VERSION.UPDATE_INSTALL;
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
    public String component2() {
        return getAppId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getAppName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getVersionCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getVersionName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] component6() {
        return getUserAgent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getDownloadUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component8() {
        return getUpdateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getUpdateLog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component10() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component11() {
        return getUpdateInstall();
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
    public String value2() {
        return getAppId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getAppName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getVersionCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getVersionName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String[] value6() {
        return getUserAgent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getDownloadUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value8() {
        return getUpdateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getUpdateLog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value11() {
        return getUpdateInstall();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAppVersionRecord value1(BigDecimal value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAppVersionRecord value2(String value) {
        setAppId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAppVersionRecord value3(String value) {
        setAppName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAppVersionRecord value4(String value) {
        setVersionCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAppVersionRecord value5(String value) {
        setVersionName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAppVersionRecord value6(String... value) {
        setUserAgent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAppVersionRecord value7(String value) {
        setDownloadUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAppVersionRecord value8(BigDecimal value) {
        setUpdateId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAppVersionRecord value9(String value) {
        setUpdateLog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAppVersionRecord value10(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAppVersionRecord value11(Boolean value) {
        setUpdateInstall(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TAppVersionRecord values(BigDecimal value1, String value2, String value3, String value4, String value5, String[] value6, String value7, BigDecimal value8, String value9, Timestamp value10, Boolean value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TAppVersionRecord
     */
    public TAppVersionRecord() {
        super(TAppVersion.T_APP_VERSION);
    }

    /**
     * Create a detached, initialised TAppVersionRecord
     */
    public TAppVersionRecord(BigDecimal id, String appId, String appName, String versionCode, String versionName, String[] userAgent, String downloadUrl, BigDecimal updateId, String updateLog, Timestamp updateTime, Boolean updateInstall) {
        super(TAppVersion.T_APP_VERSION);

        set(0, id);
        set(1, appId);
        set(2, appName);
        set(3, versionCode);
        set(4, versionName);
        set(5, userAgent);
        set(6, downloadUrl);
        set(7, updateId);
        set(8, updateLog);
        set(9, updateTime);
        set(10, updateInstall);
    }
}