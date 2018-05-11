/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao4;

/**
 *
 * @author Otávio
 */
public class MediadorRyuKen implements Mediador {

    private ColaboradorRyu ryu;
    private ColaboradorKen ken;

    public MediadorRyuKen(ColaboradorRyu ryu, ColaboradorKen ken) {
        this.ryu = ryu;
        this.ken = ken;
        ryu.setMediador(this);
        ken.setMediador(this);
    }

    public ColaboradorRyu getRyu() {
        return ryu;
    }

    public void setRyu(ColaboradorRyu r) {
        ryu = r;
    }

    public ColaboradorKen getKen() {
        return ken;
    }

    public void setKen(ColaboradorKen k) {
        ken = k;
    }

    public void OperacaoMediada() {
        if (ryu != null) {
            ryu.hadouken();
        }
        if (ken != null) {
            ken.shoryuken();
        }
    }
}
