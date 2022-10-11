/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ifelse;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class IfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        System.out.print("Entre com sua idade:");
        int idade = scan.nextInt();
        
        if (idade>=18){
            System.out.println("É maior de idade.");
        } else {
            System.out.println("Não é maior de idade.");
        }
            
        
        // barato <= 10
        // 10 < valor < 15 - Pedir desconto
        // 15 <= valor 17 - Pesquisar mais
        // >= 17 - Muito caro
        
        System.out.print("Entre com o preço do item:");
        double valor = scan.nextDouble();
        
        if (valor<=10){
            System.out.println("Está barato, pode comprar.");
        } else if (valor>10 && valor <15){
                    System.out.println("Voce pode pedir um desconto.");                    
                    } else if (valor >=15 && valor <17){
                        System.out.println("Pode pesquisar mais.");
                    } else{ //(valor >=17)   
                        System.out.println("Muito caro.");
                    }                    
    }
    
}
