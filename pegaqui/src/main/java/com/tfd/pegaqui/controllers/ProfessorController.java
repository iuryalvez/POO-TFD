// Controlador REST para controlar os EndPoints da aplicação
// Quem faz isso é o pacote de spring web
// EndPoint é um caminho da url que resulta em alguma requisição

package com.tfd.pegaqui.controllers;

import com.tfd.pegaqui.entities.Professor;
import com.tfd.pegaqui.repositories.ProfessorRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // identificando que é um Controlador REST que responde por requisições
@RequestMapping(value = "/professores") // responde pelo caminho "/professores" 
public class ProfessorController {
    // aqui poderia ser usado o Postmam para visualizar as requisições e dados (não utilizamos)

    // Injeão de dependências
    @Autowired
    private ProfessorRepository repository;
    
    // Criando EndPoint que pega (get) dados de todos os professores do bando de dados
    @GetMapping
    public List<Professor> procurarTodos() {
        List<Professor> resultado = repository.findAll(); // fazendo o findAll através do repositório JPA
        return resultado;
    }
    
    // Criando EndPoint que pega (get) dados de todos os professores do bando de dados
    @GetMapping(value = "/{id}") // indica que o caminho terá "/{numero}" {id} significa um número
    public Professor procurarPorID(@PathVariable Integer id) { // PathVariable associa o id do getmapping com essa variável
        Professor resultado = repository.findById(id).get(); // fazendo o findById através do repositório JPA
        // findByID retorna um optional (objeto especial do java), para pegar o professor associado ao id usamos o get()
        // fazer tratamento de exceções (Ex: id que não existe)
        return resultado;
    }

    // Criando EndPoint que salva (post) dados um professor no bando de dados
    @PostMapping
    public Professor inserir(@RequestBody Professor professor) { // RequestBody diz que a variável professor é o corpo da requisição
        // RequestBody é necessário quando a requisição é Post
        Professor resultado = repository.save(professor); // o save manda o insert para o banco de dados com o objeto convertido para O-R
        // save retorna uma nova referência para o objeto salvo
        return resultado;
    }

}
