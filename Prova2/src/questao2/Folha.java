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
public class Folha extends Sujeito{
    
    private double gas;
    private double gasolina;
    private double percentual;

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    public double getGas() {
        return gas;
    }

    public void setGas(double gas) {
        this.gas = gas;
        notificar(gas, percentual);
    }

    public double getGasolina() {
        return gasolina;
    }

    public void setGasolina(double gasolina) {
        this.gasolina = gasolina;
        notificar(gasolina, percentual);
    }
    
    
    
}
