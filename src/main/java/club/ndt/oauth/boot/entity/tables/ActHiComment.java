/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables;


import com.ndt.sms.entity.Indexes;
import com.ndt.sms.entity.Keys;
import com.ndt.sms.entity.Ndt;
import com.ndt.sms.entity.tables.records.ActHiCommentRecord;

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
public class ActHiComment extends TableImpl<ActHiCommentRecord> {

    private static final long serialVersionUID = 1115990103;

    /**
     * The reference instance of <code>ndt.act_hi_comment</code>
     */
    public static final ActHiComment ACT_HI_COMMENT = new ActHiComment();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ActHiCommentRecord> getRecordType() {
        return ActHiCommentRecord.class;
    }

    /**
     * The column <code>ndt.act_hi_comment.id_</code>.
     */
    public final TableField<ActHiCommentRecord, String> ID_ = createField("id_", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>ndt.act_hi_comment.type_</code>.
     */
    public final TableField<ActHiCommentRecord, String> TYPE_ = createField("type_", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>ndt.act_hi_comment.time_</code>.
     */
    public final TableField<ActHiCommentRecord, Timestamp> TIME_ = createField("time_", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>ndt.act_hi_comment.user_id_</code>.
     */
    public final TableField<ActHiCommentRecord, String> USER_ID_ = createField("user_id_", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>ndt.act_hi_comment.task_id_</code>.
     */
    public final TableField<ActHiCommentRecord, String> TASK_ID_ = createField("task_id_", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>ndt.act_hi_comment.proc_inst_id_</code>.
     */
    public final TableField<ActHiCommentRecord, String> PROC_INST_ID_ = createField("proc_inst_id_", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>ndt.act_hi_comment.action_</code>.
     */
    public final TableField<ActHiCommentRecord, String> ACTION_ = createField("action_", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>ndt.act_hi_comment.message_</code>.
     */
    public final TableField<ActHiCommentRecord, String> MESSAGE_ = createField("message_", org.jooq.impl.SQLDataType.VARCHAR(4000), this, "");

    /**
     * The column <code>ndt.act_hi_comment.full_msg_</code>.
     */
    public final TableField<ActHiCommentRecord, byte[]> FULL_MSG_ = createField("full_msg_", org.jooq.impl.SQLDataType.BLOB, this, "");

    /**
     * Create a <code>ndt.act_hi_comment</code> table reference
     */
    public ActHiComment() {
        this(DSL.name("act_hi_comment"), null);
    }

    /**
     * Create an aliased <code>ndt.act_hi_comment</code> table reference
     */
    public ActHiComment(String alias) {
        this(DSL.name(alias), ACT_HI_COMMENT);
    }

    /**
     * Create an aliased <code>ndt.act_hi_comment</code> table reference
     */
    public ActHiComment(Name alias) {
        this(alias, ACT_HI_COMMENT);
    }

    private ActHiComment(Name alias, Table<ActHiCommentRecord> aliased) {
        this(alias, aliased, null);
    }

    private ActHiComment(Name alias, Table<ActHiCommentRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.ACT_HI_COMMENT_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ActHiCommentRecord> getPrimaryKey() {
        return Keys.ACT_HI_COMMENT_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ActHiCommentRecord>> getKeys() {
        return Arrays.<UniqueKey<ActHiCommentRecord>>asList(Keys.ACT_HI_COMMENT_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActHiComment as(String alias) {
        return new ActHiComment(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActHiComment as(Name alias) {
        return new ActHiComment(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ActHiComment rename(String name) {
        return new ActHiComment(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ActHiComment rename(Name name) {
        return new ActHiComment(name, null);
    }
}
