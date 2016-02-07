package com.github.blackanthrax.twitchbot.irc.listener.impl;

import org.pircbotx.hooks.ListenerAdapter;
import org.pircbotx.hooks.events.ConnectEvent;
import org.pircbotx.hooks.events.JoinEvent;
import org.pircbotx.hooks.events.MessageEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.github.blackanthrax.twitchbot.integration.gateway.IrcMessageGateway;

@Component
public class TwitchBotListener extends ListenerAdapter {
    
    @Autowired
    private IrcMessageGateway gateway;

    @Override
    public void onConnect(ConnectEvent event) throws Exception {
        super.onConnect(event);
    }

    @Override
    public void onJoin(JoinEvent event) throws Exception {
        super.onJoin(event);
    }

    @Override
    public void onMessage(MessageEvent event) throws Exception {
        super.onMessage(event);
        gateway.forward(event);
    }
}
