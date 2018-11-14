/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables;


import com.ndt.sms.entity.Indexes;
import com.ndt.sms.entity.Keys;
import com.ndt.sms.entity.Ndt;
import com.ndt.sms.entity.tables.records.TBannerModelRecord;

import java.math.BigDecimal;
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
 * banner弹窗表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TBannerModel extends TableImpl<TBannerModelRecord> {

    private static final long serialVersionUID = -759022893;

    /**
     * The reference instance of <code>ndt.t_banner_model</code>
     */
    public static final TBannerModel T_BANNER_MODEL = new TBannerModel();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TBannerModelRecord> getRecordType() {
        return TBannerModelRecord.class;
    }

    /**
     * The column <code>ndt.t_banner_model.id</code>. id
     */
    public final TableField<TBannerModelRecord, BigDecimal> ID = createField("id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "id");

    /**
     * The column <code>ndt.t_banner_model.name</code>. model名称
     */
    public final TableField<TBannerModelRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR(20), this, "model名称");

    /**
     * The column <code>ndt.t_banner_model.notes</code>. model简介
     */
    public final TableField<TBannerModelRecord, String> NOTES = createField("notes", org.jooq.impl.SQLDataType.VARCHAR(200), this, "model简介");

    /**
     * The column <code>ndt.t_banner_model.telephone</code>. 联系电话
     */
    public final TableField<TBannerModelRecord, String> TELEPHONE = createField("telephone", org.jooq.impl.SQLDataType.VARCHAR(15), this, "联系电话");

    /**
     * The column <code>ndt.t_banner_model.line_href</code>. 线上办理地址
     */
    public final TableField<TBannerModelRecord, String> LINE_HREF = createField("line_href", org.jooq.impl.SQLDataType.VARCHAR(200), this, "线上办理地址");

    /**
     * The column <code>ndt.t_banner_model.more_href</code>. 更多办理地址
     */
    public final TableField<TBannerModelRecord, String> MORE_HREF = createField("more_href", org.jooq.impl.SQLDataType.VARCHAR(200), this, "更多办理地址");

    /**
     * The column <code>ndt.t_banner_model.img_uri</code>. 图片uri
     */
    public final TableField<TBannerModelRecord, String> IMG_URI = createField("img_uri", org.jooq.impl.SQLDataType.VARCHAR(120), this, "图片uri");

    /**
     * Create a <code>ndt.t_banner_model</code> table reference
     */
    public TBannerModel() {
        this(DSL.name("t_banner_model"), null);
    }

    /**
     * Create an aliased <code>ndt.t_banner_model</code> table reference
     */
    public TBannerModel(String alias) {
        this(DSL.name(alias), T_BANNER_MODEL);
    }

    /**
     * Create an aliased <code>ndt.t_banner_model</code> table reference
     */
    public TBannerModel(Name alias) {
        this(alias, T_BANNER_MODEL);
    }

    private TBannerModel(Name alias, Table<TBannerModelRecord> aliased) {
        this(alias, aliased, null);
    }

    private TBannerModel(Name alias, Table<TBannerModelRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "banner弹窗表");
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
        return Arrays.<Index>asList(Indexes.PK_T_BANNER_MODEL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TBannerModelRecord> getPrimaryKey() {
        return Keys.PK_T_BANNER_MODEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TBannerModelRecord>> getKeys() {
        return Arrays.<UniqueKey<TBannerModelRecord>>asList(Keys.PK_T_BANNER_MODEL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TBannerModel as(String alias) {
        return new TBannerModel(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TBannerModel as(Name alias) {
        return new TBannerModel(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TBannerModel rename(String name) {
        return new TBannerModel(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TBannerModel rename(Name name) {
        return new TBannerModel(name, null);
    }
}
