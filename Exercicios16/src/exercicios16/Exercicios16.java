/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios16;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class Exercicios16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com a base:");
        int base = scan.nextInt();
        
        System.out.println("Entre com a potência:");
        int pot = scan.nextInt();
        
        int resultado = base;
        for (int i=1; i<pot ; i++){
            resultado *= base;
            
        }
        System.out.println("Resultado "+ resultado);
    }
    
}
