package com.dev.mapstructexample.entities;

import com.dev.mapstructexample.enums.StatusVaga;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Vaga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descricao;
    private LocalDate dataPublicacao;
    private Double salarioEmReal;
    @Enumerated(EnumType.STRING)
    private StatusVaga status;

    @ManyToOne
    @JoinColumn
    private Usuario usuarioCriador;

    @ManyToOne
    @JoinColumn
    private Categoria categoria;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public Double getSalarioEmReal() {
        return salarioEmReal;
    }

    public void setSalarioEmReal(Double salarioEmReal) {
        this.salarioEmReal = salarioEmReal;
    }

    public StatusVaga getStatus() {
        return status;
    }

    public void setStatus(StatusVaga status) {
        this.status = status;
    }
}
