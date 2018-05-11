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
public class Gerente extends FuncionarioChain{
    private String nome;
    private String departamento;

    public Gerente(IDFuncionarios id,String nome,String departamento) {
        super(IDFuncionarios.gerente);
        this.nome = nome;
        this.departamento = departamento;
    }

    @Override
    protected void efetuaAtendimento(Protocolo p) {
        System.out.println("Gerente: Protocolo não resolvido");
    }
}
