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
public class QUESTION49 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner s = new Scanner(System.in);
       
      
        int n =1;
        int n1= 0;
        int n2=0;
            
        while (n<=6){
            System.out.printf("%d ", n );
               n++;
             
        if(n%2 == 0){
                n1++;
            }
            else if(n1%2 != 0){
               n2++;
                
            }
        }
        System.out.println("");
        System.out.println("Numeros pares: "+n1);
        System.out.println("Numeros impares: "+n2);
    }
    
}
