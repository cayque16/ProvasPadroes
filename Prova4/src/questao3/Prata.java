/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao3;

/**
 *
 * @author cayqu
 */
public class Prata extends CoquetelDecorator {

    private float leiteCondensado;
    private float abacaxi;

    public Prata(Basico basico) {
        super(basico);
        this.leiteCondensado = 10;
        this.abacaxi = 100;
        super.setGelo(3);
    }

    public float getLeiteCondensado() {
        return leiteCondensado;
    }

    public void setLeiteCondensado(float leiteCondensado) {
        this.leiteCondensado = leiteCondensado;
    }

    public float getAbacaxi() {
        return abacaxi;
    }

    public void setAbacaxi(float abacaxi) {
        this.abacaxi = abacaxi;
    }

    @Override
    public String toString() {
        return "Coquetel Prata (Coquetel básico + " + "Leite condensado: " + 
                leiteCondensado + "ml, abacaxi: " + abacaxi + ", gelo: " + super.getGelo() + " pedras)";
    }

    
}
