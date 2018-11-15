/*
 * This file is generated by jOOQ.
*/
package club.ndt.oauth.boot.entity.tables.pojos;


import java.io.Serializable;
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
public class OauthAccessokenPjo implements Serializable {

    private static final long serialVersionUID = -1517593290;

    private Timestamp createTime;
    private String    tokenId;
    private byte[]    token;
    private String    authenticationId;
    private String    userName;
    private String    clientId;
    private byte[]    authentication;
    private String    refreshToken;

    public OauthAccessokenPjo() {}

    public OauthAccessokenPjo(OauthAccessokenPjo value) {
        this.createTime = value.createTime;
        this.tokenId = value.tokenId;
        this.token = value.token;
        this.authenticationId = value.authenticationId;
        this.userName = value.userName;
        this.clientId = value.clientId;
        this.authentication = value.authentication;
        this.refreshToken = value.refreshToken;
    }

    public OauthAccessokenPjo(
        Timestamp createTime,
        String    tokenId,
        byte[]    token,
        String    authenticationId,
        String    userName,
        String    clientId,
        byte[]    authentication,
        String    refreshToken
    ) {
        this.createTime = createTime;
        this.tokenId = tokenId;
        this.token = token;
        this.authenticationId = authenticationId;
        this.userName = userName;
        this.clientId = clientId;
        this.authentication = authentication;
        this.refreshToken = refreshToken;
    }

    public Timestamp getCreateTime() {
        return this.createTime;
    }

    public OauthAccessokenPjo setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getTokenId() {
        return this.tokenId;
    }

    public OauthAccessokenPjo setTokenId(String tokenId) {
        this.tokenId = tokenId;
        return this;
    }

    public byte[] getToken() {
        return this.token;
    }

    public OauthAccessokenPjo setToken(byte... token) {
        this.token = token;
        return this;
    }

    public String getAuthenticationId() {
        return this.authenticationId;
    }

    public OauthAccessokenPjo setAuthenticationId(String authenticationId) {
        this.authenticationId = authenticationId;
        return this;
    }

    public String getUserName() {
        return this.userName;
    }

    public OauthAccessokenPjo setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getClientId() {
        return this.clientId;
    }

    public OauthAccessokenPjo setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    public byte[] getAuthentication() {
        return this.authentication;
    }

    public OauthAccessokenPjo setAuthentication(byte... authentication) {
        this.authentication = authentication;
        return this;
    }

    public String getRefreshToken() {
        return this.refreshToken;
    }

    public OauthAccessokenPjo setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("OauthAccessokenPjo (");

        sb.append(createTime);
        sb.append(", ").append(tokenId);
        sb.append(", ").append("[binary...]");
        sb.append(", ").append(authenticationId);
        sb.append(", ").append(userName);
        sb.append(", ").append(clientId);
        sb.append(", ").append("[binary...]");
        sb.append(", ").append(refreshToken);

        sb.append(")");
        return sb.toString();
    }
}
