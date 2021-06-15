package com.example.domain;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Curso {

	@Id @GeneratedValue
	private Long id;
	private String nome;
	private String descricao;
	private String ementa;
	private Date dataCadastro;
	private Date dataInicio;
	private float valor;
	
	
	public Curso() {
	}
	public Curso(Long id, String nome, String descricao, String ementa, Date dataCadastro, Date dataInicio,
			float valor) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.ementa = ementa;
		this.dataCadastro = dataCadastro;
		this.dataInicio = dataInicio;
		this.valor = valor;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getEmenta() {
		return ementa;
	}
	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	
}
