package com.generation.blogPessoal.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.blogPessoal.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	//optional por que pode retornar um nulo
	//findby e um nome reservado
	public Optional <Usuario> findByUsuario(String usuario);
	
	public List <Usuario> findAllByNomeContainingIgnoreCase (String nome);
	
	public Usuario findByNome(String nome);
	
}

