/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios03;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class Exercicios03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Entre com o primeiro número:");
        int num1 = scan.nextInt();
        
        System.out.print("Entre com o segundo número:");
        int num2 = scan.nextInt();
        
        if (num1 > num2){
            System.out.println("O num1 é maior: "+num1);           
        } else {
            System.out.println("O num2 é maior: "+num2);
            
        }        
        
    }
    
}
