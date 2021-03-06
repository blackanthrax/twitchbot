package com.github.blackanthrax.iounbot.integration.serviceactivator;

import org.pircbotx.hooks.events.MessageEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

import com.github.blackanthrax.iounbot.integration.IntegrationConstants;
import com.github.blackanthrax.iounbot.irc.service.TimeoutAndBanService;

@MessageEndpoint
public class TimeoutServiceActivator {

    @Autowired
    private TimeoutAndBanService service;

    @ServiceActivator(inputChannel = IntegrationConstants.TIMEOUT_INPUT)
    public void timeout(MessageEvent event) {
       
    }
}
