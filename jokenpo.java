/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuestõesAlgoritmo;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author LRodrigues
 */
public class jokenpo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner s = new Scanner(System.in);
         DecimalFormat df = new DecimalFormat("#0.00");
         
         //JOKENPÔ
         
         System.out.println("Escolha entre 0 , 1 e 2"); 
            System.out.println("Pedra = 0");
            System.out.println("Papel = 1");
            System.out.println("Tesoura = 2");
            
                System.out.println("Jogador 1");
                    int v1 = s.nextInt();
                System.out.println("Jogador 2");
                    int v2 = s.nextInt();
                    
             switch (v1) {       
                 case  0:
                     switch (v2){     
                         case 0:
                                System.out.println("Empate");
                                break;
                         case 1: 
                                System.out.println("Jogador 2 ganhou");
                                break;
                         case 2: 
                                System.out.println("Jogador 1 ganhou");
                         default:
                                System.out.println("User error");
                     }break;
                 case 1: 
                        switch(v2){ 
                            case 0:
                                System.out.println("Jogador 1 ganhou");
                                break;
                            case 1:
                                System.out.println("Empate");
                                break;
                            case 2:   
                                System.out.println("Jogador 2 ganhou");
                                break;
                              default:
                                System.out.println("User error");    
                        } break; 
                 case 2: 
                        switch(v2){ 
                            case 0:
                                System.out.println("Jogador 2 ganhou");
                                break;
                            case 1:
                                System.out.println("Jogador 1 ganhou");
                                break;
                            case 2:   
                                System.out.println("Empate");
                                break;
                              default:
                                System.out.println("User error");    
                        } break;
                                default:
                                System.out.println("User error");
                     }
             }
                    
    }
    

