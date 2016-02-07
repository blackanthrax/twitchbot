package com.github.blackanthrax.twitchbot.acl.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Channel {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    
    @OneToMany
    private List<ChannelCommandAcl> acl;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public void setAcl(List<ChannelCommandAcl> acl) {
        this.acl = acl;
    }
    
    public List<ChannelCommandAcl> getAcl() {
        return acl;
    }

}
