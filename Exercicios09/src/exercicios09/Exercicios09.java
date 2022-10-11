/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios09;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class Exercicios09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        boolean notaValida = false;
        
        do{ 
        System.out.println("Entre com uma nota");
        
        double nota = scan.nextDouble();
        
        
        if (nota >= 0 && nota <= 10){
            notaValida =true;
            System.out.println("Voce digitou: "+ nota);
                       
        } else {
            System.out.println("Nota inválida, digite novamente.");
        }
        }while (!notaValida);
    }
   
}
