package com.github.blackanthrax.iounbot.irc.listener.impl;

import org.pircbotx.hooks.events.MessageEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.github.blackanthrax.iounbot.irc.service.BotCommandService;

@Component
public class IrcMessageDispatcher {
    
    @Autowired
    private BotCommandService channelService;

    public void dispatchChatMessage(MessageEvent event) {
        
        if(event.getMessage().startsWith("!join")){
            channelService.joinChannel(event);
        } else if(event.getMessage().startsWith("!leave")){
            channelService.leaveChannel(event);
            
        }
        
        // event.getTags() to get subscriber status and more
        
    }

}
