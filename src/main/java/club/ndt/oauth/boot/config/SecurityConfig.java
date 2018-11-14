package club.ndt.oauth.boot.config;

import club.ndt.oauth.boot.config.auth2.BootOAuth2SecurityConfig;
import club.ndt.oauth.boot.filter.BootClientCredentialsTokenEndpointFilter;
import club.ndt.oauth.boot.support.BootLoginFailureHandler;
import club.ndt.oauth.boot.support.oauth2.BootAccessDeniedHandler;
import club.ndt.oauth.boot.support.BootSecurityProperties;
import club.ndt.oauth.boot.support.BootUserDetailService;
import club.ndt.oauth.boot.support.oauth2.BootOAuth2AuthExceptionEntryPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.client.ClientCredentialsTokenEndpointFilter;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

/**
 * @author ndt
 * @create time 2018/10/10  11:48
 * @description
 * @modify by
 * @modify time
 **/
@Configuration
@Order(1)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private BootUserDetailService userDetailService;

    @Autowired
    private BootSecurityProperties properties;

    @Autowired
    private BootLoginFailureHandler handler;

    @Autowired
    private ClientDetailsService clientDetailsService;

    @Autowired
    BootOAuth2AuthExceptionEntryPoint authenticationEntryPoint;








    /**
     * 让Security 忽略这些url，不做拦截处理
     *
     * @param
     * @throws Exception
     */
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers
                ("/swagger-ui.html/**", "/webjars/**",
                        "/swagger-resources/**", "/v2/api-docs/**",
                        "/swagger-resources/configuration/ui/**", "/swagger-resources/configuration/security/**",
                        "/images/**");
    }

    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailService);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                // 必须配置，不然OAuth2的http配置不生效----不明觉厉
                .requestMatchers()
                .antMatchers("/auth/login", properties.getLoginProcessUrl(), "/oauth/authorize")
                .and()
                .authorizeRequests()
                // 自定义页面或处理url是，如果不配置全局允许，浏览器会提示服务器将页面转发多次
                .antMatchers("/auth/login", properties.getLoginProcessUrl())
                .permitAll()
                .anyRequest()
                .authenticated();

        // 表单登录
        http.formLogin()
                .failureHandler(handler)
                // 页面
                .loginPage("/auth/login")
                // 登录处理url
                .loginProcessingUrl(properties.getLoginProcessUrl());

        http.httpBasic().disable();





    }


    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }


}