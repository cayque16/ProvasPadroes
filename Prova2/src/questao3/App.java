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
public class App {
    public static void main(String[] args) {
        
        Protocolo p = new Protocolo(1, "sem conexão");
        
        FuncionarioChain funcio = new Gerente(IDFuncionarios.gerente, "Carlos", "SAC");
        funcio.setNext(new Supervisor(IDFuncionarios.supervisor, "Lucas", "Internet"));
        funcio.setNext(new Atendentes(IDFuncionarios.atendente, "André", 1));
        
        try{         
            funcio.efetuarAtendimento(IDFuncionarios.gerente, p);
            funcio.efetuarAtendimento(IDFuncionarios.supervisor, p);
            funcio.efetuarAtendimento(IDFuncionarios.atendente, p);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
