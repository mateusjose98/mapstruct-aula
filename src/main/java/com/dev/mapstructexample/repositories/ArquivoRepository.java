package com.dev.mapstructexample.repositories;

import com.dev.mapstructexample.entities.Arquivo;
import com.dev.mapstructexample.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArquivoRepository extends JpaRepository<Arquivo, Long> {
}
