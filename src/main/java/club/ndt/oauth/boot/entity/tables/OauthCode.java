/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables;


import club.ndt.oauth.boot.entity.Ndt;
import club.ndt.oauth.boot.entity.tables.records.OauthCodeRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
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
public class OauthCode extends TableImpl<OauthCodeRecord> {

    private static final long serialVersionUID = 1006912366;

    /**
     * The reference instance of <code>ndt.oauth_code</code>
     */
    public static final OauthCode OAUTH_CODE = new OauthCode();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OauthCodeRecord> getRecordType() {
        return OauthCodeRecord.class;
    }

    /**
     * The column <code>ndt.oauth_code.code</code>.
     */
    public final TableField<OauthCodeRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>ndt.oauth_code.authentication</code>.
     */
    public final TableField<OauthCodeRecord, byte[]> AUTHENTICATION = createField("authentication", org.jooq.impl.SQLDataType.BLOB, this, "");

    /**
     * Create a <code>ndt.oauth_code</code> table reference
     */
    public OauthCode() {
        this(DSL.name("oauth_code"), null);
    }

    /**
     * Create an aliased <code>ndt.oauth_code</code> table reference
     */
    public OauthCode(String alias) {
        this(DSL.name(alias), OAUTH_CODE);
    }

    /**
     * Create an aliased <code>ndt.oauth_code</code> table reference
     */
    public OauthCode(Name alias) {
        this(alias, OAUTH_CODE);
    }

    private OauthCode(Name alias, Table<OauthCodeRecord> aliased) {
        this(alias, aliased, null);
    }

    private OauthCode(Name alias, Table<OauthCodeRecord> aliased, Field<?>[] parameters) {
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
    public OauthCode as(String alias) {
        return new OauthCode(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OauthCode as(Name alias) {
        return new OauthCode(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public OauthCode rename(String name) {
        return new OauthCode(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public OauthCode rename(Name name) {
        return new OauthCode(name, null);
    }
}
