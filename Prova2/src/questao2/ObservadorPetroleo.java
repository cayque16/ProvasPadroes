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
public class ObservadorPetroleo implements Observador{

    private double valorPetroleo = 0;
    @Override
    public void atualizar(double valorProduto, double percentualModificado) {
        if(percentualModificado > 0){
        valorPetroleo = valorProduto +  (valorProduto * 2.0 * percentualModificado);
        } else {
            valorPetroleo = valorProduto +  (valorProduto * percentualModificado);
        }
    }

    public double getValorPetroleo() {
        return valorPetroleo;
    }

    public void setValorPetroleo(double valorPetroleo) {
        this.valorPetroleo = valorPetroleo;
    }
}