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
public class TomatePrototype extends LegumePrototype {

    private int tipo;

    public TomatePrototype() {
        peso = 0.0;
    }

    public TomatePrototype(TomatePrototype tomatePrototype) {
        this.peso = tomatePrototype.getPeso();
    }

    @Override
    public LegumePrototype clonar() {
        return new TomatePrototype(this);
    }

    @Override
    public String exibirInfo() {
        return "Tomate plantado em: " + getDataPlantio() + " peso: " + this.getPeso();
    }

}
