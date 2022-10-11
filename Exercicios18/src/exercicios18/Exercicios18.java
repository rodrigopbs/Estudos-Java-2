/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios18;

import java.util.Scanner;

/**
 *
 * @author Rodrigo
 */
public class Exercicios18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //System.out.println("Lojas Tabajara");  
        
        int qtdProdutos;                
        boolean sair = false;
        String continuarCompra;
        double preco, total;
        String output;
        double valorPago, troco;
        
        do {
            System.out.println("Deseja informar uma nova compra? S/N");
            continuarCompra = scan.next();
            
            if (continuarCompra.equalsIgnoreCase("S") ){
                
                output = "Lojas Tabajata\n";
                
            System.out.println("Digite a quantidade de produtos da compra:");
            qtdProdutos = scan.nextInt();
            
            total = 0;
            
            for (int i=1; i<=qtdProdutos; i++){
                System.out.println("Informe preço do produto "+i);
                preco = scan.nextDouble();
                total += preco;
                output += "Produto " + i + ": R$ "+ preco +"\n";
                
            }
            output += "Total: R$ " + total + "\n";
            
                System.out.println("Total: R$ "+total);
            
                System.out.println("Entre com o valor pago:");
                valorPago = scan.nextDouble();
                
                output += "Dinheiro: R$ " + valorPago + "\n";
                
                
                troco = total - valorPago;
                
                output += "Troco: R$ "+troco;
                
                System.out.println(output);
            }else {
                sair = true;
            }
        }while(!sair);
        
      
    }
    
}
