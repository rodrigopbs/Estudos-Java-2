/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios11;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class Exercicios11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        boolean infoValida = false;
        String nome, sexo, estadoCivil;
        int idade;
        double salario;
        
        
        do{
            System.out.println("Entre com o nome:");
            nome = scan.next();
            
            if (nome.length() > 3){
                infoValida = true;
            }else { 
                System.out.println("Nome precisa no mínimo 3 caracteres.");
            }
        }while(!infoValida);
        
        infoValida = false;
        
        do{
            System.out.println("Entre com a idade:");
            idade = scan.nextInt();
            
            if (idade >= 0 && idade <= 150){
                infoValida = true;
            }else { 
                System.out.println("Idade precisa ser entre 0 e 150.");
            }
        }while(!infoValida);
        
        infoValida = false;
        
        do{
            System.out.println("Entre com o salário:");
            salario = scan.nextDouble();
            
            if (salario>0){
                infoValida = true;
            }else { 
                System.out.println("Salario precisa ser maior que 0.");
            }
        }while(!infoValida);
        
        infoValida = false;
        
        do{
            System.out.println("Entre com o genero:");
            sexo = scan.next();
            
            if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m") ){
                infoValida = true;
            }else { 
                System.out.println("Salario precisa ser 'f' ou 'm' ");
            }
        }while(!infoValida);
        
        infoValida = false;
        
        do{
            System.out.println("Entre com o estado civil:");
            estadoCivil = scan.next();
            
            if (estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d") ||
                    estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c")){
                infoValida = true;
            }else { 
                System.out.println("Estado civil precisa ser 's', 'c', 'v' ou 'd' ");
            }
        }while(!infoValida);

        System.out.println("As seguintes informações foram coletadas: ");
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Salário: "+salario);
        System.out.println("Sexo: "+sexo);
        System.out.println("Estado Civil: "+estadoCivil); 
    }
    
}
