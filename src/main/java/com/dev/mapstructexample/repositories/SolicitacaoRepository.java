package com.dev.mapstructexample.repositories;

import com.dev.mapstructexample.entities.Arquivo;
import com.dev.mapstructexample.entities.Solicitacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SolicitacaoRepository extends JpaRepository<Solicitacao, Long> {
}
