package com.github.blackanthrax.iounbot.acl.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class ChannelCommandAclPrimaryKey implements Serializable {

    private static final long serialVersionUID = 4003477897777448609L;
    private Long channel;
    private Long command;
    private Long privilege;

    public void setChannelId(Long channelId) {
        this.channel = channelId;
    }

    public Long getChannelId() {
        return channel;
    }

    public void setCommandId(Long commandId) {
        this.command = commandId;
    }

    public Long getCommandId() {
        return command;
    }

    public void setPrivilegeId(Long privilegeId) {
        this.privilege = privilegeId;
    }

    public Long getPrivilegeId() {
        return privilege;
    }

    @Override
    public int hashCode() {
        return (int) (command + privilege + channel);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ChannelCommandAclPrimaryKey) {
            ChannelCommandAclPrimaryKey pk = (ChannelCommandAclPrimaryKey) obj;
            return (pk.getChannelId() == this.getChannelId())
                    && (pk.getCommandId() == this.getCommandId())
                    && (pk.getPrivilegeId() == this.getPrivilegeId());
        }
        return false;
    }
}
