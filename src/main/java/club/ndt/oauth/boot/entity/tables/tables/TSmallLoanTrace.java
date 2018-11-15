/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables;


import club.ndt.oauth.boot.entity.Indexes;
import club.ndt.oauth.boot.entity.Keys;
import club.ndt.oauth.boot.entity.Ndt;
import club.ndt.oauth.boot.entity.tables.records.TSmallLoanTraceRecord;

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
 * 小V贷款轨迹表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TSmallLoanTrace extends TableImpl<TSmallLoanTraceRecord> {

    private static final long serialVersionUID = -1436387712;

    /**
     * The reference instance of <code>ndt.t_small_loan_trace</code>
     */
    public static final TSmallLoanTrace T_SMALL_LOAN_TRACE = new TSmallLoanTrace();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TSmallLoanTraceRecord> getRecordType() {
        return TSmallLoanTraceRecord.class;
    }

    /**
     * The column <code>ndt.t_small_loan_trace.id</code>. 轨迹id
     */
    public final TableField<TSmallLoanTraceRecord, BigDecimal> ID = createField("id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "轨迹id");

    /**
     * The column <code>ndt.t_small_loan_trace.order_id</code>. 订单id
     */
    public final TableField<TSmallLoanTraceRecord, BigDecimal> ORDER_ID = createField("order_id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "订单id");

    /**
     * The column <code>ndt.t_small_loan_trace.oper_user_id</code>. 操作用户id
     */
    public final TableField<TSmallLoanTraceRecord, BigDecimal> OPER_USER_ID = createField("oper_user_id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "操作用户id");

    /**
     * The column <code>ndt.t_small_loan_trace.note</code>. 提示信息
     */
    public final TableField<TSmallLoanTraceRecord, String> NOTE = createField("note", org.jooq.impl.SQLDataType.VARCHAR(150), this, "提示信息");

    /**
     * The column <code>ndt.t_small_loan_trace.create_at</code>. 创建时间
     */
    public final TableField<TSmallLoanTraceRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "创建时间");

    /**
     * The column <code>ndt.t_small_loan_trace.status</code>. 贷款状态
     */
    public final TableField<TSmallLoanTraceRecord, Integer> STATUS = createField("status", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "贷款状态");

    /**
     * The column <code>ndt.t_small_loan_trace.money</code>. 记录金额
     */
    public final TableField<TSmallLoanTraceRecord, BigDecimal> MONEY = createField("money", org.jooq.impl.SQLDataType.NUMERIC, this, "记录金额");

    /**
     * Create a <code>ndt.t_small_loan_trace</code> table reference
     */
    public TSmallLoanTrace() {
        this(DSL.name("t_small_loan_trace"), null);
    }

    /**
     * Create an aliased <code>ndt.t_small_loan_trace</code> table reference
     */
    public TSmallLoanTrace(String alias) {
        this(DSL.name(alias), T_SMALL_LOAN_TRACE);
    }

    /**
     * Create an aliased <code>ndt.t_small_loan_trace</code> table reference
     */
    public TSmallLoanTrace(Name alias) {
        this(alias, T_SMALL_LOAN_TRACE);
    }

    private TSmallLoanTrace(Name alias, Table<TSmallLoanTraceRecord> aliased) {
        this(alias, aliased, null);
    }

    private TSmallLoanTrace(Name alias, Table<TSmallLoanTraceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "小V贷款轨迹表");
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
        return Arrays.<Index>asList(Indexes.T_SMALL_LOAN_TRACE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TSmallLoanTraceRecord> getPrimaryKey() {
        return Keys.T_SMALL_LOAN_TRACE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TSmallLoanTraceRecord>> getKeys() {
        return Arrays.<UniqueKey<TSmallLoanTraceRecord>>asList(Keys.T_SMALL_LOAN_TRACE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TSmallLoanTrace as(String alias) {
        return new TSmallLoanTrace(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TSmallLoanTrace as(Name alias) {
        return new TSmallLoanTrace(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TSmallLoanTrace rename(String name) {
        return new TSmallLoanTrace(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TSmallLoanTrace rename(Name name) {
        return new TSmallLoanTrace(name, null);
    }
}