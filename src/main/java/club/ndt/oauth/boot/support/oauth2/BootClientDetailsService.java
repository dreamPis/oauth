/*
package club.ndt.oauth.boot.support.oauth2;

import club.ndt.oauth.boot.entity.Client;
import club.ndt.oauth.boot.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.stereotype.Component;

*/
/**
 * @author ndt
 * @create time 2018/10/16  9:22
 * @description
 * @modify by
 * @modify time
 **//*

@Component
public final class BootClientDetailsService implements ClientDetailsService {

    @Autowired
    private IClientService clientService;

    @Override
    public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {

        Client client = this.clientService.findClientByClientId(clientId);

        if(client==null){
            throw new ClientRegistrationException("客户端不存在");
        }
        BootClientDetails details=new BootClientDetails(client);

        return details;
    }

}
*/
