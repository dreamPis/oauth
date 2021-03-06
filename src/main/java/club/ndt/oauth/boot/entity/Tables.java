/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity;


import club.ndt.oauth.boot.entity.tables.OauthAccessToken;
import club.ndt.oauth.boot.entity.tables.OauthClientDetails;
import club.ndt.oauth.boot.entity.tables.OauthCode;
import club.ndt.oauth.boot.entity.tables.OauthRefreshToken;
import club.ndt.oauth.boot.entity.tables.TPersonalDetail;
import club.ndt.oauth.boot.entity.tables.TUser;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in ndt
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>ndt.oauth_access_token</code>.
     */
    public static final OauthAccessToken OAUTH_ACCESS_TOKEN = club.ndt.oauth.boot.entity.tables.OauthAccessToken.OAUTH_ACCESS_TOKEN;

    /**
     * The table <code>ndt.oauth_client_details</code>.
     */
    public static final OauthClientDetails OAUTH_CLIENT_DETAILS = club.ndt.oauth.boot.entity.tables.OauthClientDetails.OAUTH_CLIENT_DETAILS;

    /**
     * The table <code>ndt.oauth_code</code>.
     */
    public static final OauthCode OAUTH_CODE = club.ndt.oauth.boot.entity.tables.OauthCode.OAUTH_CODE;

    /**
     * The table <code>ndt.oauth_refresh_token</code>.
     */
    public static final OauthRefreshToken OAUTH_REFRESH_TOKEN = club.ndt.oauth.boot.entity.tables.OauthRefreshToken.OAUTH_REFRESH_TOKEN;

    /**
     * 个人用户详情表
     */
    public static final TPersonalDetail T_PERSONAL_DETAIL = club.ndt.oauth.boot.entity.tables.TPersonalDetail.T_PERSONAL_DETAIL;

    /**
     * 用户表
     */
    public static final TUser T_USER = club.ndt.oauth.boot.entity.tables.TUser.T_USER;
}
