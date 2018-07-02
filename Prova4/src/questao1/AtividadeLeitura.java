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
public class AtividadeLeitura implements AtividadeCommand {

    int paginas;

    public float sabedoria() {
        return (float) (paginas * 0.9876);
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public void processaAtividade(Atividade atividade) {
        System.out.println("Leitura adicionada ao Log");
    }

}
