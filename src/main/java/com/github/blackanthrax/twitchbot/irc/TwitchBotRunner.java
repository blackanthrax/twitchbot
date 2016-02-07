package com.github.blackanthrax.twitchbot.irc;

import java.io.IOException;

import org.pircbotx.PircBotX;
import org.pircbotx.exception.IrcException;

public class TwitchBotRunner extends Thread{
    
    private PircBotX bot;
    
    public TwitchBotRunner(PircBotX bot) {
        this.bot = bot;
    }
    
    public void run() {
        
        try {
            bot.startBot();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IrcException e) {
            e.printStackTrace();
        }
    }
    
    public PircBotX getBot() {
        return bot;
    }
    
    public void startBot(){
        new Thread(this).start();
    }

}
