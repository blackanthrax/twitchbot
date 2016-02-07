package com.github.blackanthrax.twitchbot.acl.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class ChannelCommandAcl {

    
    @ManyToOne
    private Channel channel;

    @ManyToOne
    private Command command;

    @ManyToOne
    private UserPrivilege privilege;
    
    @EmbeddedId
    private ChannelCommandAclPrimaryKey id;

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public UserPrivilege getPrivilege() {
        return privilege;
    }

    public void setPrivilege(UserPrivilege privilege) {
        this.privilege = privilege;
    }

}
