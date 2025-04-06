/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contaTerminal;

import java.util.Scanner;

/**
 *
 * @author duda
 */
public class ContaTerminal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        String agencia, nomeCliente;
        float saldo;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da Agência: ");
        agencia = sc.next();
        
        System.out.println("Por favor, digite o número da conta: ");
        numero = sc.nextInt();
        
        System.out.println("Por favor, digite o nome do cliente: ");
        nomeCliente = sc.next();
        
        System.out.println("Por favor, digite o saldo: ");
        saldo = sc.nextFloat();
        
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque\n", nomeCliente, agencia, numero, saldo );
    } 
    
}
