package club.ndt.oauth.boot.dao.oauth;

import club.ndt.oauth.boot.dao.BaseDaoImpl;
import club.ndt.oauth.boot.entity.tables.records.TUserRecord;
import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

import static club.ndt.oauth.boot.entity.tables.TUser.T_USER;

/**
 * @Author ser7en
 * @Date 2018-11-15 10:44
 * @version：
 * @Desc：
 */
@Repository
public class UserDao extends BaseDaoImpl<TUserRecord, BigDecimal> {

    @Autowired
    private DSLContext dsl;

    public UserDao() {
        super(T_USER);
    }

    @Override
    public Configuration getConfiguration() {
        return dsl.configuration();
    }

    public TUserRecord findByUserName(String username){
        return dsl.selectFrom(T_USER)
                .where(T_USER.LOGIN_NAME.eq(username).or(T_USER.MOBILE.eq(username)))
                .fetchOne();
    }
}
