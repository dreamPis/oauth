/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables;


import club.ndt.oauth.boot.entity.Indexes;
import club.ndt.oauth.boot.entity.Keys;
import club.ndt.oauth.boot.entity.Ndt;
import club.ndt.oauth.boot.entity.tables.records.TMessageRecord;

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
 * 消息表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TMessage extends TableImpl<TMessageRecord> {

    private static final long serialVersionUID = -1011289866;

    /**
     * The reference instance of <code>ndt.t_message</code>
     */
    public static final TMessage T_MESSAGE = new TMessage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TMessageRecord> getRecordType() {
        return TMessageRecord.class;
    }

    /**
     * The column <code>ndt.t_message.id</code>.
     */
    public final TableField<TMessageRecord, BigDecimal> ID = createField("id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>ndt.t_message.content</code>. 消息内容
     */
    public final TableField<TMessageRecord, String> CONTENT = createField("content", org.jooq.impl.SQLDataType.CLOB, this, "消息内容");

    /**
     * The column <code>ndt.t_message.send_time</code>. 发送时间
     */
    public final TableField<TMessageRecord, Timestamp> SEND_TIME = createField("send_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "发送时间");

    /**
     * The column <code>ndt.t_message.message_type</code>. 消息类型
     */
    public final TableField<TMessageRecord, Integer> MESSAGE_TYPE = createField("message_type", org.jooq.impl.SQLDataType.INTEGER, this, "消息类型");

    /**
     * The column <code>ndt.t_message.priority</code>. 优先级
     */
    public final TableField<TMessageRecord, Integer> PRIORITY = createField("priority", org.jooq.impl.SQLDataType.INTEGER, this, "优先级");

    /**
     * The column <code>ndt.t_message.channel</code>. 下发渠道
     */
    public final TableField<TMessageRecord, Integer[]> CHANNEL = createField("channel", org.jooq.impl.SQLDataType.INTEGER.getArrayDataType(), this, "下发渠道");

    /**
     * The column <code>ndt.t_message.state</code>. 处理结果
     */
    public final TableField<TMessageRecord, Integer> STATE = createField("state", org.jooq.impl.SQLDataType.INTEGER, this, "处理结果");

    /**
     * The column <code>ndt.t_message.create_by</code>. 创建人
     */
    public final TableField<TMessageRecord, BigDecimal> CREATE_BY = createField("create_by", org.jooq.impl.SQLDataType.NUMERIC, this, "创建人");

    /**
     * The column <code>ndt.t_message.create_at</code>. 创建时间
     */
    public final TableField<TMessageRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "创建时间");

    /**
     * The column <code>ndt.t_message.status</code>. 记录状态
     */
    public final TableField<TMessageRecord, Short> STATUS = createField("status", org.jooq.impl.SQLDataType.SMALLINT, this, "记录状态");

    /**
     * Create a <code>ndt.t_message</code> table reference
     */
    public TMessage() {
        this(DSL.name("t_message"), null);
    }

    /**
     * Create an aliased <code>ndt.t_message</code> table reference
     */
    public TMessage(String alias) {
        this(DSL.name(alias), T_MESSAGE);
    }

    /**
     * Create an aliased <code>ndt.t_message</code> table reference
     */
    public TMessage(Name alias) {
        this(alias, T_MESSAGE);
    }

    private TMessage(Name alias, Table<TMessageRecord> aliased) {
        this(alias, aliased, null);
    }

    private TMessage(Name alias, Table<TMessageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "消息表");
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
        return Arrays.<Index>asList(Indexes.T_MESSAGE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TMessageRecord> getPrimaryKey() {
        return Keys.T_MESSAGE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TMessageRecord>> getKeys() {
        return Arrays.<UniqueKey<TMessageRecord>>asList(Keys.T_MESSAGE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TMessage as(String alias) {
        return new TMessage(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TMessage as(Name alias) {
        return new TMessage(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TMessage rename(String name) {
        return new TMessage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TMessage rename(Name name) {
        return new TMessage(name, null);
    }
}
