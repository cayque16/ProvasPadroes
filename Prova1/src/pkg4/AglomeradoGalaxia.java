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
public class AglomeradoGalaxia extends ObjetoAstronomico{
    
    private String nome;

    List<GrupoGalaxia> grupoGalaxias = new ArrayList<GrupoGalaxia>();

    public AglomeradoGalaxia(String nome, float latitude, float massa, float velocidade, float campoGravi, String tipo) {
        super(nome, latitude, massa, velocidade, campoGravi, tipo);
    }

    public boolean addGrupo(GrupoGalaxia g){
        return grupoGalaxias.add(g);
    }
    
    public GrupoGalaxia removeGrupo(int idx){
        return grupoGalaxias.remove(idx);
    }
    
    public int sizeofGrupo(){
        return grupoGalaxias.size();
    }
    
    public Iterator<GrupoGalaxia> iteratorGrupo(){
        return grupoGalaxias.iterator();
    }
    
    @Override
    public float massaTotal() {
        float soma = getMassa();

        Iterator <GrupoGalaxia> it = this.iteratorGrupo();
        for(int n = 0;n < this.sizeofGrupo(); n++){
            soma += it.next().massaTotal();
        }
        
        return soma;
    }    
}
