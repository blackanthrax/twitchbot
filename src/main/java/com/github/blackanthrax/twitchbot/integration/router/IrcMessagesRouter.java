package com.github.blackanthrax.twitchbot.integration.router;

import org.pircbotx.hooks.events.MessageEvent;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.Router;

import com.github.blackanthrax.twitchbot.integration.IntegrationConstants;

@MessageEndpoint
public class IrcMessagesRouter {

    @Router(inputChannel=IntegrationConstants.IRC_INPUT)
    public String route(MessageEvent event){
        if(event.getMessage().startsWith("!")){
            return IntegrationConstants.COMMAND_INPUT;
        }
        return IntegrationConstants.MESSAGE_INPUT;
    }
}
