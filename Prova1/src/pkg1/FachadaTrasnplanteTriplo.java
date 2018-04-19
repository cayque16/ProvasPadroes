/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

/**
 *
 * @author cayqu
 */
public class FachadaTrasnplanteTriplo {
    Coracao coracao;
    Rim rim;
    Pulmao pulmao;

    public FachadaTrasnplanteTriplo(Coracao coracao, Rim rim, Pulmao pulmao) {
        this.coracao = coracao;
        this.rim = rim;
        this.pulmao = pulmao;
    }
    
    public final int getTamanhoCoracao(){
        return coracao.getTamanho();
    }
    
    public final void setTamanhoCoracao(int tamanho){
        coracao.setTamanho(tamanho);
    }
    
    public final int getTamanhoPulmao(){
        return pulmao.getTamanho();
    }
    
    public final void setTamanhoPulmao(int tamanho){
        pulmao.setTamanho(tamanho);
    }
    
    public final int getLadoPulmao(){
        return pulmao.getLado();
    }
    
    public final void setLadoPulmao(int tamanho){
        pulmao.setLado(tamanho);
    }
    
    public final int getTamanhoRim(){
        return rim.getTamanho();
    }
    
    public final void setTamanhoRim(int tamanho){
        rim.setTamanho(tamanho);
    }
    
    public final int getLadoRim(){
        return rim.getTamanho();
    }
    
    public final void setLadoRim(int tamanho){
        rim.setTamanho(tamanho);
    }
}
