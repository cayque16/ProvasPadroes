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
public class ObservadorDolar implements Observador{
    
    private double valorDolar = 0;
    @Override
    public void atualizar(double valorProduto, double valorPercentualModificado) {
        valorDolar = valorProduto +  (valorProduto*valorPercentualModificado);
    }

    public double getValorDolar() {
        return valorDolar;
    }

    public void setValorDolar(double valorDolar) {
        this.valorDolar = valorDolar;
    }
}
