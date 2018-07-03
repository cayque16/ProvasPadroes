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
public class Pessoa {

    private float raiva;

    private Estado estado = new Civilizado();

    public Estado getEstado() {
        return estado;
    }

    public float getRaiva() {
        return raiva;
    }

    public void setRaiva(float raiva) {
        this.raiva = raiva;
        if (raiva < 0.8 && !(estado instanceof Civilizado)) {
            estado = new Civilizado();
        } else if (raiva >= 0.8 && !(estado instanceof Selvagem)) {
            estado = new Selvagem();
        }
    }

}
