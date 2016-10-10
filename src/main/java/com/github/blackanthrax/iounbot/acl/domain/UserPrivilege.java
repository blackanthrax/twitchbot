package com.github.blackanthrax.iounbot.acl.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class UserPrivilege {

    @Id
    @GeneratedValue
    private Long id;
    private TwitchPrivilegeTypes privilege;
    
    @OneToMany
    private List<ChannelCommandAcl> acl;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setPrivilege(TwitchPrivilegeTypes privilege) {
        this.privilege = privilege;
    }

    public TwitchPrivilegeTypes getPrivilege() {
        return privilege;
    }

    public void setAcl(List<ChannelCommandAcl> acl) {
        this.acl = acl;
    }
    
    public List<ChannelCommandAcl> getAcl() {
        return acl;
    }
    
}
