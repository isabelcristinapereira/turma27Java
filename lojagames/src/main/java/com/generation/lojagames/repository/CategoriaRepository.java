package com.generation.lojagames.repository;
import org.springframework.stereotype.Repository;

import com.generation.lojagames.model.Categoria;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CategoriaRepository extends  JpaRepository<Categoria, Long>{
//criar um metodo que vai fazer uma lista e joga tudo de categoria aqui dentro
	public List<Categoria> findAllByDescricaoContainingIgnoreCase(String descricao); 
	//select * tb_categoria where descricao like "%descricao%"
	
}
