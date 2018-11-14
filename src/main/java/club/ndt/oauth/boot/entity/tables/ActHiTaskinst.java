/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables;


import com.ndt.sms.entity.Indexes;
import com.ndt.sms.entity.Keys;
import com.ndt.sms.entity.Ndt;
import com.ndt.sms.entity.tables.records.ActHiTaskinstRecord;

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
public class ActHiTaskinst extends TableImpl<ActHiTaskinstRecord> {

    private static final long serialVersionUID = 1315584141;

    /**
     * The reference instance of <code>ndt.act_hi_taskinst</code>
     */
    public static final ActHiTaskinst ACT_HI_TASKINST = new ActHiTaskinst();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ActHiTaskinstRecord> getRecordType() {
        return ActHiTaskinstRecord.class;
    }

    /**
     * The column <code>ndt.act_hi_taskinst.id_</code>.
     */
    public final TableField<ActHiTaskinstRecord, String> ID_ = createField("id_", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>ndt.act_hi_taskinst.proc_def_id_</code>.
     */
    public final TableField<ActHiTaskinstRecord, String> PROC_DEF_ID_ = createField("proc_def_id_", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>ndt.act_hi_taskinst.task_def_key_</code>.
     */
    public final TableField<ActHiTaskinstRecord, String> TASK_DEF_KEY_ = createField("task_def_key_", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>ndt.act_hi_taskinst.proc_inst_id_</code>.
     */
    public final TableField<ActHiTaskinstRecord, String> PROC_INST_ID_ = createField("proc_inst_id_", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>ndt.act_hi_taskinst.execution_id_</code>.
     */
    public final TableField<ActHiTaskinstRecord, String> EXECUTION_ID_ = createField("execution_id_", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>ndt.act_hi_taskinst.name_</code>.
     */
    public final TableField<ActHiTaskinstRecord, String> NAME_ = createField("name_", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>ndt.act_hi_taskinst.parent_task_id_</code>.
     */
    public final TableField<ActHiTaskinstRecord, String> PARENT_TASK_ID_ = createField("parent_task_id_", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>ndt.act_hi_taskinst.description_</code>.
     */
    public final TableField<ActHiTaskinstRecord, String> DESCRIPTION_ = createField("description_", org.jooq.impl.SQLDataType.VARCHAR(4000), this, "");

    /**
     * The column <code>ndt.act_hi_taskinst.owner_</code>.
     */
    public final TableField<ActHiTaskinstRecord, String> OWNER_ = createField("owner_", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>ndt.act_hi_taskinst.assignee_</code>.
     */
    public final TableField<ActHiTaskinstRecord, String> ASSIGNEE_ = createField("assignee_", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>ndt.act_hi_taskinst.start_time_</code>.
     */
    public final TableField<ActHiTaskinstRecord, Timestamp> START_TIME_ = createField("start_time_", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>ndt.act_hi_taskinst.claim_time_</code>.
     */
    public final TableField<ActHiTaskinstRecord, Timestamp> CLAIM_TIME_ = createField("claim_time_", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>ndt.act_hi_taskinst.end_time_</code>.
     */
    public final TableField<ActHiTaskinstRecord, Timestamp> END_TIME_ = createField("end_time_", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>ndt.act_hi_taskinst.duration_</code>.
     */
    public final TableField<ActHiTaskinstRecord, Long> DURATION_ = createField("duration_", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>ndt.act_hi_taskinst.delete_reason_</code>.
     */
    public final TableField<ActHiTaskinstRecord, String> DELETE_REASON_ = createField("delete_reason_", org.jooq.impl.SQLDataType.VARCHAR(4000), this, "");

    /**
     * The column <code>ndt.act_hi_taskinst.priority_</code>.
     */
    public final TableField<ActHiTaskinstRecord, Integer> PRIORITY_ = createField("priority_", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>ndt.act_hi_taskinst.due_date_</code>.
     */
    public final TableField<ActHiTaskinstRecord, Timestamp> DUE_DATE_ = createField("due_date_", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>ndt.act_hi_taskinst.form_key_</code>.
     */
    public final TableField<ActHiTaskinstRecord, String> FORM_KEY_ = createField("form_key_", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>ndt.act_hi_taskinst.category_</code>.
     */
    public final TableField<ActHiTaskinstRecord, String> CATEGORY_ = createField("category_", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>ndt.act_hi_taskinst.tenant_id_</code>.
     */
    public final TableField<ActHiTaskinstRecord, String> TENANT_ID_ = createField("tenant_id_", org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.field("''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>ndt.act_hi_taskinst</code> table reference
     */
    public ActHiTaskinst() {
        this(DSL.name("act_hi_taskinst"), null);
    }

    /**
     * Create an aliased <code>ndt.act_hi_taskinst</code> table reference
     */
    public ActHiTaskinst(String alias) {
        this(DSL.name(alias), ACT_HI_TASKINST);
    }

    /**
     * Create an aliased <code>ndt.act_hi_taskinst</code> table reference
     */
    public ActHiTaskinst(Name alias) {
        this(alias, ACT_HI_TASKINST);
    }

    private ActHiTaskinst(Name alias, Table<ActHiTaskinstRecord> aliased) {
        this(alias, aliased, null);
    }

    private ActHiTaskinst(Name alias, Table<ActHiTaskinstRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.ACT_HI_TASKINST_PKEY, Indexes.ACT_IDX_HI_TASK_INST_PROCINST);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ActHiTaskinstRecord> getPrimaryKey() {
        return Keys.ACT_HI_TASKINST_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ActHiTaskinstRecord>> getKeys() {
        return Arrays.<UniqueKey<ActHiTaskinstRecord>>asList(Keys.ACT_HI_TASKINST_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActHiTaskinst as(String alias) {
        return new ActHiTaskinst(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActHiTaskinst as(Name alias) {
        return new ActHiTaskinst(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ActHiTaskinst rename(String name) {
        return new ActHiTaskinst(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ActHiTaskinst rename(Name name) {
        return new ActHiTaskinst(name, null);
    }
}