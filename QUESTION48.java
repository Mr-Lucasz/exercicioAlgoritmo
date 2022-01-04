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
public class QUESTION48 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
       int n1 = 1; 
       int soma=0;
       while(n1 <= 7 ){
            System.out.printf("%d ", n1);
            n1++;
                soma = soma + n1;
            
            
        }
        System.out.println("A soma é:" + soma);
    }
    
}
