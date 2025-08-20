package com.dioDesafio.service.impl;

import com.dioDesafio.model.Cliente;
import com.dioDesafio.service.ICliente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class ClienteService implements ICliente {

    List<Cliente> listaClientes = new ArrayList<>();
    @Override
    public String criarCliente(Cliente cliente) {
        listaClientes.add(cliente);
        return "Cliente criado";
    }

    @Override
    public String deletarCliente(String cpf) {
        listaClientes.removeIf(c -> Objects.equals(c.getCpf(), cpf));
        return "Cliente deletado";
    }

    @Override
    public List<Cliente> getClientes() {
        return listaClientes;
    }

    @Override
    public Cliente getCliente(String cpf) {
        return listaClientes.stream().filter(c-> Objects.equals(c.getCpf(), cpf)).findFirst().get();
    }
}
