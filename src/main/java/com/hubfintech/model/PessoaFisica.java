package com.hubfintech.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.DiscriminatorOptions;

@Entity
@DiscriminatorValue(value="T_PESSOA_FISICA")
@DiscriminatorOptions(force=true)
public class PessoaFisica extends Pessoa {
	
	private static final long serialVersionUID = 6597449127143514520L;

	@Column(name = "DSC_NOME")
	private String nome;
	
	@Column(name = "NR_CPF", unique = true)
	private String cpf;
	
	@Temporal(value=TemporalType.TIMESTAMP)
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
