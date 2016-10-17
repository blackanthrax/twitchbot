package com.github.blackanthrax.iounbot.persistence.domain;

import java.io.Serializable;

public class MembershipId implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 630641598678613512L;
    private Long organization;
    private Long person;
    private Long role;

    public MembershipId() {
    }

    public MembershipId(Long organizationId, Long personId, Long roleId) {
        super();
        this.organization = organizationId;
        this.person = personId;
        this.role = roleId;
    }

    public Long getOrganization() {
        return organization;
    }

    public void setOrganization(Long organizationId) {
        this.organization = organizationId;
    }

    public Long getPerson() {
        return person;
    }

    public void setPerson(Long personId) {
        this.person = personId;
    }

    public Long getRole() {
        return role;
    }

    public void setRole(Long roleId) {
        this.role = roleId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((organization == null) ? 0 : organization.hashCode());
        result = prime * result + ((person == null) ? 0 : person.hashCode());
        result = prime * result + ((role == null) ? 0 : role.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        MembershipId other = (MembershipId) obj;
        if (organization == null) {
            if (other.organization != null) return false;
        } else if (!organization.equals(other.organization)) return false;
        if (person == null) {
            if (other.person != null) return false;
        } else if (!person.equals(other.person)) return false;
        if (role == null) {
            if (other.role != null) return false;
        } else if (!role.equals(other.role)) return false;
        return true;
    }

}
