/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables;


import com.ndt.sms.entity.Indexes;
import com.ndt.sms.entity.Keys;
import com.ndt.sms.entity.Ndt;
import com.ndt.sms.entity.tables.records.TVillageCompanyPatentRecord;

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
 * 村站采集的公司专利资质信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TVillageCompanyPatent extends TableImpl<TVillageCompanyPatentRecord> {

    private static final long serialVersionUID = 2027947525;

    /**
     * The reference instance of <code>ndt.t_village_company_patent</code>
     */
    public static final TVillageCompanyPatent T_VILLAGE_COMPANY_PATENT = new TVillageCompanyPatent();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TVillageCompanyPatentRecord> getRecordType() {
        return TVillageCompanyPatentRecord.class;
    }

    /**
     * The column <code>ndt.t_village_company_patent.id</code>.
     */
    public final TableField<TVillageCompanyPatentRecord, BigDecimal> ID = createField("id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>ndt.t_village_company_patent.village_company_info_id</code>. 公司详情ID
     */
    public final TableField<TVillageCompanyPatentRecord, BigDecimal> VILLAGE_COMPANY_INFO_ID = createField("village_company_info_id", org.jooq.impl.SQLDataType.NUMERIC, this, "公司详情ID");

    /**
     * The column <code>ndt.t_village_company_patent.patent_name</code>. 专利资质名称
     */
    public final TableField<TVillageCompanyPatentRecord, String> PATENT_NAME = createField("patent_name", org.jooq.impl.SQLDataType.VARCHAR(20), this, "专利资质名称");

    /**
     * The column <code>ndt.t_village_company_patent.patent_no</code>. 专利资质编号
     */
    public final TableField<TVillageCompanyPatentRecord, String> PATENT_NO = createField("patent_no", org.jooq.impl.SQLDataType.VARCHAR(50), this, "专利资质编号");

    /**
     * The column <code>ndt.t_village_company_patent.acquire_date</code>. 获得时间
     */
    public final TableField<TVillageCompanyPatentRecord, String> ACQUIRE_DATE = createField("acquire_date", org.jooq.impl.SQLDataType.VARCHAR(50), this, "获得时间");

    /**
     * The column <code>ndt.t_village_company_patent.state</code>.
     */
    public final TableField<TVillageCompanyPatentRecord, Integer> STATE = createField("state", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>ndt.t_village_company_patent.status</code>.
     */
    public final TableField<TVillageCompanyPatentRecord, Short> STATUS = createField("status", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>ndt.t_village_company_patent.create_user</code>.
     */
    public final TableField<TVillageCompanyPatentRecord, BigDecimal> CREATE_USER = createField("create_user", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>ndt.t_village_company_patent.create_time</code>.
     */
    public final TableField<TVillageCompanyPatentRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>ndt.t_village_company_patent.update_user</code>.
     */
    public final TableField<TVillageCompanyPatentRecord, BigDecimal> UPDATE_USER = createField("update_user", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>ndt.t_village_company_patent.update_time</code>.
     */
    public final TableField<TVillageCompanyPatentRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>ndt.t_village_company_patent</code> table reference
     */
    public TVillageCompanyPatent() {
        this(DSL.name("t_village_company_patent"), null);
    }

    /**
     * Create an aliased <code>ndt.t_village_company_patent</code> table reference
     */
    public TVillageCompanyPatent(String alias) {
        this(DSL.name(alias), T_VILLAGE_COMPANY_PATENT);
    }

    /**
     * Create an aliased <code>ndt.t_village_company_patent</code> table reference
     */
    public TVillageCompanyPatent(Name alias) {
        this(alias, T_VILLAGE_COMPANY_PATENT);
    }

    private TVillageCompanyPatent(Name alias, Table<TVillageCompanyPatentRecord> aliased) {
        this(alias, aliased, null);
    }

    private TVillageCompanyPatent(Name alias, Table<TVillageCompanyPatentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "村站采集的公司专利资质信息");
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
        return Arrays.<Index>asList(Indexes.T_VILLAGE_COMPANY_PATENT_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TVillageCompanyPatentRecord> getPrimaryKey() {
        return Keys.T_VILLAGE_COMPANY_PATENT_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TVillageCompanyPatentRecord>> getKeys() {
        return Arrays.<UniqueKey<TVillageCompanyPatentRecord>>asList(Keys.T_VILLAGE_COMPANY_PATENT_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyPatent as(String alias) {
        return new TVillageCompanyPatent(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyPatent as(Name alias) {
        return new TVillageCompanyPatent(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TVillageCompanyPatent rename(String name) {
        return new TVillageCompanyPatent(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TVillageCompanyPatent rename(Name name) {
        return new TVillageCompanyPatent(name, null);
    }
}
