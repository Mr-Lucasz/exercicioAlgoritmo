/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuestõesAlgoritmo;

/**
 *
 * @author LRodrigues
 */
public class QUESTION46 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int soma = 0;
        int valor = 6;
        while(valor <= 100){
            System.out.printf("%d ", valor);
            valor= valor+2;
            soma = soma+valor;
        }
        System.out.println("o resultado é:"+ soma);
    }
    
}
