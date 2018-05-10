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
public abstract class Colaborador {

    private Mediador mediador;

    public void chamarOperacao() {
        mediador.OperacaoMediada();
    }

    public Mediador getMediador() {
        return mediador;
    }

    public void setMediador(Mediador m) {
        mediador = m;
    }

}
