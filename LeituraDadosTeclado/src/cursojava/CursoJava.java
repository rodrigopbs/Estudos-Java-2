/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cursojava;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class CursoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Separados 
        /*
        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome completo é: "+ nomeCompleto);
        
        System.out.println("Digite seu primeiro nome: ");
        String primeiroNome = scan.next();
        System.out.println("Seu primeiro nome é: "+ primeiroNome);
        
        
        System.out.println("Dogote a sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Sua idade é: "+ idade);
       
        System.out.println("Digite a sua altura: ");
        double altura = scan.nextDouble();
        System.out.println("A sua altura é: "+ altura);
        
        */
        // Juntos 
        System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem bichinho de estimação: ");
        String primeiroNome = scan.next();
        int idade = scan.nextInt();
        byte qtdFilhos = scan.nextByte();
        float altura = scan.nextFloat();
        boolean temPet = scan.nextBoolean();
        
        System.out.println("Voce digitou os seguintes valores:");
        System.out.println("Primeiro nome: "+ primeiroNome);
        System.out.println("Idade: "+ idade);
        System.out.println("Quantidade de filhos: "+ qtdFilhos);
        System.out.println("Altura: "+ altura);
        System.out.println("Tem bichinho de estimação: "+ temPet);

    }
    
}
