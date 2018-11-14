package club.ndt.oauth.boot.config.auth2;

import club.ndt.oauth.boot.filter.BootClientCredentialsTokenEndpointFilter;
import club.ndt.oauth.boot.support.oauth2.BootAccessDeniedHandler;
import club.ndt.oauth.boot.support.oauth2.BootOAuth2AuthExceptionEntryPoint;
import club.ndt.oauth.boot.support.BootSecurityProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.client.ClientCredentialsTokenEndpointFilter;
import org.springframework.security.oauth2.provider.error.OAuth2AuthenticationEntryPoint;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.web.AuthenticationEntryPoint;


/**
 * @author ndt
 * @create time 2018/10/15  14:57
 * @description
 * @modify by
 * @modify time
 **/
@Configuration
@EnableResourceServer
public class OAuth2ResourceServerConfig  extends ResourceServerConfigurerAdapter{

    @Autowired
    private AuthenticationEntryPoint point;

    @Autowired
    private BootAccessDeniedHandler handler;

    @Autowired
    private TokenStore tokenStore;


    @Autowired
    private BootClientCredentialsTokenEndpointFilter bootClientCredentialsTokenEndpointFilter;

    @Override
    public void configure(ResourceServerSecurityConfigurer resources) throws Exception {

        resources.tokenStore(tokenStore)
                .resourceId("boot-server");

        resources.authenticationEntryPoint(point).accessDeniedHandler(handler);

    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                    .anyRequest()
                    .access("#oauth2.hasAnyScope('all')");
    }



}
