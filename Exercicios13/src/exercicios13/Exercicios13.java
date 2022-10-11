/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios13;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class Exercicios13 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int num;
        int maior = Integer.MIN_VALUE;
        
       
        for (int i=0 ; i< 5; i++){
            
            System.out.print("Entre com um número: ");
            num = scan.nextInt();
            
            if (num>maior) {
                maior = num;
            }
        }
        System.out.println("O maior número digitado foi: "+ maior);
    }
    
}
