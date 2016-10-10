package com.github.blackanthrax.iounbot.configuration;

import org.pircbotx.PircBotX;
import org.pircbotx.cap.EnableCapHandler;
import org.pircbotx.hooks.ListenerAdapter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.blackanthrax.iounbot.irc.TwitchBotRunner;

@Configuration
@ConfigurationProperties
public class TwitchBotConfiguration {
    
    @Value("${twitch.tmi.name}")
    private String name;
    
    @Value("${twitch.tmi.token}")
    private String token;

    @Bean
    public org.pircbotx.Configuration pircbotxConfig(ListenerAdapter listener) {
        org.pircbotx.Configuration configuration = new org.pircbotx.Configuration.Builder()
                .addServer("irc.twitch.tv")
                .setOnJoinWhoEnabled(false)
                .setName(name)
                .setCapEnabled(true)
                .setServerPassword(token)
                .addCapHandler(new EnableCapHandler("twitch.tv/membership"))
                .addCapHandler(new EnableCapHandler("twitch.tv/tags"))
                .addCapHandler(new EnableCapHandler("twitch.tv/commands"))
                .addListener(listener)
                .buildConfiguration();
        return configuration;
    }
    
    @Bean(initMethod="startBot")
    public TwitchBotRunner runner(PircBotX bot){
        return new TwitchBotRunner(bot);
    }
    
    @Bean
    public PircBotX pircbotx(org.pircbotx.Configuration configuration){
        return new PircBotX(configuration);
    }
}
