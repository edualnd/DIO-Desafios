/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package classe;
import interfaces.Aparelho;
import interfaces.Navegador;
import interfaces.ReprodutorMusical;
import java.util.ArrayList;
import java.util.Arrays;
/**
 *
 * @author duda
 */
public class Iphone implements Aparelho, Navegador, ReprodutorMusical{

    @Override
    public void ligar(String CONTATO) {
        System.out.println("Ligando para " + CONTATO);
    }

    @Override
    public void atender(String CONTATO) {
        System.out.println("Atendendo " + CONTATO);
    }

    @Override
    public void iniciarCorrreioVoz() {
        System.out.println("Voce esta no correio de voz ");
    }

    @Override
    public void exibirPagina(String ABAS) {
        System.out.println("Exibindo " + ABAS);
    }

    @Override
    public void adicionarNovaAba(String ABAS) {
        System.out.println(ABAS + " adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando...");
    }

    @Override
    public void fecharPagina(String ABAS) {
        System.out.println("Pagina " + ABAS + " fechada");
    }

    @Override
    public void tocar(String MUSICA) {
        System.out.println("Tocando " + MUSICA);
    }

    @Override
    public void pausar(String MUSICA) {
        System.out.println(MUSICA + " pausada");
    }

    @Override
    public void selecionarMusica(String MUSICA) {
        System.out.println("Musica "+ MUSICA +"selecionada");
    }

    @Override
    public void proximaMusica(String MUSICA) {
        System.out.println("Proxima musica tocando");
    }

   
    
}
