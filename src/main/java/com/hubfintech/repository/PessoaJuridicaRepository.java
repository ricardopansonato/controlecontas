package com.hubfintech.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hubfintech.model.PessoaJuridica;

@RepositoryRestResource(collectionResourceRel = "pessoaJuridica", path = "pessoaJuridica")
public interface PessoaJuridicaRepository extends PagingAndSortingRepository<PessoaJuridica, Long> {

}
