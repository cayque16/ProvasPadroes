/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

import java.util.Scanner;

/**
 *
 * @author cayqu
 */
public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Coracao coracao = new Coracao();
        Pulmao pulmao = new Pulmao();
        Rim rim = new Rim();
        
        FachadaTrasnplanteTriplo f = new FachadaTrasnplanteTriplo(coracao, rim, pulmao);
        
        System.out.println("Tamanho do coração: ");
        f.setTamanhoCoracao(s.nextInt());
        
        System.out.println("Tamanho do pulmão: ");
        f.setTamanhoPulmao(s.nextInt());
        
        System.out.println("Lado do pulmão: ");
        f.setLadoPulmao(s.nextInt());
        
        System.out.println("Tamanho do rim: ");
        f.setTamanhoRim(s.nextInt());
        
        System.out.println("Lado do rim: ");
        f.setLadoRim(s.nextInt());
        
        System.out.println("Tamanho do pulmao: "+f.getTamanhoPulmao());
        
        
    }
}
