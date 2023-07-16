package com.example.demo.domain.depoimentos;

import jakarta.validation.constraints.NotBlank;
import org.antlr.v4.runtime.misc.NotNull;

public record DepoimentoCadastroDTO(

        String fotoPerfil,
        @NotBlank
        String depoimento,
        @NotBlank
        String nomeUsuario
) {
}
