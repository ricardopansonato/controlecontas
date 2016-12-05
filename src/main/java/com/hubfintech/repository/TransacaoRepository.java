package com.hubfintech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hubfintech.model.Transacao;

@RepositoryRestResource(collectionResourceRel = "transacao", path = "transacao")
public interface TransacaoRepository extends JpaRepository<Transacao, Long> {
}
