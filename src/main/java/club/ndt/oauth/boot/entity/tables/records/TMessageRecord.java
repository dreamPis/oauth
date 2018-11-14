/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables.records;


import club.ndt.oauth.boot.entity.tables.TMessage;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 消息表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TMessageRecord extends UpdatableRecordImpl<TMessageRecord> implements Record10<BigDecimal, String, Timestamp, Integer, Integer, Integer[], Integer, BigDecimal, Timestamp, Short> {

    private static final long serialVersionUID = -521529648;

    /**
     * Setter for <code>ndt.t_message.id</code>.
     */
    public TMessageRecord setId(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_message.id</code>.
     */
    public BigDecimal getId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>ndt.t_message.content</code>. 消息内容
     */
    public TMessageRecord setContent(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_message.content</code>. 消息内容
     */
    public String getContent() {
        return (String) get(1);
    }

    /**
     * Setter for <code>ndt.t_message.send_time</code>. 发送时间
     */
    public TMessageRecord setSendTime(Timestamp value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_message.send_time</code>. 发送时间
     */
    public Timestamp getSendTime() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>ndt.t_message.message_type</code>. 消息类型
     */
    public TMessageRecord setMessageType(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_message.message_type</code>. 消息类型
     */
    public Integer getMessageType() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>ndt.t_message.priority</code>. 优先级
     */
    public TMessageRecord setPriority(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_message.priority</code>. 优先级
     */
    public Integer getPriority() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>ndt.t_message.channel</code>. 下发渠道
     */
    public TMessageRecord setChannel(Integer... value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_message.channel</code>. 下发渠道
     */
    public Integer[] getChannel() {
        return (Integer[]) get(5);
    }

    /**
     * Setter for <code>ndt.t_message.state</code>. 处理结果
     */
    public TMessageRecord setState(Integer value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_message.state</code>. 处理结果
     */
    public Integer getState() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>ndt.t_message.create_by</code>. 创建人
     */
    public TMessageRecord setCreateBy(BigDecimal value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_message.create_by</code>. 创建人
     */
    public BigDecimal getCreateBy() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>ndt.t_message.create_at</code>. 创建时间
     */
    public TMessageRecord setCreateAt(Timestamp value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_message.create_at</code>. 创建时间
     */
    public Timestamp getCreateAt() {
        return (Timestamp) get(8);
    }

    /**
     * Setter for <code>ndt.t_message.status</code>. 记录状态
     */
    public TMessageRecord setStatus(Short value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_message.status</code>. 记录状态
     */
    public Short getStatus() {
        return (Short) get(9);
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
    public Row10<BigDecimal, String, Timestamp, Integer, Integer, Integer[], Integer, BigDecimal, Timestamp, Short> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<BigDecimal, String, Timestamp, Integer, Integer, Integer[], Integer, BigDecimal, Timestamp, Short> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field1() {
        return TMessage.T_MESSAGE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TMessage.T_MESSAGE.CONTENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return TMessage.T_MESSAGE.SEND_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return TMessage.T_MESSAGE.MESSAGE_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return TMessage.T_MESSAGE.PRIORITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer[]> field6() {
        return TMessage.T_MESSAGE.CHANNEL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return TMessage.T_MESSAGE.STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field8() {
        return TMessage.T_MESSAGE.CREATE_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field9() {
        return TMessage.T_MESSAGE.CREATE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field10() {
        return TMessage.T_MESSAGE.STATUS;
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
        return getContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getSendTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getMessageType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getPriority();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer[] component6() {
        return getChannel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component8() {
        return getCreateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component9() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component10() {
        return getStatus();
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
        return getContent();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getSendTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getMessageType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getPriority();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer[] value6() {
        return getChannel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value8() {
        return getCreateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value9() {
        return getCreateAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value10() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TMessageRecord value1(BigDecimal value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TMessageRecord value2(String value) {
        setContent(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TMessageRecord value3(Timestamp value) {
        setSendTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TMessageRecord value4(Integer value) {
        setMessageType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TMessageRecord value5(Integer value) {
        setPriority(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TMessageRecord value6(Integer... value) {
        setChannel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TMessageRecord value7(Integer value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TMessageRecord value8(BigDecimal value) {
        setCreateBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TMessageRecord value9(Timestamp value) {
        setCreateAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TMessageRecord value10(Short value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TMessageRecord values(BigDecimal value1, String value2, Timestamp value3, Integer value4, Integer value5, Integer[] value6, Integer value7, BigDecimal value8, Timestamp value9, Short value10) {
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
     * Create a detached TMessageRecord
     */
    public TMessageRecord() {
        super(TMessage.T_MESSAGE);
    }

    /**
     * Create a detached, initialised TMessageRecord
     */
    public TMessageRecord(BigDecimal id, String content, Timestamp sendTime, Integer messageType, Integer priority, Integer[] channel, Integer state, BigDecimal createBy, Timestamp createAt, Short status) {
        super(TMessage.T_MESSAGE);

        set(0, id);
        set(1, content);
        set(2, sendTime);
        set(3, messageType);
        set(4, priority);
        set(5, channel);
        set(6, state);
        set(7, createBy);
        set(8, createAt);
        set(9, status);
    }
}
