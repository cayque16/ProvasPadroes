/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3;

/**
 *
 * @author cayqu
 */
public class SuperLancamento implements Categoria{
    private final int tempo = 24;

    @Override
    public float Preco(float preco) {
        return (float) (preco * 0.01 + preco);
    }
}
