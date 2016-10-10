package com.github.blackanthrax.iounbot.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.plugin.core.config.EnablePluginRegistries;

import com.github.blackanthrax.twitchbot.plugin.TwitchbotPlugin;

@Configuration
@EnablePluginRegistries(TwitchbotPlugin.class)
public class PluginConfiguration {}
