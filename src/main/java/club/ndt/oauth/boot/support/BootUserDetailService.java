package club.ndt.oauth.boot.support;

import club.ndt.oauth.boot.entity.tables.pojos.UserPjo;
import club.ndt.oauth.boot.service.UserService;
import club.ndt.oauth.boot.support.oauth2.BootUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ndt
 * @create time 2018/10/11  9:13
 * @description
 * @modify by
 * @modify time
 **/
@Component
public final class BootUserDetailService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Override
    public BootUser loadUserByUsername(String username) throws UsernameNotFoundException {

        UserPjo pjo= this.userService.findByUserName(username);
        if(pjo==null) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        GrantedAuthority authority = new SimpleGrantedAuthority("ROLE_USER");
        List <GrantedAuthority>authorities = new ArrayList<>();
        authorities.add(authority);
        BootUser user = new BootUser(username, pjo.getPassword(), authorities);
        user.setSalt(pjo.getSalt());

        return user;
    }
}
