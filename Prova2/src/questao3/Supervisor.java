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
public class Supervisor extends FuncionarioChain{
    
    private String nome,secao;
    
    public Supervisor(IDFuncionarios id,String nome,String secao) {
        super(IDFuncionarios.supervisor);
        this.nome = nome;
        this.secao = secao;
    }

    @Override
    protected void efetuaAtendimento(Protocolo p) {
        p.setResolvido(true);
        p.setFuncionario(nome);
        System.out.println("Supervisor: Protocolo resolvido");
    }
    
}
