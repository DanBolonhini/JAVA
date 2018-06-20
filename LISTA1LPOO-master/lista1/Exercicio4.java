package lista;

import java.util.Scanner;
/**
 *
 * @author Danilo
 */
public class Exercicio4 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double a, b;
        
        System.out.println("Digite dois números. Um pra A e outro pra B, onde A será B e B será A");
        
        System.out.println("Digite um valor para A: ");
        a = input.nextDouble();
        System.out.println("Digite um valor para B: ");
        b = input.nextDouble ();
        
        System.out.println("O valor de A será: " + b + " e o valor de B será: " +a);
    }
}

//Faça um algoritmo em fluxograma e pseudocódigo (VISUALG) que leia
//dois valores para as variáveis A e B, efetue a troca dos valores de forma