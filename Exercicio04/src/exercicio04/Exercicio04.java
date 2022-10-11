/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio04;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class Exercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Entre com uma letra (F ou M): ");
        String input = scan.next();
        
        if(input.equalsIgnoreCase("f")){
            System.out.println("F - Feminino");
            
        }else if (input.equalsIgnoreCase("m")){
            System.out.println("M - masculino");
            
        }else{
            System.out.println("Sexo inválido");
        }
        
        
        
    }
    
}
