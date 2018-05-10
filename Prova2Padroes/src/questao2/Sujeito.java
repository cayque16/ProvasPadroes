/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Otávio
 */
public abstract class Sujeito {    

	private List<Observador> observadores = new ArrayList<Observador>();
    

	public boolean addObservador(Observador v) {return observadores.add(v);}
    

	public Observador removeObservador(int idx) {return observadores.remove(idx);}
    

	public int sizeOfObservador() {return observadores.size();}
    

	public Iterator<Observador> iteratorObservador() {return observadores.iterator();}
    
	
	protected void notificar(double valorProduto, double percentualModificado) {
        
		for (Observador observador : observadores) {observador.atualizar(valorProduto, percentualModificado);}
    
	}

}



