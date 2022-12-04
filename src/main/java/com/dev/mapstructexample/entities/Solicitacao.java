package com.dev.mapstructexample.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Solicitacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dataSolicitacao;

    private String comentario;

    @ManyToOne
    @JoinColumn
    private Usuario usuarioAplicante;


    @ManyToOne
    @JoinColumn
    private Arquivo arquivo;

    @ManyToOne
    @JoinColumn
    private Vaga vaga;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataSolicitacao() {
        return dataSolicitacao;
    }

    public void setDataSolicitacao(LocalDate dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Usuario getUsuarioAplicante() {
        return usuarioAplicante;
    }

    public void setUsuarioAplicante(Usuario usuarioAplicante) {
        this.usuarioAplicante = usuarioAplicante;
    }


    public Arquivo getArquivo() {
        return arquivo;
    }

    public void setArquivo(Arquivo arquivo) {
        this.arquivo = arquivo;
    }

    public Vaga getVaga() {
        return vaga;
    }

    public void setVaga(Vaga vaga) {
        this.vaga = vaga;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Solicitacao that = (Solicitacao) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


}
