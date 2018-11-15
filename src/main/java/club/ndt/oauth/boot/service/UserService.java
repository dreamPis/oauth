package club.ndt.oauth.boot.service;

import club.ndt.oauth.boot.entity.tables.pojos.UserPjo;

/**
 * @Author ser7en
 * @Date 2018-11-15 10:42
 * @version：
 * @Desc：
 */
public interface UserService {

    UserPjo findByUserName(String username);
}
