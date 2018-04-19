/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4;

/**
 *
 * @author USUARIO
 */
public class App {
    
    public static void main(String[] args) {
        SistemaEstelar s1 = new SistemaEstelar("Sistema1", 1, 2, 3, 4, "tipo1");
        SistemaEstelar s2 = new SistemaEstelar("Sistema2", 5, 6, 7, 8, "tipo2");
        SistemaEstelar s3 = new SistemaEstelar("Sistema3", 9, 10, 11, 12, "tipo3");
        SistemaEstelar s4 = new SistemaEstelar("Sistema4", 13, 14, 15, 16, "tipo4");
        SistemaEstelar s5 = new SistemaEstelar("Sistema5", 17, 18, 19, 20, "tipo5");
        SistemaEstelar s6 = new SistemaEstelar("Sistema6", 21, 22, 23, 24, "tipo6");

        Galaxia g1 = new Galaxia("Galaxia1", 1, 2, 3, 4, "tipo1");
        Galaxia g2 = new Galaxia("Galaxia1", 5, 6, 7, 8, "tipo2");
        
        g1.addSistema(s1);
        g1.addSistema(s2);
        g1.addSistema(s3);
        
        g2.addSistema(s4);
        g2.addSistema(s5);
        g2.addSistema(s6);
        
        GrupoGalaxia gg1 = new GrupoGalaxia("Grupo1", 1, 2, 3, 4, "tipo1");
        GrupoGalaxia gg2 = new GrupoGalaxia("Grupo2", 5, 6, 7, 8, "tipo2");
        
        gg1.addGalaxia(g1);
        gg2.addGalaxia(g2);
        
        AglomeradoGalaxia ag = new AglomeradoGalaxia("Aglomerado", 1, 2, 3, 4, "tipo");
        
        ag.addGrupo(gg1);
        ag.addGrupo(gg2);
        
        Universo u =  new Universo("Univero", 1, 2, 3, 4, "tipo");
        
        u.addAglomerado(ag);
        
        System.out.println("Massa desse universo: " + u.massaTotal());
    }          
}
