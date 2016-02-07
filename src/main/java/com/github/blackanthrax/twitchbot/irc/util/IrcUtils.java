package com.github.blackanthrax.twitchbot.irc.util;

public class IrcUtils {

    private static final String POUND_SIGN = "#";
    
    public static final String nameToChannel(String name){
        return POUND_SIGN.concat(name);
    }
}
