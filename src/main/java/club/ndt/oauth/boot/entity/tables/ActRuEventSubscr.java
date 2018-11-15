/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables;


import club.ndt.oauth.boot.entity.Indexes;
import club.ndt.oauth.boot.entity.Keys;
import club.ndt.oauth.boot.entity.Ndt;
import club.ndt.oauth.boot.entity.tables.records.ActRuEventSubscrRecord;

import java.sql.Timestamp;
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
public class ActRuEventSubscr extends TableImpl<ActRuEventSubscrRecord> {

    private static final long serialVersionUID = 1280435318;

    /**
     * The reference instance of <code>ndt.act_ru_event_subscr</code>
     */
    public static final ActRuEventSubscr ACT_RU_EVENT_SUBSCR = new ActRuEventSubscr();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ActRuEventSubscrRecord> getRecordType() {
        return ActRuEventSubscrRecord.class;
    }

    /**
     * The column <code>ndt.act_ru_event_subscr.id_</code>.
     */
    public final TableField<ActRuEventSubscrRecord, String> ID_ = createField("id_", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>ndt.act_ru_event_subscr.rev_</code>.
     */
    public final TableField<ActRuEventSubscrRecord, Integer> REV_ = createField("rev_", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>ndt.act_ru_event_subscr.event_type_</code>.
     */
    public final TableField<ActRuEventSubscrRecord, String> EVENT_TYPE_ = createField("event_type_", org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>ndt.act_ru_event_subscr.event_name_</code>.
     */
    public final TableField<ActRuEventSubscrRecord, String> EVENT_NAME_ = createField("event_name_", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>ndt.act_ru_event_subscr.execution_id_</code>.
     */
    public final TableField<ActRuEventSubscrRecord, String> EXECUTION_ID_ = createField("execution_id_", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>ndt.act_ru_event_subscr.proc_inst_id_</code>.
     */
    public final TableField<ActRuEventSubscrRecord, String> PROC_INST_ID_ = createField("proc_inst_id_", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>ndt.act_ru_event_subscr.activity_id_</code>.
     */
    public final TableField<ActRuEventSubscrRecord, String> ACTIVITY_ID_ = createField("activity_id_", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>ndt.act_ru_event_subscr.configuration_</code>.
     */
    public final TableField<ActRuEventSubscrRecord, String> CONFIGURATION_ = createField("configuration_", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>ndt.act_ru_event_subscr.created_</code>.
     */
    public final TableField<ActRuEventSubscrRecord, Timestamp> CREATED_ = createField("created_", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>ndt.act_ru_event_subscr.proc_def_id_</code>.
     */
    public final TableField<ActRuEventSubscrRecord, String> PROC_DEF_ID_ = createField("proc_def_id_", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>ndt.act_ru_event_subscr.tenant_id_</code>.
     */
    public final TableField<ActRuEventSubscrRecord, String> TENANT_ID_ = createField("tenant_id_", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.field("''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>ndt.act_ru_event_subscr</code> table reference
     */
    public ActRuEventSubscr() {
        this(DSL.name("act_ru_event_subscr"), null);
    }

    /**
     * Create an aliased <code>ndt.act_ru_event_subscr</code> table reference
     */
    public ActRuEventSubscr(String alias) {
        this(DSL.name(alias), ACT_RU_EVENT_SUBSCR);
    }

    /**
     * Create an aliased <code>ndt.act_ru_event_subscr</code> table reference
     */
    public ActRuEventSubscr(Name alias) {
        this(alias, ACT_RU_EVENT_SUBSCR);
    }

    private ActRuEventSubscr(Name alias, Table<ActRuEventSubscrRecord> aliased) {
        this(alias, aliased, null);
    }

    private ActRuEventSubscr(Name alias, Table<ActRuEventSubscrRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.ACT_IDX_EVENT_SUBSCR, Indexes.ACT_IDX_EVENT_SUBSCR_CONFIG_, Indexes.ACT_RU_EVENT_SUBSCR_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ActRuEventSubscrRecord> getPrimaryKey() {
        return Keys.ACT_RU_EVENT_SUBSCR_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ActRuEventSubscrRecord>> getKeys() {
        return Arrays.<UniqueKey<ActRuEventSubscrRecord>>asList(Keys.ACT_RU_EVENT_SUBSCR_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ActRuEventSubscrRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ActRuEventSubscrRecord, ?>>asList(Keys.ACT_RU_EVENT_SUBSCR__ACT_FK_EVENT_EXEC);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuEventSubscr as(String alias) {
        return new ActRuEventSubscr(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActRuEventSubscr as(Name alias) {
        return new ActRuEventSubscr(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ActRuEventSubscr rename(String name) {
        return new ActRuEventSubscr(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ActRuEventSubscr rename(Name name) {
        return new ActRuEventSubscr(name, null);
    }
}
