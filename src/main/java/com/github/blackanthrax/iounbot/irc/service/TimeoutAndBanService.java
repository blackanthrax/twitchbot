package com.github.blackanthrax.iounbot.irc.service;

import org.pircbotx.PircBotX;
import org.pircbotx.hooks.events.MessageEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TimeoutAndBanService {

    @Autowired
    private PircBotX bot;
    
    public void timeout(MessageEvent event){
        String user = event.getUser().getNick();
        bot.send().message(event.getChannel().getName(), String.format(".timeout %s", user));
    }
    
    public void ban(MessageEvent event){
        
    }
}
