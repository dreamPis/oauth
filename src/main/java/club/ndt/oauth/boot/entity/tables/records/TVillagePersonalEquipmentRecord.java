/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.records;


import com.ndt.sms.entity.tables.TVillagePersonalEquipment;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 设备信息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TVillagePersonalEquipmentRecord extends UpdatableRecordImpl<TVillagePersonalEquipmentRecord> implements Record10<BigDecimal, BigDecimal, String, BigDecimal, String, Short, BigDecimal, Timestamp, BigDecimal, Timestamp> {

    private static final long serialVersionUID = -142927885;

    /**
     * Setter for <code>ndt.t_village_personal_equipment.id</code>.
     */
    public TVillagePersonalEquipmentRecord setId(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_equipment.id</code>.
     */
    public BigDecimal getId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>ndt.t_village_personal_equipment.baseinfo_id</code>. 对应用户基本信息id
     */
    public TVillagePersonalEquipmentRecord setBaseinfoId(BigDecimal value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_equipment.baseinfo_id</code>. 对应用户基本信息id
     */
    public BigDecimal getBaseinfoId() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>ndt.t_village_personal_equipment.equipment_type</code>. 生产及运输设备种类
     */
    public TVillagePersonalEquipmentRecord setEquipmentType(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_equipment.equipment_type</code>. 生产及运输设备种类
     */
    public String getEquipmentType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>ndt.t_village_personal_equipment.equipment_amount</code>. 购进价格
     */
    public TVillagePersonalEquipmentRecord setEquipmentAmount(BigDecimal value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_equipment.equipment_amount</code>. 购进价格
     */
    public BigDecimal getEquipmentAmount() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>ndt.t_village_personal_equipment.buy_equipment_time</code>. 购进年月
     */
    public TVillagePersonalEquipmentRecord setBuyEquipmentTime(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_equipment.buy_equipment_time</code>. 购进年月
     */
    public String getBuyEquipmentTime() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ndt.t_village_personal_equipment.status</code>.
     */
    public TVillagePersonalEquipmentRecord setStatus(Short value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_equipment.status</code>.
     */
    public Short getStatus() {
        return (Short) get(5);
    }

    /**
     * Setter for <code>ndt.t_village_personal_equipment.create_user</code>.
     */
    public TVillagePersonalEquipmentRecord setCreateUser(BigDecimal value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_equipment.create_user</code>.
     */
    public BigDecimal getCreateUser() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>ndt.t_village_personal_equipment.create_time</code>.
     */
    public TVillagePersonalEquipmentRecord setCreateTime(Timestamp value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_equipment.create_time</code>.
     */
    public Timestamp getCreateTime() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>ndt.t_village_personal_equipment.update_user</code>.
     */
    public TVillagePersonalEquipmentRecord setUpdateUser(BigDecimal value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_equipment.update_user</code>.
     */
    public BigDecimal getUpdateUser() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>ndt.t_village_personal_equipment.update_time</code>.
     */
    public TVillagePersonalEquipmentRecord setUpdateTime(Timestamp value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_village_personal_equipment.update_time</code>.
     */
    public Timestamp getUpdateTime() {
        return (Timestamp) get(9);
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
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<BigDecimal, BigDecimal, String, BigDecimal, String, Short, BigDecimal, Timestamp, BigDecimal, Timestamp> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<BigDecimal, BigDecimal, String, BigDecimal, String, Short, BigDecimal, Timestamp, BigDecimal, Timestamp> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field1() {
        return TVillagePersonalEquipment.T_VILLAGE_PERSONAL_EQUIPMENT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field2() {
        return TVillagePersonalEquipment.T_VILLAGE_PERSONAL_EQUIPMENT.BASEINFO_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TVillagePersonalEquipment.T_VILLAGE_PERSONAL_EQUIPMENT.EQUIPMENT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return TVillagePersonalEquipment.T_VILLAGE_PERSONAL_EQUIPMENT.EQUIPMENT_AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TVillagePersonalEquipment.T_VILLAGE_PERSONAL_EQUIPMENT.BUY_EQUIPMENT_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field6() {
        return TVillagePersonalEquipment.T_VILLAGE_PERSONAL_EQUIPMENT.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field7() {
        return TVillagePersonalEquipment.T_VILLAGE_PERSONAL_EQUIPMENT.CREATE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return TVillagePersonalEquipment.T_VILLAGE_PERSONAL_EQUIPMENT.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field9() {
        return TVillagePersonalEquipment.T_VILLAGE_PERSONAL_EQUIPMENT.UPDATE_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field10() {
        return TVillagePersonalEquipment.T_VILLAGE_PERSONAL_EQUIPMENT.UPDATE_TIME;
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
        return getBaseinfoId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getEquipmentType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component4() {
        return getEquipmentAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getBuyEquipmentTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component6() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component7() {
        return getCreateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component9() {
        return getUpdateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component10() {
        return getUpdateTime();
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
        return getBaseinfoId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getEquipmentType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getEquipmentAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getBuyEquipmentTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value6() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value7() {
        return getCreateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value9() {
        return getUpdateUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value10() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalEquipmentRecord value1(BigDecimal value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalEquipmentRecord value2(BigDecimal value) {
        setBaseinfoId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalEquipmentRecord value3(String value) {
        setEquipmentType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalEquipmentRecord value4(BigDecimal value) {
        setEquipmentAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalEquipmentRecord value5(String value) {
        setBuyEquipmentTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalEquipmentRecord value6(Short value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalEquipmentRecord value7(BigDecimal value) {
        setCreateUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalEquipmentRecord value8(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalEquipmentRecord value9(BigDecimal value) {
        setUpdateUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalEquipmentRecord value10(Timestamp value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TVillagePersonalEquipmentRecord values(BigDecimal value1, BigDecimal value2, String value3, BigDecimal value4, String value5, Short value6, BigDecimal value7, Timestamp value8, BigDecimal value9, Timestamp value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TVillagePersonalEquipmentRecord
     */
    public TVillagePersonalEquipmentRecord() {
        super(TVillagePersonalEquipment.T_VILLAGE_PERSONAL_EQUIPMENT);
    }

    /**
     * Create a detached, initialised TVillagePersonalEquipmentRecord
     */
    public TVillagePersonalEquipmentRecord(BigDecimal id, BigDecimal baseinfoId, String equipmentType, BigDecimal equipmentAmount, String buyEquipmentTime, Short status, BigDecimal createUser, Timestamp createTime, BigDecimal updateUser, Timestamp updateTime) {
        super(TVillagePersonalEquipment.T_VILLAGE_PERSONAL_EQUIPMENT);

        set(0, id);
        set(1, baseinfoId);
        set(2, equipmentType);
        set(3, equipmentAmount);
        set(4, buyEquipmentTime);
        set(5, status);
        set(6, createUser);
        set(7, createTime);
        set(8, updateUser);
        set(9, updateTime);
    }
}