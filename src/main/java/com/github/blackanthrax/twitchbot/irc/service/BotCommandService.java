package com.github.blackanthrax.twitchbot.irc.service;

import org.pircbotx.PircBotX;
import org.pircbotx.hooks.events.MessageEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.github.blackanthrax.twitchbot.irc.util.IrcConstants;

import static com.github.blackanthrax.twitchbot.irc.util.IrcUtils.nameToChannel;

@Component
public class BotCommandService {

    @Autowired
    private PircBotX bot;

    public void joinChannel(MessageEvent event) {
        if (event.getChannel().getName().equals(nameToChannel(bot.getNick()))) {
            bot.send().joinChannel(nameToChannel(event.getUser().getNick()));
        } else {
            bot.send().message(
                    event.getChannel().getName(),
                    String.format("%s you can not use this command outside of %s's channel.",
                            event.getUser().getNick(), bot.getNick()));
        }

    }

    public void leaveChannel(MessageEvent event) {

        if (event.getChannel().getName().equals(nameToChannel(bot.getNick()))) {
            bot.sendRaw().rawLineNow(
                    IrcConstants.PART.concat(nameToChannel(event.getUser().getNick())));
        } else {
            bot.send().message(
                    event.getChannel().getName(),
                    String.format("%s you can not use this command outside of %s's channel.",
                            event.getUser().getNick(), bot.getNick()));
        }

    }
}
