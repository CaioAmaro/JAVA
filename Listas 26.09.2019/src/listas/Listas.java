package listas;
import java.util.Scanner;


public class Listas {
    public static void main(String[] args) {
        
        Retangulo retangulo = new Retangulo();
        Scanner entrada = new Scanner(System.in);
       
        double altura;
        double base;
        double quantidadeDePisos;
        double quantidadeDeRodapes;
        
        System.out.println("Digite a altura do retângulo: ");
        altura = entrada.nextDouble();
        System.out.println("Digite a Base do retângulo: ");
        base = entrada.nextDouble();
        
        
        quantidadeDePisos = retangulo.calcularArea(base,altura);
        System.out.println("A quantidade de piso é "+ quantidadeDePisos + " m^2");
        
        quantidadeDeRodapes = retangulo.calcularPerimetro(altura,base);
        System.out.println("A quantidade de rodapé é "+ quantidadeDeRodapes + " m");
        
               
    }  
}
