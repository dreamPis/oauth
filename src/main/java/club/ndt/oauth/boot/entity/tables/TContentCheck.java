/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables;


import club.ndt.oauth.boot.entity.Indexes;
import club.ndt.oauth.boot.entity.Keys;
import club.ndt.oauth.boot.entity.Ndt;
import club.ndt.oauth.boot.entity.tables.records.TContentCheckRecord;

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
 * 内容审核表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TContentCheck extends TableImpl<TContentCheckRecord> {

    private static final long serialVersionUID = -477482972;

    /**
     * The reference instance of <code>ndt.t_content_check</code>
     */
    public static final TContentCheck T_CONTENT_CHECK = new TContentCheck();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TContentCheckRecord> getRecordType() {
        return TContentCheckRecord.class;
    }

    /**
     * The column <code>ndt.t_content_check.id</code>.
     */
    public final TableField<TContentCheckRecord, BigDecimal> ID = createField("id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>ndt.t_content_check.content_type</code>. 内容类型
     */
    public final TableField<TContentCheckRecord, Integer> CONTENT_TYPE = createField("content_type", org.jooq.impl.SQLDataType.INTEGER, this, "内容类型");

    /**
     * The column <code>ndt.t_content_check.content_id</code>. 内容ID
     */
    public final TableField<TContentCheckRecord, BigDecimal> CONTENT_ID = createField("content_id", org.jooq.impl.SQLDataType.NUMERIC, this, "内容ID");

    /**
     * The column <code>ndt.t_content_check.check_org_id</code>. 审核组织ID
     */
    public final TableField<TContentCheckRecord, BigDecimal> CHECK_ORG_ID = createField("check_org_id", org.jooq.impl.SQLDataType.NUMERIC, this, "审核组织ID");

    /**
     * The column <code>ndt.t_content_check.msg</code>. 审核信息
     */
    public final TableField<TContentCheckRecord, String> MSG = createField("msg", org.jooq.impl.SQLDataType.VARCHAR(200), this, "审核信息");

    /**
     * The column <code>ndt.t_content_check.state</code>. 审核状态
     */
    public final TableField<TContentCheckRecord, Integer> STATE = createField("state", org.jooq.impl.SQLDataType.INTEGER, this, "审核状态");

    /**
     * The column <code>ndt.t_content_check.status</code>. 记录状态
     */
    public final TableField<TContentCheckRecord, Short> STATUS = createField("status", org.jooq.impl.SQLDataType.SMALLINT, this, "记录状态");

    /**
     * The column <code>ndt.t_content_check.create_by</code>. 创建人
     */
    public final TableField<TContentCheckRecord, BigDecimal> CREATE_BY = createField("create_by", org.jooq.impl.SQLDataType.NUMERIC, this, "创建人");

    /**
     * The column <code>ndt.t_content_check.create_at</code>. 创建时间
     */
    public final TableField<TContentCheckRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "创建时间");

    /**
     * Create a <code>ndt.t_content_check</code> table reference
     */
    public TContentCheck() {
        this(DSL.name("t_content_check"), null);
    }

    /**
     * Create an aliased <code>ndt.t_content_check</code> table reference
     */
    public TContentCheck(String alias) {
        this(DSL.name(alias), T_CONTENT_CHECK);
    }

    /**
     * Create an aliased <code>ndt.t_content_check</code> table reference
     */
    public TContentCheck(Name alias) {
        this(alias, T_CONTENT_CHECK);
    }

    private TContentCheck(Name alias, Table<TContentCheckRecord> aliased) {
        this(alias, aliased, null);
    }

    private TContentCheck(Name alias, Table<TContentCheckRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "内容审核表");
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
        return Arrays.<Index>asList(Indexes.T_CONTENT_CHECK_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TContentCheckRecord> getPrimaryKey() {
        return Keys.T_CONTENT_CHECK_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TContentCheckRecord>> getKeys() {
        return Arrays.<UniqueKey<TContentCheckRecord>>asList(Keys.T_CONTENT_CHECK_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TContentCheck as(String alias) {
        return new TContentCheck(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TContentCheck as(Name alias) {
        return new TContentCheck(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TContentCheck rename(String name) {
        return new TContentCheck(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TContentCheck rename(Name name) {
        return new TContentCheck(name, null);
    }
}
