/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

/**
 *
 * @author duda
 */
public interface ReprodutorMusical {
    public String MUSICA = "if ain't got you";
    
    /**
     *
     * @param MUSICA
     */
    void tocar(String MUSICA);
    void pausar(String MUSICA);
    void selecionarMusica(String MUSICA);
    void proximaMusica(String MUSICA);
}
