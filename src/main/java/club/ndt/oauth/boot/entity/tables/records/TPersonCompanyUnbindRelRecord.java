/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables.records;


import club.ndt.oauth.boot.entity.tables.TPersonCompanyUnbindRel;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 个人公司账号绑定表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TPersonCompanyUnbindRelRecord extends UpdatableRecordImpl<TPersonCompanyUnbindRelRecord> implements Record5<BigDecimal, BigDecimal, BigDecimal, Short, Timestamp> {

    private static final long serialVersionUID = -627548870;

    /**
     * Setter for <code>ndt.t_person_company_unbind_rel.user_id</code>. 用户ID
     */
    public TPersonCompanyUnbindRelRecord setUserId(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_person_company_unbind_rel.user_id</code>. 用户ID
     */
    public BigDecimal getUserId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>ndt.t_person_company_unbind_rel.company_id</code>. 公司ID
     */
    public TPersonCompanyUnbindRelRecord setCompanyId(BigDecimal value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_person_company_unbind_rel.company_id</code>. 公司ID
     */
    public BigDecimal getCompanyId() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>ndt.t_person_company_unbind_rel.id</code>. 主键
     */
    public TPersonCompanyUnbindRelRecord setId(BigDecimal value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_person_company_unbind_rel.id</code>. 主键
     */
    public BigDecimal getId() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for <code>ndt.t_person_company_unbind_rel.is_legal_person</code>. 是否法人(1、是，2、否)
     */
    public TPersonCompanyUnbindRelRecord setIsLegalPerson(Short value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_person_company_unbind_rel.is_legal_person</code>. 是否法人(1、是，2、否)
     */
    public Short getIsLegalPerson() {
        return (Short) get(3);
    }

    /**
     * Setter for <code>ndt.t_person_company_unbind_rel.unbind_date</code>. 绑定时间
     */
    public TPersonCompanyUnbindRelRecord setUnbindDate(Timestamp value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_person_company_unbind_rel.unbind_date</code>. 绑定时间
     */
    public Timestamp getUnbindDate() {
        return (Timestamp) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<BigDecimal, BigDecimal, BigDecimal, Short, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<BigDecimal, BigDecimal, BigDecimal, Short, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field1() {
        return TPersonCompanyUnbindRel.T_PERSON_COMPANY_UNBIND_REL.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field2() {
        return TPersonCompanyUnbindRel.T_PERSON_COMPANY_UNBIND_REL.COMPANY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field3() {
        return TPersonCompanyUnbindRel.T_PERSON_COMPANY_UNBIND_REL.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field4() {
        return TPersonCompanyUnbindRel.T_PERSON_COMPANY_UNBIND_REL.IS_LEGAL_PERSON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return TPersonCompanyUnbindRel.T_PERSON_COMPANY_UNBIND_REL.UNBIND_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component1() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component2() {
        return getCompanyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component3() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component4() {
        return getIsLegalPerson();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getUnbindDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value1() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value2() {
        return getCompanyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value3() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value4() {
        return getIsLegalPerson();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getUnbindDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPersonCompanyUnbindRelRecord value1(BigDecimal value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPersonCompanyUnbindRelRecord value2(BigDecimal value) {
        setCompanyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPersonCompanyUnbindRelRecord value3(BigDecimal value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPersonCompanyUnbindRelRecord value4(Short value) {
        setIsLegalPerson(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPersonCompanyUnbindRelRecord value5(Timestamp value) {
        setUnbindDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPersonCompanyUnbindRelRecord values(BigDecimal value1, BigDecimal value2, BigDecimal value3, Short value4, Timestamp value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TPersonCompanyUnbindRelRecord
     */
    public TPersonCompanyUnbindRelRecord() {
        super(TPersonCompanyUnbindRel.T_PERSON_COMPANY_UNBIND_REL);
    }

    /**
     * Create a detached, initialised TPersonCompanyUnbindRelRecord
     */
    public TPersonCompanyUnbindRelRecord(BigDecimal userId, BigDecimal companyId, BigDecimal id, Short isLegalPerson, Timestamp unbindDate) {
        super(TPersonCompanyUnbindRel.T_PERSON_COMPANY_UNBIND_REL);

        set(0, userId);
        set(1, companyId);
        set(2, id);
        set(3, isLegalPerson);
        set(4, unbindDate);
    }
}
