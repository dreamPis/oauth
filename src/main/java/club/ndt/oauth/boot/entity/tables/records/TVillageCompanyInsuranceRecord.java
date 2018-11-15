/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables.records;


import club.ndt.oauth.boot.entity.tables.TVillageCompanyInsurance;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record15;
import org.jooq.Row15;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 村站采集的公司参保信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TVillageCompanyInsuranceRecord extends UpdatableRecordImpl<TVillageCompanyInsuranceRecord> implements Record15<BigDecimal, BigDecimal, String, String, String, BigDecimal, String, String, Short, BigDecimal, Timestamp, BigDecimal, Timestamp, BigDecimal, BigDecimal[]> {

    private static final long serialVersionUID = -1471622047;

    /**
     * Setter for <code>ndt.t_village_company_insurance.id</code>.
     */
    public TVillageCompanyInsuranceRecord setId(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_insurance.id</code>.
     */
    public BigDecimal getId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>ndt.t_village_company_insurance.village_company_info_id</code>. 公司详情ID
     */
    public TVillageCompanyInsuranceRecord setVillageCompanyInfoId(BigDecimal value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_insurance.village_company_info_id</code>. 公司详情ID
     */
    public BigDecimal getVillageCompanyInfoId() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>ndt.t_village_company_insurance.insurance_name</code>. 保险名称
     */
    public TVillageCompanyInsuranceRecord setInsuranceName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_insurance.insurance_name</code>. 保险名称
     */
    public String getInsuranceName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ndt.t_village_company_insurance.insurance_type</code>. 保险类型
     */
    public TVillageCompanyInsuranceRecord setInsuranceType(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_insurance.insurance_type</code>. 保险类型
     */
    public String getInsuranceType() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ndt.t_village_company_insurance.beneficiary</code>. 第一受益人
     */
    public TVillageCompanyInsuranceRecord setBeneficiary(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_insurance.beneficiary</code>. 第一受益人
     */
    public String getBeneficiary() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ndt.t_village_company_insurance.insurance_amt</code>. 保险金额
     */
    public TVillageCompanyInsuranceRecord setInsuranceAmt(BigDecimal value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_insurance.insurance_amt</code>. 保险金额
     */
    public BigDecimal getInsuranceAmt() {
        return (BigDecimal) get(5);
    }

    /**
     * Setter for <code>ndt.t_village_company_insurance.insurance_time</code>. 参保日期
     */
    public TVillageCompanyInsuranceRecord setInsuranceTime(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_insurance.insurance_time</code>. 参保日期
     */
    public String getInsuranceTime() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ndt.t_village_company_insurance.insurance_duetime</code>. 保险到期日
     */
    public TVillageCompanyInsuranceRecord setInsuranceDuetime(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_insurance.insurance_duetime</code>. 保险到期日
     */
    public String getInsuranceDuetime() {
        return (String) get(7);
    }

    /**
     * Setter for <code>ndt.t_village_company_insurance.status</code>.
     */
    public TVillageCompanyInsuranceRecord setStatus(Short value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_insurance.status</code>.
     */
    public Short getStatus() {
        return (Short) get(8);
    }

    /**
     * Setter for <code>ndt.t_village_company_insurance.create_user</code>.
     */
    public TVillageCompanyInsuranceRecord setCreateUser(BigDecimal value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_insurance.create_user</code>.
     */
    public BigDecimal getCreateUser() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>ndt.t_village_company_insurance.create_time</code>.
     */
    public TVillageCompanyInsuranceRecord setCreateTime(Timestamp value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_insurance.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>ndt.t_village_company_insurance.update_user</code>.
     */
    public TVillageCompanyInsuranceRecord setUpdateUser(BigDecimal value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_insurance.update_user</code>.
     */
    public BigDecimal getUpdateUser() {
        return (BigDecimal) get(11);
    }

    /**
     * Setter for <code>ndt.t_village_company_insurance.update_time</code>.
     */
    public TVillageCompanyInsuranceRecord setUpdateTime(Timestamp value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_insurance.update_time</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(12);
    }

    /**
     * Setter for <code>ndt.t_village_company_insurance.insurance_pay</code>. 总保费支出(万元)
     */
    public TVillageCompanyInsuranceRecord setInsurancePay(BigDecimal value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_insurance.insurance_pay</code>. 总保费支出(万元)
     */
    public BigDecimal getInsurancePay() {
        return (BigDecimal) get(13);
    }

    /**
     * Setter for <code>ndt.t_village_company_insurance.insurance_img</code>. 参保凭证
     */
    public TVillageCompanyInsuranceRecord setInsuranceImg(BigDecimal... value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_company_insurance.insurance_img</code>. 参保凭证
     */
    public BigDecimal[] getInsuranceImg() {
        return (BigDecimal[]) get(14);
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
    // Record15 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<BigDecimal, BigDecimal, String, String, String, BigDecimal, String, String, Short, BigDecimal, Timestamp, BigDecimal, Timestamp, BigDecimal, BigDecimal[]> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<BigDecimal, BigDecimal, String, String, String, BigDecimal, String, String, Short, BigDecimal, Timestamp, BigDecimal, Timestamp, BigDecimal, BigDecimal[]> valuesRow() {
        return (Row15) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field1() {
        return TVillageCompanyInsurance.T_VILLAGE_COMPANY_INSURANCE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field2() {
        return TVillageCompanyInsurance.T_VILLAGE_COMPANY_INSURANCE.VILLAGE_COMPANY_INFO_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TVillageCompanyInsurance.T_VILLAGE_COMPANY_INSURANCE.INSURANCE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TVillageCompanyInsurance.T_VILLAGE_COMPANY_INSURANCE.INSURANCE_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TVillageCompanyInsurance.T_VILLAGE_COMPANY_INSURANCE.BENEFICIARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field6() {
        return TVillageCompanyInsurance.T_VILLAGE_COMPANY_INSURANCE.INSURANCE_AMT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TVillageCompanyInsurance.T_VILLAGE_COMPANY_INSURANCE.INSURANCE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return TVillageCompanyInsurance.T_VILLAGE_COMPANY_INSURANCE.INSURANCE_DUETIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field9() {
        return TVillageCompanyInsurance.T_VILLAGE_COMPANY_INSURANCE.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field10() {
        return TVillageCompanyInsurance.T_VILLAGE_COMPANY_INSURANCE.CREATE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return TVillageCompanyInsurance.T_VILLAGE_COMPANY_INSURANCE.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field12() {
        return TVillageCompanyInsurance.T_VILLAGE_COMPANY_INSURANCE.UPDATE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field13() {
        return TVillageCompanyInsurance.T_VILLAGE_COMPANY_INSURANCE.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field14() {
        return TVillageCompanyInsurance.T_VILLAGE_COMPANY_INSURANCE.INSURANCE_PAY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal[]> field15() {
        return TVillageCompanyInsurance.T_VILLAGE_COMPANY_INSURANCE.INSURANCE_IMG;
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
        return getInsuranceName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getInsuranceType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getBeneficiary();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component6() {
        return getInsuranceAmt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getInsuranceTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getInsuranceDuetime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component9() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component10() {
        return getCreateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component12() {
        return getUpdateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component13() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component14() {
        return getInsurancePay();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal[] component15() {
        return getInsuranceImg();
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
        return getInsuranceName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getInsuranceType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getBeneficiary();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value6() {
        return getInsuranceAmt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getInsuranceTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getInsuranceDuetime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value9() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value10() {
        return getCreateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value12() {
        return getUpdateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value13() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value14() {
        return getInsurancePay();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal[] value15() {
        return getInsuranceImg();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyInsuranceRecord value1(BigDecimal value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyInsuranceRecord value2(BigDecimal value) {
        setVillageCompanyInfoId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyInsuranceRecord value3(String value) {
        setInsuranceName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyInsuranceRecord value4(String value) {
        setInsuranceType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyInsuranceRecord value5(String value) {
        setBeneficiary(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyInsuranceRecord value6(BigDecimal value) {
        setInsuranceAmt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyInsuranceRecord value7(String value) {
        setInsuranceTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyInsuranceRecord value8(String value) {
        setInsuranceDuetime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyInsuranceRecord value9(Short value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyInsuranceRecord value10(BigDecimal value) {
        setCreateUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyInsuranceRecord value11(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyInsuranceRecord value12(BigDecimal value) {
        setUpdateUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyInsuranceRecord value13(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyInsuranceRecord value14(BigDecimal value) {
        setInsurancePay(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyInsuranceRecord value15(BigDecimal... value) {
        setInsuranceImg(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillageCompanyInsuranceRecord values(BigDecimal value1, BigDecimal value2, String value3, String value4, String value5, BigDecimal value6, String value7, String value8, Short value9, BigDecimal value10, Timestamp value11, BigDecimal value12, Timestamp value13, BigDecimal value14, BigDecimal[] value15) {
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
        value13(value13);
        value14(value14);
        value15(value15);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TVillageCompanyInsuranceRecord
     */
    public TVillageCompanyInsuranceRecord() {
        super(TVillageCompanyInsurance.T_VILLAGE_COMPANY_INSURANCE);
    }

    /**
     * Create a detached, initialised TVillageCompanyInsuranceRecord
     */
    public TVillageCompanyInsuranceRecord(BigDecimal id, BigDecimal villageCompanyInfoId, String insuranceName, String insuranceType, String beneficiary, BigDecimal insuranceAmt, String insuranceTime, String insuranceDuetime, Short status, BigDecimal createUser, Timestamp createTime, BigDecimal updateUser, Timestamp updateTime, BigDecimal insurancePay, BigDecimal[] insuranceImg) {
        super(TVillageCompanyInsurance.T_VILLAGE_COMPANY_INSURANCE);

        set(0, id);
        set(1, villageCompanyInfoId);
        set(2, insuranceName);
        set(3, insuranceType);
        set(4, beneficiary);
        set(5, insuranceAmt);
        set(6, insuranceTime);
        set(7, insuranceDuetime);
        set(8, status);
        set(9, createUser);
        set(10, createTime);
        set(11, updateUser);
        set(12, updateTime);
        set(13, insurancePay);
        set(14, insuranceImg);
    }
}
