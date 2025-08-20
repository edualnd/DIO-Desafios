package com.dioDesafio.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Medico {
    private String nome;
    private String cpf;
    private Especialidade especialidade;
    private int idade;
}
