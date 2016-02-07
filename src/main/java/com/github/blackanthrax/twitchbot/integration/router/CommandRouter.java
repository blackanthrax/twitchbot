package com.github.blackanthrax.twitchbot.integration.router;

import org.pircbotx.hooks.events.MessageEvent;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.Router;

import com.github.blackanthrax.twitchbot.integration.IntegrationConstants;


/**
 * dynamically routes the messages to command channels by the fist word after the
 * exclamation mark.
 * @author mgora
 *
 */
@MessageEndpoint
public class CommandRouter {

    @Router(inputChannel=IntegrationConstants.COMMAND_INPUT)
    public String route(MessageEvent event){
        
        int firstSpace = event.getMessage().indexOf(" ");
        String commandName = event.getMessage().substring(1, firstSpace);
        String channelName = commandName.concat("CommandsInput");
        
        return channelName;
                
    }
}
