/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables;


import com.ndt.sms.entity.Indexes;
import com.ndt.sms.entity.Keys;
import com.ndt.sms.entity.Ndt;
import com.ndt.sms.entity.tables.records.TVillagePersonalPurchasingRecord;

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
 * 采购信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TVillagePersonalPurchasing extends TableImpl<TVillagePersonalPurchasingRecord> {

    private static final long serialVersionUID = 1729539161;

    /**
     * The reference instance of <code>ndt.t_village_personal_purchasing</code>
     */
    public static final TVillagePersonalPurchasing T_VILLAGE_PERSONAL_PURCHASING = new TVillagePersonalPurchasing();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TVillagePersonalPurchasingRecord> getRecordType() {
        return TVillagePersonalPurchasingRecord.class;
    }

    /**
     * The column <code>ndt.t_village_personal_purchasing.id</code>.
     */
    public final TableField<TVillagePersonalPurchasingRecord, BigDecimal> ID = createField("id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>ndt.t_village_personal_purchasing.baseinfo_id</code>. 对应用户基本信息id
     */
    public final TableField<TVillagePersonalPurchasingRecord, BigDecimal> BASEINFO_ID = createField("baseinfo_id", org.jooq.impl.SQLDataType.NUMERIC, this, "对应用户基本信息id");

    /**
     * The column <code>ndt.t_village_personal_purchasing.purchasing_commodity</code>. 采购物资
     */
    public final TableField<TVillagePersonalPurchasingRecord, String> PURCHASING_COMMODITY = createField("purchasing_commodity", org.jooq.impl.SQLDataType.VARCHAR(80), this, "采购物资");

    /**
     * The column <code>ndt.t_village_personal_purchasing.purchasing_amount</code>. 采购金额
     */
    public final TableField<TVillagePersonalPurchasingRecord, BigDecimal> PURCHASING_AMOUNT = createField("purchasing_amount", org.jooq.impl.SQLDataType.NUMERIC, this, "采购金额");

    /**
     * The column <code>ndt.t_village_personal_purchasing.purchasing_time</code>. 采购时间
     */
    public final TableField<TVillagePersonalPurchasingRecord, String> PURCHASING_TIME = createField("purchasing_time", org.jooq.impl.SQLDataType.VARCHAR(50), this, "采购时间");

    /**
     * The column <code>ndt.t_village_personal_purchasing.purchasing_image_url</code>. 采购相关图片路径
     */
    public final TableField<TVillagePersonalPurchasingRecord, String> PURCHASING_IMAGE_URL = createField("purchasing_image_url", org.jooq.impl.SQLDataType.VARCHAR(200), this, "采购相关图片路径");

    /**
     * The column <code>ndt.t_village_personal_purchasing.status</code>.
     */
    public final TableField<TVillagePersonalPurchasingRecord, Short> STATUS = createField("status", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>ndt.t_village_personal_purchasing.create_user</code>.
     */
    public final TableField<TVillagePersonalPurchasingRecord, BigDecimal> CREATE_USER = createField("create_user", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>ndt.t_village_personal_purchasing.create_time</code>.
     */
    public final TableField<TVillagePersonalPurchasingRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>ndt.t_village_personal_purchasing.update_user</code>.
     */
    public final TableField<TVillagePersonalPurchasingRecord, BigDecimal> UPDATE_USER = createField("update_user", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>ndt.t_village_personal_purchasing.update_time</code>.
     */
    public final TableField<TVillagePersonalPurchasingRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>ndt.t_village_personal_purchasing</code> table reference
     */
    public TVillagePersonalPurchasing() {
        this(DSL.name("t_village_personal_purchasing"), null);
    }

    /**
     * Create an aliased <code>ndt.t_village_personal_purchasing</code> table reference
     */
    public TVillagePersonalPurchasing(String alias) {
        this(DSL.name(alias), T_VILLAGE_PERSONAL_PURCHASING);
    }

    /**
     * Create an aliased <code>ndt.t_village_personal_purchasing</code> table reference
     */
    public TVillagePersonalPurchasing(Name alias) {
        this(alias, T_VILLAGE_PERSONAL_PURCHASING);
    }

    private TVillagePersonalPurchasing(Name alias, Table<TVillagePersonalPurchasingRecord> aliased) {
        this(alias, aliased, null);
    }

    private TVillagePersonalPurchasing(Name alias, Table<TVillagePersonalPurchasingRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "采购信息");
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
        return Arrays.<Index>asList(Indexes.T_VILLAGE_PERSONAL_PURCHASING_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TVillagePersonalPurchasingRecord> getPrimaryKey() {
        return Keys.T_VILLAGE_PERSONAL_PURCHASING_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TVillagePersonalPurchasingRecord>> getKeys() {
        return Arrays.<UniqueKey<TVillagePersonalPurchasingRecord>>asList(Keys.T_VILLAGE_PERSONAL_PURCHASING_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalPurchasing as(String alias) {
        return new TVillagePersonalPurchasing(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalPurchasing as(Name alias) {
        return new TVillagePersonalPurchasing(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TVillagePersonalPurchasing rename(String name) {
        return new TVillagePersonalPurchasing(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TVillagePersonalPurchasing rename(Name name) {
        return new TVillagePersonalPurchasing(name, null);
    }
}
