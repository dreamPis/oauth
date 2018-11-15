/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables;


import club.ndt.oauth.boot.entity.Indexes;
import club.ndt.oauth.boot.entity.Keys;
import club.ndt.oauth.boot.entity.Ndt;
import club.ndt.oauth.boot.entity.tables.records.MtMessageAccepterRecord;

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
 * 消息接收者表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MtMessageAccepter extends TableImpl<MtMessageAccepterRecord> {

    private static final long serialVersionUID = 561315515;

    /**
     * The reference instance of <code>ndt.mt_message_accepter</code>
     */
    public static final MtMessageAccepter MT_MESSAGE_ACCEPTER = new MtMessageAccepter();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MtMessageAccepterRecord> getRecordType() {
        return MtMessageAccepterRecord.class;
    }

    /**
     * The column <code>ndt.mt_message_accepter.id</code>.
     */
    public final TableField<MtMessageAccepterRecord, BigDecimal> ID = createField("id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>ndt.mt_message_accepter.message_id</code>. 消息ID
     */
    public final TableField<MtMessageAccepterRecord, BigDecimal> MESSAGE_ID = createField("message_id", org.jooq.impl.SQLDataType.NUMERIC, this, "消息ID");

    /**
     * The column <code>ndt.mt_message_accepter.accepter_type</code>. 消息接收对象类型
     */
    public final TableField<MtMessageAccepterRecord, Integer> ACCEPTER_TYPE = createField("accepter_type", org.jooq.impl.SQLDataType.INTEGER, this, "消息接收对象类型");

    /**
     * The column <code>ndt.mt_message_accepter.accepter_id</code>. 消息接收对象ID
     */
    public final TableField<MtMessageAccepterRecord, BigDecimal> ACCEPTER_ID = createField("accepter_id", org.jooq.impl.SQLDataType.NUMERIC, this, "消息接收对象ID");

    /**
     * The column <code>ndt.mt_message_accepter.create_at</code>. 创建时间
     */
    public final TableField<MtMessageAccepterRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "创建时间");

    /**
     * Create a <code>ndt.mt_message_accepter</code> table reference
     */
    public MtMessageAccepter() {
        this(DSL.name("mt_message_accepter"), null);
    }

    /**
     * Create an aliased <code>ndt.mt_message_accepter</code> table reference
     */
    public MtMessageAccepter(String alias) {
        this(DSL.name(alias), MT_MESSAGE_ACCEPTER);
    }

    /**
     * Create an aliased <code>ndt.mt_message_accepter</code> table reference
     */
    public MtMessageAccepter(Name alias) {
        this(alias, MT_MESSAGE_ACCEPTER);
    }

    private MtMessageAccepter(Name alias, Table<MtMessageAccepterRecord> aliased) {
        this(alias, aliased, null);
    }

    private MtMessageAccepter(Name alias, Table<MtMessageAccepterRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "消息接收者表");
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
        return Arrays.<Index>asList(Indexes.MT_MESSAGE_ACCEPTER_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MtMessageAccepterRecord> getPrimaryKey() {
        return Keys.MT_MESSAGE_ACCEPTER_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MtMessageAccepterRecord>> getKeys() {
        return Arrays.<UniqueKey<MtMessageAccepterRecord>>asList(Keys.MT_MESSAGE_ACCEPTER_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MtMessageAccepter as(String alias) {
        return new MtMessageAccepter(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MtMessageAccepter as(Name alias) {
        return new MtMessageAccepter(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MtMessageAccepter rename(String name) {
        return new MtMessageAccepter(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MtMessageAccepter rename(Name name) {
        return new MtMessageAccepter(name, null);
    }
}