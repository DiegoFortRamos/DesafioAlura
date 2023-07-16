package com.example.demo.domain.depoimentos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "depoimentos")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Depoimento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fotoPerfil;
    private String depoimento;
    private String nomeUsuario;

    public Depoimento(DepoimentoCadastroDTO dados){
        this.fotoPerfil = dados.fotoPerfil();
        this.depoimento = dados.depoimento();
        this.nomeUsuario = dados.nomeUsuario();
    }
}
