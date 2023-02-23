package com.tfd.pegaqui.entities;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.ManyToMany;

@Entity // identificando classe como entidade (JPA) para usá-la no banco de dados
@Table(name = "tb_usuarios") // tabela de usuários
public class Usuario {
	
	@Id // identificando que é a chave primária do banco
	@GeneratedValue(strategy = GenerationType.IDENTITY) // função que gera um valor auto incrementável no banco de dados
    private int id;

	private String nome;
	private String email;
	private String genero;
	private String senha;
	
    @ManyToMany
    private List<Turma> turmasFavoritadas;
	
    public Usuario() {} // default construtor

	public Usuario(String nome, String senha, String email, String genero){
		this.nome = nome;
		this.senha = senha;
		this.email = email;
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

    public String getSenha() {
		return this.senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

}
