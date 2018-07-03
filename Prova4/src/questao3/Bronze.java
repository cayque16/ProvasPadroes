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
public class Bronze extends CoquetelDecorator {

    private float leiteCondensado;
    private float guarana;

    public Bronze(Basico basico) {
        super(basico);
        this.leiteCondensado = 20;
        this.guarana = 100;
        super.setLeiteCoco(100);
    }

    public float getLeiteCondensado() {
        return leiteCondensado;
    }

    public void setLeiteCondensado(float leiteCondensado) {
        this.leiteCondensado = leiteCondensado;
    }

    public float getGuarana() {
        return guarana;
    }

    public void setGuarana(float guarana) {
        this.guarana = guarana;
    }

    @Override
    public String toString() {
        return "Coquetel Bronze (Coquetel básico + " + "Leite condensado: "
                + leiteCondensado + "ml, guaraná: " + guarana + "ml, leite de coco: " + super.getLeiteCoco() + "ml)";
    }
}
