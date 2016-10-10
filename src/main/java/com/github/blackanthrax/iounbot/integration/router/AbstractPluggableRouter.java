package com.github.blackanthrax.iounbot.integration.router;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.plugin.core.OrderAwarePluginRegistry;
import org.springframework.plugin.metadata.PluginMetadata;

import com.github.blackanthrax.twitchbot.plugin.TwitchbotPlugin;

public abstract class AbstractPluggableRouter {

    @Autowired
    private OrderAwarePluginRegistry<TwitchbotPlugin, PluginMetadata> registry;
    
}
