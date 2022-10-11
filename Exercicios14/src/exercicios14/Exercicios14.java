/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios14;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class Exercicios14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o primeiro número: ");
        int num1 = scan.nextInt();
        
        System.out.println("Entre com o segundo número: ");
        int num2 = scan.nextInt();
        
        int soma = 0;
        
        for (int i= num1; i <= num2; i++){
            soma += i;
        }
        System.out.println("Soma "+soma);
    }
    
}
