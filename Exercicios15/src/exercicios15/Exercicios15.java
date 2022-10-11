/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios15;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class Exercicios15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o número para gerar a tabuada: ");
        int num = scan.nextInt();
        
        System.out.println("Tabuada de "+num + ":");
        
        for (int i=1; i<=10; i++){
            System.out.println(num+ " x " + i + " = "+ (num*i));
            
        }
        
    }
    
}
