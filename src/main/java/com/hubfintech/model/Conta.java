package com.hubfintech.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "T_CONTA")
public class Conta implements Serializable {

	private static final long serialVersionUID = 8240753739994340360L;

	@Id
	@Column(name = "ID_CONTA")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "DSC_NOME")
	private String nome;
	
	@Column(name = "DT_CRIACAO")
	private Date dataCriacao;
	
	@Column(name = "DSC_STATUS")
	@Enumerated(EnumType.ORDINAL)
	private Status status = Status.ATIVO;
	
	@Column(name = "ID_CONTA_PAI")
	private Long contaPai;
	
	@ManyToOne(cascade=CascadeType.DETACH)
	@JoinColumn(name = "ID_PESSOA")
	private Pessoa pessoa;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Long getContaPai() {
		return contaPai;
	}

	public void setContaPai(Long contaPai) {
		this.contaPai = contaPai;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
