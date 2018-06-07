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
public class BatataPrototype extends LegumePrototype {

    private int tipo;
    private double tam;

    public BatataPrototype() {
        peso = 0.0;
    }

    public BatataPrototype(BatataPrototype batataPrototype) {
        this.peso = batataPrototype.getPeso();
    }

    @Override
    public LegumePrototype clonar() {
        return new BatataPrototype(this);
    }

    @Override
    public String exibirInfo() {
        return "Batata plantada em: " + getDataPlantio() + " peso: " + this.getPeso();
    }

}
