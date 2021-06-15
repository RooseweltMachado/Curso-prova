package com.example.demo;

import java.sql.Date;

public class CursoDTO {
	private String nome;
	private String descricao;
	private String ementa;
	private Date dataCadastro;
	private Date dataInicio;
	private float valor;
	
	
	public CursoDTO() {
		
	}
	public CursoDTO(String nome, String descricao, String ementa, Date dataCadastro, Date dataInicio, float valor) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.ementa = ementa;
		this.dataCadastro = dataCadastro;
		this.dataInicio = dataInicio;
		this.valor = valor;
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
