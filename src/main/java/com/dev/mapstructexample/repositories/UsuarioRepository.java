package com.dev.mapstructexample.repositories;

import com.dev.mapstructexample.dtos.UsuarioResumoDTO;
import com.dev.mapstructexample.entities.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Query(value = "SELECT new com.dev.mapstructexample.dtos.UsuarioResumoDTO(u.id, u.nome, u.login) " +
                   "FROM Usuario u ")
    Page<UsuarioResumoDTO> findAllResumo(Pageable pageable);
}
