// pacote "ENTITIES": é dessa forma que o spring identifica uma classe que 
// será utilizada para suas funções de mapeamento objeto-relacional

package com.tfd.pegaqui.entities;

// import java.io.File;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
// import jakarta.persistence.JoinColumn;
// import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
// import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

// identifica a classe como entidade para o mapeamento objeto-relacional
@Entity 
@Table(name = "tb_professores") // o modelo relacional é uma tabela e o nome dela no banco de dados do JPA é tb_professores
public class Professor {
	
	@Id // identificando que é a chave primária do banco
	@GeneratedValue(strategy = GenerationType.IDENTITY) // função que gera um valor auto incrementável no banco de dados
	private int id; // id encapsulado

	private String nome;

    // Relacionamento entre Professor e Turma
	@OneToMany(mappedBy = "professor") // um professor para muitas turmas, aqui criamos um modelo bidirecional
	// conseguimos acessar as turmas pelo professor e o professor pelas turmas
	private List<Turma> turmas; // cada professor tem uma lista de turmas que ele pode ministrar ou já ter ministrado
	
	// private List<Publicacao> avaliacao; // Construtor 1
	private float notaMedia;
	// static int idCriado = 0;
	
	Professor(String nome){ // construtor
		// this.id = idCriado;
		// idCriado++;
		this.nome = nome;
		this.turmas = null;
		// this.avaliacao = null;
		this.notaMedia = 0;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getNotaMedia() {
		return notaMedia;
	}
	public void setNotaMedia(float notaMedia) {
		this.notaMedia = notaMedia;
	}
}