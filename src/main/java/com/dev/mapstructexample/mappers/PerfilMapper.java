package com.dev.mapstructexample.mappers;

import com.dev.mapstructexample.dtos.PerfilDTO;
import com.dev.mapstructexample.dtos.SolicitacaoDTO;
import com.dev.mapstructexample.entities.Perfil;
import com.dev.mapstructexample.entities.Solicitacao;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

@Component
public class PerfilMapper {

    public SolicitacaoDTO toDto(Solicitacao solicitacao) {
        if(solicitacao == null) {
            return null;
        }
        SolicitacaoDTO resultado = new SolicitacaoDTO();
        BeanUtils.copyProperties(solicitacao, resultado, "usuarioAplicante", "arquivo", "vaga");
        return resultado;
    }
    public PerfilDTO toDto(Perfil perfil) {
        if(perfil == null) return null;
        PerfilDTO resultado = new PerfilDTO();
        BeanUtils.copyProperties(perfil, resultado);
        return resultado;

    }


    public Set<PerfilDTO> toDto(Set<Perfil> perfis) {
        if(perfis == null) return null;
        return perfis.stream().map(perfil -> this.toDto(perfil)).collect(Collectors.toSet());
    }


}
