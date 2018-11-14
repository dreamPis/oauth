/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables;


import com.ndt.sms.entity.Ndt;
import com.ndt.sms.entity.tables.records.VStatisticsUserRecord;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class VStatisticsUser extends TableImpl<VStatisticsUserRecord> {

    private static final long serialVersionUID = -245956157;

    /**
     * The reference instance of <code>ndt.v_statistics_user</code>
     */
    public static final VStatisticsUser V_STATISTICS_USER = new VStatisticsUser();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<VStatisticsUserRecord> getRecordType() {
        return VStatisticsUserRecord.class;
    }

    /**
     * The column <code>ndt.v_statistics_user.id</code>.
     */
    public final TableField<VStatisticsUserRecord, BigDecimal> ID = createField("id", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>ndt.v_statistics_user.login_name</code>.
     */
    public final TableField<VStatisticsUserRecord, String> LOGIN_NAME = createField("login_name", org.jooq.impl.SQLDataType.VARCHAR(40), this, "");

    /**
     * The column <code>ndt.v_statistics_user.salt</code>.
     */
    public final TableField<VStatisticsUserRecord, String> SALT = createField("salt", org.jooq.impl.SQLDataType.VARCHAR(40), this, "");

    /**
     * The column <code>ndt.v_statistics_user.password</code>.
     */
    public final TableField<VStatisticsUserRecord, String> PASSWORD = createField("password", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>ndt.v_statistics_user.name</code>.
     */
    public final TableField<VStatisticsUserRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(60), this, "");

    /**
     * The column <code>ndt.v_statistics_user.gender</code>.
     */
    public final TableField<VStatisticsUserRecord, Integer> GENDER = createField("gender", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>ndt.v_statistics_user.mobile</code>.
     */
    public final TableField<VStatisticsUserRecord, String> MOBILE = createField("mobile", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>ndt.v_statistics_user.image_url</code>.
     */
    public final TableField<VStatisticsUserRecord, String> IMAGE_URL = createField("image_url", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>ndt.v_statistics_user.user_type</code>.
     */
    public final TableField<VStatisticsUserRecord, Integer> USER_TYPE = createField("user_type", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>ndt.v_statistics_user.admin_division_id</code>.
     */
    public final TableField<VStatisticsUserRecord, BigDecimal> ADMIN_DIVISION_ID = createField("admin_division_id", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>ndt.v_statistics_user.org_id</code>.
     */
    public final TableField<VStatisticsUserRecord, BigDecimal> ORG_ID = createField("org_id", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>ndt.v_statistics_user.user_detail_id</code>.
     */
    public final TableField<VStatisticsUserRecord, BigDecimal> USER_DETAIL_ID = createField("user_detail_id", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>ndt.v_statistics_user.subscription_types</code>.
     */
    public final TableField<VStatisticsUserRecord, Integer[]> SUBSCRIPTION_TYPES = createField("subscription_types", org.jooq.impl.SQLDataType.INTEGER.getArrayDataType(), this, "");

    /**
     * The column <code>ndt.v_statistics_user.account_state</code>.
     */
    public final TableField<VStatisticsUserRecord, Integer> ACCOUNT_STATE = createField("account_state", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>ndt.v_statistics_user.status</code>.
     */
    public final TableField<VStatisticsUserRecord, Short> STATUS = createField("status", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>ndt.v_statistics_user.create_by</code>.
     */
    public final TableField<VStatisticsUserRecord, BigDecimal> CREATE_BY = createField("create_by", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>ndt.v_statistics_user.create_at</code>.
     */
    public final TableField<VStatisticsUserRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>ndt.v_statistics_user.update_by</code>.
     */
    public final TableField<VStatisticsUserRecord, BigDecimal> UPDATE_BY = createField("update_by", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>ndt.v_statistics_user.update_at</code>.
     */
    public final TableField<VStatisticsUserRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>ndt.v_statistics_user.last_login_time</code>.
     */
    public final TableField<VStatisticsUserRecord, Timestamp> LAST_LOGIN_TIME = createField("last_login_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>ndt.v_statistics_user.source_id</code>.
     */
    public final TableField<VStatisticsUserRecord, Integer> SOURCE_ID = createField("source_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>ndt.v_statistics_user.is_farm</code>.
     */
    public final TableField<VStatisticsUserRecord, Boolean> IS_FARM = createField("is_farm", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>ndt.v_statistics_user.is_cooperation</code>.
     */
    public final TableField<VStatisticsUserRecord, Boolean> IS_COOPERATION = createField("is_cooperation", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>ndt.v_statistics_user.is_leading_enterprice</code>.
     */
    public final TableField<VStatisticsUserRecord, Boolean> IS_LEADING_ENTERPRICE = createField("is_leading_enterprice", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>ndt.v_statistics_user.is_large_agricultural_family</code>.
     */
    public final TableField<VStatisticsUserRecord, Boolean> IS_LARGE_AGRICULTURAL_FAMILY = createField("is_large_agricultural_family", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>ndt.v_statistics_user.is_majar_project</code>.
     */
    public final TableField<VStatisticsUserRecord, Boolean> IS_MAJAR_PROJECT = createField("is_majar_project", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>ndt.v_statistics_user.division_id</code>.
     */
    public final TableField<VStatisticsUserRecord, String> DIVISION_ID = createField("division_id", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>ndt.v_statistics_user.division_name</code>.
     */
    public final TableField<VStatisticsUserRecord, String> DIVISION_NAME = createField("division_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>ndt.v_statistics_user.division_full_name</code>.
     */
    public final TableField<VStatisticsUserRecord, String> DIVISION_FULL_NAME = createField("division_full_name", org.jooq.impl.SQLDataType.VARCHAR(200), this, "");

    /**
     * The column <code>ndt.v_statistics_user.is_bind_company</code>.
     */
    public final TableField<VStatisticsUserRecord, Integer> IS_BIND_COMPANY = createField("is_bind_company", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>ndt.v_statistics_user.credit_type</code>.
     */
    public final TableField<VStatisticsUserRecord, Short> CREDIT_TYPE = createField("credit_type", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * Create a <code>ndt.v_statistics_user</code> table reference
     */
    public VStatisticsUser() {
        this(DSL.name("v_statistics_user"), null);
    }

    /**
     * Create an aliased <code>ndt.v_statistics_user</code> table reference
     */
    public VStatisticsUser(String alias) {
        this(DSL.name(alias), V_STATISTICS_USER);
    }

    /**
     * Create an aliased <code>ndt.v_statistics_user</code> table reference
     */
    public VStatisticsUser(Name alias) {
        this(alias, V_STATISTICS_USER);
    }

    private VStatisticsUser(Name alias, Table<VStatisticsUserRecord> aliased) {
        this(alias, aliased, null);
    }

    private VStatisticsUser(Name alias, Table<VStatisticsUserRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Ndt.NDT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VStatisticsUser as(String alias) {
        return new VStatisticsUser(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VStatisticsUser as(Name alias) {
        return new VStatisticsUser(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public VStatisticsUser rename(String name) {
        return new VStatisticsUser(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public VStatisticsUser rename(Name name) {
        return new VStatisticsUser(name, null);
    }
}