package br.com.entretec.DAO;

import javax.persistence.EntityManager;

import br.com.etec.model.PesquisaEsporte;


public class PesquisaDAO {
	
	private final DAO<PesquisaEsporte> dao;

	public PesquisaDAO(EntityManager em) {
		dao = new DAO<PesquisaEsporte>(em, PesquisaEsporte.class);
	}

	public void adiciona(PesquisaEsporte t) {
		dao.adiciona(t);
	}

}
