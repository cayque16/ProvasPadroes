/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao3;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author cayqu
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<LegumePrototype> listaLegumes = new ArrayList<>();
    
    public static void main(String[] args) {
        // TODO code application logic here
        BatataPrototype prototipoBatata = new BatataPrototype();
        CenouraPrototype prototipoCenoura = new CenouraPrototype();
        TomatePrototype prototipoTomate = new TomatePrototype();

        LegumePrototype legume;
        

        legume = prototipoBatata.clonar();
        legume.setPeso(150);
        legume.setPlantio(new Date(2018, 6, 7));
        listaLegumes.add(legume);

        legume = prototipoBatata.clonar();
        legume.setPeso(300);
        legume.setPlantio(new Date(2018, 6, 12));
        listaLegumes.add(legume);

        legume = prototipoCenoura.clonar();
        legume.setPeso(50);
        legume.setPlantio(new Date(2018, 6, 7));
        listaLegumes.add(legume);

        legume = prototipoCenoura.clonar();
        legume.setPeso(100);
        legume.setPlantio(new Date(2018, 6, 12));
        listaLegumes.add(legume);

        legume = prototipoTomate.clonar();
        legume.setPeso(120);
        legume.setPlantio(new Date(2018, 6, 7));
        listaLegumes.add(legume);

        legume = prototipoTomate.clonar();
        legume.setPeso(80);
        legume.setPlantio(new Date(2018, 6, 12));
        listaLegumes.add(legume);
        
        maiorLegume();

        /*for (int i = 0; i < listaLegumes.size(); i++) {
            System.out.println(listaLegumes.get(i).exibirInfo());
        }*/
    }

    public static void maiorLegume() {
        BatataPrototype batata = new BatataPrototype();
        TomatePrototype tomate = new TomatePrototype();
        CenouraPrototype cenoura = new CenouraPrototype();

        for (int i = 0; i < listaLegumes.size(); i++) {
            if (listaLegumes.get(i) instanceof BatataPrototype) {
                if (listaLegumes.get(i).getPeso() > batata.getPeso()) {
                    batata = (BatataPrototype) listaLegumes.get(i);
                }
            } else if (listaLegumes.get(i) instanceof TomatePrototype) {
                if (listaLegumes.get(i).getPeso() > tomate.getPeso()) {
                    tomate = (TomatePrototype) listaLegumes.get(i);
                } 
            } else {
                if (listaLegumes.get(i).getPeso() > cenoura.getPeso()) {
                    cenoura = (CenouraPrototype) listaLegumes.get(i);
                } 
            }
        }
        System.out.println("Maior batata: " + batata.exibirInfo());
        System.out.println("Maior tomate: " + tomate.exibirInfo());
        System.out.println("Maior cenoura: " + cenoura.exibirInfo());
    }
}
