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
public class Midia {
    private int id,idadeCensura;
    private String titulo;
    private Categoria categoria;
    private float preco;

    public Midia(int id, int idadeCensura, String titulo, Categoria categoria, float preco) {
        this.id = id;
        this.idadeCensura = idadeCensura;
        this.titulo = titulo;
        this.categoria = categoria;
        this.preco = preco;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdadeCensura() {
        return idadeCensura;
    }

    public void setIdadeCensura(int idadeCensura) {
        this.idadeCensura = idadeCensura;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    public float precoFinal(){
        return categoria.Preco(preco);
    }
}
