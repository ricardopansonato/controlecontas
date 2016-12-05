package com.hubfintech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hubfintech.model.PessoaJuridica;

@RepositoryRestResource(collectionResourceRel = "pessoaJuridica", path = "pessoaJuridica")
public interface PessoaJuridicaRepository extends JpaRepository<PessoaJuridica, Long> {
}
