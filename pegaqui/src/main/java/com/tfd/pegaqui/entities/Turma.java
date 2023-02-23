// pacote "ENTITIES": é dessa forma que o spring identifica uma classe que 
// será utilizada para suas funções

package com.tfd.pegaqui.entities;

// import java.io.File;
// import java.util.List;

// Escolher os imports com base na especificação para manter o projeto funcional
// Nesse caso não importar o que há implementação 
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

// identifica a classe para o mapeamento objeto-relacional (JPA)
@Entity 
@Table(name = "tb_turmas") // o modelo relacional é uma tabela e o nome dela no banco de dados do JPA é tb_turmas
public class Turma {
	
	@Id // vai ser a chave primária do banco
	@GeneratedValue(strategy = GenerationType.IDENTITY) // valor auto-incrementável no banco de dados
	private int id;
	
	private String nome;

    // Relacionamento entre Turma e Professor:
	@ManyToOne // muitas turmas para um professor, cada professor possui muitas turmas, cada turma possui 1 professor
	@JoinColumn(name = "professor_id") // sabendo que o modelo é uma tabela, adicionamos uma nova coluna para mostrar o professor_id relacionado
	// mostra de acordo com a chave estrangeira associada a turmas_id
    private Professor professor;

	private String semestre;
    
	private float notaMedia;
	
	public Turma() {}

	public Turma(String nome, String semestre, Professor professor){
		this.nome = nome;
		this.semestre = semestre;
		this.professor = professor;
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
	public String getSemestre() {
        return semestre;
    }
    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
	
}