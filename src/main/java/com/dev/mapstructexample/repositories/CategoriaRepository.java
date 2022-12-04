package com.dev.mapstructexample.repositories;

import com.dev.mapstructexample.entities.Arquivo;
import com.dev.mapstructexample.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
