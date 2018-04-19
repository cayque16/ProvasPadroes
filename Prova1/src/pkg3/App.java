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
public class App {
    public static void main(String[] args) {
        
        Normal normal = new Normal();
        Lancamento lancamento = new Lancamento();
        SuperLancamento superLancamento = new SuperLancamento();
        Midia locacao[] = new Midia[3];
        float total = 0;
        
        locacao[0] = new CD("Iron Maiden", 14, 1, 16, "Piece of Mind",normal , 20);
        locacao[1] = new DVD("Ação", "pt", 1, 16, "Rampage: Destruição Total", lancamento, 60);
        locacao[2] = new Game("PS4", 1, 18, "God of War 4", superLancamento, (float) 149.90);
        
        System.out.println("Nova locação:");
        for(int i=0;i<3;i++){
            System.out.println(locacao[i].getTitulo() +"-----------"+locacao[i].precoFinal());
            total += locacao[i].precoFinal();
        }
        System.out.println("Total: ------------ "+total);
    }
}
