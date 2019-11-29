package com.hidroginastica.hidroginastica.moldels;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;
@Entity
public class Turma implements Serializable {
	private static final long serialVersionUIO = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long codigo;
	@NotEmpty
	private String nome;
	@NotEmpty
	private String horario;
	@NotEmpty
	private String diasSem;
	
	//Metodos get e set.
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getDiasSem() {
		return diasSem;
	}
	public void setDiasSem(String diasSem) {
		this.diasSem = diasSem;
	}
	
	
	

}
