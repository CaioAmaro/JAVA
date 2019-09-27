/*
    Classe Quadrado: Crie uma classe que modele um quadrado: 
    a. Atributos: Tamanho do lado 
    b. Métodos: Mudar valor do Lado, Retornar valor do Lado e calcular Área; 
 */

package listas;
public class Quadrado {
    
    //ATRIBUTOS
    private double tamanhoDoLado;
    
    //MÉTODOS
    public void mudarValorDoLado(double tamanhoDoLado){
        this.tamanhoDoLado = tamanhoDoLado;
    }
    
    public double retornarValorDoLado(){
        return this.tamanhoDoLado;
    }
    
    public void calcularArea(){
       double area = this.tamanhoDoLado*2;
       //System.out.println("A area é: "+  area);
    }
    
}

