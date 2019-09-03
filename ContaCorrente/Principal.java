/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContaCorrente;

import java.util.Scanner;

/**
 *
 * @author Willian
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                //DECLARANDO DOIS OBJETOS DA CLASSE CONTA.
        Conta donoConta01 = new Conta("Willian", 111111-11, 1500);
        Conta donoConta02 = new Conta("Gubiani", 222222-22, 1500);
        
        double qntSaque, qntDeposito, qntTransf, novoSaldo;
        
        Scanner entrada = new Scanner(System.in);
       
        System.out.println("Saldo Atual: " + donoConta01.getSaldo());
        
        System.out.println("Digite a quantidade para sacar:");
        qntSaque = entrada.nextDouble();
        donoConta01.sacar(qntSaque);
        System.out.println("\nDigite a quantidade para deposito");
        qntDeposito = entrada.nextDouble();
        donoConta01.depositar(qntDeposito);
        System.out.println("\nQuantidade de saque: " + qntSaque + "\n" +
                           "Quantidade de deposito: " + qntDeposito);
        
        System.out.println("Novo Saldo: " + donoConta01.getSaldo());
    }
    
    
    
    
}
