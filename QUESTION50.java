/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuestõesAlgoritmo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author LRodrigues
 */
public class QUESTION50 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        Random random = new Random();
       int sorteio = 0; 
        
        int n1 = 1 ;
        int numeros = 0;
        int maiorFive = 0;
        
        while(n1 <= 10 )
        {
        sorteio = random.nextInt(20);
         n1++; 
          System.out.printf("%d ", sorteio);
          
                if(sorteio%3 == 0){
             numeros++;             
          }
           if(sorteio > 5){
                maiorFive++;           
}
           
          
        }
        System.out.println("");
            System.out.println("Os números sorteados foram " +n1 );
        System.out.println("São os numeros divisiveis por 3 = "+numeros);
     System.out.println("São os numeros maiores que 5 =  "+maiorFive);
    }
}
