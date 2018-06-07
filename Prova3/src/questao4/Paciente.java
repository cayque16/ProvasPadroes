/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao4;

/**
 *
 * @author cayqu
 */
public class Paciente {
    private String nome;
    private Historico historico = new Historico();
    private String tratamento;

    public Paciente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Historico getHistorico() {
        return historico;
    }

    public void setHistorico(Historico historico) {
        this.historico = historico;
    }

    public String getTratamento() {
        return tratamento;
    }

    public void setTratamento(String tratamento) {
        historico.addConsulta(new Consulta(this.tratamento));
        this.tratamento = tratamento;
    }
    
    public boolean desfazerConsulta() {
        if (historico.sizeOfConsulta()> 0) {
            this.tratamento = historico.removePilhaConsulta().getTratamento();
            return true;
        } else {
            return false;
        }
    }
}
