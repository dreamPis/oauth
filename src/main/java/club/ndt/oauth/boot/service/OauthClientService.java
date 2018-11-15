package club.ndt.oauth.boot.service;

import club.ndt.oauth.boot.entity.tables.pojos.OauthClientDetailsPjo;

/**
 * @Author ser7en
 * @Date 2018-11-15 10:32
 * @version：
 * @Desc：
 */
public interface OauthClientService {

    OauthClientDetailsPjo findClientByClientId(String clientId);

}
