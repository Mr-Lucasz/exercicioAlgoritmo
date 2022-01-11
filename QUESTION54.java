
package QuestõesAlgoritmo;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *54) Desenvolva um aplicativo que leia o peso e a altura de 7 pessoas, mostrando
no final:
a) Qual foi a média de altura do grupo
b) Quantas pessoas pesam mais de 90Kg
c) Quantas pessoas que pesam menos de 50Kg tem menos de 1.60m
d) Quantas pessoas que medem mais de 1.90m pesam mais de 100Kg.
 * @author LRodrigues
 */
public class QUESTION54 {
        
    public static void main(String[] args) {
        
       Scanner s = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat("#0.00");
                
       double mediaA=0,  mediaAlturaGp = 0, mais90=0, pesoAlt1=0, pesoAlt2=0;
       int n = 1;
       
       while(n<=2){
           
           System.out.println("Pessoa nº"+n+", Informe seu peso:");
            double peso = s.nextDouble();
                System.out.println("Pessoa "+n+"º, informe o sua altura:" );
                    double altura = s.nextDouble();
           
            mediaA+=altura;
            mediaAlturaGp+=mediaA/7;
            n++;
            
            if(peso > 90)
                mais90++;
            
            if(peso<50 && altura < 1.60)
               pesoAlt1++;
                    
            if(peso<100 && altura < 1.90)
               pesoAlt2++;        
       }
        System.out.println("Média de altura do grupo:"+mediaAlturaGp+" metros"); 
        System.out.println(mais90+" pessoas pesam mais de 90kg");
        System.out.println(pesoAlt1+" pessoas pesam menos de 50kg e tem menos de 1,60");
        System.out.println(pesoAlt2+" pessoas pesam menos de 100kg e tem mais de 1,90m");
        
}
}