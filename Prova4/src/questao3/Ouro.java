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
public class Ouro extends Prata {

    private float marshmallow;
    private int cereja;
    private int guardaChuva;

    public Ouro(Prata prata) {
        super(prata);
        this.marshmallow = 100;
        this.cereja = 1;
        this.guardaChuva = 1;
    }

    public float getMarshmallow() {
        return marshmallow;
    }

    public void setMarshmallow(float marshmallow) {
        this.marshmallow = marshmallow;
    }

    public int getCereja() {
        return cereja;
    }

    public void setCereja(int cereja) {
        this.cereja = cereja;
    }

    public int getGuardaChuva() {
        return guardaChuva;
    }

    public void setGuardaChuva(int guardaChuva) {
        this.guardaChuva = guardaChuva;
    }

    @Override
    public String toString() {
        return "Coquetel Ouro (Coquetel prata + " + "marshmallow: " + 
                marshmallow + "g, guarda-chuva: " + guardaChuva + ")";
    }
}
