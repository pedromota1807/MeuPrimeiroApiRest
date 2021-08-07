package br.com.pedromota.cadastrodeenderecos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name = "endereco")
public class Enderecos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id_endereco")
	private int id;
	
	@Column(length = 100, nullable = false)
	private String logradouro;
	
	@Column(nullable = false)
	private int numero;
	
	@Column(length = 100, nullable = true)
	private String complemento;
	
	@Column(length = 100, nullable = false)
	private String bairro;
	
	@Column(length = 100, nullable = false)
	private String cidade;
	
	@Column(length = 2, nullable = false)
	private String estado;
	
	@ManyToOne
	@JoinColumn(name = "cpf")
	@JsonIgnoreProperties("listaEnderecos")
	private Usuario userFk;
	
	public int getId() {
		return id;
	}
	public void setId(int idEnd) {
		this.id = id;
	}
	
	public Usuario getUserFk() {
		return userFk;
	}
	public void setUserFk(Usuario userFk) {
		this.userFk = userFk;
	}
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
