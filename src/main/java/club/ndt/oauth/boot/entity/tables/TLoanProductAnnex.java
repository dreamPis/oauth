/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables;


import club.ndt.oauth.boot.entity.Indexes;
import club.ndt.oauth.boot.entity.Keys;
import club.ndt.oauth.boot.entity.Ndt;
import club.ndt.oauth.boot.entity.tables.records.TLoanProductAnnexRecord;

import java.math.BigDecimal;
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
public class TLoanProductAnnex extends TableImpl<TLoanProductAnnexRecord> {

    private static final long serialVersionUID = 417076751;

    /**
     * The reference instance of <code>ndt.t_loan_product_annex</code>
     */
    public static final TLoanProductAnnex T_LOAN_PRODUCT_ANNEX = new TLoanProductAnnex();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TLoanProductAnnexRecord> getRecordType() {
        return TLoanProductAnnexRecord.class;
    }

    /**
     * The column <code>ndt.t_loan_product_annex.id</code>. 主键
     */
    public final TableField<TLoanProductAnnexRecord, BigDecimal> ID = createField("id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "主键");

    /**
     * The column <code>ndt.t_loan_product_annex.product_id</code>. 产品ID
     */
    public final TableField<TLoanProductAnnexRecord, BigDecimal> PRODUCT_ID = createField("product_id", org.jooq.impl.SQLDataType.NUMERIC, this, "产品ID");

    /**
     * The column <code>ndt.t_loan_product_annex.annex_type</code>. 产品类型(参照码表83)
     */
    public final TableField<TLoanProductAnnexRecord, Integer> ANNEX_TYPE = createField("annex_type", org.jooq.impl.SQLDataType.INTEGER, this, "产品类型(参照码表83)");

    /**
     * The column <code>ndt.t_loan_product_annex.annex_path</code>. 附件地址
     */
    public final TableField<TLoanProductAnnexRecord, String> ANNEX_PATH = createField("annex_path", org.jooq.impl.SQLDataType.VARCHAR(50), this, "附件地址");

    /**
     * The column <code>ndt.t_loan_product_annex.state</code>. 状态(0、删除， 1、未删除)
     */
    public final TableField<TLoanProductAnnexRecord, Short> STATE = createField("state", org.jooq.impl.SQLDataType.SMALLINT, this, "状态(0、删除， 1、未删除)");

    /**
     * Create a <code>ndt.t_loan_product_annex</code> table reference
     */
    public TLoanProductAnnex() {
        this(DSL.name("t_loan_product_annex"), null);
    }

    /**
     * Create an aliased <code>ndt.t_loan_product_annex</code> table reference
     */
    public TLoanProductAnnex(String alias) {
        this(DSL.name(alias), T_LOAN_PRODUCT_ANNEX);
    }

    /**
     * Create an aliased <code>ndt.t_loan_product_annex</code> table reference
     */
    public TLoanProductAnnex(Name alias) {
        this(alias, T_LOAN_PRODUCT_ANNEX);
    }

    private TLoanProductAnnex(Name alias, Table<TLoanProductAnnexRecord> aliased) {
        this(alias, aliased, null);
    }

    private TLoanProductAnnex(Name alias, Table<TLoanProductAnnexRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.T_LOAN_PRODUCT_ANNEX_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TLoanProductAnnexRecord> getPrimaryKey() {
        return Keys.T_LOAN_PRODUCT_ANNEX_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TLoanProductAnnexRecord>> getKeys() {
        return Arrays.<UniqueKey<TLoanProductAnnexRecord>>asList(Keys.T_LOAN_PRODUCT_ANNEX_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TLoanProductAnnex as(String alias) {
        return new TLoanProductAnnex(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TLoanProductAnnex as(Name alias) {
        return new TLoanProductAnnex(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TLoanProductAnnex rename(String name) {
        return new TLoanProductAnnex(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TLoanProductAnnex rename(Name name) {
        return new TLoanProductAnnex(name, null);
    }
}
