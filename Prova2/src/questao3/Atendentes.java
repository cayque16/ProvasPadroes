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

    public Atendentes(IDFuncionarios id) {
        super(IDFuncionarios.func1);
    }

    @Override
    protected void efetuaAtendimento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
