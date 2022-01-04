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
public class QUESTION33 {

    /**
     *  Escreva um programa para aprovar ou não o empréstimo bancário para a compra
        de uma casa. O programa vai perguntar o valor da casa, o salário do comprador e
        em quantos anos ele vai pagar. Calcule o valor da prestação mensal, sabendo que
        ela não  pode exceder 30% do salário ou então o empréstimo será negado.
     */
    public static void main(String[] args) {
              Scanner s = new Scanner(System.in);
            DecimalFormat df = new DecimalFormat("#0.00");  
        
            
            System.out.println("Informe o valor da casa que quer comprar");
            int valor = s.nextInt();
            
            System.out.println("Infome o seu salário:");
            int salario = s.nextInt();
            
            System.out.println("Informe em anos quanto tempo deseja pagar:");
            int tempo = s.nextInt();
    
            int prestacao = valor/(tempo*12);
            
            System.out.println("O valor da prestação é " +prestacao);
            
            
            if(prestacao < salario*0.3) 
            System.out.println("Você conseguirá o empréstimo");
    
                else
                    if (prestacao > salario*0.3)
                        System.out.println("Você não conseguirá o empréstimo");
            
    }
    
}
