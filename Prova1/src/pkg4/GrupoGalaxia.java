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
public class GrupoGalaxia extends ObjetoAstronomico{

    private String nome;
    private double diametro;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
    
    List<Galaxia> galaxias = new ArrayList<Galaxia>();

    public GrupoGalaxia(String nome, float latitude, float massa, float velocidade, float campoGravi, String tipo) {
        super(nome, latitude, massa, velocidade, campoGravi, tipo);
    }

    public boolean addGalaxia(Galaxia g){
        return galaxias.add(g);
    }
    
    public Galaxia removeGalaxia(int idx){
        return galaxias.remove(idx);
    }
    
    public int sizeofGalaxia(){
        return galaxias.size();
    }
    
    public Iterator<Galaxia> iteratorGalaxia(){
        return galaxias.iterator();
    }
    
    @Override
    public float massaTotal() {
        float soma = getMassa();

        Iterator <Galaxia> it = this.iteratorGalaxia();
        for(int n = 0;n < this.sizeofGalaxia(); n++){
            soma += it.next().massaTotal();
        }
        
        return soma;
    }
    
}
