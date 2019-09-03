/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContaCorrente;

/**
 *
 * @author Willian
 */
public class Conta {
    
    private String nomeDono;
    private int numConta;
    private double saldo;
    
    public void sacar(double qntSaque) {
        double novoSaldo = this.saldo - qntSaque; 
        this.saldo = novoSaldo;
    }
    
    public void depositar(double qntDeposito) {
        this.saldo += qntDeposito;
    }
    
    public void tranferencia(Conta destino, double qntTransf){
        this.saldo = this.saldo - qntTransf;
            destino.depositar(qntTransf);
    }
    //DECLARANDO CONSTRUTORES
    
    //VAZIO
    public Conta(){
    }
    
    //CHEIO
    public Conta(String nomeDono, int numConta, double saldo){
        this.nomeDono = nomeDono;
        this.numConta = numConta;
        this.saldo = saldo;
    }
    
    // GETTERS E SETTERS:
    
    public String getNomeDono(){
        return nomeDono;
    }
    public void setNomeDono(String nomeDono){
        this.nomeDono = nomeDono;
    }
    public int getNumConta(){
        return numConta;
    }
    public void setNumConta(int numConta){
        this.numConta = numConta;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
}
