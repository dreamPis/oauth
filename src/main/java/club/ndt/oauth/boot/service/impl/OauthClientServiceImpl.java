package club.ndt.oauth.boot.service.impl;

import club.ndt.oauth.boot.dao.oauth.OauthClientDao;
import club.ndt.oauth.boot.entity.tables.pojos.OauthClientDetailsPjo;
import club.ndt.oauth.boot.entity.tables.records.OauthClientDetailsRecord;
import club.ndt.oauth.boot.service.OauthClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author ser7en
 * @Date 2018-11-15 10:33
 * @version：
 * @Desc：
 */
@Service
public class OauthClientServiceImpl implements OauthClientService {

    @Autowired
    private OauthClientDao oauthClientDao;

    @Override
    public OauthClientDetailsPjo findClientByClientId(String clientId) {
        OauthClientDetailsRecord record = oauthClientDao.findById(clientId);
        OauthClientDetailsPjo pjo = new OauthClientDetailsPjo();
        record.into(pjo);
        return pjo;
    }
}
