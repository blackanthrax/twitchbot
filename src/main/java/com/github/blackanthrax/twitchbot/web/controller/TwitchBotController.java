package com.github.blackanthrax.twitchbot.web.controller;

import java.security.Principal;

import org.pircbotx.PircBotX;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.blackanthrax.twitchbot.web.dto.ChannelDto;

@RestController
@RequestMapping("/api")
public class TwitchBotController {

    @Autowired
    private PircBotX bot;
    
    @RequestMapping
    public Principal user(Principal principal){
        return principal;
    }

    @RequestMapping(value = "/join", method = RequestMethod.POST)
    public void join(@RequestBody ChannelDto channel) {
        bot.send().joinChannel(channel.getName());
    }

    @RequestMapping(value = "/leave", method = RequestMethod.POST)
    public void leave(@RequestBody ChannelDto channel) {
        bot.sendRaw().rawLine("PART " + channel.getName());
    }
}
