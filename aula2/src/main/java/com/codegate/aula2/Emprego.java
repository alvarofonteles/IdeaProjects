package com.codegate.aula2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Emprego {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@NotEmpty(message = "Titulo não pode ser nulo.")
	@Size(min = 5, max = 20, message = "Mínimo de 05 Caracteres.")
	private String titulo;

	@NotEmpty(message = "Empresa não pode ser nula.")
	@Size(min = 3, max = 50, message = "Mínimo de 03 Caracteres e Máximo de 50.")
	private String empresa;

	@NotEmpty(message = "Descrição não pode ser nula.")
	@Size(min = 10, max = 100, message = "Mínimo de 10 Caracteres e Máximo de 100.")
	private String descricao;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
