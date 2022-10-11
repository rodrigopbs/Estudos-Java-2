/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios05;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class Exercicios05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*
        //Usando if else
        
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Entre com uma letra: ");
        String letra = scan.next();
        
        if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || 
                letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") ||
                letra.equalsIgnoreCase("u")){
            System.out.println("Vogal");
            
        }else {
            System.out.println("Consoante");
        }
                       
    }
*/
    //Usando Switch Case
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Entre com uma letra: ");
        String letra = scan.next();
        
        if (letra.length()>1){
            System.out.println("Não é uma letra válida.");
        
        }else{
            switch(letra){
            case "a", "e", "i", "o", "u", "A", "E", "I", "O", "U" -> System.out.println("Vogal");
            default -> System.out.println("Consoante");
         
            }
        }
    }
}