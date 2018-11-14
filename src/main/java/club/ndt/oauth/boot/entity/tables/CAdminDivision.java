/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables;


import club.ndt.oauth.boot.entity.Indexes;
import club.ndt.oauth.boot.entity.Keys;
import club.ndt.oauth.boot.entity.Ndt;
import club.ndt.oauth.boot.entity.tables.records.CAdminDivisionRecord;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * 行政区划表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CAdminDivision extends TableImpl<CAdminDivisionRecord> {

    private static final long serialVersionUID = -676622039;

    /**
     * The reference instance of <code>ndt.c_admin_division</code>
     */
    public static final CAdminDivision C_ADMIN_DIVISION = new CAdminDivision();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CAdminDivisionRecord> getRecordType() {
        return CAdminDivisionRecord.class;
    }

    /**
     * The column <code>ndt.c_admin_division.id</code>.
     */
    public final TableField<CAdminDivisionRecord, BigDecimal> ID = createField("id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>ndt.c_admin_division.code</code>. 编码
     */
    public final TableField<CAdminDivisionRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR(20), this, "编码");

    /**
     * The column <code>ndt.c_admin_division.name</code>. 名称
     */
    public final TableField<CAdminDivisionRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(30), this, "名称");

    /**
     * The column <code>ndt.c_admin_division.full_name</code>. 完整名称
     */
    public final TableField<CAdminDivisionRecord, String> FULL_NAME = createField("full_name", org.jooq.impl.SQLDataType.VARCHAR(200), this, "完整名称");

    /**
     * The column <code>ndt.c_admin_division.parent_id</code>. 父级ID
     */
    public final TableField<CAdminDivisionRecord, BigDecimal> PARENT_ID = createField("parent_id", org.jooq.impl.SQLDataType.NUMERIC, this, "父级ID");

    /**
     * The column <code>ndt.c_admin_division.level</code>. 层级
     */
    public final TableField<CAdminDivisionRecord, Short> LEVEL = createField("level", org.jooq.impl.SQLDataType.SMALLINT, this, "层级");

    /**
     * The column <code>ndt.c_admin_division.district_id</code>. 区县ID
     */
    public final TableField<CAdminDivisionRecord, BigDecimal> DISTRICT_ID = createField("district_id", org.jooq.impl.SQLDataType.NUMERIC, this, "区县ID");

    /**
     * The column <code>ndt.c_admin_division.town_id</code>. 乡镇ID
     */
    public final TableField<CAdminDivisionRecord, BigDecimal> TOWN_ID = createField("town_id", org.jooq.impl.SQLDataType.NUMERIC, this, "乡镇ID");

    /**
     * The column <code>ndt.c_admin_division.longitude</code>. 经度
     */
    public final TableField<CAdminDivisionRecord, BigDecimal> LONGITUDE = createField("longitude", org.jooq.impl.SQLDataType.NUMERIC(20, 16), this, "经度");

    /**
     * The column <code>ndt.c_admin_division.latitude</code>. 纬度
     */
    public final TableField<CAdminDivisionRecord, BigDecimal> LATITUDE = createField("latitude", org.jooq.impl.SQLDataType.NUMERIC(20, 16), this, "纬度");

    /**
     * The column <code>ndt.c_admin_division.status</code>. 记录状态
     */
    public final TableField<CAdminDivisionRecord, Short> STATUS = createField("status", org.jooq.impl.SQLDataType.SMALLINT, this, "记录状态");

    /**
     * The column <code>ndt.c_admin_division.update_by</code>. 更新人
     */
    public final TableField<CAdminDivisionRecord, BigDecimal> UPDATE_BY = createField("update_by", org.jooq.impl.SQLDataType.NUMERIC, this, "更新人");

    /**
     * The column <code>ndt.c_admin_division.update_at</code>. 更新时间
     */
    public final TableField<CAdminDivisionRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * Create a <code>ndt.c_admin_division</code> table reference
     */
    public CAdminDivision() {
        this(DSL.name("c_admin_division"), null);
    }

    /**
     * Create an aliased <code>ndt.c_admin_division</code> table reference
     */
    public CAdminDivision(String alias) {
        this(DSL.name(alias), C_ADMIN_DIVISION);
    }

    /**
     * Create an aliased <code>ndt.c_admin_division</code> table reference
     */
    public CAdminDivision(Name alias) {
        this(alias, C_ADMIN_DIVISION);
    }

    private CAdminDivision(Name alias, Table<CAdminDivisionRecord> aliased) {
        this(alias, aliased, null);
    }

    private CAdminDivision(Name alias, Table<CAdminDivisionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "行政区划表");
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
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.C_ADMIN_DIVISION_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CAdminDivisionRecord> getPrimaryKey() {
        return Keys.C_ADMIN_DIVISION_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CAdminDivisionRecord>> getKeys() {
        return Arrays.<UniqueKey<CAdminDivisionRecord>>asList(Keys.C_ADMIN_DIVISION_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CAdminDivision as(String alias) {
        return new CAdminDivision(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CAdminDivision as(Name alias) {
        return new CAdminDivision(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CAdminDivision rename(String name) {
        return new CAdminDivision(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CAdminDivision rename(Name name) {
        return new CAdminDivision(name, null);
    }
}
