/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loopwhile;

/**
 *
 * @author Rodrigo
 */
public class LoopWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int i = 1; //count ou cont
        int max = 10;
        
        System.out.println("Contando até "+max);
        
        while (i <= max) {
            System.out.println("Valor de i: "+i);
            i++; // i = i + 1; ou i += 1;
        }
        System.out.println(i);
    }
    
}
