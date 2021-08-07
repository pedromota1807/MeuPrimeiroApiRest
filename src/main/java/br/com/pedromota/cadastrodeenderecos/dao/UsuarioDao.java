package br.com.pedromota.cadastrodeenderecos.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.pedromota.cadastrodeenderecos.model.Usuario;

@Repository
public interface UsuarioDao extends CrudRepository<Usuario, String>{

}
