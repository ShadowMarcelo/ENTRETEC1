package br.com.entretec.business;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.entretec.DAO.PesquisaDAO;
import br.com.entretec.infra.JPAUtil;
import br.com.etec.model.PesquisaEsporte;


public class PesquisaRN {
	PesquisaEsporte pesquisaEsporte = new PesquisaEsporte();
	List<PesquisaEsporte>pesquisas  = new ArrayList<PesquisaEsporte>();
	
	public void gravar(PesquisaEsporte entity) {
		EntityManager em = new JPAUtil().getEntityManager();
	    em.getTransaction().begin();
	    PesquisaDAO dao = new PesquisaDAO(em);
	    dao.adiciona(entity);
	    em.getTransaction().commit();
	    em.close();
	}
	
	

}
