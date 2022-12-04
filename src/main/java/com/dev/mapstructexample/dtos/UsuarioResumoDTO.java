package com.dev.mapstructexample.dtos;

public class UsuarioResumoDTO {

    private Long id;
    private String nome;
    private String login;

    public UsuarioResumoDTO(Long id, String nome, String login) {
        this.id = id;
        this.nome = nome;
        this.login = login;
    }

    public UsuarioResumoDTO() {
    }

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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
