package com.dioDesafio.service.impl;

import com.dioDesafio.model.Cliente;
import com.dioDesafio.model.Medico;
import com.dioDesafio.service.ICliente;
import com.dioDesafio.service.IMedico;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class MedicoService implements IMedico {
    List<Medico> listaMedicos = new ArrayList<>();
    @Override
    public String criarMedico(Medico medico) {
        listaMedicos.add(medico);
        return "Medico criado";
    }

    @Override
    public String deletarMedico(String cpf) {
        listaMedicos.removeIf(m-> Objects.equals(m.getCpf(), cpf));
        return "Medico deletado";
    }

    @Override
    public List<Medico> getMedicos() {
        return listaMedicos;
    }
    @Override
    public Medico getMedico(String cpf) {
        return listaMedicos.stream().filter(c-> Objects.equals(c.getCpf(), cpf)).findFirst().get();
    }
}
