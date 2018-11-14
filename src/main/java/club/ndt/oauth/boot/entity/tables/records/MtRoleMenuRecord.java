/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.records;


import com.ndt.sms.entity.tables.MtRoleMenu;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 角色菜单中间表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MtRoleMenuRecord extends UpdatableRecordImpl<MtRoleMenuRecord> implements Record3<BigDecimal, BigDecimal, BigDecimal> {

    private static final long serialVersionUID = 655730037;

    /**
     * Setter for <code>ndt.mt_role_menu.id</code>.
     */
    public MtRoleMenuRecord setId(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.mt_role_menu.id</code>.
     */
    public BigDecimal getId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>ndt.mt_role_menu.role_id</code>. 角色ID
     */
    public MtRoleMenuRecord setRoleId(BigDecimal value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.mt_role_menu.role_id</code>. 角色ID
     */
    public BigDecimal getRoleId() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>ndt.mt_role_menu.menu_id</code>. 菜单ID
     */
    public MtRoleMenuRecord setMenuId(BigDecimal value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.mt_role_menu.menu_id</code>. 菜单ID
     */
    public BigDecimal getMenuId() {
        return (BigDecimal) get(2);
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
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<BigDecimal, BigDecimal, BigDecimal> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<BigDecimal, BigDecimal, BigDecimal> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field1() {
        return MtRoleMenu.MT_ROLE_MENU.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field2() {
        return MtRoleMenu.MT_ROLE_MENU.ROLE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field3() {
        return MtRoleMenu.MT_ROLE_MENU.MENU_ID;
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
        return getRoleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component3() {
        return getMenuId();
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
        return getRoleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value3() {
        return getMenuId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MtRoleMenuRecord value1(BigDecimal value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MtRoleMenuRecord value2(BigDecimal value) {
        setRoleId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MtRoleMenuRecord value3(BigDecimal value) {
        setMenuId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MtRoleMenuRecord values(BigDecimal value1, BigDecimal value2, BigDecimal value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MtRoleMenuRecord
     */
    public MtRoleMenuRecord() {
        super(MtRoleMenu.MT_ROLE_MENU);
    }

    /**
     * Create a detached, initialised MtRoleMenuRecord
     */
    public MtRoleMenuRecord(BigDecimal id, BigDecimal roleId, BigDecimal menuId) {
        super(MtRoleMenu.MT_ROLE_MENU);

        set(0, id);
        set(1, roleId);
        set(2, menuId);
    }
}