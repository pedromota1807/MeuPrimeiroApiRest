package br.com.pedromota.cadastrodeenderecos.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.pedromota.cadastrodeenderecos.model.Enderecos;

public interface EnderecoDao extends CrudRepository<Enderecos, Integer>{
	

}
