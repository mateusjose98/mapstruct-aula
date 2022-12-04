package com.dev.mapstructexample.dtos;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class UsuarioComAssociacoesDTO {
    private Long id;
    private String nome;
    private String email;
    private String login;
    private String senha;
    private LocalDate dataRegistro;
    private Set<PerfilDTO> perfis = new HashSet<>();
    private Set<SolicitacaoDTO> solicitacoes = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public Set<PerfilDTO> getPerfis() {
        return perfis;
    }

    public void setPerfis(Set<PerfilDTO> perfis) {
        this.perfis = perfis;
    }

    public Set<SolicitacaoDTO> getSolicitacoes() {
        return solicitacoes;
    }

    public void setSolicitacoes(Set<SolicitacaoDTO> solicitacoes) {
        this.solicitacoes = solicitacoes;
    }
}
