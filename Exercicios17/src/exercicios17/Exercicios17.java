/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios17;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class Exercicios17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int num;
        int pares = 0;
        int impares = 0;
        
        for (int i=0; i<5; i++){
            
            System.out.println("Entre com um número: ");
            num = scan.nextInt();
                    
            if (num %2 ==0){
                pares++;
            }else {
                impares++;
            }
        }
        System.out.println("Pares "+ pares);
        System.out.println("Impares"+ impares);
    }
    
}
