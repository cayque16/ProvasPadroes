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
public class Cliente {
    
    private Unidade unidade = null;

    public Unidade getUnidade() {
        return unidade;
    }

    public void setUnidade(Unidade unidade) {
        this.unidade = unidade;
    }
    
    public boolean realizarCompra(Perfume p){
        if(unidade != null){
            unidade.venda(p);
            return true;
        }
        return false;
    }
}
