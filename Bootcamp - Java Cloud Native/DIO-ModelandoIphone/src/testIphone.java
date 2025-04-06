/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author duda
 */
import classe.Iphone;
public class testIphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        
        //Aparelho
        
        iphone.ligar("Julia");
        iphone.atender("Julia");
        iphone.iniciarCorrreioVoz();
        
        //Navegador
        iphone.exibirPagina("google.com");
        iphone.adicionarNovaAba("google.com");
        iphone.atualizarPagina();
        iphone.fecharPagina("google.com");
        
        //Reprodutor Musical
        iphone.tocar("Blinding Lights - The Weeknd");
        iphone.pausar("Blinding Lights - The Weeknd");
        iphone.selecionarMusica("if ain't got you - Alicia Keys");
        iphone.proximaMusica("Blinding Lights - The Weeknd");
    }
    
}
