package br.com.entretec.infra;

import javax.persistence.Persistence;

public class CriarTabelas {
	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("ENTRETEC");
	}
}
