/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables.records;


import club.ndt.oauth.boot.entity.tables.TNationalDebtTerm;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 国债产品期限
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TNationalDebtTermRecord extends UpdatableRecordImpl<TNationalDebtTermRecord> implements Record7<BigDecimal, BigDecimal, Integer, Integer, Integer, Integer, String> {

    private static final long serialVersionUID = -737508595;

    /**
     * Setter for <code>ndt.t_national_debt_term.id</code>.
     */
    public TNationalDebtTermRecord setId(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_national_debt_term.id</code>.
     */
    public BigDecimal getId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>ndt.t_national_debt_term.product_id</code>. 国债产品id
     */
    public TNationalDebtTermRecord setProductId(BigDecimal value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_national_debt_term.product_id</code>. 国债产品id
     */
    public BigDecimal getProductId() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>ndt.t_national_debt_term.issue_period</code>. 发行年限1年,3年...
     */
    public TNationalDebtTermRecord setIssuePeriod(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_national_debt_term.issue_period</code>. 发行年限1年,3年...
     */
    public Integer getIssuePeriod() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>ndt.t_national_debt_term.amount</code>. 发行总数量
     */
    public TNationalDebtTermRecord setAmount(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_national_debt_term.amount</code>. 发行总数量
     */
    public Integer getAmount() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>ndt.t_national_debt_term.single_buy_sum</code>. 单笔购买最大数量,预留字段
     */
    public TNationalDebtTermRecord setSingleBuySum(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_national_debt_term.single_buy_sum</code>. 单笔购买最大数量,预留字段
     */
    public Integer getSingleBuySum() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>ndt.t_national_debt_term.amount_balance</code>. 剩余总量
     */
    public TNationalDebtTermRecord setAmountBalance(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_national_debt_term.amount_balance</code>. 剩余总量
     */
    public Integer getAmountBalance() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>ndt.t_national_debt_term.annual_interest_rate</code>. 年利率
     */
    public TNationalDebtTermRecord setAnnualInterestRate(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_national_debt_term.annual_interest_rate</code>. 年利率
     */
    public String getAnnualInterestRate() {
        return (String) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<BigDecimal, BigDecimal, Integer, Integer, Integer, Integer, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<BigDecimal, BigDecimal, Integer, Integer, Integer, Integer, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field1() {
        return TNationalDebtTerm.T_NATIONAL_DEBT_TERM.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field2() {
        return TNationalDebtTerm.T_NATIONAL_DEBT_TERM.PRODUCT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TNationalDebtTerm.T_NATIONAL_DEBT_TERM.ISSUE_PERIOD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return TNationalDebtTerm.T_NATIONAL_DEBT_TERM.AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return TNationalDebtTerm.T_NATIONAL_DEBT_TERM.SINGLE_BUY_SUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return TNationalDebtTerm.T_NATIONAL_DEBT_TERM.AMOUNT_BALANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TNationalDebtTerm.T_NATIONAL_DEBT_TERM.ANNUAL_INTEREST_RATE;
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
        return getProductId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getIssuePeriod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getSingleBuySum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getAmountBalance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getAnnualInterestRate();
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
        return getProductId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getIssuePeriod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getSingleBuySum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getAmountBalance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getAnnualInterestRate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNationalDebtTermRecord value1(BigDecimal value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNationalDebtTermRecord value2(BigDecimal value) {
        setProductId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNationalDebtTermRecord value3(Integer value) {
        setIssuePeriod(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNationalDebtTermRecord value4(Integer value) {
        setAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNationalDebtTermRecord value5(Integer value) {
        setSingleBuySum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNationalDebtTermRecord value6(Integer value) {
        setAmountBalance(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNationalDebtTermRecord value7(String value) {
        setAnnualInterestRate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TNationalDebtTermRecord values(BigDecimal value1, BigDecimal value2, Integer value3, Integer value4, Integer value5, Integer value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TNationalDebtTermRecord
     */
    public TNationalDebtTermRecord() {
        super(TNationalDebtTerm.T_NATIONAL_DEBT_TERM);
    }

    /**
     * Create a detached, initialised TNationalDebtTermRecord
     */
    public TNationalDebtTermRecord(BigDecimal id, BigDecimal productId, Integer issuePeriod, Integer amount, Integer singleBuySum, Integer amountBalance, String annualInterestRate) {
        super(TNationalDebtTerm.T_NATIONAL_DEBT_TERM);

        set(0, id);
        set(1, productId);
        set(2, issuePeriod);
        set(3, amount);
        set(4, singleBuySum);
        set(5, amountBalance);
        set(6, annualInterestRate);
    }
}
