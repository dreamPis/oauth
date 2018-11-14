/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables;


import club.ndt.oauth.boot.entity.Indexes;
import club.ndt.oauth.boot.entity.Keys;
import club.ndt.oauth.boot.entity.Ndt;
import club.ndt.oauth.boot.entity.tables.records.TRecommendationRecord;

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
 * 推荐表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TRecommendation extends TableImpl<TRecommendationRecord> {

    private static final long serialVersionUID = 1464906700;

    /**
     * The reference instance of <code>ndt.t_recommendation</code>
     */
    public static final TRecommendation T_RECOMMENDATION = new TRecommendation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TRecommendationRecord> getRecordType() {
        return TRecommendationRecord.class;
    }

    /**
     * The column <code>ndt.t_recommendation.id</code>.
     */
    public final TableField<TRecommendationRecord, BigDecimal> ID = createField("id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>ndt.t_recommendation.type</code>. 类型
     */
    public final TableField<TRecommendationRecord, Integer> TYPE = createField("type", org.jooq.impl.SQLDataType.INTEGER, this, "类型");

    /**
     * The column <code>ndt.t_recommendation.index</code>. 顺序
     */
    public final TableField<TRecommendationRecord, Short> INDEX = createField("index", org.jooq.impl.SQLDataType.SMALLINT, this, "顺序");

    /**
     * The column <code>ndt.t_recommendation.ref_id</code>. 关联ID
     */
    public final TableField<TRecommendationRecord, BigDecimal> REF_ID = createField("ref_id", org.jooq.impl.SQLDataType.NUMERIC, this, "关联ID");

    /**
     * The column <code>ndt.t_recommendation.status</code>.
     */
    public final TableField<TRecommendationRecord, Short> STATUS = createField("status", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>ndt.t_recommendation.create_by</code>.
     */
    public final TableField<TRecommendationRecord, BigDecimal> CREATE_BY = createField("create_by", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>ndt.t_recommendation.create_at</code>.
     */
    public final TableField<TRecommendationRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>ndt.t_recommendation.update_by</code>.
     */
    public final TableField<TRecommendationRecord, BigDecimal> UPDATE_BY = createField("update_by", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>ndt.t_recommendation.update_at</code>.
     */
    public final TableField<TRecommendationRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>ndt.t_recommendation.division_id</code>. 行政区划id
     */
    public final TableField<TRecommendationRecord, BigDecimal> DIVISION_ID = createField("division_id", org.jooq.impl.SQLDataType.NUMERIC, this, "行政区划id");

    /**
     * Create a <code>ndt.t_recommendation</code> table reference
     */
    public TRecommendation() {
        this(DSL.name("t_recommendation"), null);
    }

    /**
     * Create an aliased <code>ndt.t_recommendation</code> table reference
     */
    public TRecommendation(String alias) {
        this(DSL.name(alias), T_RECOMMENDATION);
    }

    /**
     * Create an aliased <code>ndt.t_recommendation</code> table reference
     */
    public TRecommendation(Name alias) {
        this(alias, T_RECOMMENDATION);
    }

    private TRecommendation(Name alias, Table<TRecommendationRecord> aliased) {
        this(alias, aliased, null);
    }

    private TRecommendation(Name alias, Table<TRecommendationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "推荐表");
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
        return Arrays.<Index>asList(Indexes.T_RECOMMENDATION_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TRecommendationRecord> getPrimaryKey() {
        return Keys.T_RECOMMENDATION_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TRecommendationRecord>> getKeys() {
        return Arrays.<UniqueKey<TRecommendationRecord>>asList(Keys.T_RECOMMENDATION_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRecommendation as(String alias) {
        return new TRecommendation(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TRecommendation as(Name alias) {
        return new TRecommendation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TRecommendation rename(String name) {
        return new TRecommendation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TRecommendation rename(Name name) {
        return new TRecommendation(name, null);
    }
}
