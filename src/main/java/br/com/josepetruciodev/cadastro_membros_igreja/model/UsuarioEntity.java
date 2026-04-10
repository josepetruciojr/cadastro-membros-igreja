package br.com.josepetruciodev.cadastro_membros_igreja.model;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioEntity {

    private Integer id;
    private String nome;
    private String email;
    private String telefone;
}
