/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables;


import club.ndt.oauth.boot.entity.Indexes;
import club.ndt.oauth.boot.entity.Keys;
import club.ndt.oauth.boot.entity.Ndt;
import club.ndt.oauth.boot.entity.tables.records.TVillagePersonalHouseRecord;

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
 * 房屋资产信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TVillagePersonalHouse extends TableImpl<TVillagePersonalHouseRecord> {

    private static final long serialVersionUID = -2008180199;

    /**
     * The reference instance of <code>ndt.t_village_personal_house</code>
     */
    public static final TVillagePersonalHouse T_VILLAGE_PERSONAL_HOUSE = new TVillagePersonalHouse();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TVillagePersonalHouseRecord> getRecordType() {
        return TVillagePersonalHouseRecord.class;
    }

    /**
     * The column <code>ndt.t_village_personal_house.id</code>.
     */
    public final TableField<TVillagePersonalHouseRecord, BigDecimal> ID = createField("id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>ndt.t_village_personal_house.baseinfo_id</code>. 对应用户基本信息id
     */
    public final TableField<TVillagePersonalHouseRecord, BigDecimal> BASEINFO_ID = createField("baseinfo_id", org.jooq.impl.SQLDataType.NUMERIC, this, "对应用户基本信息id");

    /**
     * The column <code>ndt.t_village_personal_house.house_address</code>. 房屋地址
     */
    public final TableField<TVillagePersonalHouseRecord, String> HOUSE_ADDRESS = createField("house_address", org.jooq.impl.SQLDataType.VARCHAR(100), this, "房屋地址");

    /**
     * The column <code>ndt.t_village_personal_house.house_type</code>. 房屋性质，参考码表54
     */
    public final TableField<TVillagePersonalHouseRecord, Integer> HOUSE_TYPE = createField("house_type", org.jooq.impl.SQLDataType.INTEGER, this, "房屋性质，参考码表54");

    /**
     * The column <code>ndt.t_village_personal_house.house_time</code>. 购建年月
     */
    public final TableField<TVillagePersonalHouseRecord, String> HOUSE_TIME = createField("house_time", org.jooq.impl.SQLDataType.VARCHAR(50), this, "购建年月");

    /**
     * The column <code>ndt.t_village_personal_house.floorage</code>. 建筑面积平方米
     */
    public final TableField<TVillagePersonalHouseRecord, Integer> FLOORAGE = createField("floorage", org.jooq.impl.SQLDataType.INTEGER, this, "建筑面积平方米");

    /**
     * The column <code>ndt.t_village_personal_house.status</code>.
     */
    public final TableField<TVillagePersonalHouseRecord, Short> STATUS = createField("status", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>ndt.t_village_personal_house.create_user</code>.
     */
    public final TableField<TVillagePersonalHouseRecord, BigDecimal> CREATE_USER = createField("create_user", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>ndt.t_village_personal_house.create_time</code>.
     */
    public final TableField<TVillagePersonalHouseRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>ndt.t_village_personal_house.update_user</code>.
     */
    public final TableField<TVillagePersonalHouseRecord, BigDecimal> UPDATE_USER = createField("update_user", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>ndt.t_village_personal_house.update_time</code>.
     */
    public final TableField<TVillagePersonalHouseRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>ndt.t_village_personal_house</code> table reference
     */
    public TVillagePersonalHouse() {
        this(DSL.name("t_village_personal_house"), null);
    }

    /**
     * Create an aliased <code>ndt.t_village_personal_house</code> table reference
     */
    public TVillagePersonalHouse(String alias) {
        this(DSL.name(alias), T_VILLAGE_PERSONAL_HOUSE);
    }

    /**
     * Create an aliased <code>ndt.t_village_personal_house</code> table reference
     */
    public TVillagePersonalHouse(Name alias) {
        this(alias, T_VILLAGE_PERSONAL_HOUSE);
    }

    private TVillagePersonalHouse(Name alias, Table<TVillagePersonalHouseRecord> aliased) {
        this(alias, aliased, null);
    }

    private TVillagePersonalHouse(Name alias, Table<TVillagePersonalHouseRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "房屋资产信息");
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
        return Arrays.<Index>asList(Indexes.T_VILLAGE_PERSONAL_HOUSE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TVillagePersonalHouseRecord> getPrimaryKey() {
        return Keys.T_VILLAGE_PERSONAL_HOUSE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TVillagePersonalHouseRecord>> getKeys() {
        return Arrays.<UniqueKey<TVillagePersonalHouseRecord>>asList(Keys.T_VILLAGE_PERSONAL_HOUSE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalHouse as(String alias) {
        return new TVillagePersonalHouse(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalHouse as(Name alias) {
        return new TVillagePersonalHouse(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TVillagePersonalHouse rename(String name) {
        return new TVillagePersonalHouse(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TVillagePersonalHouse rename(Name name) {
        return new TVillagePersonalHouse(name, null);
    }
}
