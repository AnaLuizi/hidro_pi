package com.hidroginastica.hidroginastica.moldels;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Aluno implements Serializable{
	
	private static final long serialVersionUIO = 1L;
	
	//Alô @@@@@
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long Id;
	@NotEmpty
	private String nome;
	@NotEmpty
	private String endereco;
	@NotEmpty
	private String Telefone;
	@NotEmpty
	private String cpf;
	
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
