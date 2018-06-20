package lista;

import java.util.Scanner;
/**
 *
 * @author Danilo
 */
    public class Exercicio5{
        public static void main(String[] args) {
            int n;
            double v;
                Scanner input = new Scanner(System.in);
            
                System.out.println("Digite um número INTEIRO para apresentar o quadrado desse NÚMERO:");
            n = input.nextInt();
            v = Math.pow(n, 2);
            System.out.println("O Quadrado do númeoro "+ n+" é: "+ v);
        }
    }
//Faça um algoritmo em fluxograma e pseudocódigo (VISUALG) que
//efetue a leitura de um número inteiro e apresente o resultado do
//quadrado deste número.