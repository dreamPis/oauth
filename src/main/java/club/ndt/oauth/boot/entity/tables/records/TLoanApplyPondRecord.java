/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables.records;


import club.ndt.oauth.boot.entity.tables.TLoanApplyPond;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TLoanApplyPondRecord extends UpdatableRecordImpl<TLoanApplyPondRecord> implements Record9<BigDecimal, String, Integer, BigDecimal, String, String, Timestamp, String, String> {

    private static final long serialVersionUID = 990727601;

    /**
     * Setter for <code>ndt.t_loan_apply_pond.id</code>. 主键
     */
    public TLoanApplyPondRecord setId(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_loan_apply_pond.id</code>. 主键
     */
    public BigDecimal getId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>ndt.t_loan_apply_pond.name</code>. 姓名
     */
    public TLoanApplyPondRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_loan_apply_pond.name</code>. 姓名
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ndt.t_loan_apply_pond.type</code>. 贷款类型(参照码表27)
     */
    public TLoanApplyPondRecord setType(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_loan_apply_pond.type</code>. 贷款类型(参照码表27)
     */
    public Integer getType() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>ndt.t_loan_apply_pond.amount</code>. 金额
     */
    public TLoanApplyPondRecord setAmount(BigDecimal value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_loan_apply_pond.amount</code>. 金额
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>ndt.t_loan_apply_pond.code</code>. 社会信用代码/身份证号码
     */
    public TLoanApplyPondRecord setCode(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_loan_apply_pond.code</code>. 社会信用代码/身份证号码
     */
    public String getCode() {
        return (String) get(4);
    }

    /**
     * Setter for <code>ndt.t_loan_apply_pond.phone</code>. 电话号码
     */
    public TLoanApplyPondRecord setPhone(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_loan_apply_pond.phone</code>. 电话号码
     */
    public String getPhone() {
        return (String) get(5);
    }

    /**
     * Setter for <code>ndt.t_loan_apply_pond.apply_date</code>. 时间
     */
    public TLoanApplyPondRecord setApplyDate(Timestamp value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_loan_apply_pond.apply_date</code>. 时间
     */
    public Timestamp getApplyDate() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>ndt.t_loan_apply_pond.address</code>. 联系地址
     */
    public TLoanApplyPondRecord setAddress(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_loan_apply_pond.address</code>. 联系地址
     */
    public String getAddress() {
        return (String) get(7);
    }

    /**
     * Setter for <code>ndt.t_loan_apply_pond.bank_name</code>. 意向银行
     */
    public TLoanApplyPondRecord setBankName(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_loan_apply_pond.bank_name</code>. 意向银行
     */
    public String getBankName() {
        return (String) get(8);
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
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<BigDecimal, String, Integer, BigDecimal, String, String, Timestamp, String, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<BigDecimal, String, Integer, BigDecimal, String, String, Timestamp, String, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field1() {
        return TLoanApplyPond.T_LOAN_APPLY_POND.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TLoanApplyPond.T_LOAN_APPLY_POND.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TLoanApplyPond.T_LOAN_APPLY_POND.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return TLoanApplyPond.T_LOAN_APPLY_POND.AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TLoanApplyPond.T_LOAN_APPLY_POND.CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TLoanApplyPond.T_LOAN_APPLY_POND.PHONE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return TLoanApplyPond.T_LOAN_APPLY_POND.APPLY_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return TLoanApplyPond.T_LOAN_APPLY_POND.ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return TLoanApplyPond.T_LOAN_APPLY_POND.BANK_NAME;
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
    public Integer component3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component4() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getCode();
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
    public Timestamp component7() {
        return getApplyDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getBankName();
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
    public Integer value3() {
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getCode();
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
    public Timestamp value7() {
        return getApplyDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getBankName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TLoanApplyPondRecord value1(BigDecimal value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TLoanApplyPondRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TLoanApplyPondRecord value3(Integer value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TLoanApplyPondRecord value4(BigDecimal value) {
        setAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TLoanApplyPondRecord value5(String value) {
        setCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TLoanApplyPondRecord value6(String value) {
        setPhone(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TLoanApplyPondRecord value7(Timestamp value) {
        setApplyDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TLoanApplyPondRecord value8(String value) {
        setAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TLoanApplyPondRecord value9(String value) {
        setBankName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TLoanApplyPondRecord values(BigDecimal value1, String value2, Integer value3, BigDecimal value4, String value5, String value6, Timestamp value7, String value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TLoanApplyPondRecord
     */
    public TLoanApplyPondRecord() {
        super(TLoanApplyPond.T_LOAN_APPLY_POND);
    }

    /**
     * Create a detached, initialised TLoanApplyPondRecord
     */
    public TLoanApplyPondRecord(BigDecimal id, String name, Integer type, BigDecimal amount, String code, String phone, Timestamp applyDate, String address, String bankName) {
        super(TLoanApplyPond.T_LOAN_APPLY_POND);

        set(0, id);
        set(1, name);
        set(2, type);
        set(3, amount);
        set(4, code);
        set(5, phone);
        set(6, applyDate);
        set(7, address);
        set(8, bankName);
    }
}
