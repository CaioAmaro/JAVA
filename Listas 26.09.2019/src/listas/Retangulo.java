/*
Classe Retangulo: Crie uma classe que modele um retangulo: 
a. Atributos: LadoA, LadoB (ou Comprimento e Largura, ou Base e Altura, a escolher) 

b. Métodos: Mudar valor dos lados, Retornar valor dos lados, calcular Área e calcular Perímetro; 

c. Crie um programa que utilize esta classe. Ele deve pedir ao usuário que informe as medidades de um local. 
Depois, deve criar um objeto com as medidas e calcular a quantidade de pisos e de rodapés necessárias para o local. 

 */
package listas;
public class Retangulo {
    
    //ATRIBUTOS
    private double base;
    private double altura;
    
    //MÉTEDOS
    public void mudarValorDosLados(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    public double retornarBase(){
        return this.base;
    }
    
    public double retornarAltura(){
        return this.altura;
    }
    
    public double calcularArea(double base , double altura){
        return base * altura;
    }
    
    public double calcularPerimetro(double base, double altura){
        return  2*(base + altura);
    }
    
    
}
