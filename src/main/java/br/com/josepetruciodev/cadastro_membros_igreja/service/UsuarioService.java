package br.com.josepetruciodev.cadastro_membros_igreja.service;

import br.com.josepetruciodev.cadastro_membros_igreja.model.UsuarioEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final List<UsuarioEntity> usuarios =  new ArrayList<>();

    public UsuarioEntity criarUsuario(UsuarioEntity usuario){

        UsuarioEntity novoUsuario = UsuarioEntity.builder()
                .id(usuario.getId())
                .nome(usuario.getNome())
                .email(usuario.getEmail())
                .telefone(usuario.getTelefone())
                .build();
       usuarios.add(novoUsuario);
       return novoUsuario;
    }
    public List<UsuarioEntity> mostrarUsuarios(){
       return new ArrayList<>(usuarios);
    }

    public void deletarUsuario(Integer id){
        usuarios.removeIf(u -> u.getId().equals(id));
    }

    public UsuarioEntity atualizarUsuario(UsuarioEntity usuario, Integer id){
        UsuarioEntity user = usuarios.stream().filter(u -> u.getId().equals(id)).findFirst().orElse(null);

        user.setId(usuario.getId());
        user.setNome(usuario.getNome());
        user.setEmail(usuario.getEmail());
        user.setTelefone(usuario.getTelefone());
        return user;
    }

}
