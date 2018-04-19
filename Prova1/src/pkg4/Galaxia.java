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
public class Galaxia extends ObjetoAstronomico{
    
    private String nome,tipo;
    
    List<SistemaEstelar> sistemaEstelares = new ArrayList<SistemaEstelar>();

    public Galaxia(String nome, float latitude, float massa, float velocidade, float campoGravi, String tipo) {
        super(nome, latitude, massa, velocidade, campoGravi, tipo);
    }

    public boolean addSistema(SistemaEstelar s){
        return sistemaEstelares.add(s);
    }
    
    public SistemaEstelar removeSistema(int idx){
        return sistemaEstelares.remove(idx);
    }
    
    public int sizeofSistema(){
        return sistemaEstelares.size();
    }
    
    public Iterator<SistemaEstelar> iteratorSistema(){
        return sistemaEstelares.iterator();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public float massaTotal() {
        float soma = getMassa();

        Iterator <SistemaEstelar> it = this.iteratorSistema();
        for(int n = 0;n < this.sizeofSistema(); n++){
            soma += it.next().massaTotal();
        }
        
        return soma;
    }   
}
