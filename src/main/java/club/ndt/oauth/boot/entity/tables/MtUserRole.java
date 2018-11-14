/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables;


import club.ndt.oauth.boot.entity.Indexes;
import club.ndt.oauth.boot.entity.Keys;
import club.ndt.oauth.boot.entity.Ndt;
import club.ndt.oauth.boot.entity.tables.records.MtUserRoleRecord;

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
 * 用户角色中间表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MtUserRole extends TableImpl<MtUserRoleRecord> {

    private static final long serialVersionUID = 1420468472;

    /**
     * The reference instance of <code>ndt.mt_user_role</code>
     */
    public static final MtUserRole MT_USER_ROLE = new MtUserRole();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MtUserRoleRecord> getRecordType() {
        return MtUserRoleRecord.class;
    }

    /**
     * The column <code>ndt.mt_user_role.id</code>.
     */
    public final TableField<MtUserRoleRecord, BigDecimal> ID = createField("id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>ndt.mt_user_role.user_id</code>. 用户ID
     */
    public final TableField<MtUserRoleRecord, BigDecimal> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.NUMERIC, this, "用户ID");

    /**
     * The column <code>ndt.mt_user_role.role_id</code>. 角色ID
     */
    public final TableField<MtUserRoleRecord, BigDecimal> ROLE_ID = createField("role_id", org.jooq.impl.SQLDataType.NUMERIC, this, "角色ID");

    /**
     * The column <code>ndt.mt_user_role.create_at</code>. 创建时间
     */
    public final TableField<MtUserRoleRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "创建时间");

    /**
     * The column <code>ndt.mt_user_role.create_by</code>. 创建人
     */
    public final TableField<MtUserRoleRecord, BigDecimal> CREATE_BY = createField("create_by", org.jooq.impl.SQLDataType.NUMERIC, this, "创建人");

    /**
     * Create a <code>ndt.mt_user_role</code> table reference
     */
    public MtUserRole() {
        this(DSL.name("mt_user_role"), null);
    }

    /**
     * Create an aliased <code>ndt.mt_user_role</code> table reference
     */
    public MtUserRole(String alias) {
        this(DSL.name(alias), MT_USER_ROLE);
    }

    /**
     * Create an aliased <code>ndt.mt_user_role</code> table reference
     */
    public MtUserRole(Name alias) {
        this(alias, MT_USER_ROLE);
    }

    private MtUserRole(Name alias, Table<MtUserRoleRecord> aliased) {
        this(alias, aliased, null);
    }

    private MtUserRole(Name alias, Table<MtUserRoleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "用户角色中间表");
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
        return Arrays.<Index>asList(Indexes.MT_USER_ROLE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MtUserRoleRecord> getPrimaryKey() {
        return Keys.MT_USER_ROLE_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MtUserRoleRecord>> getKeys() {
        return Arrays.<UniqueKey<MtUserRoleRecord>>asList(Keys.MT_USER_ROLE_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MtUserRole as(String alias) {
        return new MtUserRole(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MtUserRole as(Name alias) {
        return new MtUserRole(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MtUserRole rename(String name) {
        return new MtUserRole(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MtUserRole rename(Name name) {
        return new MtUserRole(name, null);
    }
}
