package club.ndt.oauth.boot.service.impl;

import club.ndt.oauth.boot.dao.oauth.UserDao;
import club.ndt.oauth.boot.entity.tables.pojos.UserPjo;
import club.ndt.oauth.boot.entity.tables.records.TUserRecord;
import club.ndt.oauth.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author ser7en
 * @Date 2018-11-15 10:42
 * @version：
 * @Desc：
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserPjo findByUserName(String username) {
        TUserRecord record = userDao.findByUserName(username);
        UserPjo pjo = new UserPjo();
        record.into(pjo);
        return pjo;
    }
}
