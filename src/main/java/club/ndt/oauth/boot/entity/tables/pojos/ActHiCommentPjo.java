/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables.pojos;


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
public class ActHiCommentPjo implements Serializable {

    private static final long serialVersionUID = 641428185;

    private String    id_;
    private String    type_;
    private Timestamp time_;
    private String    userId_;
    private String    taskId_;
    private String    procInstId_;
    private String    action_;
    private String    message_;
    private byte[]    fullMsg_;

    public ActHiCommentPjo() {}

    public ActHiCommentPjo(ActHiCommentPjo value) {
        this.id_ = value.id_;
        this.type_ = value.type_;
        this.time_ = value.time_;
        this.userId_ = value.userId_;
        this.taskId_ = value.taskId_;
        this.procInstId_ = value.procInstId_;
        this.action_ = value.action_;
        this.message_ = value.message_;
        this.fullMsg_ = value.fullMsg_;
    }

    public ActHiCommentPjo(
        String    id_,
        String    type_,
        Timestamp time_,
        String    userId_,
        String    taskId_,
        String    procInstId_,
        String    action_,
        String    message_,
        byte[]    fullMsg_
    ) {
        this.id_ = id_;
        this.type_ = type_;
        this.time_ = time_;
        this.userId_ = userId_;
        this.taskId_ = taskId_;
        this.procInstId_ = procInstId_;
        this.action_ = action_;
        this.message_ = message_;
        this.fullMsg_ = fullMsg_;
    }

    public String getId_() {
        return this.id_;
    }

    public ActHiCommentPjo setId_(String id_) {
        this.id_ = id_;
        return this;
    }

    public String getType_() {
        return this.type_;
    }

    public ActHiCommentPjo setType_(String type_) {
        this.type_ = type_;
        return this;
    }

    public Timestamp getTime_() {
        return this.time_;
    }

    public ActHiCommentPjo setTime_(Timestamp time_) {
        this.time_ = time_;
        return this;
    }

    public String getUserId_() {
        return this.userId_;
    }

    public ActHiCommentPjo setUserId_(String userId_) {
        this.userId_ = userId_;
        return this;
    }

    public String getTaskId_() {
        return this.taskId_;
    }

    public ActHiCommentPjo setTaskId_(String taskId_) {
        this.taskId_ = taskId_;
        return this;
    }

    public String getProcInstId_() {
        return this.procInstId_;
    }

    public ActHiCommentPjo setProcInstId_(String procInstId_) {
        this.procInstId_ = procInstId_;
        return this;
    }

    public String getAction_() {
        return this.action_;
    }

    public ActHiCommentPjo setAction_(String action_) {
        this.action_ = action_;
        return this;
    }

    public String getMessage_() {
        return this.message_;
    }

    public ActHiCommentPjo setMessage_(String message_) {
        this.message_ = message_;
        return this;
    }

    public byte[] getFullMsg_() {
        return this.fullMsg_;
    }

    public ActHiCommentPjo setFullMsg_(byte... fullMsg_) {
        this.fullMsg_ = fullMsg_;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ActHiCommentPjo (");

        sb.append(id_);
        sb.append(", ").append(type_);
        sb.append(", ").append(time_);
        sb.append(", ").append(userId_);
        sb.append(", ").append(taskId_);
        sb.append(", ").append(procInstId_);
        sb.append(", ").append(action_);
        sb.append(", ").append(message_);
        sb.append(", ").append("[binary...]");

        sb.append(")");
        return sb.toString();
    }
}
