package com.hubfintech.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_PESSOA_FISICA")
public class PessoaFisica extends Pessoa {
	
	@Column(name = "DSC_NOME")
	private String nome;
	@Column(name = "NR_CPF")
	private String cpf;
	@Temporal(value=TemporalType.DATE)
	@Column(name = "DT_NASCIMENTO")
	private Date dataNascimento;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}
