package com.github.blackanthrax.iounbot.irc;

import java.io.IOException;

import org.pircbotx.PircBotX;
import org.pircbotx.exception.IrcException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TwitchBotRunner extends Thread {

    private static final Logger LOG = LoggerFactory.getLogger(TwitchBotRunner.class);

    private PircBotX bot;

    public TwitchBotRunner(PircBotX bot) {
        this.bot = bot;
    }

    public void run() {

        try {
            bot.startBot();
        } catch (IOException e) {
            LOG.error("IO Exception occured.", e);
        } catch (IrcException e) {
            LOG.error("IRC Exception occured.", e);
        }
    }

    public PircBotX getBot() {
        return bot;
    }

    public void startBot() {
        new Thread(this).start();
    }

}
