package com.github.blackanthrax.iounbot.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@IdClass(MembershipId.class)
public class Membership {

    private Person person;
    private Organization organization;
    private Role role;

    @Id
    @ManyToOne
    @PrimaryKeyJoinColumn(name = "personId", referencedColumnName = "id")
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Id
    @ManyToOne
    @PrimaryKeyJoinColumn(name = "OrganizationId", referencedColumnName = "id")
    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    @Id
    @ManyToOne
    @PrimaryKeyJoinColumn(name = "roleId", referencedColumnName = "id")
    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

}
