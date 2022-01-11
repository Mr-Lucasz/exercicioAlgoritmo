/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuestõesAlgoritmo;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *56) Crie um programa que leia vários números pelo teclado e mostre no final o
somatório entre eles.
Obs: O programa será interrompido quando o número 1111 for digitado
 * @author LRodrigues
 */
public class QUESTION56 {
    public static void main(String[] args) {
        
   
    Scanner s = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#0.00");
    
    int n = 0, num=0, soma=0;
    while(n<=10){
        System.out.println("Digite um número:");
        num = s.nextInt();
        
       if(num == 1111){ 
           System.out.println("!!!!!!!!!BREAK!!!!!!!!!!");
           break;
         
       }
       
       /**uma váriável soma com valor zero para armazenar o valor de numero e atriubur a soma, resultando no somatório dos
       numeros ditados.
       
       */
       soma +=num;
       n++;
       }
        System.out.println("O SOMATÓRIO DOS NUMEROS DIGITADO SÃO:"+soma);
    }
 }