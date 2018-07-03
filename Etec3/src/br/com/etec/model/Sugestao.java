package br.com.etec.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity



public class Sugestao {

	
	@Id
	@GeneratedValue
	private int id;
	private String tipoSugestao;
	private Boolean anonimo;
	private String descricao;
	
	@ManyToOne
	private Usuario usuario;
	
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getTipoSugestao() {
		return tipoSugestao;
	}
	public void setTipoSugestao(String tipoSugestao) {
		this.tipoSugestao = tipoSugestao;
	}
	public Boolean getAnonimo() {
		return anonimo;
	}
	public void setAnonimo(Boolean anonimo) {
		this.anonimo = anonimo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}

