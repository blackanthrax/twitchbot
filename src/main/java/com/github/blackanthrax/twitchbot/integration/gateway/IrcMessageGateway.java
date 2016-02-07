package com.github.blackanthrax.twitchbot.integration.gateway;

import org.pircbotx.hooks.events.MessageEvent;
import org.springframework.integration.annotation.Gateway;

import com.github.blackanthrax.twitchbot.integration.IntegrationConstants;


public interface IrcMessageGateway {

    @Gateway(requestChannel=IntegrationConstants.IRC_INPUT)
    public void forward(MessageEvent event);

}
