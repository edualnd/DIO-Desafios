package com.dioDesafio.controller;

import com.dioDesafio.model.Cliente;
import com.dioDesafio.service.impl.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cli")
public class ClienteController {

    ClienteService service = new ClienteService();
    @PostMapping()
    public String criarCliente(@RequestBody Cliente cliente){
        service.criarCliente(cliente);
        return "Cliente criado com sucesso";
    }
    @DeleteMapping("/{cpf}")
    public String deletarCliente(@PathVariable String cpf){
        service.deletarCliente(cpf);
        return "Cliente deletado com sucesso";
    }
    @GetMapping()
    public List<Cliente> acharClientes(){
        return service.getClientes();
    }
    @GetMapping("/{cpf}")
    public Cliente acharClientes(@PathVariable String cpf){
        return service.getCliente(cpf);
    }
}
