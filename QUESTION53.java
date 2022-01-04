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
public class QUESTION53 {

    /**
     * 53) Faça um programa que leia a idade e o sexo de 5 pessoas, mostrando no final:
a) Quantos homens foram cadastrados
b) Quantas mulheres foram cadastradas
c) A média de idade do grupo
d) A média de idade dos homens
e) Quantas mulheres tem mais de 20 anos
    
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        int n = 1;
        int idade = 0, soma=0, num=0;
        int homem = 0,  mulher=0, maiorVi = 0;
        double mediaIda = 0, idaMed = 0,idadeH = 0, mediaIdH =0;
        
        while(n <= 5){
            System.out.println("Infomre a idade da " +n+ "º pessoa:" );
            idade = s.nextInt();
            
            System.out.println("Qual o Sexo ?");
            int sexo = s.nextInt();
       
            mediaIda = mediaIda + idade;   
           idaMed = mediaIda/5;
           n++;
           
            if(sexo == 1){
              homem++;
            }
           if(sexo == 2){
              mulher++;
           }
           if(sexo == 1){
            idadeH = idadeH + idade;
            mediaIdH = idadeH/5;
           }      
          if(sexo == 2 && idade > 20){
            maiorVi = maiorVi + 1;
          }
           
     }
        System.out.println(homem+" homens foram cadastrados");
        System.out.println(mulher+ " mulheres foram cadastradas");
        System.out.println("A média de idade do grupo é: "+idaMed);
        System.out.println("A média de idade dos homens: "+mediaIdH);
        if(maiorVi == 0){
            System.out.println("Nenhuma tem mais de 20");
        }
            else
                 System.out.println(maiorVi + " mulheres tem mais de 20y");
        }
    }



