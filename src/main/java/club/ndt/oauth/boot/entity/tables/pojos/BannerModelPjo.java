/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;

import javax.annotation.Generated;


/**
 * banner弹窗表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BannerModelPjo implements Serializable {

    private static final long serialVersionUID = 1573624448;

    private BigDecimal id;
    private String     name;
    private String     notes;
    private String     telephone;
    private String     lineHref;
    private String     moreHref;
    private String     imgUri;

    public BannerModelPjo() {}

    public BannerModelPjo(BannerModelPjo value) {
        this.id = value.id;
        this.name = value.name;
        this.notes = value.notes;
        this.telephone = value.telephone;
        this.lineHref = value.lineHref;
        this.moreHref = value.moreHref;
        this.imgUri = value.imgUri;
    }

    public BannerModelPjo(
        BigDecimal id,
        String     name,
        String     notes,
        String     telephone,
        String     lineHref,
        String     moreHref,
        String     imgUri
    ) {
        this.id = id;
        this.name = name;
        this.notes = notes;
        this.telephone = telephone;
        this.lineHref = lineHref;
        this.moreHref = moreHref;
        this.imgUri = imgUri;
    }

    public BigDecimal getId() {
        return this.id;
    }

    public BannerModelPjo setId(BigDecimal id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public BannerModelPjo setName(String name) {
        this.name = name;
        return this;
    }

    public String getNotes() {
        return this.notes;
    }

    public BannerModelPjo setNotes(String notes) {
        this.notes = notes;
        return this;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public BannerModelPjo setTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }

    public String getLineHref() {
        return this.lineHref;
    }

    public BannerModelPjo setLineHref(String lineHref) {
        this.lineHref = lineHref;
        return this;
    }

    public String getMoreHref() {
        return this.moreHref;
    }

    public BannerModelPjo setMoreHref(String moreHref) {
        this.moreHref = moreHref;
        return this;
    }

    public String getImgUri() {
        return this.imgUri;
    }

    public BannerModelPjo setImgUri(String imgUri) {
        this.imgUri = imgUri;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("BannerModelPjo (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(notes);
        sb.append(", ").append(telephone);
        sb.append(", ").append(lineHref);
        sb.append(", ").append(moreHref);
        sb.append(", ").append(imgUri);

        sb.append(")");
        return sb.toString();
    }
}
