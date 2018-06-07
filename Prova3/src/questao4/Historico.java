/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao4;

import java.util.Stack;

/**
 *
 * @author cayqu
 */
public class Historico {

    private Stack<Consulta> consultas = new Stack<>();

    public boolean addConsulta(Consulta c) {
        consultas.push(c);
        return true;
    }

    public int sizeOfConsulta() {
        return consultas.size();
    }

    public Consulta removePilhaConsulta() {
        return consultas.pop();
    }
}
