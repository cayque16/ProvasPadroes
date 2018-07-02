/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao1;

/**
 *
 * @author cayqu
 */
public class Refeicao {
    private float caloria;
    
    public float engorda(){
        return (float) (caloria * 0.1234);
    }

    public float getCaloria() {
        return caloria;
    }

    public void setCaloria(float caloria) {
        this.caloria = caloria;
    }
    
    
}
