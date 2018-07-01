package br.com.etec.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class PesquisaEsporte {
	@Id
	@GeneratedValue
	private Integer id;
	private Boolean praticaEsporte;
	private Esporte esportePraticado;
	private Esporte gostariaEsporte;
	private Boolean desejoPraticarAlgumEsporte;
	private Boolean houvesseGincana;
	private Boolean houvesseCampeonato;
	private Esporte esporteFavorito;
	private String frenquenciaEsporte;
	
	@ManyToMany
	@JoinTable(name="Perfil_Detalhe_Esporte", joinColumns={@JoinColumn(name="idPesquisaEsporte")},
	inverseJoinColumns={@JoinColumn(name="idPerfil")})
	private List<Perfil> perfis;
	
	
		
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Boolean getPraticaEsporte() {
		return praticaEsporte;
	}
	public void setPraticaEsporte(Boolean praticaEsporte) {
		this.praticaEsporte = praticaEsporte;
	}
	public Esporte getEsportePraticado() {
		return esportePraticado;
	}
	public void setEsportePraticado(Esporte esportePraticado) {
		this.esportePraticado = esportePraticado;
	}
	public Esporte getGostariaEsporte() {
		return gostariaEsporte;
	}
	public void setGostariaEsporte(Esporte gostariaEsporte) {
		this.gostariaEsporte = gostariaEsporte;
	}
	public Boolean getDesejoPraticarAlgumEsporte() {
		return desejoPraticarAlgumEsporte;
	}
	public void setDesejoPraticarAlgumEsporte(Boolean desejoPraticarAlgumEsporte) {
		this.desejoPraticarAlgumEsporte = desejoPraticarAlgumEsporte;
	}
	public Boolean getHouvesseGincana() {
		return houvesseGincana;
	}
	public void setHouvesseGincana(Boolean houvesseGincana) {
		this.houvesseGincana = houvesseGincana;
	}
	public Boolean getHouvesseCampeonato() {
		return houvesseCampeonato;
	}
	public void setHouvesseCampeonato(Boolean houvesseCampeonato) {
		this.houvesseCampeonato = houvesseCampeonato;
	}
	public Esporte getEsporteFavorito() {
		return esporteFavorito;
	}
	public void setEsporteFavorito(Esporte esporteFavorito) {
		this.esporteFavorito = esporteFavorito;
	}
	public String getFrenquenciaEsporte() {
		return frenquenciaEsporte;
	}
	public void setFrenquenciaEsporte(String frenquenciaEsporte) {
		this.frenquenciaEsporte = frenquenciaEsporte;
	}
	
}
	
	
	
	
	
	