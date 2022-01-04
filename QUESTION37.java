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
public class QUESTION37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        System.out.println("Informe seu salário:");
        double money = s.nextDouble();
        
        System.out.println("Qual seu gênero:");
        int genero = s.nextInt();
        
        switch(genero){
            case 1:
                System.out.println("Masculino");
                break;
            case 2:
                System.out.println("Feminino");
                break;
            default: System.out.println("Opção não cadastrada");
            
        }
        System.out.println("Quantos anos trabalha na empresa:");
        int xp = s.nextInt();
        
        
       if (genero == 2){
            
           if(xp < 15)
               System.out.println("Seu novo salário "+ (money+money*0.05));
                if(xp >= 15 && xp<=20)
                   System.out.println("Seu novo salário "+ (money+money*0.12));
                      if(xp > 20)
                       System.out.println("Seu novo salário "+ (money+ money*0.23));
                                  }else
                                             if(genero == 1){
                                                  
                                                          if(xp < 20)
                                                                 System.out.println("Seu novo salário "+ (money+money*0.03));
                                                                              if(xp >= 20 && xp<=30)
                                                                                  System.out.println("Seu novo salário: " + (money + money*0.13));
                                                                                           if(xp > 30)
                                                                                               System.out.println("Seu novo salário "+ (money+ money*0.25));
                   
               }  
        


    }
    
}
