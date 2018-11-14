/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables;


import com.ndt.sms.entity.Indexes;
import com.ndt.sms.entity.Keys;
import com.ndt.sms.entity.Ndt;
import com.ndt.sms.entity.tables.records.TVillagePersonalCarinfoRecord;

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
 * 非生产性车辆信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TVillagePersonalCarinfo extends TableImpl<TVillagePersonalCarinfoRecord> {

    private static final long serialVersionUID = -747669990;

    /**
     * The reference instance of <code>ndt.t_village_personal_carinfo</code>
     */
    public static final TVillagePersonalCarinfo T_VILLAGE_PERSONAL_CARINFO = new TVillagePersonalCarinfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TVillagePersonalCarinfoRecord> getRecordType() {
        return TVillagePersonalCarinfoRecord.class;
    }

    /**
     * The column <code>ndt.t_village_personal_carinfo.id</code>.
     */
    public final TableField<TVillagePersonalCarinfoRecord, BigDecimal> ID = createField("id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>ndt.t_village_personal_carinfo.baseinfo_id</code>. 对应用户基本信息id
     */
    public final TableField<TVillagePersonalCarinfoRecord, BigDecimal> BASEINFO_ID = createField("baseinfo_id", org.jooq.impl.SQLDataType.NUMERIC, this, "对应用户基本信息id");

    /**
     * The column <code>ndt.t_village_personal_carinfo.car_id</code>. 车牌号
     */
    public final TableField<TVillagePersonalCarinfoRecord, String> CAR_ID = createField("car_id", org.jooq.impl.SQLDataType.VARCHAR(30), this, "车牌号");

    /**
     * The column <code>ndt.t_village_personal_carinfo.buy_time</code>. 购买时间
     */
    public final TableField<TVillagePersonalCarinfoRecord, String> BUY_TIME = createField("buy_time", org.jooq.impl.SQLDataType.VARCHAR(50), this, "购买时间");

    /**
     * The column <code>ndt.t_village_personal_carinfo.buy_amount</code>. 购买金额
     */
    public final TableField<TVillagePersonalCarinfoRecord, BigDecimal> BUY_AMOUNT = createField("buy_amount", org.jooq.impl.SQLDataType.NUMERIC, this, "购买金额");

    /**
     * The column <code>ndt.t_village_personal_carinfo.status</code>.
     */
    public final TableField<TVillagePersonalCarinfoRecord, Short> STATUS = createField("status", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>ndt.t_village_personal_carinfo.create_user</code>.
     */
    public final TableField<TVillagePersonalCarinfoRecord, BigDecimal> CREATE_USER = createField("create_user", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>ndt.t_village_personal_carinfo.create_time</code>.
     */
    public final TableField<TVillagePersonalCarinfoRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>ndt.t_village_personal_carinfo.update_user</code>.
     */
    public final TableField<TVillagePersonalCarinfoRecord, BigDecimal> UPDATE_USER = createField("update_user", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>ndt.t_village_personal_carinfo.update_time</code>.
     */
    public final TableField<TVillagePersonalCarinfoRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>ndt.t_village_personal_carinfo</code> table reference
     */
    public TVillagePersonalCarinfo() {
        this(DSL.name("t_village_personal_carinfo"), null);
    }

    /**
     * Create an aliased <code>ndt.t_village_personal_carinfo</code> table reference
     */
    public TVillagePersonalCarinfo(String alias) {
        this(DSL.name(alias), T_VILLAGE_PERSONAL_CARINFO);
    }

    /**
     * Create an aliased <code>ndt.t_village_personal_carinfo</code> table reference
     */
    public TVillagePersonalCarinfo(Name alias) {
        this(alias, T_VILLAGE_PERSONAL_CARINFO);
    }

    private TVillagePersonalCarinfo(Name alias, Table<TVillagePersonalCarinfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private TVillagePersonalCarinfo(Name alias, Table<TVillagePersonalCarinfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "非生产性车辆信息");
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
        return Arrays.<Index>asList(Indexes.T_VILLAGE_PERSONAL_CARINFO_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TVillagePersonalCarinfoRecord> getPrimaryKey() {
        return Keys.T_VILLAGE_PERSONAL_CARINFO_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TVillagePersonalCarinfoRecord>> getKeys() {
        return Arrays.<UniqueKey<TVillagePersonalCarinfoRecord>>asList(Keys.T_VILLAGE_PERSONAL_CARINFO_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalCarinfo as(String alias) {
        return new TVillagePersonalCarinfo(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalCarinfo as(Name alias) {
        return new TVillagePersonalCarinfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TVillagePersonalCarinfo rename(String name) {
        return new TVillagePersonalCarinfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TVillagePersonalCarinfo rename(Name name) {
        return new TVillagePersonalCarinfo(name, null);
    }
}