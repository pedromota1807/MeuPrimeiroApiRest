package br.com.pedromota.cadastrodeenderecos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.com.pedromota.cadastrodeenderecos.dao.EnderecoDao;
import br.com.pedromota.cadastrodeenderecos.model.Enderecos;

@RestController
public class EnderecoController {
	
	@Autowired
	private EnderecoDao endDao;
	
	@GetMapping("/enderecos")
	public List listarEnd() {
		return (List) endDao.findAll();
	}
	
	@PostMapping("/enderecos")
	@ResponseStatus(HttpStatus.CREATED)
	public Enderecos adicionarEndereco(@RequestBody Enderecos endereco){
	   return endDao.save(endereco);
	}
	
	@GetMapping("/enderecos/{id}")
	public Enderecos listaEndCpf(@PathVariable int id) {
		Enderecos end = endDao.findById(id).get();
		return end;
	}

}
