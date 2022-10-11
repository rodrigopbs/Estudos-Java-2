/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios10;
import java.util.Scanner;
/**
 *
 * @author Rodrigo
 */
public class Exercicios10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        boolean infoValidas;
        String nomeUser;
        String senha;
        
        do{
            System.out.print("Entre com o nome do usuário: ");
            nomeUser = scan.next();
            
            System.out.print("Entre com a senha: ");
            senha = scan.next();
            
            if (nomeUser.equalsIgnoreCase(senha)){
                infoValidas = false;
                System.out.println("Senha igual ao usuário, digite novemente.");
            }else {
                infoValidas = true;
                System.out.println("Senha e usuários válidos.");
            }
            
        }while (!infoValidas);
    }
    
}
