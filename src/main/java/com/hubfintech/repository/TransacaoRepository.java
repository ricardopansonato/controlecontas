package com.hubfintech.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hubfintech.ContaApiApplication;
import com.hubfintech.model.Transacao;

@RepositoryRestResource(collectionResourceRel = "transacao", path = ContaApiApplication.API_PATH + "/transacao")
public interface TransacaoRepository extends PagingAndSortingRepository<Transacao, Long> {

}
