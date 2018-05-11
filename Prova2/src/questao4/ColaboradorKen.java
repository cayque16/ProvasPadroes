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
public class ColaboradorKen extends Colaborador {

    private int vitalidade = 100;

    public void shoryuken() {
        vitalidade -= 8;
    }

    public int getVitalidade() {
        return vitalidade;
    }

}
