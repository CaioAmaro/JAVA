/*

Classe Pessoa: Crie uma classe que modele uma pessoa: 

a. Atributos: nome, idade, peso e altura 

b. Métodos: Envelhercer, engordar, emagrecer, crescer. 

Obs: Por padrão, a cada ano que nossa pessoa envelhece,
sendo a idade dela menor que 21 anos, ela deve crescer 0,5 cm. 

 */

package listas;
public class Pessoa {
    
    //Atributos
    private String nome;
    private int idade;
    private double peso;
    private double altura;
    
    //métodos
    public void envelhecer(){
        if(this.idade < 21){
            this.idade ++;
            this.altura += 0.5;
        }else{
            this.idade ++;
        }
    }
    
    public void engordar(){
        this.peso ++;
    }
    
    public void emagrecer(){
        this.peso --;
    }
    
    public void crescer(){
        this.altura ++;
    }
}
