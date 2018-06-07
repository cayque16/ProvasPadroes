/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao3;

import java.util.Date;

/**
 *
 * @author cayqu
 */
public abstract class LegumePrototype {

    protected Date plantio;
    protected double peso;

    public Date getPlantio() {
        return plantio;
    }

    public void setPlantio(Date plantio) {
        this.plantio = plantio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public abstract String exibirInfo();

    public abstract LegumePrototype clonar();

    public String getDataPlantio() {
        return plantio.getDate() + "/" + plantio.getMonth() + "/" + plantio.getYear();
    }
}
