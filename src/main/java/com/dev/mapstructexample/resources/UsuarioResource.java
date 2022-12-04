package com.dev.mapstructexample.resources;

import com.dev.mapstructexample.dtos.UsuarioComAssociacoesDTO;
import com.dev.mapstructexample.dtos.UsuarioDTO;
import com.dev.mapstructexample.dtos.UsuarioResumoDTO;
import com.dev.mapstructexample.services.UsuarioService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController @RequestMapping("usuarios")
public class UsuarioResource {

    final UsuarioService usuarioService;

    public UsuarioResource(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<UsuarioDTO> salvar(@RequestBody UsuarioDTO dto) {
        UsuarioDTO usuarioSalvo = usuarioService.salvarNovoUsuario(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioSalvo);
    }

    @GetMapping("{id}")
    public ResponseEntity<UsuarioComAssociacoesDTO> listar(@PathVariable Long id) {
        UsuarioComAssociacoesDTO usuarioCompleto = usuarioService.buscarUsuarioPorId(id);
        return ResponseEntity.ok(usuarioCompleto);
    }

    @GetMapping
    public ResponseEntity<Page<UsuarioDTO>> buscar(Pageable pageable) {
        Page<UsuarioDTO> usuarioDTOS = usuarioService.listarPaginado(pageable);
        return ResponseEntity.ok(usuarioDTOS);
    }

    @GetMapping("resumo")
    public ResponseEntity<Page<UsuarioResumoDTO>> listarResumido(Pageable pageable) {
        Page<UsuarioResumoDTO> usuarioDTOS = usuarioService.listarUsuarioResumoPaginado(pageable);
        return ResponseEntity.ok(usuarioDTOS);
    }

    @PutMapping("{id}")
    public ResponseEntity<UsuarioDTO> atualizar(@PathVariable Long id, @RequestBody UsuarioDTO dto) {
        UsuarioDTO usuarioAtualizado = usuarioService.atualizarUsuario(id, dto);
        return ResponseEntity.ok(usuarioAtualizado);
    }

    @PatchMapping("{id}")
    public ResponseEntity<UsuarioDTO> merge(@PathVariable Long id, @RequestBody UsuarioDTO dto) {
        UsuarioDTO usuarioAtualizado = usuarioService.atualizarPacialmenteUsuario(id, dto);
        return ResponseEntity.ok(usuarioAtualizado);
    }


}
