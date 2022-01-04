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
public class QUESTION43 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        int valor = 30;
           
           
           while(valor >= 1){
            System.out.printf("%d ", valor);
            valor--;
            
            if(valor%4 == 0){
                System.out.print("["+valor+"]");
                 valor--;
            }

            
            
               
                }
          
        System.out.print("Acabou!");
    }
    
}
