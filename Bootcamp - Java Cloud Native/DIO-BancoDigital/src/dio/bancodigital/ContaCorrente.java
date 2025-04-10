/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dio.bancodigital;

/**
 *
 * @author duda
 */
public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }
    public void imprimirExtrato(){
        System.out.println("======Extrato Conta Corrente======");
        System.out.println(this.agencia);
        System.out.println(this.numero);
        System.out.printf("%.2f%n", this.Saldo);
        
    }
  
  
}
