package com.dioDesafio.service;



import com.dioDesafio.model.Medico;

import java.util.List;

public interface IMedico {
    String criarMedico(Medico medico);
    String deletarMedico(String cpf);
    List<Medico> getMedicos();
    Medico getMedico(String cpf);
}
