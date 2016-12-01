package com.hubfintech.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hubfintech.model.PessoaFisica;

@RepositoryRestResource(collectionResourceRel = "pessoaFisica", path = "pessoaFisica")
public interface PessoaFisicaRepository extends PagingAndSortingRepository<PessoaFisica, Long> {

}
