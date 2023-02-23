// Controlador REST para controlar os EndPoints da aplicação
// Quem faz isso é o pacote de spring web

package com.tfd.pegaqui.controllers;

import com.tfd.pegaqui.entities.Professor;
import com.tfd.pegaqui.repositories.ProfessorRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // identificando que é um Controlador REST que responde por requisições
@RequestMapping(value = "/professores") // responde pelo caminho "/professores" 
public class ProfessorController {
    
    // Injeão de dependências
    @Autowired
    private ProfessorRepository repository;
    
    // Criando EndPoint que pega (get) dados do bando de dados
    @GetMapping
    public List<Professor> procurarTodos() {
        List<Professor> resultado = repository.findAll(); // fazendo o findAll através do repositório JPA
        return resultado;
    }

}
