package com.dioDesafio.service;

import com.dioDesafio.model.Cliente;
import com.dioDesafio.model.Consulta;

import java.util.List;

public interface ICliente {
    String criarCliente(Cliente cliente);
    String deletarCliente(String cpf);
    List<Cliente> getClientes();

    Cliente getCliente(String cpf);

}
