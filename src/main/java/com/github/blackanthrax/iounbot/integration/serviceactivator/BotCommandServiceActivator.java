package com.github.blackanthrax.iounbot.integration.serviceactivator;

import org.pircbotx.hooks.events.MessageEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

import com.github.blackanthrax.iounbot.integration.IntegrationConstants;
import com.github.blackanthrax.iounbot.irc.service.BotCommandService;

@MessageEndpoint
public class BotCommandServiceActivator {

    @Autowired
    private BotCommandService service;
    
    @ServiceActivator(inputChannel=IntegrationConstants.BOT_COMMANDS_INPUT)
    public void doStuff(MessageEvent event){
        if(event.getMessage().contains("echo")) {
            event.getChannel().send().message(event.getMessage().substring(10));
        }
    }
}
