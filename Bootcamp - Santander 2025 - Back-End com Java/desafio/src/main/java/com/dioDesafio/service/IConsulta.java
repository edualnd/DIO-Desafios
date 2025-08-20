package com.dioDesafio.service;

import com.dioDesafio.model.Consulta;

import java.util.List;

public interface IConsulta {
    List<Consulta> getConsultasPorCliente(String cpf);
    List<Consulta> getConsultasPorMedico(String cpf);
    List<Consulta> getConsultas();
    String marcarConsulta(Consulta consulta);
    String desmarcarConsulta(String cpf);


}
