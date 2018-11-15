package club.ndt.oauth.boot.support.oauth2;

import club.ndt.oauth.boot.entity.tables.pojos.OauthClientDetailsPjo;
import club.ndt.oauth.boot.utils.CommonUtils;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.oauth2.provider.ClientDetails;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * @author ndt
 * @create time 2018/10/16  15:36
 * @description
 * @modify by
 * @modify time
 **/
@Data
@SuppressWarnings("unchecked")
public final class BootClientDetails implements ClientDetails {

    private OauthClientDetailsPjo client;
    private Set<String> scope;

    public BootClientDetails(OauthClientDetailsPjo client) {
        this.client = client;
    }

    public BootClientDetails() {
    }

    @Override
    public String getClientId() {
        return client.getClientId();
    }

    @Override
    public Set<String> getResourceIds() {
        return client.getResourceIds()!=null?
                CommonUtils.transformStringToSet(client.getResourceIds(),String.class):null;
    }

    @Override
    public boolean isSecretRequired() {
        return false;
    }


    @Override
    public String getClientSecret() {
        return client.getClientSecret();
    }

    @Override
    public boolean isScoped() {
        return false;
    }


    @Override
    public Set<String> getScope() {

        this.scope = client.getScope()!=null?
                CommonUtils.transformStringToSet(client.getScope(),String.class):null;

        return client.getScope()!=null?
                CommonUtils.transformStringToSet(client.getScope(),String.class):null;
    }

    @Override
    public Set<String> getAuthorizedGrantTypes() {
        return client.getAuthorizedGrantTypes()!=null?
                CommonUtils.transformStringToSet(client.getAuthorizedGrantTypes(),String.class):null;
    }

    @Override
    public Set<String> getRegisteredRedirectUri() {
        return client.getWebServerRedirectUri()!=null?
                CommonUtils.transformStringToSet(client.getWebServerRedirectUri(),String.class):null;
    }

    @Override
    public Collection<GrantedAuthority> getAuthorities() {
        return (client.getAuthorities()!=null&&client.getAuthorities().trim().length()>0)?
                AuthorityUtils.commaSeparatedStringToAuthorityList(client.getAuthorities()):null;
    }

    @Override
    public Integer getAccessTokenValiditySeconds() {
        return client.getAccessTokenValidity();
    }

    @Override
    public Integer getRefreshTokenValiditySeconds() {
        return client.getRefreshTokenValidity();
    }

    @Override
    public boolean isAutoApprove(String s) {
        return false;
    }

    @Override
    public Map<String, Object> getAdditionalInformation() {
        return null;
    }
}
