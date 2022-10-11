/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dowhile;

/**
 *
 * @author Rodrigo
 */
public class DoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 1;
        int max = 10;
        
        System.out.println("Contando até "+max);
        
        do{
            
            System.out.println("Valor de i: "+ i); 
            i++;
        }while (i <= 15);
        
        System.out.println(i);
        
    }
    
}
