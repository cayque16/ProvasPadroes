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
public class Basico {

    private float cachaca;
    private int gelo;
    private float leiteCoco;

    public Basico() {
        cachaca = 100;
        gelo = 2;
        leiteCoco = 50;
    }

    public float getCachaca() {
        return cachaca;
    }

    public void setCachaca(float cachaca) {
        this.cachaca = cachaca;
    }

    public int getGelo() {
        return gelo;
    }

    public void setGelo(int gelo) {
        this.gelo = gelo;
    }

    public float getLeiteCoco() {
        return leiteCoco;
    }

    public void setLeiteCoco(float leiteCoco) {
        this.leiteCoco = leiteCoco;
    }

    @Override
    public String toString() {
        return "Coquetel Básico (cachaça: " + cachaca + "ml , gelo: " + gelo + 
                " pedras, " + "leite de coco: " + leiteCoco + "ml)";
    }

}
