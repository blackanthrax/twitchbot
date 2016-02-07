package com.github.blackanthrax.twitchbot.integration.router;

import org.pircbotx.hooks.events.MessageEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.Router;

import com.github.blackanthrax.twitchbot.integration.IntegrationConstants;

@MessageEndpoint
public class CapsRouter {
    
    private final Logger log = LoggerFactory.getLogger(this.getClass());
    

    @Router(inputChannel=IntegrationConstants.MESSAGE_INPUT)
    public String route(MessageEvent event){
        if(event.getMessage().matches("^[A-Z]+$")){
            return IntegrationConstants.CAPSLOCK_INPUT; 
        }
        return IntegrationConstants.BANNED_WORDS_INPUT;
    }
}
