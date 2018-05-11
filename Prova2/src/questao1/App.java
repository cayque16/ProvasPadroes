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
public class App {
    public static void main(String[] args) {
        Matriz m = Matriz.getInstancia();
        m.setCGC("123");
        m.setEndereco("Rua azul");
        m.setQuimico("João");
        
        Fabrica f1 = new Fabrica("124", "Rua vermelha", 30);
        Fabrica f2 = new Fabrica("125", "Rua verde", 45);
        
        Loja l1 = new Loja("126", "Rua roxa", 4);
        Loja l2 = new Loja("126", "Rua preta", 3);
        Loja l3 = new Loja("126", "Rua lilas", 2);
        
        Perfume p1 = new Perfume(1, "Kaiak", (float) 79.9, "masculino");
        Perfume p2 = new Perfume(1, "Egeo", (float) 89.9, "feminino");
        
        DecimalFormat df = new DecimalFormat("#.00");
        
        System.out.println("Faturamento antes das vendas: "+m.totalAnual);
        System.out.println("-------------------------------------------");
        
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();
        Cliente c3 = new Cliente();
        
        c1.setUnidade(m);
        c1.realizarCompra(p1);
        
        c2.setUnidade(f1);
        c2.realizarCompra(p2);
        
        c1.setUnidade(f2);
        c1.realizarCompra(p1);
        
        c1.setUnidade(l1);
        c1.realizarCompra(p1);
        
        c1.setUnidade(l2);
        c1.realizarCompra(p2);
        
        c2.setUnidade(l3);
        c1.realizarCompra(p1);
        
        System.out.println("-------------------------------------------");
        System.out.println("Faturamento depois das vendas: "+df.format(m.totalAnual));
    }
}
