/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2;

/**
 *
 * @author cayqu
 */
public class App {
    public static void main(String[] args) {
        AdaptadorSegundoGrau sg = new AdaptadorSegundoGrau();
        
        sg.setA(10);
        sg.setB(22);
        sg.setC(31);
        
        System.out.println("Valor de Y: "+sg.valorY(4));
    }
}
