package com.dev.mapstructexample.mappers;

import com.dev.mapstructexample.dtos.UsuarioComAssociacoesDTO;
import com.dev.mapstructexample.dtos.UsuarioDTO;
import com.dev.mapstructexample.dtos.UsuarioResumoDTO;
import com.dev.mapstructexample.entities.Usuario;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import static java.util.Objects.nonNull;

@Component
public class UsuarioMapper {

    final SolicitacaoMapper solicitacaoMapper;
    final PerfilMapper perfilMapper;
    final VagaMapper vagaMapper;

    public UsuarioMapper(SolicitacaoMapper solicitacaoMapper, PerfilMapper perfilMapper, VagaMapper vagaMapper) {
        this.solicitacaoMapper = solicitacaoMapper;
        this.perfilMapper = perfilMapper;
        this.vagaMapper = vagaMapper;
    }

    public Usuario partialUpdate(Usuario usuario, UsuarioDTO dto) {
        if (dto == null) {
            return null;
        }
        if (nonNull(dto.getNome())) {
            usuario.setNome(dto.getNome());
        }
        if (nonNull(dto.getEmail())) {
            usuario.setEmail(dto.getEmail());
        }
        if (nonNull(dto.getDataRegistro())) {
            usuario.setDataRegistro(dto.getDataRegistro());
        }
        if (nonNull(dto.getSenha())) {
            usuario.setSenha(dto.getSenha());
        }
        if (nonNull(dto.getLogin())) {
            usuario.setLogin(dto.getLogin());
        }
        return usuario;
    }

    public Usuario toEntity(UsuarioDTO dto) {
        Usuario usuario = new Usuario();
        if (dto == null) {
            return null;
        }

        usuario.setId(dto.getId());
        usuario.setNome(dto.getNome());
        usuario.setEmail(dto.getEmail());
        usuario.setDataRegistro(dto.getDataRegistro());
        usuario.setSenha(dto.getSenha());
        usuario.setLogin(dto.getLogin());

        //uma outra forma: BeanUtils.copyProperties(dto, usuario, "perfis",  "solicitacoes");
        // mapear os relacionamentos

        return usuario;

    }

    public UsuarioDTO toDto(Usuario entity) {
        var dto = new UsuarioDTO();
        BeanUtils.copyProperties(entity, dto, "perfis",  "solicitacoes");
        return dto;
    }

    public UsuarioResumoDTO toDtoResumo(Usuario entity) {
        var dto = new UsuarioResumoDTO();
        BeanUtils.copyProperties(entity, dto, "perfis",  "solicitacoes");
        return dto;
    }

    public UsuarioComAssociacoesDTO toDtoComAssociacoes(Usuario entity) {
        var dto = new UsuarioComAssociacoesDTO();
        BeanUtils.copyProperties(entity, dto, "perfis" , "solicitacoes");

        dto.setSolicitacoes(solicitacaoMapper.toDto(entity.getSolicitacoes()));
        dto.setPerfis(perfilMapper.toDto(entity.getPerfis()));

        return dto;
    }

}
