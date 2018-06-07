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
public class CenouraPrototype extends LegumePrototype {

    private double tam;

    public CenouraPrototype() {
        peso = 0.0;
    }

    public CenouraPrototype(CenouraPrototype cenouraPrototype) {
        this.peso = cenouraPrototype.getPeso();
    }

    @Override
    public LegumePrototype clonar() {
        return new CenouraPrototype(this);
    }

    @Override
    public String exibirInfo() {
        return "Cenoura plantada em: " + getDataPlantio() + " peso: " + this.getPeso();
    }

}
