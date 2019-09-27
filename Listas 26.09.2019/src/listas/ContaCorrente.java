/*
Classe Conta Corrente: Crie uma classe para implementar uma conta corrente.

A classe deve possuir os seguintes atributos: número da conta, nome do correntista e saldo. 

Os métodos são os seguintes: alterarNome, depósito e saque;

No construtor, saldo é opcional, com valor default zero e os demais atributos são obrigatórios.
 */

package listas;
public class ContaCorrente {
    
    //Atributos
    private int numeroDaConta;
    private String nomeDoCorrentista;
    private double saldo;
    
    //Métodos

    public ContaCorrente(int numeroDaConta, String nomeDoCorrentista) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoCorrentista = nomeDoCorrentista;
        this.saldo = 0;
    }
    
    
    
    
    public void alterarNome(String nome){
        this.nomeDoCorrentista = nome;
    }
    
    public void deposito(double deposito){
        this.saldo += deposito;
    }
    
    public void saque(double saque){
        this.saldo -= saque;
    }
}
