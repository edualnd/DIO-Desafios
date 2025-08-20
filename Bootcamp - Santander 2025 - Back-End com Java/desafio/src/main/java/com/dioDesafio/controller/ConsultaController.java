package com.dioDesafio.controller;

import com.dioDesafio.model.Cliente;
import com.dioDesafio.model.Consulta;
import com.dioDesafio.service.impl.ClienteService;
import com.dioDesafio.service.impl.ConsultaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/con")

public class ConsultaController {

    ConsultaService service = new ConsultaService();

    @GetMapping("/cli/{cpf}")
    public List<Consulta> getConsultaPorCliente(@PathVariable String cpf){
        return service.getConsultasPorCliente(cpf);
    }
    @GetMapping("/med/{cpf}")
    public List<Consulta> getConsultaPorMedico(@PathVariable String cpf){
        return service.getConsultasPorMedico(cpf);
    }
    @GetMapping()
    public List<Consulta> getConsultas(){
        return service.getConsultas();
    }

    @PostMapping()
    public String marcarConsulta(@RequestBody Consulta consulta){
        service.marcarConsulta(consulta);
        return "Consulta criada com sucesso";
    }
    @DeleteMapping("/{cpf}")
    public String desmarcarConsulta(@PathVariable String cpf){
        service.desmarcarConsulta(cpf);
        return "Consulta deletada com sucesso";
    }
}
