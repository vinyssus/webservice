package com.projet.microserviceBank.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.projet.microserviceBank.entity.Compte;

@RepositoryRestResource
public interface CompteRepository extends JpaRepository<Compte, Long>{

}
