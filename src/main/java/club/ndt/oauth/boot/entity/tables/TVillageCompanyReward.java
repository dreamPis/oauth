/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables;


import com.ndt.sms.entity.Indexes;
import com.ndt.sms.entity.Keys;
import com.ndt.sms.entity.Ndt;
import com.ndt.sms.entity.tables.records.TVillageCompanyRewardRecord;

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
 * 村站采集的公司奖励/处罚信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TVillageCompanyReward extends TableImpl<TVillageCompanyRewardRecord> {

    private static final long serialVersionUID = -983802741;

    /**
     * The reference instance of <code>ndt.t_village_company_reward</code>
     */
    public static final TVillageCompanyReward T_VILLAGE_COMPANY_REWARD = new TVillageCompanyReward();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TVillageCompanyRewardRecord> getRecordType() {
        return TVillageCompanyRewardRecord.class;
    }

    /**
     * The column <code>ndt.t_village_company_reward.id</code>.
     */
    public final TableField<TVillageCompanyRewardRecord, BigDecimal> ID = createField("id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>ndt.t_village_company_reward.village_company_info_id</code>. 公司详情ID
     */
    public final TableField<TVillageCompanyRewardRecord, BigDecimal> VILLAGE_COMPANY_INFO_ID = createField("village_company_info_id", org.jooq.impl.SQLDataType.NUMERIC, this, "公司详情ID");

    /**
     * The column <code>ndt.t_village_company_reward.reorpu_type</code>. 类型（奖励或处罚 码表）
     */
    public final TableField<TVillageCompanyRewardRecord, Integer> REORPU_TYPE = createField("reorpu_type", org.jooq.impl.SQLDataType.INTEGER, this, "类型（奖励或处罚 码表）");

    /**
     * The column <code>ndt.t_village_company_reward.type</code>. 类型
     */
    public final TableField<TVillageCompanyRewardRecord, String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR(50), this, "类型");

    /**
     * The column <code>ndt.t_village_company_reward.award_date</code>. 时间
     */
    public final TableField<TVillageCompanyRewardRecord, String> AWARD_DATE = createField("award_date", org.jooq.impl.SQLDataType.VARCHAR(50), this, "时间");

    /**
     * The column <code>ndt.t_village_company_reward.registration_number</code>. 登记号
     */
    public final TableField<TVillageCompanyRewardRecord, String> REGISTRATION_NUMBER = createField("registration_number", org.jooq.impl.SQLDataType.VARCHAR(50), this, "登记号");

    /**
     * The column <code>ndt.t_village_company_reward.state</code>.
     */
    public final TableField<TVillageCompanyRewardRecord, Integer> STATE = createField("state", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>ndt.t_village_company_reward.status</code>.
     */
    public final TableField<TVillageCompanyRewardRecord, Short> STATUS = createField("status", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>ndt.t_village_company_reward.create_user</code>.
     */
    public final TableField<TVillageCompanyRewardRecord, BigDecimal> CREATE_USER = createField("create_user", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>ndt.t_village_company_reward.create_time</code>.
     */
    public final TableField<TVillageCompanyRewardRecord, Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>ndt.t_village_company_reward.update_user</code>.
     */
    public final TableField<TVillageCompanyRewardRecord, BigDecimal> UPDATE_USER = createField("update_user", org.jooq.impl.SQLDataType.NUMERIC, this, "");

    /**
     * The column <code>ndt.t_village_company_reward.update_time</code>.
     */
    public final TableField<TVillageCompanyRewardRecord, Timestamp> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>ndt.t_village_company_reward</code> table reference
     */
    public TVillageCompanyReward() {
        this(DSL.name("t_village_company_reward"), null);
    }

    /**
     * Create an aliased <code>ndt.t_village_company_reward</code> table reference
     */
    public TVillageCompanyReward(String alias) {
        this(DSL.name(alias), T_VILLAGE_COMPANY_REWARD);
    }

    /**
     * Create an aliased <code>ndt.t_village_company_reward</code> table reference
     */
    public TVillageCompanyReward(Name alias) {
        this(alias, T_VILLAGE_COMPANY_REWARD);
    }

    private TVillageCompanyReward(Name alias, Table<TVillageCompanyRewardRecord> aliased) {
        this(alias, aliased, null);
    }

    private TVillageCompanyReward(Name alias, Table<TVillageCompanyRewardRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "村站采集的公司奖励/处罚信息");
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
        return Arrays.<Index>asList(Indexes.T_VILLAGE_COMPANY_REWARD_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TVillageCompanyRewardRecord> getPrimaryKey() {
        return Keys.T_VILLAGE_COMPANY_REWARD_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TVillageCompanyRewardRecord>> getKeys() {
        return Arrays.<UniqueKey<TVillageCompanyRewardRecord>>asList(Keys.T_VILLAGE_COMPANY_REWARD_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyReward as(String alias) {
        return new TVillageCompanyReward(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyReward as(Name alias) {
        return new TVillageCompanyReward(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TVillageCompanyReward rename(String name) {
        return new TVillageCompanyReward(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TVillageCompanyReward rename(Name name) {
        return new TVillageCompanyReward(name, null);
    }
}
