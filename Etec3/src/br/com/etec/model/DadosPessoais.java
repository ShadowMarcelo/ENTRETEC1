package br.com.etec.model;

import javax.persistence.Embeddable;
import java.util.Date;
@Embeddable
public class DadosPessoais {
private String nome;
private Integer rg;
private Integer cpf;
private String sexo;
private Date dataNascimento;
private boolean deficiente;
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public Integer getRg() {
	return rg;
}
public void setRg(Integer rg) {
	this.rg = rg;
}
public Integer getCpf() {
	return cpf;
}
public void setCpf(Integer cpf) {
	this.cpf = cpf;
}
public String getSexo() {
	return sexo;
}
public void setSexo(String sexo) {
	this.sexo = sexo;
}
public Date getDataNascimento() {
	return dataNascimento;
}
public void setDataNascimento(Date dataNascimento) {
	this.dataNascimento = dataNascimento;
}
public boolean isDeficiente() {
	return deficiente;
}
public void setDeficiente(boolean deficiente) {
	this.deficiente = deficiente;
}

}
