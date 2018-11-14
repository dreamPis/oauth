/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables;


import club.ndt.oauth.boot.entity.Indexes;
import club.ndt.oauth.boot.entity.Keys;
import club.ndt.oauth.boot.entity.Ndt;
import club.ndt.oauth.boot.entity.tables.records.TVillagePersonalPaymentRecord;

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
 * 水电气费缴费情况
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TVillagePersonalPayment extends TableImpl<TVillagePersonalPaymentRecord> {

    private static final long serialVersionUID = 338207697;

    /**
     * The reference instance of <code>ndt.t_village_personal_payment</code>
     */
    public static final TVillagePersonalPayment T_VILLAGE_PERSONAL_PAYMENT = new TVillagePersonalPayment();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TVillagePersonalPaymentRecord> getRecordType() {
        return TVillagePersonalPaymentRecord.class;
    }

    /**
     * The column <code>ndt.t_village_personal_payment.id</code>.
     */
    public final TableField<TVillagePersonalPaymentRecord, BigDecimal> ID = createField("id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>ndt.t_village_personal_payment.baseinfo_id</code>. 对应用户基本信息id
     */
    public final TableField<TVillagePersonalPaymentRecord, BigDecimal> BASEINFO_ID = createField("baseinfo_id", org.jooq.impl.SQLDataType.NUMERIC, this, "对应用户基本信息id");

    /**
     * The column <code>ndt.t_village_personal_payment.payment_month</code>. 缴费月份
     */
    public final TableField<TVillagePersonalPaymentRecord, String> PAYMENT_MONTH = createField("payment_month", org.jooq.impl.SQLDataType.VARCHAR(30), this, "缴费月份");

    /**
     * The column <code>ndt.t_village_personal_payment.payment_amount</code>. 缴费金额
     */
    public final TableField<TVillagePersonalPaymentRecord, BigDecimal> PAYMENT_AMOUNT = createField("payment_amount", org.jooq.impl.SQLDataType.NUMERIC, this, "缴费金额");

    /**
     * The column <code>ndt.t_village_personal_payment.payment_type</code>. 缴费类型
     */
    public final TableField<TVillagePersonalPaymentRecord, String> PAYMENT_TYPE = createField("payment_type", org.jooq.impl.SQLDataType.VARCHAR(50), this, "缴费类型");

    /**
     * The column <code>ndt.t_village_personal_payment.use_num</code>. 用量
     */
    public final TableField<TVillagePersonalPaymentRecord, String> USE_NUM = createField("use_num", org.jooq.impl.SQLDataType.VARCHAR(50), this, "用量");

    /**
     * The column <code>ndt.t_village_personal_payment.pay_image_url</code>. 缴费相关图片路径
     */
    public final TableField<TVillagePersonalPaymentRecord, String> PAY_IMAGE_URL = createField("pay_image_url", org.jooq.impl.SQLDataType.VARCHAR(200), this, "缴费相关图片路径");

    /**
     * The column <code>ndt.t_village_personal_payment.status</code>.
     */
    public final TableField<TVillagePersonalPaymentRecord, Short> STATUS = createField("status", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>ndt.t_village_personal_payment.create_user</code>.
     */
    public final TableField<TVillagePersonalPaymentRecord, BigDecimal> CREATE_USER = createField("create_user", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>ndt.t_village_personal_payment.create_time</code>.
     */
    public final TableField<TVillagePersonalPaymentRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>ndt.t_village_personal_payment.update_user</code>.
     */
    public final TableField<TVillagePersonalPaymentRecord, BigDecimal> UPDATE_USER = createField("update_user", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>ndt.t_village_personal_payment.update_time</code>.
     */
    public final TableField<TVillagePersonalPaymentRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>ndt.t_village_personal_payment</code> table reference
     */
    public TVillagePersonalPayment() {
        this(DSL.name("t_village_personal_payment"), null);
    }

    /**
     * Create an aliased <code>ndt.t_village_personal_payment</code> table reference
     */
    public TVillagePersonalPayment(String alias) {
        this(DSL.name(alias), T_VILLAGE_PERSONAL_PAYMENT);
    }

    /**
     * Create an aliased <code>ndt.t_village_personal_payment</code> table reference
     */
    public TVillagePersonalPayment(Name alias) {
        this(alias, T_VILLAGE_PERSONAL_PAYMENT);
    }

    private TVillagePersonalPayment(Name alias, Table<TVillagePersonalPaymentRecord> aliased) {
        this(alias, aliased, null);
    }

    private TVillagePersonalPayment(Name alias, Table<TVillagePersonalPaymentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "水电气费缴费情况");
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
        return Arrays.<Index>asList(Indexes.T_VILLAGE_PERSONAL_PAYMENT_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TVillagePersonalPaymentRecord> getPrimaryKey() {
        return Keys.T_VILLAGE_PERSONAL_PAYMENT_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TVillagePersonalPaymentRecord>> getKeys() {
        return Arrays.<UniqueKey<TVillagePersonalPaymentRecord>>asList(Keys.T_VILLAGE_PERSONAL_PAYMENT_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalPayment as(String alias) {
        return new TVillagePersonalPayment(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalPayment as(Name alias) {
        return new TVillagePersonalPayment(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TVillagePersonalPayment rename(String name) {
        return new TVillagePersonalPayment(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TVillagePersonalPayment rename(Name name) {
        return new TVillagePersonalPayment(name, null);
    }
}
