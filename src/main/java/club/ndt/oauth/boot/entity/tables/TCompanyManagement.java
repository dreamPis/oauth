/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables;


import club.ndt.oauth.boot.entity.Indexes;
import club.ndt.oauth.boot.entity.Keys;
import club.ndt.oauth.boot.entity.Ndt;
import club.ndt.oauth.boot.entity.tables.records.TCompanyManagementRecord;

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
 * 公司经营状况表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TCompanyManagement extends TableImpl<TCompanyManagementRecord> {

    private static final long serialVersionUID = 1232595814;

    /**
     * The reference instance of <code>ndt.t_company_management</code>
     */
    public static final TCompanyManagement T_COMPANY_MANAGEMENT = new TCompanyManagement();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TCompanyManagementRecord> getRecordType() {
        return TCompanyManagementRecord.class;
    }

    /**
     * The column <code>ndt.t_company_management.id</code>.
     */
    public final TableField<TCompanyManagementRecord, BigDecimal> ID = createField("id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>ndt.t_company_management.company_detail_id</code>. 公司详情ID
     */
    public final TableField<TCompanyManagementRecord, BigDecimal> COMPANY_DETAIL_ID = createField("company_detail_id", org.jooq.impl.SQLDataType.NUMERIC, this, "公司详情ID");

    /**
     * The column <code>ndt.t_company_management.running_address</code>. 经营地址
     */
    public final TableField<TCompanyManagementRecord, String> RUNNING_ADDRESS = createField("running_address", org.jooq.impl.SQLDataType.VARCHAR(100), this, "经营地址");

    /**
     * The column <code>ndt.t_company_management.calendar_year</code>. 年度
     */
    public final TableField<TCompanyManagementRecord, String> CALENDAR_YEAR = createField("calendar_year", org.jooq.impl.SQLDataType.VARCHAR(30), this, "年度");

    /**
     * The column <code>ndt.t_company_management.social_security_amt</code>. 社保缴纳金额
     */
    public final TableField<TCompanyManagementRecord, BigDecimal> SOCIAL_SECURITY_AMT = createField("social_security_amt", org.jooq.impl.SQLDataType.NUMERIC, this, "社保缴纳金额");

    /**
     * The column <code>ndt.t_company_management.management_evaluation</code>. 经营评价
     */
    public final TableField<TCompanyManagementRecord, String> MANAGEMENT_EVALUATION = createField("management_evaluation", org.jooq.impl.SQLDataType.VARCHAR(10), this, "经营评价");

    /**
     * The column <code>ndt.t_company_management.local_tax_evaluation</code>. 地税评价
     */
    public final TableField<TCompanyManagementRecord, String> LOCAL_TAX_EVALUATION = createField("local_tax_evaluation", org.jooq.impl.SQLDataType.VARCHAR(10), this, "地税评价");

    /**
     * The column <code>ndt.t_company_management.national_tax_evaluation</code>. 国税评价
     */
    public final TableField<TCompanyManagementRecord, String> NATIONAL_TAX_EVALUATION = createField("national_tax_evaluation", org.jooq.impl.SQLDataType.VARCHAR(10), this, "国税评价");

    /**
     * The column <code>ndt.t_company_management.court_black_list</code>. 是否在法院黑名单中
     */
    public final TableField<TCompanyManagementRecord, Boolean> COURT_BLACK_LIST = createField("court_black_list", org.jooq.impl.SQLDataType.BOOLEAN, this, "是否在法院黑名单中");

    /**
     * The column <code>ndt.t_company_management.commerce_black_list</code>. 是否在工商黑名单中
     */
    public final TableField<TCompanyManagementRecord, Boolean> COMMERCE_BLACK_LIST = createField("commerce_black_list", org.jooq.impl.SQLDataType.BOOLEAN, this, "是否在工商黑名单中");

    /**
     * The column <code>ndt.t_company_management.status</code>.
     */
    public final TableField<TCompanyManagementRecord, Short> STATUS = createField("status", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>ndt.t_company_management.create_by</code>.
     */
    public final TableField<TCompanyManagementRecord, BigDecimal> CREATE_BY = createField("create_by", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>ndt.t_company_management.create_at</code>.
     */
    public final TableField<TCompanyManagementRecord, Timestamp> CREATE_AT = createField("create_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>ndt.t_company_management.update_by</code>.
     */
    public final TableField<TCompanyManagementRecord, BigDecimal> UPDATE_BY = createField("update_by", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>ndt.t_company_management.update_at</code>.
     */
    public final TableField<TCompanyManagementRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>ndt.t_company_management</code> table reference
     */
    public TCompanyManagement() {
        this(DSL.name("t_company_management"), null);
    }

    /**
     * Create an aliased <code>ndt.t_company_management</code> table reference
     */
    public TCompanyManagement(String alias) {
        this(DSL.name(alias), T_COMPANY_MANAGEMENT);
    }

    /**
     * Create an aliased <code>ndt.t_company_management</code> table reference
     */
    public TCompanyManagement(Name alias) {
        this(alias, T_COMPANY_MANAGEMENT);
    }

    private TCompanyManagement(Name alias, Table<TCompanyManagementRecord> aliased) {
        this(alias, aliased, null);
    }

    private TCompanyManagement(Name alias, Table<TCompanyManagementRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "公司经营状况表");
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
        return Arrays.<Index>asList(Indexes.T_COMPANY_MANAGEMENT_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TCompanyManagementRecord> getPrimaryKey() {
        return Keys.T_COMPANY_MANAGEMENT_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TCompanyManagementRecord>> getKeys() {
        return Arrays.<UniqueKey<TCompanyManagementRecord>>asList(Keys.T_COMPANY_MANAGEMENT_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCompanyManagement as(String alias) {
        return new TCompanyManagement(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TCompanyManagement as(Name alias) {
        return new TCompanyManagement(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TCompanyManagement rename(String name) {
        return new TCompanyManagement(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TCompanyManagement rename(Name name) {
        return new TCompanyManagement(name, null);
    }
}
