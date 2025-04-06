/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

/**
 *
 * @author duda
 */
public interface Navegador {
    public String ABAS = "google.com";
    
    /**
     *
     * @param ABAS
     */
    void exibirPagina(String ABAS);
    void adicionarNovaAba(String ABAS);
    void atualizarPagina();
    void fecharPagina(String ABAS);
}
