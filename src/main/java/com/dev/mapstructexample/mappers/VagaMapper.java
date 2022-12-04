package com.dev.mapstructexample.mappers;

import com.dev.mapstructexample.dtos.VagaDTO;
import com.dev.mapstructexample.entities.Vaga;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

@Component
public class VagaMapper {
    public Set<VagaDTO> toDto(Set<Vaga> vagasCadastradas) {
        if (vagasCadastradas == null) return null;
        return vagasCadastradas.stream().map(vaga -> this.toDto(vaga)).collect(Collectors.toSet());
    }

    private VagaDTO toDto(Vaga vaga) {
        if(vaga == null) return null;
        VagaDTO resultado = new VagaDTO();
        BeanUtils.copyProperties(vaga, resultado, "usuarioCriador", "categoria");
        return resultado;
    }
}
