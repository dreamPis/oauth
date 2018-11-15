/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables;


import club.ndt.oauth.boot.entity.Indexes;
import club.ndt.oauth.boot.entity.Keys;
import club.ndt.oauth.boot.entity.Ndt;
import club.ndt.oauth.boot.entity.tables.records.ActHiIdentitylinkRecord;

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
public class ActHiIdentitylink extends TableImpl<ActHiIdentitylinkRecord> {

    private static final long serialVersionUID = 1766674463;

    /**
     * The reference instance of <code>ndt.act_hi_identitylink</code>
     */
    public static final ActHiIdentitylink ACT_HI_IDENTITYLINK = new ActHiIdentitylink();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ActHiIdentitylinkRecord> getRecordType() {
        return ActHiIdentitylinkRecord.class;
    }

    /**
     * The column <code>ndt.act_hi_identitylink.id_</code>.
     */
    public final TableField<ActHiIdentitylinkRecord, String> ID_ = createField("id_", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>ndt.act_hi_identitylink.group_id_</code>.
     */
    public final TableField<ActHiIdentitylinkRecord, String> GROUP_ID_ = createField("group_id_", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>ndt.act_hi_identitylink.type_</code>.
     */
    public final TableField<ActHiIdentitylinkRecord, String> TYPE_ = createField("type_", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>ndt.act_hi_identitylink.user_id_</code>.
     */
    public final TableField<ActHiIdentitylinkRecord, String> USER_ID_ = createField("user_id_", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>ndt.act_hi_identitylink.task_id_</code>.
     */
    public final TableField<ActHiIdentitylinkRecord, String> TASK_ID_ = createField("task_id_", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>ndt.act_hi_identitylink.proc_inst_id_</code>.
     */
    public final TableField<ActHiIdentitylinkRecord, String> PROC_INST_ID_ = createField("proc_inst_id_", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * Create a <code>ndt.act_hi_identitylink</code> table reference
     */
    public ActHiIdentitylink() {
        this(DSL.name("act_hi_identitylink"), null);
    }

    /**
     * Create an aliased <code>ndt.act_hi_identitylink</code> table reference
     */
    public ActHiIdentitylink(String alias) {
        this(DSL.name(alias), ACT_HI_IDENTITYLINK);
    }

    /**
     * Create an aliased <code>ndt.act_hi_identitylink</code> table reference
     */
    public ActHiIdentitylink(Name alias) {
        this(alias, ACT_HI_IDENTITYLINK);
    }

    private ActHiIdentitylink(Name alias, Table<ActHiIdentitylinkRecord> aliased) {
        this(alias, aliased, null);
    }

    private ActHiIdentitylink(Name alias, Table<ActHiIdentitylinkRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.ACT_HI_IDENTITYLINK_PKEY, Indexes.ACT_IDX_HI_IDENT_LNK_PROCINST, Indexes.ACT_IDX_HI_IDENT_LNK_TASK, Indexes.ACT_IDX_HI_IDENT_LNK_USER);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ActHiIdentitylinkRecord> getPrimaryKey() {
        return Keys.ACT_HI_IDENTITYLINK_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ActHiIdentitylinkRecord>> getKeys() {
        return Arrays.<UniqueKey<ActHiIdentitylinkRecord>>asList(Keys.ACT_HI_IDENTITYLINK_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActHiIdentitylink as(String alias) {
        return new ActHiIdentitylink(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActHiIdentitylink as(Name alias) {
        return new ActHiIdentitylink(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ActHiIdentitylink rename(String name) {
        return new ActHiIdentitylink(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ActHiIdentitylink rename(Name name) {
        return new ActHiIdentitylink(name, null);
    }
}