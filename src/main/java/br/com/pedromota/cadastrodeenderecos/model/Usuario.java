package br.com.pedromota.cadastrodeenderecos.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "usuario")
public class Usuario {
	
	@Column(length = 100, nullable = false)
	private String nome;
	@Id
	@Column(length = 11, nullable = false)
	private String cpf;
	@Column(length = 100, nullable = false)
	private String email;
	@Column(name = "data_nascimento", nullable = false, unique = true)
	private String dataNasc;
	@OneToMany(mappedBy = "userFk", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("userFk")
	public List<Enderecos> listaEnderecos;
	
	
	public List<Enderecos> getListaEnderecos() {
		return listaEnderecos;
	}
	public void setListaEnderecos(List<Enderecos> listaEnderecos) {
		this.listaEnderecos = listaEnderecos;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}
}
