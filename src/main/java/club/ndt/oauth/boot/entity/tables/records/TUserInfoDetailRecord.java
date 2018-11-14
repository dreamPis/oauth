/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables.records;


import club.ndt.oauth.boot.entity.tables.TUserInfoDetail;

import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 用户详细数据
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TUserInfoDetailRecord extends UpdatableRecordImpl<TUserInfoDetailRecord> implements Record6<BigDecimal, BigDecimal, Integer, String, Integer, Short> {

    private static final long serialVersionUID = -1649338100;

    /**
     * Setter for <code>ndt.t_user_info_detail.user_id</code>. 用户ID
     */
    public TUserInfoDetailRecord setUserId(BigDecimal value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_user_info_detail.user_id</code>. 用户ID
     */
    public BigDecimal getUserId() {
        return (BigDecimal) get(0);
    }

    /**
     * Setter for <code>ndt.t_user_info_detail.face_file_id</code>. 人脸识别数据文件id
     */
    public TUserInfoDetailRecord setFaceFileId(BigDecimal value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_user_info_detail.face_file_id</code>. 人脸识别数据文件id
     */
    public BigDecimal getFaceFileId() {
        return (BigDecimal) get(1);
    }

    /**
     * Setter for <code>ndt.t_user_info_detail.score</code>. 个人积分
     */
    public TUserInfoDetailRecord setScore(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_user_info_detail.score</code>. 个人积分
     */
    public Integer getScore() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>ndt.t_user_info_detail.identity_file_ids</code>. 身份证文件正反面
     */
    public TUserInfoDetailRecord setIdentityFileIds(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_user_info_detail.identity_file_ids</code>. 身份证文件正反面
     */
    public String getIdentityFileIds() {
        return (String) get(3);
    }

    /**
     * Setter for <code>ndt.t_user_info_detail.state</code>. 审核状态(3501：待审核，3502：不通过，3503：通过)
     */
    public TUserInfoDetailRecord setState(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_user_info_detail.state</code>. 审核状态(3501：待审核，3502：不通过，3503：通过)
     */
    public Integer getState() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>ndt.t_user_info_detail.source</code>. 认证请求来源(不为空表示外籍认证)
     */
    public TUserInfoDetailRecord setSource(Short value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>ndt.t_user_info_detail.source</code>. 认证请求来源(不为空表示外籍认证)
     */
    public Short getSource() {
        return (Short) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<BigDecimal> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<BigDecimal, BigDecimal, Integer, String, Integer, Short> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<BigDecimal, BigDecimal, Integer, String, Integer, Short> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field1() {
        return TUserInfoDetail.T_USER_INFO_DETAIL.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field2() {
        return TUserInfoDetail.T_USER_INFO_DETAIL.FACE_FILE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return TUserInfoDetail.T_USER_INFO_DETAIL.SCORE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TUserInfoDetail.T_USER_INFO_DETAIL.IDENTITY_FILE_IDS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return TUserInfoDetail.T_USER_INFO_DETAIL.STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field6() {
        return TUserInfoDetail.T_USER_INFO_DETAIL.SOURCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component1() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component2() {
        return getFaceFileId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getScore();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getIdentityFileIds();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component6() {
        return getSource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value1() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value2() {
        return getFaceFileId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getScore();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getIdentityFileIds();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value6() {
        return getSource();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserInfoDetailRecord value1(BigDecimal value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserInfoDetailRecord value2(BigDecimal value) {
        setFaceFileId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserInfoDetailRecord value3(Integer value) {
        setScore(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserInfoDetailRecord value4(String value) {
        setIdentityFileIds(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserInfoDetailRecord value5(Integer value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserInfoDetailRecord value6(Short value) {
        setSource(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TUserInfoDetailRecord values(BigDecimal value1, BigDecimal value2, Integer value3, String value4, Integer value5, Short value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TUserInfoDetailRecord
     */
    public TUserInfoDetailRecord() {
        super(TUserInfoDetail.T_USER_INFO_DETAIL);
    }

    /**
     * Create a detached, initialised TUserInfoDetailRecord
     */
    public TUserInfoDetailRecord(BigDecimal userId, BigDecimal faceFileId, Integer score, String identityFileIds, Integer state, Short source) {
        super(TUserInfoDetail.T_USER_INFO_DETAIL);

        set(0, userId);
        set(1, faceFileId);
        set(2, score);
        set(3, identityFileIds);
        set(4, state);
        set(5, source);
    }
}
