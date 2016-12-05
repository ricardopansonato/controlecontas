package com.hubfintech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hubfintech.model.Conta;

@RepositoryRestResource(collectionResourceRel = "conta", path = "conta")
public interface ContaRepository extends JpaRepository<Conta, Long> {
}
