package br.com.etec.model;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Usuario {
	@Id
	@GeneratedValue
private Integer id;
	@Embedded
	private DadosPessoais dadosPessoais;
	@Embedded
	private Contato contato;
	@Embedded
	private Endereco endereco;
	
	@OneToMany(mappedBy="usuario")
	private List<Sugestao>sugestoes;
	
	
	public List<Sugestao> getSugestoes() {
		return sugestoes;
	}
	public void setSugestoes(List<Sugestao> sugestoes) {
		this.sugestoes = sugestoes;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}
	public void setDadosPessoais(DadosPessoais dadosPessoais) {
		this.dadosPessoais = dadosPessoais;
	}
	public Contato getContato() {
		return contato;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	






}
