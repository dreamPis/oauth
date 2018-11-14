/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables;


import com.ndt.sms.entity.Indexes;
import com.ndt.sms.entity.Keys;
import com.ndt.sms.entity.Ndt;
import com.ndt.sms.entity.tables.records.TNationalDebtOrdersRecord;

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
 * 国债产品
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TNationalDebtOrders extends TableImpl<TNationalDebtOrdersRecord> {

    private static final long serialVersionUID = -88783946;

    /**
     * The reference instance of <code>ndt.t_national_debt_orders</code>
     */
    public static final TNationalDebtOrders T_NATIONAL_DEBT_ORDERS = new TNationalDebtOrders();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TNationalDebtOrdersRecord> getRecordType() {
        return TNationalDebtOrdersRecord.class;
    }

    /**
     * The column <code>ndt.t_national_debt_orders.id</code>. 国债id
     */
    public final TableField<TNationalDebtOrdersRecord, BigDecimal> ID = createField("id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "国债id");

    /**
     * The column <code>ndt.t_national_debt_orders.product_id</code>. 国债产品id
     */
    public final TableField<TNationalDebtOrdersRecord, BigDecimal> PRODUCT_ID = createField("product_id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "国债产品id");

    /**
     * The column <code>ndt.t_national_debt_orders.buy_user_id</code>. 购买者
     */
    public final TableField<TNationalDebtOrdersRecord, BigDecimal> BUY_USER_ID = createField("buy_user_id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "购买者");

    /**
     * The column <code>ndt.t_national_debt_orders.buy_issue_period</code>. 购买年限(发行期限id)
     */
    public final TableField<TNationalDebtOrdersRecord, BigDecimal> BUY_ISSUE_PERIOD = createField("buy_issue_period", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "购买年限(发行期限id)");

    /**
     * The column <code>ndt.t_national_debt_orders.buy_sum</code>. 购买数量
     */
    public final TableField<TNationalDebtOrdersRecord, Integer> BUY_SUM = createField("buy_sum", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "购买数量");

    /**
     * The column <code>ndt.t_national_debt_orders.buy_name</code>. 购买者姓名
     */
    public final TableField<TNationalDebtOrdersRecord, String> BUY_NAME = createField("buy_name", org.jooq.impl.SQLDataType.VARCHAR(15).nullable(false), this, "购买者姓名");

    /**
     * The column <code>ndt.t_national_debt_orders.buy_identity</code>. 购买者身份证
     */
    public final TableField<TNationalDebtOrdersRecord, String> BUY_IDENTITY = createField("buy_identity", org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "购买者身份证");

    /**
     * The column <code>ndt.t_national_debt_orders.buy_mobile</code>. 购买者手机
     */
    public final TableField<TNationalDebtOrdersRecord, String> BUY_MOBILE = createField("buy_mobile", org.jooq.impl.SQLDataType.VARCHAR(15).nullable(false), this, "购买者手机");

    /**
     * The column <code>ndt.t_national_debt_orders.buy_credit_card</code>. 银行卡号
     */
    public final TableField<TNationalDebtOrdersRecord, String> BUY_CREDIT_CARD = createField("buy_credit_card", org.jooq.impl.SQLDataType.VARCHAR(25), this, "银行卡号");

    /**
     * The column <code>ndt.t_national_debt_orders.buy_time</code>. 购买时间
     */
    public final TableField<TNationalDebtOrdersRecord, Timestamp> BUY_TIME = createField("buy_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "购买时间");

    /**
     * The column <code>ndt.t_national_debt_orders.state</code>. 是否受理
     */
    public final TableField<TNationalDebtOrdersRecord, Integer> STATE = createField("state", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "是否受理");

    /**
     * The column <code>ndt.t_national_debt_orders.operate_time</code>. 操作时间
     */
    public final TableField<TNationalDebtOrdersRecord, Timestamp> OPERATE_TIME = createField("operate_time", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "操作时间");

    /**
     * The column <code>ndt.t_national_debt_orders.variety</code>. 国债品种编码
     */
    public final TableField<TNationalDebtOrdersRecord, Integer> VARIETY = createField("variety", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "国债品种编码");

    /**
     * The column <code>ndt.t_national_debt_orders.company_id</code>. 企业id
     */
    public final TableField<TNationalDebtOrdersRecord, BigDecimal> COMPANY_ID = createField("company_id", org.jooq.impl.SQLDataType.NUMERIC, this, "企业id");

    /**
     * Create a <code>ndt.t_national_debt_orders</code> table reference
     */
    public TNationalDebtOrders() {
        this(DSL.name("t_national_debt_orders"), null);
    }

    /**
     * Create an aliased <code>ndt.t_national_debt_orders</code> table reference
     */
    public TNationalDebtOrders(String alias) {
        this(DSL.name(alias), T_NATIONAL_DEBT_ORDERS);
    }

    /**
     * Create an aliased <code>ndt.t_national_debt_orders</code> table reference
     */
    public TNationalDebtOrders(Name alias) {
        this(alias, T_NATIONAL_DEBT_ORDERS);
    }

    private TNationalDebtOrders(Name alias, Table<TNationalDebtOrdersRecord> aliased) {
        this(alias, aliased, null);
    }

    private TNationalDebtOrders(Name alias, Table<TNationalDebtOrdersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "国债产品");
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
        return Arrays.<Index>asList(Indexes.T_NATIONAL_DEBT_ORDERS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TNationalDebtOrdersRecord> getPrimaryKey() {
        return Keys.T_NATIONAL_DEBT_ORDERS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TNationalDebtOrdersRecord>> getKeys() {
        return Arrays.<UniqueKey<TNationalDebtOrdersRecord>>asList(Keys.T_NATIONAL_DEBT_ORDERS_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNationalDebtOrders as(String alias) {
        return new TNationalDebtOrders(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNationalDebtOrders as(Name alias) {
        return new TNationalDebtOrders(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TNationalDebtOrders rename(String name) {
        return new TNationalDebtOrders(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TNationalDebtOrders rename(Name name) {
        return new TNationalDebtOrders(name, null);
    }
}