package club.ndt.oauth.boot.support;

import club.ndt.oauth.boot.support.oauth2.BootUser;
import club.ndt.oauth.boot.utils.SecurityUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @Author ser7en
 * @Date 2018-11-15 11:11
 * @version：
 * @Desc：
 */
@Component
@Slf4j
public class BootAuthenticationProvider implements AuthenticationProvider {

    @Autowired
    private BootUserDetailService userService;

    /**
     * 自定义验证方式
     */
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getName();
        String password = (String) authentication.getCredentials();
        log.info("前端传过来的明文密码:" + password);
        BootUser user = userService.loadUserByUsername(username);

        //加密过程在这里体现
        log.info("结果BootUserDetailService后，已经查询出来的数据库存储密码:" + user.getPassword());
        if (SecurityUtil.isRightPassword(password, user.getSalt(), user.getPassword())) {
            throw new DisabledException("Wrong password.");
        }

        Collection<? extends GrantedAuthority> authorities = user.getAuthorities();
        return new UsernamePasswordAuthenticationToken(user, password, authorities);
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return true;
    }

}
