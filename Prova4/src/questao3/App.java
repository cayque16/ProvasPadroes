/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao3;

/**
 *
 * @author cayqu
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Basico basico = new Basico();
        Prata prata = new Prata(basico);
        Bronze bronze = new Bronze(basico);
        Ouro ouro = new Ouro(prata);
        
        
        System.out.println(basico.toString());
        System.out.println(prata.toString());
        System.out.println(bronze.toString());
        System.out.println(ouro.toString());
    }
    
}
