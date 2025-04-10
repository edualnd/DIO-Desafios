/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dio.bancodigital;

import java.util.List;

/**
 *
 * @author duda
 */
public class Banco {
    private String nome;
    private List<Conta> contas;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Banco(List<Conta> contas) {
        this.contas = contas;
    }
    
}
