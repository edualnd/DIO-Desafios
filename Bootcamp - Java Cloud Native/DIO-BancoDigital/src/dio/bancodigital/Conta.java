/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dio.bancodigital;

/**
 *
 * @author duda
 */
public abstract class Conta implements IConta{
   protected static int AGENCIA_PADRAO = 0;
   private static int SEQUENCIAL = 1;
   protected int agencia;
   protected int numero;
   protected double Saldo;
   protected Cliente cliente;

   
    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return Saldo;
    }

    
    public void Sacar(double valor) {
        Saldo -= valor;
    }

    
    public void Depositar(double valor) {
        Saldo += valor;
    }

    
    public void Transferir(double valor, Conta contaDestino) {
        Saldo-=valor;
        contaDestino.Depositar(valor);
    }
    public void imprimirExtrato(){
        System.out.println(this.agencia);
        System.out.println(this.numero);
        System.out.printf("%.2f%n", this.Saldo);
        
    }
    
    }
