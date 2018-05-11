/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao3;

/**
 *
 * @author cayqu
 */
public class Atendentes extends FuncionarioChain{

    String nome;
    int ramal;
    
    public Atendentes(IDFuncionarios id,String nome,int ramal) {
        super(IDFuncionarios.atendente);
        this.nome = nome;
        this.ramal = ramal;
    }

    @Override
    protected void efetuaAtendimento(Protocolo p) {
        p.setResolvido(true);
        p.setFuncionario(nome);
        System.out.println("Atendente: Protocolo resolvido");
    }
}
