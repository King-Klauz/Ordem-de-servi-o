package com.claudio.domain;

import java.util.Objects;

public abstract class Pessoa {
	private Integer Id;
	private String nome;
	private String cpf;
	private String telefone;

	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pessoa(Integer id, String nome, String cpf, String telefone) {
		super();
		Id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id, cpf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return Objects.equals(Id, other.Id) && Objects.equals(cpf, other.cpf);
	}

}
