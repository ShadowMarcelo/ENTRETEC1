package br.com.entretec.infra;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	
	private static  EntityManagerFactory gerenciadorDeEntidade = Persistence.createEntityManagerFactory("ENTRETEC");
	
	public EntityManager getEntityManager(){
		return gerenciadorDeEntidade.createEntityManager();  
	}
}
