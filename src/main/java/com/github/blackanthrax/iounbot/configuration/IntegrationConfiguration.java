package com.github.blackanthrax.iounbot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.channel.PublishSubscribeChannel;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

@Configuration
@IntegrationComponentScan(basePackages={"com.github.blackanthrax.iounbot.integration"})
public class IntegrationConfiguration {
    
    @Bean
    public MessageChannel fallback(){
        return new DirectChannel();
    }
    
    @Bean 
    public SubscribableChannel ircInput(){
        return new PublishSubscribeChannel();
    }
}
