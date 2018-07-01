package br.com.entretec.DAO;

import javax.persistence.EntityManager;

import br.com.etec.model.Sugestao;

public class SugestaoDAO {
	private final DAO<Sugestao> dao;

	public SugestaoDAO(EntityManager em) {
		dao = new DAO<Sugestao>(em, Sugestao.class);
	}

	public void adiciona(Sugestao t) {
		dao.adiciona(t);
	}
}
