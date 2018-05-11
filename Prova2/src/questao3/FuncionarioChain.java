/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao3;

import java.util.Random;

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
    
    public void efetuarAtendimento(IDFuncionarios id,Protocolo p) throws Exception{
        if (podeEfetuarAtendimento(id)){
            efetuaAtendimento(p);
        } else {
            if (next == null) {
                throw new Exception("funcinário não cadastrado");
            }
            next.efetuarAtendimento(id,p);
        }
    }
    
    private boolean podeEfetuarAtendimento(IDFuncionarios id){
        Random random = new Random();
        int x = random.nextInt(100) + 1;
        if(idFuncionario == id.atendente){
            return true;
        } else if((idFuncionario == id.supervisor) && (x%3 == 0)){
            return true;
        }
        return false;
    }
    
    protected abstract void efetuaAtendimento(Protocolo p);
}
