package com.github.blackanthrax.twitchbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableAutoConfiguration
@EnableConfigurationProperties
public class TwitchBot {

    public static void main(String[] args) {
        SpringApplication.run(TwitchBot.class, args);
    }

}
