package com.dioDesafio.controller;

import com.dioDesafio.model.Cliente;
import com.dioDesafio.model.Medico;
import com.dioDesafio.service.impl.ClienteService;
import com.dioDesafio.service.impl.MedicoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/med")
public class MedicoController {

    MedicoService service = new MedicoService();
    @PostMapping()
    public String criarMedico(@RequestBody Medico medico){
        service.criarMedico(medico);
        return "Medico criado com sucesso";
    }
    @DeleteMapping("/{cpf}")
    public String deletarMedico(@PathVariable String cpf){
        service.deletarMedico(cpf);
        return "Medico deletado com sucesso";
    }
    @GetMapping()
    public List<Medico> acharMedicos(){
        return service.getMedicos();
    }
    @GetMapping("/{cpf}")
    public Medico acharMedicos(@PathVariable String cpf){
        return service.getMedico(cpf);
    }
}
