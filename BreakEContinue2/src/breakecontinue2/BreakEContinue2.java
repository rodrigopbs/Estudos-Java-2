/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package breakecontinue2;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class BreakEContinue2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Entre com um número: ");
        int num = scan.nextInt();
        
        System.out.print("Entre com um limite: ");
        int max = scan.nextInt();
        
        for (int i=num; i<=max; i++){
            
            if (i%7 == 0){
                continue;
                
            }
            System.out.println("O valor de i é: "+i);
        }
    }
    
}
