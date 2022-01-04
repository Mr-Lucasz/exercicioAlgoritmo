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
public class QUESTION45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner s = new Scanner(System.in);
        
        
        System.out.println("INFORME O PRIMEIRO VALOR:");
        int valor = s.nextInt();
        System.out.println("INFORME O ÚLTIMO VALOR:");
        int valorF = s.nextInt();
        System.out.println("INCREMENTO");
        int incremento = s.nextInt();
        
        while(valor <= valorF){
            System.out.printf("%d ", valor);
            valor = valor + incremento;
        }
            while(valor >= valorF){   
                System.out.printf("%d ", valor);
                    valor = valor-incremento;
      
        }
        System.out.print("Acabou!");
    }

}