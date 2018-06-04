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
public class App {

    public static void main(String args[]) {

        ColaboradorRyu r = new ColaboradorRyu();
        ColaboradorKen k = new ColaboradorKen();

        MediadorRyuKen m = new MediadorRyuKen(r, k);

        System.out.println("ryu=" + r.getVitalidade());
        System.out.println("ken=" + k.getVitalidade());

        r.chamarOperacao();

        System.out.println("ryu=" + r.getVitalidade());
        System.out.println("ken=" + k.getVitalidade());

        k.chamarOperacao();

        System.out.println("ryu=" + r.getVitalidade());
        System.out.println("ken=" + k.getVitalidade());

        m.OperacaoMediada();

        System.out.println("ryu=" + r.getVitalidade());
        System.out.println("ken=" + k.getVitalidade());
    }
}