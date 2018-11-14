/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.annotation.Generated;


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
public class ActHiAttachmentPjo implements Serializable {

    private static final long serialVersionUID = 658210321;

    private String    id_;
    private Integer   rev_;
    private String    userId_;
    private String    name_;
    private String    description_;
    private String    type_;
    private String    taskId_;
    private String    procInstId_;
    private String    url_;
    private String    contentId_;
    private Timestamp time_;

    public ActHiAttachmentPjo() {}

    public ActHiAttachmentPjo(ActHiAttachmentPjo value) {
        this.id_ = value.id_;
        this.rev_ = value.rev_;
        this.userId_ = value.userId_;
        this.name_ = value.name_;
        this.description_ = value.description_;
        this.type_ = value.type_;
        this.taskId_ = value.taskId_;
        this.procInstId_ = value.procInstId_;
        this.url_ = value.url_;
        this.contentId_ = value.contentId_;
        this.time_ = value.time_;
    }

    public ActHiAttachmentPjo(
        String    id_,
        Integer   rev_,
        String    userId_,
        String    name_,
        String    description_,
        String    type_,
        String    taskId_,
        String    procInstId_,
        String    url_,
        String    contentId_,
        Timestamp time_
    ) {
        this.id_ = id_;
        this.rev_ = rev_;
        this.userId_ = userId_;
        this.name_ = name_;
        this.description_ = description_;
        this.type_ = type_;
        this.taskId_ = taskId_;
        this.procInstId_ = procInstId_;
        this.url_ = url_;
        this.contentId_ = contentId_;
        this.time_ = time_;
    }

    public String getId_() {
        return this.id_;
    }

    public ActHiAttachmentPjo setId_(String id_) {
        this.id_ = id_;
        return this;
    }

    public Integer getRev_() {
        return this.rev_;
    }

    public ActHiAttachmentPjo setRev_(Integer rev_) {
        this.rev_ = rev_;
        return this;
    }

    public String getUserId_() {
        return this.userId_;
    }

    public ActHiAttachmentPjo setUserId_(String userId_) {
        this.userId_ = userId_;
        return this;
    }

    public String getName_() {
        return this.name_;
    }

    public ActHiAttachmentPjo setName_(String name_) {
        this.name_ = name_;
        return this;
    }

    public String getDescription_() {
        return this.description_;
    }

    public ActHiAttachmentPjo setDescription_(String description_) {
        this.description_ = description_;
        return this;
    }

    public String getType_() {
        return this.type_;
    }

    public ActHiAttachmentPjo setType_(String type_) {
        this.type_ = type_;
        return this;
    }

    public String getTaskId_() {
        return this.taskId_;
    }

    public ActHiAttachmentPjo setTaskId_(String taskId_) {
        this.taskId_ = taskId_;
        return this;
    }

    public String getProcInstId_() {
        return this.procInstId_;
    }

    public ActHiAttachmentPjo setProcInstId_(String procInstId_) {
        this.procInstId_ = procInstId_;
        return this;
    }

    public String getUrl_() {
        return this.url_;
    }

    public ActHiAttachmentPjo setUrl_(String url_) {
        this.url_ = url_;
        return this;
    }

    public String getContentId_() {
        return this.contentId_;
    }

    public ActHiAttachmentPjo setContentId_(String contentId_) {
        this.contentId_ = contentId_;
        return this;
    }

    public Timestamp getTime_() {
        return this.time_;
    }

    public ActHiAttachmentPjo setTime_(Timestamp time_) {
        this.time_ = time_;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ActHiAttachmentPjo (");

        sb.append(id_);
        sb.append(", ").append(rev_);
        sb.append(", ").append(userId_);
        sb.append(", ").append(name_);
        sb.append(", ").append(description_);
        sb.append(", ").append(type_);
        sb.append(", ").append(taskId_);
        sb.append(", ").append(procInstId_);
        sb.append(", ").append(url_);
        sb.append(", ").append(contentId_);
        sb.append(", ").append(time_);

        sb.append(")");
        return sb.toString();
    }
}
