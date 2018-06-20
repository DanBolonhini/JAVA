package lista;

import java.util.Scanner;
/**
 *
 * @author Danilo
 */
public class Exercicio2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double c;
        double f;
        
        System.out.println("Digite a Temperatura em Graus Centigrados para ser"); 
        System.out.println("convertido para Fahrenheit:");
        c = input.nextDouble();
        f = (9*c + 160)/5;
        
        System.out.println("O valor de Graus Centigrados em Fahrenheit é: " +f);
        
    }
}
//Faça um algoritmo e implemente no (VISUALG) que leia uma
//temperatura em graus Centígrados e apresente a temperatura
//convertida em graus Fahrenheit. A equação de conversão é: F = (9 * C +
//160) / 5. Em que F é a temperatura em Fahrenheit e C é a temperatura
//em Centígrados. Faça também o algoritmo em fluxograma.