package com.dev.mapstructexample.services;

import com.dev.mapstructexample.dtos.UsuarioComAssociacoesDTO;
import com.dev.mapstructexample.dtos.UsuarioDTO;
import com.dev.mapstructexample.dtos.UsuarioResumoDTO;
import com.dev.mapstructexample.entities.Usuario;
import com.dev.mapstructexample.mappers.UsuarioMapper;
import com.dev.mapstructexample.repositories.UsuarioRepository;
import com.dev.mapstructexample.services.exceptions.EntidadeNaoEncontrada;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UsuarioService {

    final UsuarioRepository usuarioRepository;
    final UsuarioMapper usuarioMapper;

    public UsuarioService(UsuarioRepository usuarioRepository, UsuarioMapper usuarioMapper) {

        this.usuarioRepository = usuarioRepository;
        this.usuarioMapper = usuarioMapper;
    }

    public UsuarioDTO salvarNovoUsuario(UsuarioDTO dto) {

        Usuario usuario = usuarioMapper.toEntity(dto);
        UsuarioDTO usuarioDTO = usuarioMapper.toDto(usuarioRepository.save(usuario));
        return usuarioDTO;
    }

    @Transactional(readOnly = true)
    public Page<UsuarioDTO> listarPaginado(Pageable pageable) {
        Page<Usuario> paginaUsuarios = usuarioRepository.findAll(pageable);
        return paginaUsuarios.map(usuarioMapper::toDto);
    }

    public UsuarioDTO atualizarUsuario(Long id, UsuarioDTO dto) {
        if (id != dto.getId()) throw new IllegalArgumentException("ids enviados não correspondem!");
        Usuario usuario = usuarioMapper.toEntity(dto);
        usuario = usuarioRepository.save(usuario);
        return usuarioMapper.toDto(usuario);
    }

    public UsuarioDTO atualizarPacialmenteUsuario(Long id, UsuarioDTO dto) {
        if (id != dto.getId()) throw new IllegalArgumentException("ids enviados não correspondem!");
        var usuario = usuarioRepository
                .findById(id).orElseThrow(
                        () -> new EntidadeNaoEncontrada("Usuário de id %d não encontrado "));
        usuarioMapper.partialUpdate(usuario, dto);
        return usuarioMapper.toDto(usuarioRepository.save(usuario));
    }

    @Transactional(readOnly = true)
    public Page<UsuarioResumoDTO> listarUsuarioResumoPaginado(Pageable pageable) {
        Page<UsuarioResumoDTO> paginaUsuarios = usuarioRepository.findAllResumo(pageable);
        return paginaUsuarios;
    }

    @Transactional(readOnly = true)
    public UsuarioComAssociacoesDTO buscarUsuarioPorId(Long id) {
        Usuario usuario = usuarioRepository
                .findById(id).orElseThrow(() -> new EntidadeNaoEncontrada("Usuário de id %d não encontrado "));
        return usuarioMapper.toDtoComAssociacoes(usuario);
    }
}
