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

import com.generation.Farmacia.Repository.CategoriaRepository;
import com.generation.Farmacia.model.Categoria;
@RestController
@RequestMapping("/categoria") //aqui é sempre minusculo, como se fosse o endereço da pagina
@CrossOrigin("*")//selecionar tudo da tabela categoria
public class CategoriaController {
    
	@Autowired
	private CategoriaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> GetAll(){
		return ResponseEntity.ok(repository.findAll()); //metodo para chamar o model
		
	}
	
	
	@GetMapping("/{id}") //aqui esta chamando o id
	public ResponseEntity<Categoria>GetById(@PathVariable long id){
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp)) //se acho vai trazer a resposta
				.orElse(ResponseEntity.notFound().build()); //se nao achou vai da uma resposta que nao foi encontrado
	}
	@GetMapping("/descricao/{descricao}")
	public ResponseEntity<List<Categoria>> GetByDescricao(@PathVariable String descricao){
		return ResponseEntity.ok(repository.findAllByDescricaoContainingIgnoreCase(descricao));
		//retorno do repositorio.
	}
	@PostMapping //requestmapping pede um endereço, requestyBody pede um texto
	public ResponseEntity<Categoria> Post(@RequestBody Categoria categoria){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(categoria));
		
	}
	@PutMapping //atualizar
	public ResponseEntity<Categoria> Put(@RequestBody Categoria categoria){
		return ResponseEntity.ok(repository.save(categoria));
	}
	@DeleteMapping("/{id}") //void nao devolve resposta, usamos por que nao esperamos resposta, so deletar.
	
	public void delete(@PathVariable long id) {
		repository.deleteById(id); //path:caminho Variable:variavel //caminho para chegar até a variavel
	}
	//funcao do id nessa estrutura: para buscar a tabela categoria, 
	
	
}
