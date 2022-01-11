/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuestõesAlgoritmo;

import java.util.Random;
import java.util.Scanner;

/**
 *55) [DESAFIO] Vamos melhorar o jogo que fizemos no exercício 32. A partir de
agora, o computador vai sortear um número entre 1 e 10 e o jogador vai ter 4
tentativas para tentar acertar.
* 
 * @author LRodrigues
 */
public class QUESTION55 {
       public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      Random random = new Random();
       int r1 = random.nextInt(10)+1;
      int n = 1; 
      
     
        
      while(n<=4){
          System.out.println("Tentativa Nº"+n);
          n++;
        System.out.println("Vai lá!!! Digite um número de 1 a 10:");           
        int n1 = s.nextInt(); 
           
               
         if(r1 == n1){  
             System.out.println("Você acertou "); 
             break;
                    }
                
                    else
                    if (r1 != n1){
                          System.out.println("Você não acertou, tente novamente");                                                         
                                }
         if(n > 4)
              System.out.println("Sua chances acabaram");
        
    }
   n++;
}
}
