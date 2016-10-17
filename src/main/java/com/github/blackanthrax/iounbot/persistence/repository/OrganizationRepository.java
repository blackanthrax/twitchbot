package com.github.blackanthrax.iounbot.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.blackanthrax.iounbot.persistence.domain.Organization;

@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Long>{

}
