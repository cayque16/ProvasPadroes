/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3;

/**
 *
 * @author cayqu
 */
public class CD extends Midia{
    private String grupoCantor;
    private int qtdMusicas;

    public CD(String grupoCantor, int qtdMusicas, int id, int idadeCensura, String titulo, Categoria categoria, float preco) {
        super(id, idadeCensura, titulo, categoria, preco);
        this.grupoCantor = grupoCantor;
        this.qtdMusicas = qtdMusicas;
    }
    
    public String getGrupoCantor() {
        return grupoCantor;
    }

    public void setGrupoCantor(String grupoCantor) {
        this.grupoCantor = grupoCantor;
    }

    public int getQtdMusicas() {
        return qtdMusicas;
    }

    public void setQtdMusicas(int qtdMusicas) {
        this.qtdMusicas = qtdMusicas;
    }
    
    
}
