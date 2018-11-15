/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables;


import club.ndt.oauth.boot.entity.Indexes;
import club.ndt.oauth.boot.entity.Keys;
import club.ndt.oauth.boot.entity.Ndt;
import club.ndt.oauth.boot.entity.tables.records.TPersonalDetailRecord;

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
 * 个人用户详情表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TPersonalDetail extends TableImpl<TPersonalDetailRecord> {

    private static final long serialVersionUID = 1654877463;

    /**
     * The reference instance of <code>ndt.t_personal_detail</code>
     */
    public static final TPersonalDetail T_PERSONAL_DETAIL = new TPersonalDetail();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TPersonalDetailRecord> getRecordType() {
        return TPersonalDetailRecord.class;
    }

    /**
     * The column <code>ndt.t_personal_detail.id</code>.
     */
    public final TableField<TPersonalDetailRecord, BigDecimal> ID = createField("id", org.jooq.impl.SQLDataType.NUMERIC.nullable(false), this, "");

    /**
     * The column <code>ndt.t_personal_detail.identity_id</code>. 身份证
     */
    public final TableField<TPersonalDetailRecord, String> IDENTITY_ID = createField("identity_id", org.jooq.impl.SQLDataType.VARCHAR(20), this, "身份证");

    /**
     * The column <code>ndt.t_personal_detail.is_emerging</code>. 是否为新兴经营主体
     */
    public final TableField<TPersonalDetailRecord, Boolean> IS_EMERGING = createField("is_emerging", org.jooq.impl.SQLDataType.BOOLEAN, this, "是否为新兴经营主体");

    /**
     * The column <code>ndt.t_personal_detail.address</code>. 地址
     */
    public final TableField<TPersonalDetailRecord, String> ADDRESS = createField("address", org.jooq.impl.SQLDataType.VARCHAR(100), this, "地址");

    /**
     * The column <code>ndt.t_personal_detail.marital_status</code>. 婚姻状况
     */
    public final TableField<TPersonalDetailRecord, Integer> MARITAL_STATUS = createField("marital_status", org.jooq.impl.SQLDataType.INTEGER, this, "婚姻状况");

    /**
     * The column <code>ndt.t_personal_detail.evaluate</code>. 道德评价
     */
    public final TableField<TPersonalDetailRecord, Integer> EVALUATE = createField("evaluate", org.jooq.impl.SQLDataType.INTEGER, this, "道德评价");

    /**
     * The column <code>ndt.t_personal_detail.badhabits</code>. 不良嗜好
     */
    public final TableField<TPersonalDetailRecord, String> BADHABITS = createField("badhabits", org.jooq.impl.SQLDataType.VARCHAR(100), this, "不良嗜好");

    /**
     * The column <code>ndt.t_personal_detail.is_crimed</code>. 是否有犯罪记录
     */
    public final TableField<TPersonalDetailRecord, Boolean> IS_CRIMED = createField("is_crimed", org.jooq.impl.SQLDataType.BOOLEAN, this, "是否有犯罪记录");

    /**
     * The column <code>ndt.t_personal_detail.education</code>. 学历
     */
    public final TableField<TPersonalDetailRecord, Integer> EDUCATION = createField("education", org.jooq.impl.SQLDataType.INTEGER, this, "学历");

    /**
     * The column <code>ndt.t_personal_detail.support_num</code>. 赡养人数
     */
    public final TableField<TPersonalDetailRecord, Short> SUPPORT_NUM = createField("support_num", org.jooq.impl.SQLDataType.SMALLINT, this, "赡养人数");

    /**
     * The column <code>ndt.t_personal_detail.monitor_children</code>. 未成年子女数
     */
    public final TableField<TPersonalDetailRecord, Short> MONITOR_CHILDREN = createField("monitor_children", org.jooq.impl.SQLDataType.SMALLINT, this, "未成年子女数");

    /**
     * The column <code>ndt.t_personal_detail.update_at</code>. 更新时间
     */
    public final TableField<TPersonalDetailRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "更新时间");

    /**
     * The column <code>ndt.t_personal_detail.update_by</code>. 更新人
     */
    public final TableField<TPersonalDetailRecord, BigDecimal> UPDATE_BY = createField("update_by", org.jooq.impl.SQLDataType.NUMERIC, this, "更新人");

    /**
     * The column <code>ndt.t_personal_detail.related_img_urls</code>. 相关照片
     */
    public final TableField<TPersonalDetailRecord, String> RELATED_IMG_URLS = createField("related_img_urls", org.jooq.impl.SQLDataType.VARCHAR(300), this, "相关照片");

    /**
     * Create a <code>ndt.t_personal_detail</code> table reference
     */
    public TPersonalDetail() {
        this(DSL.name("t_personal_detail"), null);
    }

    /**
     * Create an aliased <code>ndt.t_personal_detail</code> table reference
     */
    public TPersonalDetail(String alias) {
        this(DSL.name(alias), T_PERSONAL_DETAIL);
    }

    /**
     * Create an aliased <code>ndt.t_personal_detail</code> table reference
     */
    public TPersonalDetail(Name alias) {
        this(alias, T_PERSONAL_DETAIL);
    }

    private TPersonalDetail(Name alias, Table<TPersonalDetailRecord> aliased) {
        this(alias, aliased, null);
    }

    private TPersonalDetail(Name alias, Table<TPersonalDetailRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "个人用户详情表");
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
        return Arrays.<Index>asList(Indexes.T_PERSONAL_DETAIL_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TPersonalDetailRecord> getPrimaryKey() {
        return Keys.T_PERSONAL_DETAIL_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TPersonalDetailRecord>> getKeys() {
        return Arrays.<UniqueKey<TPersonalDetailRecord>>asList(Keys.T_PERSONAL_DETAIL_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPersonalDetail as(String alias) {
        return new TPersonalDetail(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPersonalDetail as(Name alias) {
        return new TPersonalDetail(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TPersonalDetail rename(String name) {
        return new TPersonalDetail(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TPersonalDetail rename(Name name) {
        return new TPersonalDetail(name, null);
    }
}
