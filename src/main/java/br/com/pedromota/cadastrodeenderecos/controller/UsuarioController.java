package br.com.pedromota.cadastrodeenderecos.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.pedromota.cadastrodeenderecos.dao.UsuarioDao;
import br.com.pedromota.cadastrodeenderecos.model.Enderecos;
import br.com.pedromota.cadastrodeenderecos.model.Usuario;

@RestController
public class UsuarioController {
	
	@Autowired
	private UsuarioDao userDao;
	
	@GetMapping("/usuario")
	public ArrayList<Usuario> listarTodos(){
		ArrayList<Usuario> listaUsuarios;
		listaUsuarios = (ArrayList<Usuario>)userDao.findAll();
		return listaUsuarios;
	}
	
	@PostMapping("/usuario")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario adicionarUsuario(@RequestBody Usuario usuario){
	   return userDao.save(usuario);
	}
	
	@GetMapping("/usuario/{cpf}")
	public Usuario listaEndCpf(@PathVariable String cpf) {
		Usuario user = userDao.findById(cpf).get();
			return user;
	}

}
