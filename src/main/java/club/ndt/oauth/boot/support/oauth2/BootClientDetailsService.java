package club.ndt.oauth.boot.support.oauth2;

import club.ndt.oauth.boot.entity.tables.pojos.OauthClientDetailsPjo;
import club.ndt.oauth.boot.service.OauthClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.stereotype.Component;

/**
 * @author ndt
 * @create time 2018/10/16  9:22
 * @description
 * @modify by
 * @modify time
 **/
@Component
public final class BootClientDetailsService implements ClientDetailsService {

    @Autowired
    private OauthClientService clientService;

    @Override
    public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {

        OauthClientDetailsPjo client = this.clientService.findClientByClientId(clientId);
        if(client==null){
            throw new ClientRegistrationException("客户端不存在");
        }
        client.setAuthorities("READ");
        return new BootClientDetails(client);
    }

}
