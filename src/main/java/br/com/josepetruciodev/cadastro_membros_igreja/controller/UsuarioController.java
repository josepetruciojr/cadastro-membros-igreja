package br.com.josepetruciodev.cadastro_membros_igreja.controller;

import br.com.josepetruciodev.cadastro_membros_igreja.model.UsuarioEntity;
import br.com.josepetruciodev.cadastro_membros_igreja.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/usuario")
public class UsuarioController {


    private final UsuarioService usuarioService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioEntity criarUsuario(@RequestBody UsuarioEntity usuario) {
        return usuarioService.criarUsuario(usuario);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<UsuarioEntity> mostrarUsuarios() {
        return usuarioService.mostrarUsuarios();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public UsuarioEntity buscarUsuario(@PathVariable Integer id){
        return usuarioService.buscarUsuario(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletarUsuario(@PathVariable Integer id) {
        usuarioService.deletarUsuario(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public UsuarioEntity atualizarUsuario(@PathVariable Integer id,
                                          @RequestBody UsuarioEntity usuario) {
        return usuarioService.atualizarUsuario(usuario, id);
    }

}
