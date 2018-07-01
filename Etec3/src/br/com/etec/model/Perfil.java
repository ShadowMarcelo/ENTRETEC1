package br.com.etec.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class Perfil {
	
	@Id
	@GeneratedValue
	
	
private Integer id;
private String Apelido;

public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getApelido() {
	return Apelido;
}
public void setApelido(String apelido) {
	Apelido = apelido;
}



}
