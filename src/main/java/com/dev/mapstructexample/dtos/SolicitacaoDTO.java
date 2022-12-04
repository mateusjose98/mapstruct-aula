package com.dev.mapstructexample.dtos;

import com.dev.mapstructexample.entities.Arquivo;
import com.dev.mapstructexample.entities.Usuario;
import com.dev.mapstructexample.entities.Vaga;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

public class SolicitacaoDTO {

    private Long id;
    private LocalDate dataSolicitacao;
    private String comentario;
    private UsuarioDTO usuarioAplicante;
    private ArquivoDTO arquivo;
    private VagaDTO vaga;

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

    public UsuarioDTO getUsuarioAplicante() {
        return usuarioAplicante;
    }

    public void setUsuarioAplicante(UsuarioDTO usuarioAplicante) {
        this.usuarioAplicante = usuarioAplicante;
    }

    public ArquivoDTO getArquivo() {
        return arquivo;
    }

    public void setArquivo(ArquivoDTO arquivo) {
        this.arquivo = arquivo;
    }

    public VagaDTO getVaga() {
        return vaga;
    }

    public void setVaga(VagaDTO vaga) {
        this.vaga = vaga;
    }
}
