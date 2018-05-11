/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao1;

import java.text.DecimalFormat;

/**
 *
 * @author cayqu
 */
public class Matriz implements Unidade{

    String CGC,endereco,quimico;
    public float totalAnual = 0;
    public static Matriz matriz = new Matriz();
    
    private Matriz(){
        
    }
    
    public static Matriz getInstancia(){
        return matriz;
    }

    public String getCGC() {
        return CGC;
    }

    public void setCGC(String CGC) {
        this.CGC = CGC;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getQuimico() {
        return quimico;
    }

    public void setQuimico(String quimico) {
        this.quimico = quimico;
    }
    
    @Override
    public void venda(Perfume p) {
        float valor;
        DecimalFormat df = new DecimalFormat("#.00");
        valor = p.preco + (p.preco * (float) 0.5);
        Matriz.getInstancia().totalAnual += valor;
        System.out.println("Perfume vendido pela matriz: "+df.format(valor));
    }
}