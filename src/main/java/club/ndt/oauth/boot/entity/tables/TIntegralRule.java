/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables;


import com.ndt.sms.entity.Indexes;
import com.ndt.sms.entity.Keys;
import com.ndt.sms.entity.Ndt;
import com.ndt.sms.entity.tables.records.TIntegralRuleRecord;

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
 * 积分规则表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TIntegralRule extends TableImpl<TIntegralRuleRecord> {

    private static final long serialVersionUID = -548647699;

    /**
     * The reference instance of <code>ndt.t_integral_rule</code>
     */
    public static final TIntegralRule T_INTEGRAL_RULE = new TIntegralRule();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TIntegralRuleRecord> getRecordType() {
        return TIntegralRuleRecord.class;
    }

    /**
     * The column <code>ndt.t_integral_rule.id</code>. 规则ID
     */
    public final TableField<TIntegralRuleRecord, BigDecimal> ID = createField("id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "规则ID");

    /**
     * The column <code>ndt.t_integral_rule.integral_code</code>. 规则编码
     */
    public final TableField<TIntegralRuleRecord, Integer> INTEGRAL_CODE = createField("integral_code", org.jooq.impl.SQLDataType.INTEGER, this, "规则编码");

    /**
     * The column <code>ndt.t_integral_rule.integral_name</code>. 规则名称
     */
    public final TableField<TIntegralRuleRecord, String> INTEGRAL_NAME = createField("integral_name", org.jooq.impl.SQLDataType.VARCHAR(32), this, "规则名称");

    /**
     * The column <code>ndt.t_integral_rule.integral_remark</code>. 规则备注
     */
    public final TableField<TIntegralRuleRecord, String> INTEGRAL_REMARK = createField("integral_remark", org.jooq.impl.SQLDataType.VARCHAR(50), this, "规则备注");

    /**
     * The column <code>ndt.t_integral_rule.integral_score</code>. 分数
     */
    public final TableField<TIntegralRuleRecord, Integer> INTEGRAL_SCORE = createField("integral_score", org.jooq.impl.SQLDataType.INTEGER, this, "分数");

    /**
     * The column <code>ndt.t_integral_rule.update_by</code>. 修改人
     */
    public final TableField<TIntegralRuleRecord, BigDecimal> UPDATE_BY = createField("update_by", org.jooq.impl.SQLDataType.NUMERIC, this, "修改人");

    /**
     * The column <code>ndt.t_integral_rule.update_at</code>. 修改时间
     */
    public final TableField<TIntegralRuleRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "修改时间");

    /**
     * Create a <code>ndt.t_integral_rule</code> table reference
     */
    public TIntegralRule() {
        this(DSL.name("t_integral_rule"), null);
    }

    /**
     * Create an aliased <code>ndt.t_integral_rule</code> table reference
     */
    public TIntegralRule(String alias) {
        this(DSL.name(alias), T_INTEGRAL_RULE);
    }

    /**
     * Create an aliased <code>ndt.t_integral_rule</code> table reference
     */
    public TIntegralRule(Name alias) {
        this(alias, T_INTEGRAL_RULE);
    }

    private TIntegralRule(Name alias, Table<TIntegralRuleRecord> aliased) {
        this(alias, aliased, null);
    }

    private TIntegralRule(Name alias, Table<TIntegralRuleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "积分规则表");
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
        return Arrays.<Index>asList(Indexes.PK_T_INTEGRAL_RULE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TIntegralRuleRecord> getPrimaryKey() {
        return Keys.PK_T_INTEGRAL_RULE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TIntegralRuleRecord>> getKeys() {
        return Arrays.<UniqueKey<TIntegralRuleRecord>>asList(Keys.PK_T_INTEGRAL_RULE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TIntegralRule as(String alias) {
        return new TIntegralRule(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TIntegralRule as(Name alias) {
        return new TIntegralRule(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TIntegralRule rename(String name) {
        return new TIntegralRule(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TIntegralRule rename(Name name) {
        return new TIntegralRule(name, null);
    }
}
