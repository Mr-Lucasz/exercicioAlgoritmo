/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuestõesAlgoritmo;

import java.util.Scanner;

/**
 *
 * Faça um aplicativo que leia o preço de 8 produtos. No final, mostre na tela
 * qual foi o maior e qual foi o menor preço digitados.
 */
public class QUESTION51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int n =1;
         int produto=0;
         double valor = 0, maior = 0;
         double menor = 0;
        while(n <= 8){
  
            System.out.printf("%d Informe o preço:", n);
              valor  = s.nextInt();
            
              if(n ==1){
                  maior = valor;
                 menor = valor;
              }
              else{
                    if(valor > maior){
                      maior=valor;
                  
              } 
                    if(valor< menor){
                      menor = valor;
              }
             
              }
               n++;
        }
        System.out.println(maior);
        System.out.println(menor);
    }
    
}
