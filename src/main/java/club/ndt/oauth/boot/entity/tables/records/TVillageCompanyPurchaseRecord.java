/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables.records;


import club.ndt.oauth.boot.entity.tables.TVillageCompanyPurchase;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 村站采集的公司采购信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TVillageCompanyPurchaseRecord extends UpdatableRecordImpl<TVillageCompanyPurchaseRecord> implements Record12<BigDecimal, BigDecimal, String, BigDecimal, String, String, Short, BigDecimal, Timestamp, BigDecimal, Timestamp, BigDecimal[]> {

    private static final long serialVersionUID = 1971063754;

    /**
     * Setter for <code>ndt.t_village_company_purchase.id</code>.
     */
    public TVillageCompanyPurchaseRecord setId(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_purchase.id</code>.
     */
    public BigDecimal getId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>ndt.t_village_company_purchase.village_company_info_id</code>. 村站采集的公司详情ID
     */
    public TVillageCompanyPurchaseRecord setVillageCompanyInfoId(BigDecimal value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_purchase.village_company_info_id</code>. 村站采集的公司详情ID
     */
    public BigDecimal getVillageCompanyInfoId() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>ndt.t_village_company_purchase.purchase_material</code>. 采购物资
     */
    public TVillageCompanyPurchaseRecord setPurchaseMaterial(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_purchase.purchase_material</code>. 采购物资
     */
    public String getPurchaseMaterial() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ndt.t_village_company_purchase.purchase_amt</code>. 采购金额
     */
    public TVillageCompanyPurchaseRecord setPurchaseAmt(BigDecimal value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_purchase.purchase_amt</code>. 采购金额
     */
    public BigDecimal getPurchaseAmt() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>ndt.t_village_company_purchase.purchase_date</code>. 采购日期
     */
    public TVillageCompanyPurchaseRecord setPurchaseDate(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_purchase.purchase_date</code>. 采购日期
     */
    public String getPurchaseDate() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ndt.t_village_company_purchase.img_url</code>. 采购图片地址
     */
    public TVillageCompanyPurchaseRecord setImgUrl(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_purchase.img_url</code>. 采购图片地址
     */
    public String getImgUrl() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ndt.t_village_company_purchase.status</code>.
     */
    public TVillageCompanyPurchaseRecord setStatus(Short value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_purchase.status</code>.
     */
    public Short getStatus() {
        return (Short) get(6);
    }

    /**
     * Setter for <code>ndt.t_village_company_purchase.create_user</code>.
     */
    public TVillageCompanyPurchaseRecord setCreateUser(BigDecimal value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_purchase.create_user</code>.
     */
    public BigDecimal getCreateUser() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>ndt.t_village_company_purchase.create_time</code>.
     */
    public TVillageCompanyPurchaseRecord setCreateTime(Timestamp value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_purchase.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>ndt.t_village_company_purchase.update_user</code>.
     */
    public TVillageCompanyPurchaseRecord setUpdateUser(BigDecimal value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_purchase.update_user</code>.
     */
    public BigDecimal getUpdateUser() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>ndt.t_village_company_purchase.update_time</code>.
     */
    public TVillageCompanyPurchaseRecord setUpdateTime(Timestamp value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_purchase.update_time</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>ndt.t_village_company_purchase.purchase_url</code>. 采购凭证图片
     */
    public TVillageCompanyPurchaseRecord setPurchaseUrl(BigDecimal... value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_purchase.purchase_url</code>. 采购凭证图片
     */
    public BigDecimal[] getPurchaseUrl() {
        return (BigDecimal[]) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<BigDecimal> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<BigDecimal, BigDecimal, String, BigDecimal, String, String, Short, BigDecimal, Timestamp, BigDecimal, Timestamp, BigDecimal[]> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<BigDecimal, BigDecimal, String, BigDecimal, String, String, Short, BigDecimal, Timestamp, BigDecimal, Timestamp, BigDecimal[]> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field1() {
        return TVillageCompanyPurchase.T_VILLAGE_COMPANY_PURCHASE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field2() {
        return TVillageCompanyPurchase.T_VILLAGE_COMPANY_PURCHASE.VILLAGE_COMPANY_INFO_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TVillageCompanyPurchase.T_VILLAGE_COMPANY_PURCHASE.PURCHASE_MATERIAL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return TVillageCompanyPurchase.T_VILLAGE_COMPANY_PURCHASE.PURCHASE_AMT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TVillageCompanyPurchase.T_VILLAGE_COMPANY_PURCHASE.PURCHASE_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TVillageCompanyPurchase.T_VILLAGE_COMPANY_PURCHASE.IMG_URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field7() {
        return TVillageCompanyPurchase.T_VILLAGE_COMPANY_PURCHASE.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field8() {
        return TVillageCompanyPurchase.T_VILLAGE_COMPANY_PURCHASE.CREATE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return TVillageCompanyPurchase.T_VILLAGE_COMPANY_PURCHASE.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field10() {
        return TVillageCompanyPurchase.T_VILLAGE_COMPANY_PURCHASE.UPDATE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return TVillageCompanyPurchase.T_VILLAGE_COMPANY_PURCHASE.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal[]> field12() {
        return TVillageCompanyPurchase.T_VILLAGE_COMPANY_PURCHASE.PURCHASE_URL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component2() {
        return getVillageCompanyInfoId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getPurchaseMaterial();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component4() {
        return getPurchaseAmt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getPurchaseDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getImgUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component7() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component8() {
        return getCreateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component10() {
        return getUpdateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal[] component12() {
        return getPurchaseUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value2() {
        return getVillageCompanyInfoId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getPurchaseMaterial();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getPurchaseAmt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getPurchaseDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getImgUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value7() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value8() {
        return getCreateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value10() {
        return getUpdateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal[] value12() {
        return getPurchaseUrl();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyPurchaseRecord value1(BigDecimal value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyPurchaseRecord value2(BigDecimal value) {
        setVillageCompanyInfoId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyPurchaseRecord value3(String value) {
        setPurchaseMaterial(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyPurchaseRecord value4(BigDecimal value) {
        setPurchaseAmt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyPurchaseRecord value5(String value) {
        setPurchaseDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyPurchaseRecord value6(String value) {
        setImgUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyPurchaseRecord value7(Short value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyPurchaseRecord value8(BigDecimal value) {
        setCreateUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyPurchaseRecord value9(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyPurchaseRecord value10(BigDecimal value) {
        setUpdateUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyPurchaseRecord value11(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyPurchaseRecord value12(BigDecimal... value) {
        setPurchaseUrl(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyPurchaseRecord values(BigDecimal value1, BigDecimal value2, String value3, BigDecimal value4, String value5, String value6, Short value7, BigDecimal value8, Timestamp value9, BigDecimal value10, Timestamp value11, BigDecimal[] value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TVillageCompanyPurchaseRecord
     */
    public TVillageCompanyPurchaseRecord() {
        super(TVillageCompanyPurchase.T_VILLAGE_COMPANY_PURCHASE);
    }

    /**
     * Create a detached, initialised TVillageCompanyPurchaseRecord
     */
    public TVillageCompanyPurchaseRecord(BigDecimal id, BigDecimal villageCompanyInfoId, String purchaseMaterial, BigDecimal purchaseAmt, String purchaseDate, String imgUrl, Short status, BigDecimal createUser, Timestamp createTime, BigDecimal updateUser, Timestamp updateTime, BigDecimal[] purchaseUrl) {
        super(TVillageCompanyPurchase.T_VILLAGE_COMPANY_PURCHASE);

        set(0, id);
        set(1, villageCompanyInfoId);
        set(2, purchaseMaterial);
        set(3, purchaseAmt);
        set(4, purchaseDate);
        set(5, imgUrl);
        set(6, status);
        set(7, createUser);
        set(8, createTime);
        set(9, updateUser);
        set(10, updateTime);
        set(11, purchaseUrl);
    }
}
