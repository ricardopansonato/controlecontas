package com.hubfintech.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Entity
@Table(name="T_PESSOA")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="FROM_CLASS", discriminatorType=DiscriminatorType.STRING)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = PessoaFisica.class, name = "PessoaFisica"),
               @JsonSubTypes.Type(value = PessoaJuridica.class, name = "PessoaJuridica")})
public class Pessoa implements Serializable {
	
	private static final long serialVersionUID = 1372943459657076151L;

	@Id
	@Column(name = "ID_PESSOA")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String type;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getType() {
		if (this.type == null) {
			this.type = (this instanceof PessoaFisica) ? "PessoaFisica" : "PessoaJuridica" ;
		}
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
