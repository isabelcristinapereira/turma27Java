package com.generation.lojagames.controller;

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

import com.generation.lojagames.model.Categoria;
import com.generation.lojagames.repository.CategoriaRepository;

@RestController //informa que a categoriacontroller é o nosso controller
@RequestMapping("/categoria") //define o caminho da rota ou página
@CrossOrigin("*")//juntar front e back quando hospedados em sites diferentes
public class CategoriaController {

	
	@Autowired // troca a responsabilidade de CategoriaRepository para repository
	private CategoriaRepository repository;
	@GetMapping
	public ResponseEntity<List<Categoria>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
 
	@GetMapping ({"/id"})
	public ResponseEntity<Categoria>GetById(@PathVariable long id){
		 return repository.findById(id)    // pega todos os id
				.map(resp -> ResponseEntity.ok(resp)) // se tiver o id da ok
				.orElse(ResponseEntity.notFound().build());	// se n tiver, da erro
		
	}
	@PostMapping // metodo para postar alguma coisa, publicacao, postagem, vai usar a mesma rota principal
	public ResponseEntity<Categoria> Post (@RequestBody Categoria categoria){ // faz requisição da body
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(categoria)); // salva a requisiçao
	}
	@PutMapping // metodo para atualizar dados ,vai usar a mesma rota principal
	public ResponseEntity<Categoria> Put (@RequestBody Categoria categoria){ // faz requisição da body
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(categoria)); // atualiza a requisição
	}
	
	@DeleteMapping("/{id}") // metodo para apagar um id ,vai usar a mesma rota principal
	public void deleteId (@PathVariable long id) { // pega a requisição
		repository.deleteById(id); // deleta o id
	}
}
		
