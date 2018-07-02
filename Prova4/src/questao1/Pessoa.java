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
public class Pessoa {
    protected String nomeDaPessoa;
    
    public Pessoa(String nome){
        nomeDaPessoa = nome;
    }
    
    public void executarAtividade(AtividadeCommand tipoDeAtividade){
        Atividade atividade = new Atividade(nomeDaPessoa);
        tipoDeAtividade.processaAtividade(atividade);
    }
}
