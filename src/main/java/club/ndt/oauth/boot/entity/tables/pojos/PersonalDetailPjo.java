/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 个人用户详情表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PersonalDetailPjo implements Serializable {

    private static final long serialVersionUID = 572828622;

    private BigDecimal id;
    private String     identityId;
    private Boolean    isEmerging;
    private String     address;
    private Integer    maritalStatus;
    private Integer    evaluate;
    private String     badhabits;
    private Boolean    isCrimed;
    private Integer    education;
    private Short      supportNum;
    private Short      monitorChildren;
    private Timestamp  updateAt;
    private BigDecimal updateBy;
    private String     relatedImgUrls;

    public PersonalDetailPjo() {}

    public PersonalDetailPjo(PersonalDetailPjo value) {
        this.id = value.id;
        this.identityId = value.identityId;
        this.isEmerging = value.isEmerging;
        this.address = value.address;
        this.maritalStatus = value.maritalStatus;
        this.evaluate = value.evaluate;
        this.badhabits = value.badhabits;
        this.isCrimed = value.isCrimed;
        this.education = value.education;
        this.supportNum = value.supportNum;
        this.monitorChildren = value.monitorChildren;
        this.updateAt = value.updateAt;
        this.updateBy = value.updateBy;
        this.relatedImgUrls = value.relatedImgUrls;
    }

    public PersonalDetailPjo(
        BigDecimal id,
        String     identityId,
        Boolean    isEmerging,
        String     address,
        Integer    maritalStatus,
        Integer    evaluate,
        String     badhabits,
        Boolean    isCrimed,
        Integer    education,
        Short      supportNum,
        Short      monitorChildren,
        Timestamp  updateAt,
        BigDecimal updateBy,
        String     relatedImgUrls
    ) {
        this.id = id;
        this.identityId = identityId;
        this.isEmerging = isEmerging;
        this.address = address;
        this.maritalStatus = maritalStatus;
        this.evaluate = evaluate;
        this.badhabits = badhabits;
        this.isCrimed = isCrimed;
        this.education = education;
        this.supportNum = supportNum;
        this.monitorChildren = monitorChildren;
        this.updateAt = updateAt;
        this.updateBy = updateBy;
        this.relatedImgUrls = relatedImgUrls;
    }

    public BigDecimal getId() {
        return this.id;
    }

    public PersonalDetailPjo setId(BigDecimal id) {
        this.id = id;
        return this;
    }

    public String getIdentityId() {
        return this.identityId;
    }

    public PersonalDetailPjo setIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }

    public Boolean getIsEmerging() {
        return this.isEmerging;
    }

    public PersonalDetailPjo setIsEmerging(Boolean isEmerging) {
        this.isEmerging = isEmerging;
        return this;
    }

    public String getAddress() {
        return this.address;
    }

    public PersonalDetailPjo setAddress(String address) {
        this.address = address;
        return this;
    }

    public Integer getMaritalStatus() {
        return this.maritalStatus;
    }

    public PersonalDetailPjo setMaritalStatus(Integer maritalStatus) {
        this.maritalStatus = maritalStatus;
        return this;
    }

    public Integer getEvaluate() {
        return this.evaluate;
    }

    public PersonalDetailPjo setEvaluate(Integer evaluate) {
        this.evaluate = evaluate;
        return this;
    }

    public String getBadhabits() {
        return this.badhabits;
    }

    public PersonalDetailPjo setBadhabits(String badhabits) {
        this.badhabits = badhabits;
        return this;
    }

    public Boolean getIsCrimed() {
        return this.isCrimed;
    }

    public PersonalDetailPjo setIsCrimed(Boolean isCrimed) {
        this.isCrimed = isCrimed;
        return this;
    }

    public Integer getEducation() {
        return this.education;
    }

    public PersonalDetailPjo setEducation(Integer education) {
        this.education = education;
        return this;
    }

    public Short getSupportNum() {
        return this.supportNum;
    }

    public PersonalDetailPjo setSupportNum(Short supportNum) {
        this.supportNum = supportNum;
        return this;
    }

    public Short getMonitorChildren() {
        return this.monitorChildren;
    }

    public PersonalDetailPjo setMonitorChildren(Short monitorChildren) {
        this.monitorChildren = monitorChildren;
        return this;
    }

    public Timestamp getUpdateAt() {
        return this.updateAt;
    }

    public PersonalDetailPjo setUpdateAt(Timestamp updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    public BigDecimal getUpdateBy() {
        return this.updateBy;
    }

    public PersonalDetailPjo setUpdateBy(BigDecimal updateBy) {
        this.updateBy = updateBy;
        return this;
    }

    public String getRelatedImgUrls() {
        return this.relatedImgUrls;
    }

    public PersonalDetailPjo setRelatedImgUrls(String relatedImgUrls) {
        this.relatedImgUrls = relatedImgUrls;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PersonalDetailPjo (");

        sb.append(id);
        sb.append(", ").append(identityId);
        sb.append(", ").append(isEmerging);
        sb.append(", ").append(address);
        sb.append(", ").append(maritalStatus);
        sb.append(", ").append(evaluate);
        sb.append(", ").append(badhabits);
        sb.append(", ").append(isCrimed);
        sb.append(", ").append(education);
        sb.append(", ").append(supportNum);
        sb.append(", ").append(monitorChildren);
        sb.append(", ").append(updateAt);
        sb.append(", ").append(updateBy);
        sb.append(", ").append(relatedImgUrls);

        sb.append(")");
        return sb.toString();
    }
}
