package com.generation.lojagames.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_categoria")                   //nome da tabela do mysql

public class Categoria {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	
	                                           //adicionando as categorias
     private long id;
	@NotBlank
	@Size(min=2,max=15)
	private String tipo;
	@NotBlank
	@Size(min=3,max=250)
	private String descricao;
	
	@OneToMany(mappedBy = "categoria", cascade= CascadeType.REMOVE) //para que tudo possa passar por alteracoens
	@JsonIgnoreProperties("categoria")
	private List<Produtos> produtos;
	
	
	public List<Produtos> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produtos> produtos) {
		this.produtos = produtos;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


}
