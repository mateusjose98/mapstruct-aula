package com.dev.mapstructexample.mappers;

import com.dev.mapstructexample.dtos.SolicitacaoDTO;
import com.dev.mapstructexample.entities.Solicitacao;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

@Component
public class SolicitacaoMapper {

    public SolicitacaoDTO toDto(Solicitacao solicitacao) {
        if(solicitacao == null) {
            return null;
        }
        SolicitacaoDTO resultado = new SolicitacaoDTO();
        BeanUtils.copyProperties(solicitacao, resultado, "usuarioAplicante", "arquivo", "vaga");
        return resultado;
    }

    public Set<SolicitacaoDTO> toDto(Set<Solicitacao> solicitacoes) {
        if(solicitacoes == null) return null;
        return solicitacoes.stream().map(sol -> this.toDto(sol)).collect(Collectors.toSet());
    }


}
