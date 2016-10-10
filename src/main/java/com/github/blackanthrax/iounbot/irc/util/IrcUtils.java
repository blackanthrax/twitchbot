package com.github.blackanthrax.iounbot.irc.util;

public class IrcUtils {

    private static final String POUND_SIGN = "#";
    
    public static final String nameToChannel(String name){
        return POUND_SIGN.concat(name);
    }
}
