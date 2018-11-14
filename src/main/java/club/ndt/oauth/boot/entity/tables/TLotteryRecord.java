/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables;


import club.ndt.oauth.boot.entity.Indexes;
import club.ndt.oauth.boot.entity.Keys;
import club.ndt.oauth.boot.entity.Ndt;
import club.ndt.oauth.boot.entity.tables.records.TLotteryRecordRecord;

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
 * 抽奖记录表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TLotteryRecord extends TableImpl<TLotteryRecordRecord> {

    private static final long serialVersionUID = 1275952030;

    /**
     * The reference instance of <code>ndt.t_lottery_record</code>
     */
    public static final TLotteryRecord T_LOTTERY_RECORD = new TLotteryRecord();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TLotteryRecordRecord> getRecordType() {
        return TLotteryRecordRecord.class;
    }

    /**
     * The column <code>ndt.t_lottery_record.user_id</code>. 用户ID
     */
    public final TableField<TLotteryRecordRecord, BigDecimal> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.NUMERIC, this, "用户ID");

    /**
     * The column <code>ndt.t_lottery_record.is_win</code>. 是否中奖(1, 中奖、2, 未中奖)
     */
    public final TableField<TLotteryRecordRecord, Short> IS_WIN = createField("is_win", org.jooq.impl.SQLDataType.SMALLINT, this, "是否中奖(1, 中奖、2, 未中奖)");

    /**
     * The column <code>ndt.t_lottery_record.is_integral</code>. 是否是积分（1, 是、2, 不是）
     */
    public final TableField<TLotteryRecordRecord, Short> IS_INTEGRAL = createField("is_integral", org.jooq.impl.SQLDataType.SMALLINT, this, "是否是积分（1, 是、2, 不是）");

    /**
     * The column <code>ndt.t_lottery_record.ware_id</code>. 实物ID
     */
    public final TableField<TLotteryRecordRecord, BigDecimal> WARE_ID = createField("ware_id", org.jooq.impl.SQLDataType.NUMERIC, this, "实物ID");

    /**
     * The column <code>ndt.t_lottery_record.integral_score</code>. 积分
     */
    public final TableField<TLotteryRecordRecord, Integer> INTEGRAL_SCORE = createField("integral_score", org.jooq.impl.SQLDataType.INTEGER, this, "积分");

    /**
     * The column <code>ndt.t_lottery_record.record_date</code>. 记录时间
     */
    public final TableField<TLotteryRecordRecord, Timestamp> RECORD_DATE = createField("record_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "记录时间");

    /**
     * The column <code>ndt.t_lottery_record.id</code>. id
     */
    public final TableField<TLotteryRecordRecord, BigDecimal> ID = createField("id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "id");

    /**
     * Create a <code>ndt.t_lottery_record</code> table reference
     */
    public TLotteryRecord() {
        this(DSL.name("t_lottery_record"), null);
    }

    /**
     * Create an aliased <code>ndt.t_lottery_record</code> table reference
     */
    public TLotteryRecord(String alias) {
        this(DSL.name(alias), T_LOTTERY_RECORD);
    }

    /**
     * Create an aliased <code>ndt.t_lottery_record</code> table reference
     */
    public TLotteryRecord(Name alias) {
        this(alias, T_LOTTERY_RECORD);
    }

    private TLotteryRecord(Name alias, Table<TLotteryRecordRecord> aliased) {
        this(alias, aliased, null);
    }

    private TLotteryRecord(Name alias, Table<TLotteryRecordRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "抽奖记录表");
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
        return Arrays.<Index>asList(Indexes.T_LOTTERY_RECORD_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TLotteryRecordRecord> getPrimaryKey() {
        return Keys.T_LOTTERY_RECORD_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TLotteryRecordRecord>> getKeys() {
        return Arrays.<UniqueKey<TLotteryRecordRecord>>asList(Keys.T_LOTTERY_RECORD_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TLotteryRecord as(String alias) {
        return new TLotteryRecord(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TLotteryRecord as(Name alias) {
        return new TLotteryRecord(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TLotteryRecord rename(String name) {
        return new TLotteryRecord(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TLotteryRecord rename(Name name) {
        return new TLotteryRecord(name, null);
    }
}
