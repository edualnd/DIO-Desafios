package com.dioDesafio.service.impl;

import com.dioDesafio.model.Consulta;
import com.dioDesafio.service.IConsulta;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class ConsultaService implements IConsulta {
    List<Consulta> listaConsultas = new ArrayList<>();
    @Override
    public List<Consulta> getConsultasPorCliente(String cpf) {
        List<Consulta> consultas =
                listaConsultas.stream()
                        .filter(c-> Objects.equals(c.getClienteCpf(), cpf))
                        .toList();
        return consultas;
    }

    @Override
    public List<Consulta> getConsultasPorMedico(String cpf) {
        List<Consulta> consultas =
                listaConsultas.stream()
                        .filter(c-> Objects.equals(c.getMedicoCpf(), cpf))
                        .toList();
        return consultas;
    }

    @Override
    public List<Consulta> getConsultas() {
        return listaConsultas;
    }

    @Override
    public String marcarConsulta(Consulta consulta) {
        listaConsultas.add(consulta);
        return "Consulta marcada";
    }

    @Override
    public String desmarcarConsulta(String cpf) {
        listaConsultas.removeIf(c-> Objects.equals(c.getClienteCpf(), cpf));
        return "Consulta desmarcada";
    }
}
