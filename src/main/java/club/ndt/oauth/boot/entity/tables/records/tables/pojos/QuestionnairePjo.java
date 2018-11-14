/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;
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
public class QuestionnairePjo implements Serializable {

    private static final long serialVersionUID = -1609946892;

    private BigDecimal id;
    private Object     result;
    private BigDecimal submitUserId;
    private Timestamp  createTime;
    private Integer    tempId;

    public QuestionnairePjo() {}

    public QuestionnairePjo(QuestionnairePjo value) {
        this.id = value.id;
        this.result = value.result;
        this.submitUserId = value.submitUserId;
        this.createTime = value.createTime;
        this.tempId = value.tempId;
    }

    public QuestionnairePjo(
        BigDecimal id,
        Object     result,
        BigDecimal submitUserId,
        Timestamp  createTime,
        Integer    tempId
    ) {
        this.id = id;
        this.result = result;
        this.submitUserId = submitUserId;
        this.createTime = createTime;
        this.tempId = tempId;
    }

    public BigDecimal getId() {
        return this.id;
    }

    public QuestionnairePjo setId(BigDecimal id) {
        this.id = id;
        return this;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public Object getResult() {
        return this.result;
    }


    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using <deprecationOnUnknownTypes/> in your code generator configuration.
     */
    @java.lang.Deprecated
    public QuestionnairePjo setResult(Object result) {
        this.result = result;
        return this;
    }

    public BigDecimal getSubmitUserId() {
        return this.submitUserId;
    }

    public QuestionnairePjo setSubmitUserId(BigDecimal submitUserId) {
        this.submitUserId = submitUserId;
        return this;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public QuestionnairePjo setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
        return this;
    }

    public Integer getTempId() {
        return this.tempId;
    }

    public QuestionnairePjo setTempId(Integer tempId) {
        this.tempId = tempId;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("QuestionnairePjo (");

        sb.append(id);
        sb.append(", ").append(result);
        sb.append(", ").append(submitUserId);
        sb.append(", ").append(createTime);
        sb.append(", ").append(tempId);

        sb.append(")");
        return sb.toString();
    }
}
