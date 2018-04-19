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
public class Game extends Midia{
    private String nomeConsole;

    public Game(String nomeConsole, int id, int idadeCensura, String titulo, Categoria categoria, float preco) {
        super(id, idadeCensura, titulo, categoria, preco);
        this.nomeConsole = nomeConsole;
    }
    
    public String getNomeConsole() {
        return nomeConsole;
    }

    public void setNomeConsole(String nomeConsole) {
        this.nomeConsole = nomeConsole;
    }
}
