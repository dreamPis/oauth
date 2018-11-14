/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables.pojos;


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
public class ActIdUserPjo implements Serializable {

    private static final long serialVersionUID = 114620249;

    private String  id_;
    private Integer rev_;
    private String  first_;
    private String  last_;
    private String  email_;
    private String  pwd_;
    private String  pictureId_;

    public ActIdUserPjo() {}

    public ActIdUserPjo(ActIdUserPjo value) {
        this.id_ = value.id_;
        this.rev_ = value.rev_;
        this.first_ = value.first_;
        this.last_ = value.last_;
        this.email_ = value.email_;
        this.pwd_ = value.pwd_;
        this.pictureId_ = value.pictureId_;
    }

    public ActIdUserPjo(
        String  id_,
        Integer rev_,
        String  first_,
        String  last_,
        String  email_,
        String  pwd_,
        String  pictureId_
    ) {
        this.id_ = id_;
        this.rev_ = rev_;
        this.first_ = first_;
        this.last_ = last_;
        this.email_ = email_;
        this.pwd_ = pwd_;
        this.pictureId_ = pictureId_;
    }

    public String getId_() {
        return this.id_;
    }

    public ActIdUserPjo setId_(String id_) {
        this.id_ = id_;
        return this;
    }

    public Integer getRev_() {
        return this.rev_;
    }

    public ActIdUserPjo setRev_(Integer rev_) {
        this.rev_ = rev_;
        return this;
    }

    public String getFirst_() {
        return this.first_;
    }

    public ActIdUserPjo setFirst_(String first_) {
        this.first_ = first_;
        return this;
    }

    public String getLast_() {
        return this.last_;
    }

    public ActIdUserPjo setLast_(String last_) {
        this.last_ = last_;
        return this;
    }

    public String getEmail_() {
        return this.email_;
    }

    public ActIdUserPjo setEmail_(String email_) {
        this.email_ = email_;
        return this;
    }

    public String getPwd_() {
        return this.pwd_;
    }

    public ActIdUserPjo setPwd_(String pwd_) {
        this.pwd_ = pwd_;
        return this;
    }

    public String getPictureId_() {
        return this.pictureId_;
    }

    public ActIdUserPjo setPictureId_(String pictureId_) {
        this.pictureId_ = pictureId_;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ActIdUserPjo (");

        sb.append(id_);
        sb.append(", ").append(rev_);
        sb.append(", ").append(first_);
        sb.append(", ").append(last_);
        sb.append(", ").append(email_);
        sb.append(", ").append(pwd_);
        sb.append(", ").append(pictureId_);

        sb.append(")");
        return sb.toString();
    }
}
