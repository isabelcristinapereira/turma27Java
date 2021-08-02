package com.generation.Farmacia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.generation.Farmacia.Repository.ProdutoRepository;
import com.generation.Farmacia.model.Produto;

@RestController
@RequestMapping("/produto")
@CrossOrigin("*")
public class ProdutoController {
	@Autowired
	private ProdutoRepository repository;
	@GetMapping
	public ResponseEntity<List<Produto>>GetAll(){
		return ResponseEntity.ok(repository.findAll());
		
	}
	@GetMapping("/id")
	public ResponseEntity<Produto>GetByid(@PathVariable long id){
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp)) 
				.orElse(ResponseEntity.notFound().build()); 
	}
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<Produto>> GetByNome(@PathVariable String nome){
		return ResponseEntity.ok(repository.findAllByNomeContainingIgnoreCase( nome));
		//baseado no repository
		//responseentity: responsavel por levar e trazer informação
		
	}
	
	
	@PostMapping //criação, post da informação
	public ResponseEntity<Produto>Post(@RequestBody Produto produto){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(produto));
	}

	@PutMapping //alteração
	public ResponseEntity<Produto>Put(@RequestBody Produto produto){
		return ResponseEntity.ok(repository.save(produto)); //o retorno da responsyentity ta ok, salva dentro do repositorio a infromacao do produto
	}
	
     @DeleteMapping("/{id}") 
	
	public void delete(@PathVariable long id) {
		repository.deleteById(id); 
	}
}
