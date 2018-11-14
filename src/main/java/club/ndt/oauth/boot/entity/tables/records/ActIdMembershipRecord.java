/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables.records;


import club.ndt.oauth.boot.entity.tables.ActIdMembership;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


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
public class ActIdMembershipRecord extends UpdatableRecordImpl<ActIdMembershipRecord> implements Record2<String, String> {

    private static final long serialVersionUID = 195492412;

    /**
     * Setter for <code>ndt.act_id_membership.user_id_</code>.
     */
    public ActIdMembershipRecord setUserId_(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_id_membership.user_id_</code>.
     */
    public String getUserId_() {
        return (String) get(0);
    }

    /**
     * Setter for <code>ndt.act_id_membership.group_id_</code>.
     */
    public ActIdMembershipRecord setGroupId_(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.act_id_membership.group_id_</code>.
     */
    public String getGroupId_() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<String, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<String, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return ActIdMembership.ACT_ID_MEMBERSHIP.USER_ID_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ActIdMembership.ACT_ID_MEMBERSHIP.GROUP_ID_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getUserId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getGroupId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getUserId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getGroupId_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActIdMembershipRecord value1(String value) {
        setUserId_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActIdMembershipRecord value2(String value) {
        setGroupId_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ActIdMembershipRecord values(String value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ActIdMembershipRecord
     */
    public ActIdMembershipRecord() {
        super(ActIdMembership.ACT_ID_MEMBERSHIP);
    }

    /**
     * Create a detached, initialised ActIdMembershipRecord
     */
    public ActIdMembershipRecord(String userId_, String groupId_) {
        super(ActIdMembership.ACT_ID_MEMBERSHIP);

        set(0, userId_);
        set(1, groupId_);
    }
}
