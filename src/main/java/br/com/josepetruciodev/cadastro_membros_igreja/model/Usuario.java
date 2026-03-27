package br.com.josepetruciodev.cadastro_membros_igreja.model;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    private String nome;
    private String endereco;
    private Date dataNascimento;
}
