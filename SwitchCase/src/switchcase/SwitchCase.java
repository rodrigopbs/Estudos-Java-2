/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchcase;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class SwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Entre com um dia da semana (1-7):");
        int diaSemana = scan.nextInt();
        
        
        switch (diaSemana){
            case 1 : System.out.println("Domingo"); break;
            case 2 : System.out.println("Segunda"); break;
            case 3 : System.out.println("Terça"); break;
            case 4 : System.out.println("Quarta"); break;
            case 5 : System.out.println("Quinta"); break;
            case 6 : System.out.println("Sexta"); break;
            case 7 : System.out.println("Sabado"); break;
            default : System.out.println("Não é um dia da semana válido."); break;
        }
        
        }
        
    }
    

