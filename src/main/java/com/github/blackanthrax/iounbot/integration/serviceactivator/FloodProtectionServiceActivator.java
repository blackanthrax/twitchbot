package com.github.blackanthrax.iounbot.integration.serviceactivator;

import java.util.Map;

import org.pircbotx.hooks.events.MessageEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

import com.github.blackanthrax.iounbot.integration.IntegrationConstants;

@MessageEndpoint
public class FloodProtectionServiceActivator {
    
    private static final Logger LOG = LoggerFactory.getLogger(FloodProtectionServiceActivator.class);

    private Map<String, Integer> messages;

    @ServiceActivator(inputChannel = IntegrationConstants.IRC_INPUT)
    public void checkFlood(MessageEvent event) {
        LOG.info("MESSAGE INC");
        String user = event.getUser().getNick();
        Integer numMessages = messages.get(user) != null ? messages.get(user) + 1 : 0;
        LOG.info("MESSAGE : {}", user);
        if (messages.get(user) != null && messages.get(user) > 10) {
            event.getChannel().send().message(".timeout ".concat(user).concat(" 60"));
            event.getChannel().send().message("FLOOD PROT");
        } else {
            messages.put(user, numMessages);
        }

    }
}
