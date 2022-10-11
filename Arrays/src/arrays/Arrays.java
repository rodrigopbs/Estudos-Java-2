/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

/**
 *
 * @author Rodrigo
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              
        //temperaturas por dia
        double [] temperaturas = new double [30];        
        temperaturas [0] = 31.3;
        temperaturas [1] = 32;
        temperaturas [2] = 33.7;
        temperaturas [3] = 34;
        temperaturas [4] = 33.1;
        
        System.out.println("O valor da temperatura do dia 1 é: " +temperaturas[0]);
        
        System.out.println("O tamando do array: "+ temperaturas.length);
        
        System.out.println("Valores do array: " + temperaturas);
        
        for (int i=0; i<temperaturas.length; i++){
            System.out.println("O valor da temperatura do dia" + (i+1)+ " é " + temperaturas[i]);
            
        }
        
        //for melhorado para arrays
        for(double temp: temperaturas){
            System.out.println(temp);
            
        }
        
     }
    
}
