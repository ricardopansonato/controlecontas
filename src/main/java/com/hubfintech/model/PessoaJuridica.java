package com.hubfintech.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="T_PESSOA_JURIDICA")
public class PessoaJuridica extends Pessoa {
	
	@Column(name = "NR_CNPJ")
	private String cnpj;
	@Column(name = "DSC_RAZAO_SOCIAL")
	private String razaoSocial;
	@Column(name = "DSC_NOME_FANTASIA")
	private String nomeFantasia;
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
}
