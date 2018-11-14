/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;

import javax.annotation.Generated;


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
public class MessagePjo implements Serializable {

    private static final long serialVersionUID = -591196216;

    private BigDecimal id;
    private String     content;
    private Timestamp  sendTime;
    private Integer    messageType;
    private Integer    priority;
    private Integer[]  channel;
    private Integer    state;
    private BigDecimal createBy;
    private Timestamp  createAt;
    private Short      status;

    public MessagePjo() {}

    public MessagePjo(MessagePjo value) {
        this.id = value.id;
        this.content = value.content;
        this.sendTime = value.sendTime;
        this.messageType = value.messageType;
        this.priority = value.priority;
        this.channel = value.channel;
        this.state = value.state;
        this.createBy = value.createBy;
        this.createAt = value.createAt;
        this.status = value.status;
    }

    public MessagePjo(
        BigDecimal id,
        String     content,
        Timestamp  sendTime,
        Integer    messageType,
        Integer    priority,
        Integer[]  channel,
        Integer    state,
        BigDecimal createBy,
        Timestamp  createAt,
        Short      status
    ) {
        this.id = id;
        this.content = content;
        this.sendTime = sendTime;
        this.messageType = messageType;
        this.priority = priority;
        this.channel = channel;
        this.state = state;
        this.createBy = createBy;
        this.createAt = createAt;
        this.status = status;
    }

    public BigDecimal getId() {
        return this.id;
    }

    public MessagePjo setId(BigDecimal id) {
        this.id = id;
        return this;
    }

    public String getContent() {
        return this.content;
    }

    public MessagePjo setContent(String content) {
        this.content = content;
        return this;
    }

    public Timestamp getSendTime() {
        return this.sendTime;
    }

    public MessagePjo setSendTime(Timestamp sendTime) {
        this.sendTime = sendTime;
        return this;
    }

    public Integer getMessageType() {
        return this.messageType;
    }

    public MessagePjo setMessageType(Integer messageType) {
        this.messageType = messageType;
        return this;
    }

    public Integer getPriority() {
        return this.priority;
    }

    public MessagePjo setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    public Integer[] getChannel() {
        return this.channel;
    }

    public MessagePjo setChannel(Integer... channel) {
        this.channel = channel;
        return this;
    }

    public Integer getState() {
        return this.state;
    }

    public MessagePjo setState(Integer state) {
        this.state = state;
        return this;
    }

    public BigDecimal getCreateBy() {
        return this.createBy;
    }

    public MessagePjo setCreateBy(BigDecimal createBy) {
        this.createBy = createBy;
        return this;
    }

    public Timestamp getCreateAt() {
        return this.createAt;
    }

    public MessagePjo setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
        return this;
    }

    public Short getStatus() {
        return this.status;
    }

    public MessagePjo setStatus(Short status) {
        this.status = status;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MessagePjo (");

        sb.append(id);
        sb.append(", ").append(content);
        sb.append(", ").append(sendTime);
        sb.append(", ").append(messageType);
        sb.append(", ").append(priority);
        sb.append(", ").append(Arrays.toString(channel));
        sb.append(", ").append(state);
        sb.append(", ").append(createBy);
        sb.append(", ").append(createAt);
        sb.append(", ").append(status);

        sb.append(")");
        return sb.toString();
    }
}