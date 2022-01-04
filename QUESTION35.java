
package QuestõesAlgoritmo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class QUESTION35 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");

        
 
           System.out.println("Voce usou o carro quantos dias?"); 
            int dia = s.nextInt();
           System.out.println("Quanto km percorreu?");
           int km = s.nextInt();
           
             System.out.println("Escolha o carro usado:");
        System.out.println("1 - Carro de Luxo 2 - Carro Popular");
         int carroescolhido = s.nextInt();
      
            switch (carroescolhido){
                case 1:
                    System.out.println("Vc escolheu o carro de luxo");                   
                    break;
                case 2:
                     System.out.println("Vc escolheu o carro popular");

                    break;
                     default: System.out.println("Opcao invalida");
            } 
             
         System.out.println("Você pagará "+ 150*dia +" reais por dia usado") ;
           
           if(km <= 200){
               System.out.println("vc pagara " +0.3*km+ "reais por km");
           }
               else{
                    if(km > 200)
               System.out.println("vc pagara " +0.25*km+ "reais por km");
           }
   
                 System.out.println("Você pagará "+ 90*dia +" reais por dia usado") ;
           
           if(km <= 100){
               System.out.println("vc pagara " +0.2*km+ "reais por km");
           }
               else{
                    if(km > 100)
               System.out.println("vc pagara " +0.10*km+ "reais por km");
                   
           }
    
    }
}

