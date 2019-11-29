package com.hidroginastica.hidroginastica.moldels;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Evento implements Serializable {
	private static final long serialVersionUIO = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long Ide;
	@NotEmpty
	private String nome;
	@NotEmpty
	private String horario;
	@NotEmpty
	private String local;
	@NotEmpty
	private String data;
	
	//Metodos get e set.
	public long getIde() {
		return Ide;
	}
	public void setIde(long ide) {
		Ide = ide;
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
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
	
}