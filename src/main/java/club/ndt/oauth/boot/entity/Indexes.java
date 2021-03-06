/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity;


import club.ndt.oauth.boot.entity.tables.OauthClientDetails;
import club.ndt.oauth.boot.entity.tables.TPersonalDetail;
import club.ndt.oauth.boot.entity.tables.TUser;

import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>ndt</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index OAUTH_CLIENT_DETAILS_PKEY = Indexes0.OAUTH_CLIENT_DETAILS_PKEY;
    public static final Index T_PERSONAL_DETAIL_PKEY = Indexes0.T_PERSONAL_DETAIL_PKEY;
    public static final Index T_USER_PKEY = Indexes0.T_USER_PKEY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index OAUTH_CLIENT_DETAILS_PKEY = Internal.createIndex("oauth_client_details_pkey", OauthClientDetails.OAUTH_CLIENT_DETAILS, new OrderField[] { OauthClientDetails.OAUTH_CLIENT_DETAILS.CLIENT_ID }, true);
        public static Index T_PERSONAL_DETAIL_PKEY = Internal.createIndex("t_personal_detail_pkey", TPersonalDetail.T_PERSONAL_DETAIL, new OrderField[] { TPersonalDetail.T_PERSONAL_DETAIL.ID }, true);
        public static Index T_USER_PKEY = Internal.createIndex("t_user_pkey", TUser.T_USER, new OrderField[] { TUser.T_USER.ID }, true);
    }
}
