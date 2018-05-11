/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao1;

import java.text.DecimalFormat;

/**
 *
 *
 * @author cayqu
 */
public class Fabrica implements Unidade{

    String CGC,endereco;
    int nOperarios;

    public Fabrica(String CGC, String endereco, int nOperarios) {
        this.CGC = CGC;
        this.endereco = endereco;
        this.nOperarios = nOperarios;
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

    public int getnOperarios() {
        return nOperarios;
    }

    public void setnOperarios(int nOperarios) {
        this.nOperarios = nOperarios;
    }

    @Override
    public void venda(Perfume p) {
        float valor;
        DecimalFormat df = new DecimalFormat("#.00");
        valor = p.preco + (p.preco * (float) 0.5);
        Matriz.getInstancia().totalAnual += valor;
        System.out.println("Perfume vendido pela fabrica "+ CGC +": " + df.format(valor));
    }   
}
