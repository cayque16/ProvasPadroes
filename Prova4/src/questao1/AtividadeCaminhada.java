/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao1;

/**
 *
 * @author cayqu
 */
public class AtividadeCaminhada implements AtividadeCommand {

    private int distancia;

    public float emagrece() {
        return (float) (distancia * 0.4321);
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    @Override
    public void processaAtividade(Atividade atividade) {
        System.out.println("Caminhada adicionada ao Log");
    }

}
