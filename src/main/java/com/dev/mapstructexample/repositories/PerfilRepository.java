package com.dev.mapstructexample.repositories;

import com.dev.mapstructexample.entities.Categoria;
import com.dev.mapstructexample.entities.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerfilRepository extends JpaRepository<Perfil, Long> {
}
