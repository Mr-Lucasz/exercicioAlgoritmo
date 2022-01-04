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
public class QUESTION42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner s = new Scanner(System.in);
        System.out.println("VALOR:");
        int valor =  1;
        
        System.out.println("Informe um valor:");
        int valor1 = s.nextInt();
        
        while( valor <= valor1){
            System.out.printf("%d ", valor);
            valor++;
           
        }
      
    System.out.print("Acabou!");
             
    }
    
}

    
    

