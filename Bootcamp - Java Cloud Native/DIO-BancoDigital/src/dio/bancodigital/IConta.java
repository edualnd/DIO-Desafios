/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dio.bancodigital;

/**
 *
 * @author duda
 */
public interface IConta {
   public void Sacar(double valor);
   public void Depositar(double valor);
   public void Transferir(double valor, Conta contaDestino);
   public void imprimirExtrato();
}
