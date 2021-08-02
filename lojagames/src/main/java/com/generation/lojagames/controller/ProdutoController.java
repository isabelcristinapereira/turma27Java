package com.generation.lojagames.controller;

import java.util.List;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.generation.LojaGame.model.Categoria;
import org.generation.LojaGame.model.Produto;
import org.generation.LojaGame.repository.ProdutoRepository;
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

import com.generation.lojagames.model.Produtos;

@RestController
@RequestMapping("/produto")
@CrossOrigin("*")
public class ProdutoController {

	@Autowired
	private ProdutosRepository Repository;
	
	@GetMapping 
	public ResponseEntity<List<Produtos>> GetAll (){ 
		return ResponseEntity.ok(Repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Produtos> GetById (@PathVariable long id){
		return Repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
		}
	
	@GetMapping("/nome/{nome}") 
	public ResponseEntity<List<Produtos>> GetByCategoria (@PathVariable String nome){ 
		return ResponseEntity.ok(repository.findAllByNomeContainingIgnoreCase(nome)); 
	}
	
	@PostMapping 
	public ResponseEntity<Produtos> Post (@RequestBody Produtos produto){ 
		return ResponseEntity.status(HttpStatus.CREATED).body(Repository.save(produto)); 
	}
	
	@PutMapping 
	public ResponseEntity<Produtos> Put (@RequestBody Produtos produto){ 
		return ResponseEntity.status(HttpStatus.OK).body(Repository.save(produto)); 
	}
	
	@DeleteMapping("/{id}") 
	public void deleteId (@PathVariable long id) {
		Repository.deleteById(id); 
	}
}