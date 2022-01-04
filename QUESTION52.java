/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuestõesAlgoritmo;

import java.util.Scanner;

/**
 *52) Crie um algoritmo que leia a idade de 10 pessoas, mostrando no final:
    a) Qual é a média de idade do grupo
    b) Quantas pessoas tem mais de 18 anos
    c) Quantas pessoas tem menos de 5 anos
    d) Qual foi a maior idade lida
 * @author LRodrigues
 */
public class QUESTION52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Scanner s = new Scanner(System.in);
       
       int n = 1;
       int idade = 0, dezo = 0, five=0, maior=0;
       double soma = 0;
        while (n <= 3){
             System.out.print("Idade, pessoa " +n+ "º :");
                idade = s.nextInt();
                
        
        if(idade > 18){
             dezo++;
             }
             if(idade < 5){
                five++;
          }
             if(idade > maior){
                 maior=idade;
                 }
         n++;
         soma += idade;
      }
        System.out.println("A média de idade do grupo é "+soma/3 );
        System.out.println(dezo + " pessoas tem idade maior que 18");
        System.out.println(five+ " pesssoa possuem idade menor que 5");
    }
}
