/*
 * This file is generated by jOOQ.
*/
package com.ndt.sms.entity.tables.pojos;


import java.io.Serializable;

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
public class ActProcdefInfoPjo implements Serializable {

    private static final long serialVersionUID = -120360909;

    private String  id_;
    private String  procDefId_;
    private Integer rev_;
    private String  infoJsonId_;

    public ActProcdefInfoPjo() {}

    public ActProcdefInfoPjo(ActProcdefInfoPjo value) {
        this.id_ = value.id_;
        this.procDefId_ = value.procDefId_;
        this.rev_ = value.rev_;
        this.infoJsonId_ = value.infoJsonId_;
    }

    public ActProcdefInfoPjo(
        String  id_,
        String  procDefId_,
        Integer rev_,
        String  infoJsonId_
    ) {
        this.id_ = id_;
        this.procDefId_ = procDefId_;
        this.rev_ = rev_;
        this.infoJsonId_ = infoJsonId_;
    }

    public String getId_() {
        return this.id_;
    }

    public ActProcdefInfoPjo setId_(String id_) {
        this.id_ = id_;
        return this;
    }

    public String getProcDefId_() {
        return this.procDefId_;
    }

    public ActProcdefInfoPjo setProcDefId_(String procDefId_) {
        this.procDefId_ = procDefId_;
        return this;
    }

    public Integer getRev_() {
        return this.rev_;
    }

    public ActProcdefInfoPjo setRev_(Integer rev_) {
        this.rev_ = rev_;
        return this;
    }

    public String getInfoJsonId_() {
        return this.infoJsonId_;
    }

    public ActProcdefInfoPjo setInfoJsonId_(String infoJsonId_) {
        this.infoJsonId_ = infoJsonId_;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ActProcdefInfoPjo (");

        sb.append(id_);
        sb.append(", ").append(procDefId_);
        sb.append(", ").append(rev_);
        sb.append(", ").append(infoJsonId_);

        sb.append(")");
        return sb.toString();
    }
}