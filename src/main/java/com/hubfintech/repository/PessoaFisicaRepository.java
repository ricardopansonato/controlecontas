package com.hubfintech.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hubfintech.ContaApiApplication;
import com.hubfintech.model.PessoaFisica;

@RepositoryRestResource(collectionResourceRel = "pessoaFisica", path = ContaApiApplication.API_PATH + "/pessoaFisica")
public interface PessoaFisicaRepository extends PagingAndSortingRepository<PessoaFisica, Long> {

}
