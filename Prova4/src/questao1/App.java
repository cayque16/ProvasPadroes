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
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoa A = new Pessoa("João");
        A.executarAtividade((AtividadeCommand) new AtividadeCaminhada());
        A.executarAtividade((AtividadeCommand) new AtividadeLeitura());
        A.executarAtividade((AtividadeCommand) new AtividadeRefeicao());
        
    }
    
}
