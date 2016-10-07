package com.github.blackanthrax.twitchbot.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.plugin.core.config.EnablePluginRegistries;

import com.github.blackanthrax.twitchbot.plugin.BotPlugin;

@Configuration
@EnablePluginRegistries(BotPlugin.class)
public class PluginConfiguration {}
