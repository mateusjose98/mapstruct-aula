package com.dev.mapstructexample.dtos;

import com.dev.mapstructexample.entities.Categoria;
import com.dev.mapstructexample.entities.Usuario;
import com.dev.mapstructexample.enums.StatusVaga;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

public class VagaDTO {

    private Long id;

    private String titulo;
    private String descricao;
    private LocalDate dataPublicacao;
    private Double salarioEmReal;
    private StatusVaga status;
    private UsuarioDTO usuarioCriador;
    private CategoriaDTO categoria;

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

    public UsuarioDTO getUsuarioCriador() {
        return usuarioCriador;
    }

    public void setUsuarioCriador(UsuarioDTO usuarioCriador) {
        this.usuarioCriador = usuarioCriador;
    }

    public CategoriaDTO getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaDTO categoria) {
        this.categoria = categoria;
    }
}
