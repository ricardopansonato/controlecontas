package com.hubfintech.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_TRANSACAO")
public class Transacao {
	
	@Id
	@Column(name = "ID_TRANSACAO")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "ID_CONTA_ORIGEM")
	private Long contaOrigem;
	
	@Column(name = "ID_CONTA_DESTINO")
	private Long contaDestino;
	
	@Column(name = "NM_VALOR")
	private Double valor;
	
	@Column(name = "DSC_APORTE")
	private String aporte;

	public Long getContaOrigem() {
		return contaOrigem;
	}

	public void setContaOrigem(Long contaOrigem) {
		this.contaOrigem = contaOrigem;
	}

	public Long getContaDestino() {
		return contaDestino;
	}

	public void setContaDestino(Long contaDestino) {
		this.contaDestino = contaDestino;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getAporte() {
		return aporte;
	}

	public void setAporte(String aporte) {
		this.aporte = aporte;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
