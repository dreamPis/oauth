/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * 用户角色中间表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MtUserRolePjo implements Serializable {

    private static final long serialVersionUID = -1780599904;

    private BigDecimal id;
    private BigDecimal userId;
    private BigDecimal roleId;
    private Timestamp  createAt;
    private BigDecimal createBy;

    public MtUserRolePjo() {}

    public MtUserRolePjo(MtUserRolePjo value) {
        this.id = value.id;
        this.userId = value.userId;
        this.roleId = value.roleId;
        this.createAt = value.createAt;
        this.createBy = value.createBy;
    }

    public MtUserRolePjo(
        BigDecimal id,
        BigDecimal userId,
        BigDecimal roleId,
        Timestamp  createAt,
        BigDecimal createBy
    ) {
        this.id = id;
        this.userId = userId;
        this.roleId = roleId;
        this.createAt = createAt;
        this.createBy = createBy;
    }

    public BigDecimal getId() {
        return this.id;
    }

    public MtUserRolePjo setId(BigDecimal id) {
        this.id = id;
        return this;
    }

    public BigDecimal getUserId() {
        return this.userId;
    }

    public MtUserRolePjo setUserId(BigDecimal userId) {
        this.userId = userId;
        return this;
    }

    public BigDecimal getRoleId() {
        return this.roleId;
    }

    public MtUserRolePjo setRoleId(BigDecimal roleId) {
        this.roleId = roleId;
        return this;
    }

    public Timestamp getCreateAt() {
        return this.createAt;
    }

    public MtUserRolePjo setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
        return this;
    }

    public BigDecimal getCreateBy() {
        return this.createBy;
    }

    public MtUserRolePjo setCreateBy(BigDecimal createBy) {
        this.createBy = createBy;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MtUserRolePjo (");

        sb.append(id);
        sb.append(", ").append(userId);
        sb.append(", ").append(roleId);
        sb.append(", ").append(createAt);
        sb.append(", ").append(createBy);

        sb.append(")");
        return sb.toString();
    }
}
