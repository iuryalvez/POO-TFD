// CRUD do banco de dados com JPA repository

package com.tfd.pegaqui.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tfd.pegaqui.entities.Usuario;

// Fazer o UsuarioRepository extender JpaRepository faz com que esta classe
// herde todas as funções de um JpaRepository e nos permite acessar dados do banco de dados
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    
}
