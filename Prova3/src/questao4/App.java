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
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Paciente paciente = new Paciente("Cayque");
        Consulta consulta = new Consulta("Tratamento 1");

        paciente.setTratamento(consulta.getTratamento());
        System.out.println(paciente.getTratamento());
        
        consulta.setTratamento("Tratamento 2");
        
        paciente.setTratamento(consulta.getTratamento());
        System.out.println(paciente.getTratamento());
        
        consulta.setTratamento("Tratamento 3");
        
        paciente.setTratamento(consulta.getTratamento());
        System.out.println(paciente.getTratamento());
        
        consulta.setTratamento("Tratamento 4");
        
        paciente.setTratamento(consulta.getTratamento());
        System.out.println(paciente.getTratamento());
        
        consulta.setTratamento("Tratamento 5");
        
        paciente.setTratamento(consulta.getTratamento());
        System.out.println(paciente.getTratamento());
        
        paciente.desfazerConsulta();
        paciente.desfazerConsulta();
        paciente.desfazerConsulta();
        
        System.out.println("Desfeito 3x: ");
        System.out.println(paciente.getTratamento());
    }

}
