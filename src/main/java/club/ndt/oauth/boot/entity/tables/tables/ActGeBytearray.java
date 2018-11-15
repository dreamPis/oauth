/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables;


import club.ndt.oauth.boot.entity.Indexes;
import club.ndt.oauth.boot.entity.Keys;
import club.ndt.oauth.boot.entity.Ndt;
import club.ndt.oauth.boot.entity.tables.records.ActGeBytearrayRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ActGeBytearray extends TableImpl<ActGeBytearrayRecord> {

    private static final long serialVersionUID = -1670251536;

    /**
     * The reference instance of <code>ndt.act_ge_bytearray</code>
     */
    public static final ActGeBytearray ACT_GE_BYTEARRAY = new ActGeBytearray();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ActGeBytearrayRecord> getRecordType() {
        return ActGeBytearrayRecord.class;
    }

    /**
     * The column <code>ndt.act_ge_bytearray.id_</code>.
     */
    public final TableField<ActGeBytearrayRecord, String> ID_ = createField("id_", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>ndt.act_ge_bytearray.rev_</code>.
     */
    public final TableField<ActGeBytearrayRecord, Integer> REV_ = createField("rev_", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>ndt.act_ge_bytearray.name_</code>.
     */
    public final TableField<ActGeBytearrayRecord, String> NAME_ = createField("name_", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>ndt.act_ge_bytearray.deployment_id_</code>.
     */
    public final TableField<ActGeBytearrayRecord, String> DEPLOYMENT_ID_ = createField("deployment_id_", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>ndt.act_ge_bytearray.bytes_</code>.
     */
    public final TableField<ActGeBytearrayRecord, byte[]> BYTES_ = createField("bytes_", org.jooq.impl.SQLDataType.BLOB, this, "");

    /**
     * The column <code>ndt.act_ge_bytearray.generated_</code>.
     */
    public final TableField<ActGeBytearrayRecord, Boolean> GENERATED_ = createField("generated_", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * Create a <code>ndt.act_ge_bytearray</code> table reference
     */
    public ActGeBytearray() {
        this(DSL.name("act_ge_bytearray"), null);
    }

    /**
     * Create an aliased <code>ndt.act_ge_bytearray</code> table reference
     */
    public ActGeBytearray(String alias) {
        this(DSL.name(alias), ACT_GE_BYTEARRAY);
    }

    /**
     * Create an aliased <code>ndt.act_ge_bytearray</code> table reference
     */
    public ActGeBytearray(Name alias) {
        this(alias, ACT_GE_BYTEARRAY);
    }

    private ActGeBytearray(Name alias, Table<ActGeBytearrayRecord> aliased) {
        this(alias, aliased, null);
    }

    private ActGeBytearray(Name alias, Table<ActGeBytearrayRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
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
        return Arrays.<Index>asList(Indexes.ACT_GE_BYTEARRAY_PKEY, Indexes.ACT_IDX_BYTEAR_DEPL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ActGeBytearrayRecord> getPrimaryKey() {
        return Keys.ACT_GE_BYTEARRAY_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ActGeBytearrayRecord>> getKeys() {
        return Arrays.<UniqueKey<ActGeBytearrayRecord>>asList(Keys.ACT_GE_BYTEARRAY_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ActGeBytearrayRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ActGeBytearrayRecord, ?>>asList(Keys.ACT_GE_BYTEARRAY__ACT_FK_BYTEARR_DEPL);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActGeBytearray as(String alias) {
        return new ActGeBytearray(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActGeBytearray as(Name alias) {
        return new ActGeBytearray(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ActGeBytearray rename(String name) {
        return new ActGeBytearray(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ActGeBytearray rename(Name name) {
        return new ActGeBytearray(name, null);
    }
}
