/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables;


import club.ndt.oauth.boot.entity.Indexes;
import club.ndt.oauth.boot.entity.Keys;
import club.ndt.oauth.boot.entity.Ndt;
import club.ndt.oauth.boot.entity.tables.records.TVillagePersonalCreditRatingRecord;

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
 * 信用评价信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TVillagePersonalCreditRating extends TableImpl<TVillagePersonalCreditRatingRecord> {

    private static final long serialVersionUID = -1173807523;

    /**
     * The reference instance of <code>ndt.t_village_personal_credit_rating</code>
     */
    public static final TVillagePersonalCreditRating T_VILLAGE_PERSONAL_CREDIT_RATING = new TVillagePersonalCreditRating();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TVillagePersonalCreditRatingRecord> getRecordType() {
        return TVillagePersonalCreditRatingRecord.class;
    }

    /**
     * The column <code>ndt.t_village_personal_credit_rating.id</code>.
     */
    public final TableField<TVillagePersonalCreditRatingRecord, BigDecimal> ID = createField("id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>ndt.t_village_personal_credit_rating.baseinfo_id</code>. 对应用户基本信息id
     */
    public final TableField<TVillagePersonalCreditRatingRecord, BigDecimal> BASEINFO_ID = createField("baseinfo_id", org.jooq.impl.SQLDataType.NUMERIC, this, "对应用户基本信息id");

    /**
     * The column <code>ndt.t_village_personal_credit_rating.credit_rating_type</code>. 信用评价类型，参考码表53
     */
    public final TableField<TVillagePersonalCreditRatingRecord, Integer> CREDIT_RATING_TYPE = createField("credit_rating_type", org.jooq.impl.SQLDataType.INTEGER, this, "信用评价类型，参考码表53");

    /**
     * The column <code>ndt.t_village_personal_credit_rating.credit_rating_level</code>. 信用评价等级
     */
    public final TableField<TVillagePersonalCreditRatingRecord, String> CREDIT_RATING_LEVEL = createField("credit_rating_level", org.jooq.impl.SQLDataType.VARCHAR(100), this, "信用评价等级");

    /**
     * The column <code>ndt.t_village_personal_credit_rating.credit_rating_time</code>. 信用评价时间
     */
    public final TableField<TVillagePersonalCreditRatingRecord, String> CREDIT_RATING_TIME = createField("credit_rating_time", org.jooq.impl.SQLDataType.VARCHAR(50), this, "信用评价时间");

    /**
     * The column <code>ndt.t_village_personal_credit_rating.status</code>.
     */
    public final TableField<TVillagePersonalCreditRatingRecord, Short> STATUS = createField("status", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>ndt.t_village_personal_credit_rating.create_user</code>.
     */
    public final TableField<TVillagePersonalCreditRatingRecord, BigDecimal> CREATE_USER = createField("create_user", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>ndt.t_village_personal_credit_rating.create_time</code>.
     */
    public final TableField<TVillagePersonalCreditRatingRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>ndt.t_village_personal_credit_rating.update_user</code>.
     */
    public final TableField<TVillagePersonalCreditRatingRecord, BigDecimal> UPDATE_USER = createField("update_user", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>ndt.t_village_personal_credit_rating.update_time</code>.
     */
    public final TableField<TVillagePersonalCreditRatingRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>ndt.t_village_personal_credit_rating</code> table reference
     */
    public TVillagePersonalCreditRating() {
        this(DSL.name("t_village_personal_credit_rating"), null);
    }

    /**
     * Create an aliased <code>ndt.t_village_personal_credit_rating</code> table reference
     */
    public TVillagePersonalCreditRating(String alias) {
        this(DSL.name(alias), T_VILLAGE_PERSONAL_CREDIT_RATING);
    }

    /**
     * Create an aliased <code>ndt.t_village_personal_credit_rating</code> table reference
     */
    public TVillagePersonalCreditRating(Name alias) {
        this(alias, T_VILLAGE_PERSONAL_CREDIT_RATING);
    }

    private TVillagePersonalCreditRating(Name alias, Table<TVillagePersonalCreditRatingRecord> aliased) {
        this(alias, aliased, null);
    }

    private TVillagePersonalCreditRating(Name alias, Table<TVillagePersonalCreditRatingRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "信用评价信息");
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
        return Arrays.<Index>asList(Indexes.T_VILLAGE_PERSONAL_CREDIT_RATING_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TVillagePersonalCreditRatingRecord> getPrimaryKey() {
        return Keys.T_VILLAGE_PERSONAL_CREDIT_RATING_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TVillagePersonalCreditRatingRecord>> getKeys() {
        return Arrays.<UniqueKey<TVillagePersonalCreditRatingRecord>>asList(Keys.T_VILLAGE_PERSONAL_CREDIT_RATING_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalCreditRating as(String alias) {
        return new TVillagePersonalCreditRating(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalCreditRating as(Name alias) {
        return new TVillagePersonalCreditRating(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TVillagePersonalCreditRating rename(String name) {
        return new TVillagePersonalCreditRating(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TVillagePersonalCreditRating rename(Name name) {
        return new TVillagePersonalCreditRating(name, null);
    }
}
