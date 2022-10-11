/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoreslogicos;

/**
 *
 * @author Rodrigo
 */
public class OperadoresLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int valor1 = 1;
        int valor2 = 2;
        
        boolean resultado1 = (valor1 == 1) && (valor2 == 2);
        System.out.println("Valor1 é 1 AND valor2 é 2 - resultado: "+ resultado1);
        
        boolean resultado2 = (valor1 == 1) || (valor2 == 2);
        System.out.println("Valor1 é 1 AND valor2 é 2 - resultado: "+ resultado2);
        
        boolean verdadeiro = true;
        boolean falso = false;
        System.out.println(verdadeiro && falso);
        System.out.println(verdadeiro || falso);
        System.out.println(verdadeiro ^ falso);
        System.out.println(!verdadeiro || falso);
        
        
    }
    
}
