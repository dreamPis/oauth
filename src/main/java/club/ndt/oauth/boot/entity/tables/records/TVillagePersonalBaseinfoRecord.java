/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables.records;


import club.ndt.oauth.boot.entity.tables.TVillagePersonalBaseinfo;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record21;
import org.jooq.Row21;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 农业信用基础信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TVillagePersonalBaseinfoRecord extends UpdatableRecordImpl<TVillagePersonalBaseinfoRecord> implements Record21<BigDecimal, String, Short, Integer, String, String, String, Integer, String, Integer, Integer, Integer, Integer, Integer, Integer, Short, BigDecimal, Timestamp, BigDecimal, Timestamp, BigDecimal> {

    private static final long serialVersionUID = 521943834;

    /**
     * Setter for <code>ndt.t_village_personal_baseinfo.id</code>.
     */
    public TVillagePersonalBaseinfoRecord setId(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_baseinfo.id</code>.
     */
    public BigDecimal getId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>ndt.t_village_personal_baseinfo.name</code>. 姓名
     */
    public TVillagePersonalBaseinfoRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_baseinfo.name</code>. 姓名
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ndt.t_village_personal_baseinfo.gender</code>. 性别，参考码表1
     */
    public TVillagePersonalBaseinfoRecord setGender(Short value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_baseinfo.gender</code>. 性别，参考码表1
     */
    public Short getGender() {
        return (Short) get(2);
    }

    /**
     * Setter for <code>ndt.t_village_personal_baseinfo.marital_status</code>. 婚姻状态
     */
    public TVillagePersonalBaseinfoRecord setMaritalStatus(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_baseinfo.marital_status</code>. 婚姻状态
     */
    public Integer getMaritalStatus() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>ndt.t_village_personal_baseinfo.birth</code>. 出生年月
     */
    public TVillagePersonalBaseinfoRecord setBirth(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_baseinfo.birth</code>. 出生年月
     */
    public String getBirth() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ndt.t_village_personal_baseinfo.phone</code>. 联系电话
     */
    public TVillagePersonalBaseinfoRecord setPhone(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_baseinfo.phone</code>. 联系电话
     */
    public String getPhone() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ndt.t_village_personal_baseinfo.address</code>. 居住地址
     */
    public TVillagePersonalBaseinfoRecord setAddress(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_baseinfo.address</code>. 居住地址
     */
    public String getAddress() {
        return (String) get(6);
    }

    /**
     * Setter for <code>ndt.t_village_personal_baseinfo.papers_type</code>. 证件类型，参考码表46
     */
    public TVillagePersonalBaseinfoRecord setPapersType(Integer value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_baseinfo.papers_type</code>. 证件类型，参考码表46
     */
    public Integer getPapersType() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>ndt.t_village_personal_baseinfo.papers_id</code>. 证件号码
     */
    public TVillagePersonalBaseinfoRecord setPapersId(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_baseinfo.papers_id</code>. 证件号码
     */
    public String getPapersId() {
        return (String) get(8);
    }

    /**
     * Setter for <code>ndt.t_village_personal_baseinfo.working_type</code>. 生产经营类型，参考码表47
     */
    public TVillagePersonalBaseinfoRecord setWorkingType(Integer value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_baseinfo.working_type</code>. 生产经营类型，参考码表47
     */
    public Integer getWorkingType() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>ndt.t_village_personal_baseinfo.operating_area</code>. 流转经营面积(亩)
     */
    public TVillagePersonalBaseinfoRecord setOperatingArea(Integer value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_baseinfo.operating_area</code>. 流转经营面积(亩)
     */
    public Integer getOperatingArea() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>ndt.t_village_personal_baseinfo.breeding_number</code>. 养殖数量(只/头)
     */
    public TVillagePersonalBaseinfoRecord setBreedingNumber(Integer value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_baseinfo.breeding_number</code>. 养殖数量(只/头)
     */
    public Integer getBreedingNumber() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>ndt.t_village_personal_baseinfo.machine_number</code>. 农机数量(台)
     */
    public TVillagePersonalBaseinfoRecord setMachineNumber(Integer value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_baseinfo.machine_number</code>. 农机数量(台)
     */
    public Integer getMachineNumber() {
        return (Integer) get(12);
    }

    /**
     * Setter for <code>ndt.t_village_personal_baseinfo.manager_level</code>. 农业职业经理人等级，参考码表48
     */
    public TVillagePersonalBaseinfoRecord setManagerLevel(Integer value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_baseinfo.manager_level</code>. 农业职业经理人等级，参考码表48
     */
    public Integer getManagerLevel() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>ndt.t_village_personal_baseinfo.personal_liability_amount</code>. 个人负债金额（万）
     */
    public TVillagePersonalBaseinfoRecord setPersonalLiabilityAmount(Integer value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_baseinfo.personal_liability_amount</code>. 个人负债金额（万）
     */
    public Integer getPersonalLiabilityAmount() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>ndt.t_village_personal_baseinfo.status</code>.
     */
    public TVillagePersonalBaseinfoRecord setStatus(Short value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_baseinfo.status</code>.
     */
    public Short getStatus() {
        return (Short) get(15);
    }

    /**
     * Setter for <code>ndt.t_village_personal_baseinfo.create_user</code>.
     */
    public TVillagePersonalBaseinfoRecord setCreateUser(BigDecimal value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_baseinfo.create_user</code>.
     */
    public BigDecimal getCreateUser() {
        return (BigDecimal) get(16);
    }

    /**
     * Setter for <code>ndt.t_village_personal_baseinfo.create_time</code>.
     */
    public TVillagePersonalBaseinfoRecord setCreateTime(Timestamp value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_baseinfo.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(17);
    }

    /**
     * Setter for <code>ndt.t_village_personal_baseinfo.update_user</code>.
     */
    public TVillagePersonalBaseinfoRecord setUpdateUser(BigDecimal value) {
        set(18, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_baseinfo.update_user</code>.
     */
    public BigDecimal getUpdateUser() {
        return (BigDecimal) get(18);
    }

    /**
     * Setter for <code>ndt.t_village_personal_baseinfo.update_time</code>.
     */
    public TVillagePersonalBaseinfoRecord setUpdateTime(Timestamp value) {
        set(19, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_baseinfo.update_time</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(19);
    }

    /**
     * Setter for <code>ndt.t_village_personal_baseinfo.division_id</code>. 区域id
     */
    public TVillagePersonalBaseinfoRecord setDivisionId(BigDecimal value) {
        set(20, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_baseinfo.division_id</code>. 区域id
     */
    public BigDecimal getDivisionId() {
        return (BigDecimal) get(20);
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
    // Record21 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row21<BigDecimal, String, Short, Integer, String, String, String, Integer, String, Integer, Integer, Integer, Integer, Integer, Integer, Short, BigDecimal, Timestamp, BigDecimal, Timestamp, BigDecimal> fieldsRow() {
        return (Row21) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row21<BigDecimal, String, Short, Integer, String, String, String, Integer, String, Integer, Integer, Integer, Integer, Integer, Integer, Short, BigDecimal, Timestamp, BigDecimal, Timestamp, BigDecimal> valuesRow() {
        return (Row21) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field1() {
        return TVillagePersonalBaseinfo.T_VILLAGE_PERSONAL_BASEINFO.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TVillagePersonalBaseinfo.T_VILLAGE_PERSONAL_BASEINFO.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field3() {
        return TVillagePersonalBaseinfo.T_VILLAGE_PERSONAL_BASEINFO.GENDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return TVillagePersonalBaseinfo.T_VILLAGE_PERSONAL_BASEINFO.MARITAL_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TVillagePersonalBaseinfo.T_VILLAGE_PERSONAL_BASEINFO.BIRTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TVillagePersonalBaseinfo.T_VILLAGE_PERSONAL_BASEINFO.PHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TVillagePersonalBaseinfo.T_VILLAGE_PERSONAL_BASEINFO.ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return TVillagePersonalBaseinfo.T_VILLAGE_PERSONAL_BASEINFO.PAPERS_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return TVillagePersonalBaseinfo.T_VILLAGE_PERSONAL_BASEINFO.PAPERS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return TVillagePersonalBaseinfo.T_VILLAGE_PERSONAL_BASEINFO.WORKING_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return TVillagePersonalBaseinfo.T_VILLAGE_PERSONAL_BASEINFO.OPERATING_AREA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return TVillagePersonalBaseinfo.T_VILLAGE_PERSONAL_BASEINFO.BREEDING_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field13() {
        return TVillagePersonalBaseinfo.T_VILLAGE_PERSONAL_BASEINFO.MACHINE_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field14() {
        return TVillagePersonalBaseinfo.T_VILLAGE_PERSONAL_BASEINFO.MANAGER_LEVEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field15() {
        return TVillagePersonalBaseinfo.T_VILLAGE_PERSONAL_BASEINFO.PERSONAL_LIABILITY_AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field16() {
        return TVillagePersonalBaseinfo.T_VILLAGE_PERSONAL_BASEINFO.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field17() {
        return TVillagePersonalBaseinfo.T_VILLAGE_PERSONAL_BASEINFO.CREATE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field18() {
        return TVillagePersonalBaseinfo.T_VILLAGE_PERSONAL_BASEINFO.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field19() {
        return TVillagePersonalBaseinfo.T_VILLAGE_PERSONAL_BASEINFO.UPDATE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field20() {
        return TVillagePersonalBaseinfo.T_VILLAGE_PERSONAL_BASEINFO.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field21() {
        return TVillagePersonalBaseinfo.T_VILLAGE_PERSONAL_BASEINFO.DIVISION_ID;
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
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component3() {
        return getGender();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getMaritalStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getBirth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getPapersType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getPapersId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getWorkingType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component11() {
        return getOperatingArea();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component12() {
        return getBreedingNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component13() {
        return getMachineNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component14() {
        return getManagerLevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component15() {
        return getPersonalLiabilityAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component16() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component17() {
        return getCreateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component18() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component19() {
        return getUpdateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component20() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component21() {
        return getDivisionId();
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
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value3() {
        return getGender();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getMaritalStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getBirth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getPhone();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getPapersType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getPapersId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getWorkingType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getOperatingArea();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getBreedingNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value13() {
        return getMachineNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value14() {
        return getManagerLevel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value15() {
        return getPersonalLiabilityAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value16() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value17() {
        return getCreateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value18() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value19() {
        return getUpdateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value20() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value21() {
        return getDivisionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalBaseinfoRecord value1(BigDecimal value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalBaseinfoRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalBaseinfoRecord value3(Short value) {
        setGender(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalBaseinfoRecord value4(Integer value) {
        setMaritalStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalBaseinfoRecord value5(String value) {
        setBirth(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalBaseinfoRecord value6(String value) {
        setPhone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalBaseinfoRecord value7(String value) {
        setAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalBaseinfoRecord value8(Integer value) {
        setPapersType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalBaseinfoRecord value9(String value) {
        setPapersId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalBaseinfoRecord value10(Integer value) {
        setWorkingType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalBaseinfoRecord value11(Integer value) {
        setOperatingArea(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalBaseinfoRecord value12(Integer value) {
        setBreedingNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalBaseinfoRecord value13(Integer value) {
        setMachineNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalBaseinfoRecord value14(Integer value) {
        setManagerLevel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalBaseinfoRecord value15(Integer value) {
        setPersonalLiabilityAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalBaseinfoRecord value16(Short value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalBaseinfoRecord value17(BigDecimal value) {
        setCreateUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalBaseinfoRecord value18(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalBaseinfoRecord value19(BigDecimal value) {
        setUpdateUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalBaseinfoRecord value20(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalBaseinfoRecord value21(BigDecimal value) {
        setDivisionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalBaseinfoRecord values(BigDecimal value1, String value2, Short value3, Integer value4, String value5, String value6, String value7, Integer value8, String value9, Integer value10, Integer value11, Integer value12, Integer value13, Integer value14, Integer value15, Short value16, BigDecimal value17, Timestamp value18, BigDecimal value19, Timestamp value20, BigDecimal value21) {
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
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TVillagePersonalBaseinfoRecord
     */
    public TVillagePersonalBaseinfoRecord() {
        super(TVillagePersonalBaseinfo.T_VILLAGE_PERSONAL_BASEINFO);
    }

    /**
     * Create a detached, initialised TVillagePersonalBaseinfoRecord
     */
    public TVillagePersonalBaseinfoRecord(BigDecimal id, String name, Short gender, Integer maritalStatus, String birth, String phone, String address, Integer papersType, String papersId, Integer workingType, Integer operatingArea, Integer breedingNumber, Integer machineNumber, Integer managerLevel, Integer personalLiabilityAmount, Short status, BigDecimal createUser, Timestamp createTime, BigDecimal updateUser, Timestamp updateTime, BigDecimal divisionId) {
        super(TVillagePersonalBaseinfo.T_VILLAGE_PERSONAL_BASEINFO);

        set(0, id);
        set(1, name);
        set(2, gender);
        set(3, maritalStatus);
        set(4, birth);
        set(5, phone);
        set(6, address);
        set(7, papersType);
        set(8, papersId);
        set(9, workingType);
        set(10, operatingArea);
        set(11, breedingNumber);
        set(12, machineNumber);
        set(13, managerLevel);
        set(14, personalLiabilityAmount);
        set(15, status);
        set(16, createUser);
        set(17, createTime);
        set(18, updateUser);
        set(19, updateTime);
        set(20, divisionId);
    }
}
