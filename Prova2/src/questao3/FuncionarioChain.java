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
public abstract class FuncionarioChain {
    protected FuncionarioChain next;
    protected IDFuncionarios idFuncionario;
    
    public FuncionarioChain(IDFuncionarios id){
        next = null;
        idFuncionario = id;
    }
    
    public void setNext(FuncionarioChain prox){
        if(next == null){
            next = prox;
        } else {
            next.setNext(prox);
        }
    }
    
    public void efetuarAtendimento(IDFuncionarios id) throws Exception{
        if (podeEfetuarAtendimento(id)){
            efetuaAtendimento();
        } else {
            if (next == null) {
                throw new Exception("funcinário não cadastrado");
            }
            next.efetuarAtendimento(id);
        }
    }
    
    private boolean podeEfetuarAtendimento(IDFuncionarios id){
        if(idFuncionario == id){
            return true;
        }
        return false;
    }
    
    protected abstract void efetuaAtendimento();
}
