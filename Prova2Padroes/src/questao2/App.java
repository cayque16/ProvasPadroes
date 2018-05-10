/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao2;

/**
 *
 * @author Otávio
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

		Folha f = new Folha();
        
		ObservadorDolar od = new ObservadorDolar(); 
       
		ObservadorPetroleo op = new ObservadorPetroleo();        
 	       
		f.addObservador(od);
        
		f.addObservador(op);
                
                // Exemplo: Gasolina a 4.5, obtém diminuição de 10% na produção, então o produto encarece + dobro do valor percentual, 4.5 + 20% = 5.4 
                f.setPercentual(0.10);
                f.setGasolina(4.50);
       
		System.out.println("Gasolina Mudança na produção de petróleo=" + op.getValorPetroleo()); 
                
                // Exemplo2: Gasolina a 4.5, obtém aumento de 10% na produção, então o produto barateia - valor percentual, 4.5 - 10% = 4.05
                f.setPercentual(- 0.10);
                f.setGasolina(4.50);
        
                System.out.println("Gasolina Mudança na produção de petróleo=" + op.getValorPetroleo()); 
                
                //Exemplo3: Gasolina a 4.5, dólar sobe 10% de valor, produto fica 10% + caro = 4.5 + 10% = 4.95
                
                f.setPercentual(0.10);
                f.setGasolina(4.50);
                
                System.out.println("Gasolina Mudança no valor do dolar=" + od.getValorDolar()); 
    
    
	}

}







