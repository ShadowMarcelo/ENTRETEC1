package br.com.etec.view;

import javax.persistence.Persistence;

public class teste {
	
	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("ENTRETEC");
	}
}