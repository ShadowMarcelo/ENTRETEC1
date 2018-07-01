package br.com.entretec.business;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.entretec.DAO.SugestaoDAO;
import br.com.entretec.infra.JPAUtil;
import br.com.etec.model.Sugestao;

public class SugestaoRN {
	Sugestao sugestao = new Sugestao();
	List<Sugestao>sugestoes  = new ArrayList<Sugestao>();


public void gravar(Sugestao entity) {
	EntityManager em = new JPAUtil().getEntityManager();
    em.getTransaction().begin();
    SugestaoDAO dao = new SugestaoDAO(em);
    dao.adiciona(entity);
    em.getTransaction().commit();
    em.close();
}

}
