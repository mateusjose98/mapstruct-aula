package com.dev.mapstructexample.repositories;

import com.dev.mapstructexample.entities.Categoria;
import com.dev.mapstructexample.entities.Vaga;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VagaRepository extends JpaRepository<Vaga, Long> {
}
