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
public class QUESTION32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      Random random = new Random();
      
        System.out.println("Digite um número de 1 a 5");
        int n1 = s.nextInt();
        int r1 = random.nextInt(5)+1;
        
    
      
      if(n1 == r1){
                System.out.println("Você acertou ");
      }
                else
                    if(n1 != r1){
                        System.out.println("Você não acertou");
                        
      }
      
    }
    
}
