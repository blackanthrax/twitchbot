package com.github.blackanthrax.iounbot.integration.gateway;

import org.pircbotx.hooks.events.MessageEvent;
import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

import com.github.blackanthrax.iounbot.integration.IntegrationConstants;

@MessagingGateway(name="IrcMessageGateway")
public interface IrcMessageGateway {

    @Gateway(requestChannel=IntegrationConstants.IRC_INPUT)
    public void forward(MessageEvent event);

}
