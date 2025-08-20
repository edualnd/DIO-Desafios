package com.dioDesafio.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
public class Consulta {

    private String clienteCpf;
    private String medicoCpf;
    private LocalDateTime data;


}
