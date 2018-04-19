/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2;

/**
 *
 * @author cayqu
 */
public class AdaptadorSegundoGrau extends Funcao{

    private SegundoGrau sg = new SegundoGrau();
    
    public float getA(){
        return sg.getA();
    }
    
    public void setA(float a){
        sg.setA(a);
    }
    
    public float getB(){
        return sg.getB();
    }
    
    public void setB(float b){
        sg.setB(b);
    }
    
    public float getC(){
        return sg.getC();
    }
    
    public void setC(float c){
        sg.setC(c);
    }
    
    @Override
    public double valorY(double x) {
        return sg.calculaY((float) x);
    }
    
}
