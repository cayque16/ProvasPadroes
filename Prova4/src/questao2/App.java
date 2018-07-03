/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2;

/**
 *
 * @author Otávio
 */
public class App {
    
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setRaiva((float) 0.5);
        System.out.println(p1.getEstado());
        p1.setRaiva((float) 0.9);
        System.out.println(p1.getEstado());
    }
    
}
