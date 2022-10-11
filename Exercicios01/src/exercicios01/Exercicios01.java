/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios01;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class Exercicios01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);   
        
        System.out.print("Digite um número em métros: ");
        int numero1 = scan.nextInt();
        
        
        System.out.println("O numero convertido em centimetros é " + (numero1 * 100) + "cm");
        
    
        
    }
    
}
