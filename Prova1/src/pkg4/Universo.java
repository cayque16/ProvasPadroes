/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author cayqu
 */
public class Universo extends ObjetoAstronomico{
    
    List<AglomeradoGalaxia> aglomeradoGalaxias = new ArrayList<AglomeradoGalaxia>();

    public Universo(String nome, float latitude, float massa, float velocidade, float campoGravi, String tipo) {
        super(nome, latitude, massa, velocidade, campoGravi, tipo);
    }

    public boolean addAglomerado(AglomeradoGalaxia a){
        return aglomeradoGalaxias.add(a);
    }
    
    public AglomeradoGalaxia removeAglomerado(int idx){
        return aglomeradoGalaxias.remove(idx);
    }
    
    public int sizeofAglomerado(){
        return aglomeradoGalaxias.size();
    }
    
    public Iterator<AglomeradoGalaxia> iteratorAglomerado(){
        return aglomeradoGalaxias.iterator();
    }
    
    @Override
    public float massaTotal() {
        float soma = getMassa();

        Iterator <AglomeradoGalaxia> it = this.iteratorAglomerado();
        for(int n = 0;n < this.sizeofAglomerado(); n++){
            soma += it.next().massaTotal();
        }
        return soma;
    }    

    
}
