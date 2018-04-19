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
public class Exponencial extends Funcao{
    private double e;

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    @Override
    public double valorY(double x) {
        return Math.pow(e, x);
    }
}
