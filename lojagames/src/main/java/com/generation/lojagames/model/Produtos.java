package com.generation.lojagames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity //companheiro do create table
@Table(name= "tb_produtos") //create table

public class Produtos {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //aut_increment
	private long id;
	@NotBlank //não nulo e não vazio
	@Size(min=3,max=100)
	private String nome; //varchar
	@Min(1)
	private double preco;
	private boolean disponivel;
	
	//chave estrangeira(categoria_id)
	@ManyToOne  
	 @JsonIgnoreProperties("produtos") //para não da lista infinita
	//para relacionar as tabelas, quantidades de dados que eu estou recebendo
	private Categoria categoria; //chama a class categoria e define o nome
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public boolean isDisponivel() {
		return disponivel;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	

}
