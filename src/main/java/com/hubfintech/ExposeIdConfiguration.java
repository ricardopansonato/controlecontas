package com.hubfintech;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

import com.hubfintech.model.Conta;
import com.hubfintech.model.Pessoa;
import com.hubfintech.model.PessoaFisica;
import com.hubfintech.model.PessoaJuridica;
import com.hubfintech.model.Transacao;

@Configuration
public class ExposeIdConfiguration extends RepositoryRestMvcConfiguration {
	
    @Override
    protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Conta.class);
        config.exposeIdsFor(Pessoa.class);
        config.exposeIdsFor(PessoaFisica.class);
        config.exposeIdsFor(PessoaJuridica.class);
        config.exposeIdsFor(Transacao.class);
    }
}
