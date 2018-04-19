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
public class DVD extends Midia{
    private String genero,idioma;

    public DVD(String genero, String idioma, int id, int idadeCensura, String titulo, Categoria categoria, float preco) {
        super(id, idadeCensura, titulo, categoria, preco);
        this.genero = genero;
        this.idioma = idioma;
    }
    
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
}
