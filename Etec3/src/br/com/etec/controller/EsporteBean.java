package br.com.etec.controller;

import javax.faces.bean.ManagedBean;

import br.com.etec.model.PesquisaEsporte;

@ManagedBean
public class EsporteBean {
	
	private PesquisaEsporte pe = new PesquisaEsporte();

	public PesquisaEsporte getPe() {
		return pe;
	}

	public void setPe(PesquisaEsporte pe) {
		this.pe = pe;
	}
	

}
