/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

/**
 *
 * @author duda
 */
public interface Aparelho {
    public String CONTATO = "Juana";
    
    /**
     *
     * @param CONTATO
     */
    void ligar(String CONTATO);
    void atender(String CONTATO);
    void iniciarCorrreioVoz();

}
