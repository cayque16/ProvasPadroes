/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4;

import java.util.*;

/**
 *
 * @author cayqu
 */
public class SistemaEstelar extends ObjetoAstronomico{
    
    private String nome;
    private ObjetoAstronomico objetoCentral;
    
    List<ObjetoAstronomico> objetosAstronomicos = new ArrayList<ObjetoAstronomico>();

    public SistemaEstelar(String nome, float latitude, float massa, float velocidade, float campoGravi, String tipo) {
        super(nome, latitude, massa, velocidade, campoGravi, tipo);
    }

    public boolean addObjeto(ObjetoAstronomico o){
        return objetosAstronomicos.add(o);
    }
    
    public ObjetoAstronomico removeObjeto(int idx){
        return objetosAstronomicos.remove(idx);
    }
    
    public int sizeofObjeto(){
        return objetosAstronomicos.size();
    }
    
    public Iterator<ObjetoAstronomico> iteratorObjeto(){
        return objetosAstronomicos.iterator();
    }
    
    @Override
    public float massaTotal() {
        float soma = getMassa();

        Iterator <ObjetoAstronomico> it = this.iteratorObjeto();
        for(int n = 0;n < this.sizeofObjeto(); n++){
            soma += it.next().massaTotal();
        }
        
        return soma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ObjetoAstronomico getObjetoCentral() {
        return objetoCentral;
    }

    public void setObjetoCentral(ObjetoAstronomico objetoCentral) {
        this.objetoCentral = objetoCentral;
    }
    
    
}
