/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios02;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class Exercicios02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Entre com a temperatura em Farenheit: ");
        double f = scan.nextDouble();
        
        double c = (5* (f-32) /9);
        
        System.out.println("A temperatura "+ f + "ºF é igual a "+ c+ "ºC");
        
    }
    
}
