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
public class Loja implements Unidade{

    String CGC,endereco;
    int nVendedores;

    public Loja(String CGC, String endereco, int nVendedores) {
        this.CGC = CGC;
        this.endereco = endereco;
        this.nVendedores = nVendedores;
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

    public int getnVendedores() {
        return nVendedores;
    }

    public void setnVendedores(int nVendedores) {
        this.nVendedores = nVendedores;
    }

    @Override
    public void venda(Perfume p) {
        float valor,total;
        DecimalFormat df = new DecimalFormat("#.00");
        valor = p.preco + (p.preco * (float) 0.75);
        total = Matriz.getInstancia().getTotalAnual();
        Matriz.getInstancia().setTotalAnual(total+valor);
        System.out.println("Perfume vendido pela loja "+ CGC +": "+df.format(valor));
    }    
}
