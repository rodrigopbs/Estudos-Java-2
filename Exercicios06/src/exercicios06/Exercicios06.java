/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios06;
import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class Exercicios06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o turno que você estuda (M,T,N): ");
        String turno = scan.next();
        
        switch(turno){
            case "m", "M" :  System.out.println("Bom dia!"); break;
            case "t", "T" :  System.out.println("Boa tarde!"); break;
            case "n", "N" :  System.out.println("Boa noite!"); break;
            default: System.out.println("Valor invalido");
        }
        
        
    }
}
