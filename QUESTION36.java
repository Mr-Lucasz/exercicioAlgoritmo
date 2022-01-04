/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuestõesAlgoritmo;

import java.util.Scanner;

/**
 *
 * @author LRodrigues
 */
public class QUESTION36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int p =0;
        
        System.out.println("SEJA BEM VINDO AO 7LIFE");
        
        System.out.println("Quantos horas de atividade física você praticou esse mês?");
        int horasA = s.nextInt();
        
        
        if (horasA <= 10){
           int dif = horasA - 0;
            p = dif*2;
        }
        if (horasA > 10 && horasA<=20){
            int dif = horasA - 10;
            p = dif*10;
        }
        if (horasA > 20){
            int dif = horasA - 20;
            p = dif*10;
            
        
        }
 
        System.out.println("Você obteve "+p+" pontos e R$"+(0.05*p)+" em dinheiro");
    }
}

