package lista;

import static java.lang.Math.PI;
import java.util.Scanner;
/**
 *
 * @author Danilo
 */
    public class Exercicio3{
        
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            
                double r, a, v;
            
                System.out.println("Digite o raio e a altura da lata de óleo para calcular o volume da lata");
                System.out.println("Digite o RAIO");
                    r = input.nextDouble();
                System.out.println("Digite a ALTURA");
                    a = input.nextDouble();
                
                v = Math.pow(r, 2);
                System.out.println(v);
                
            
        }
    }

//Faça um algoritmo com descrição narrativa e em pseudocódigo para
//calcular e apresentar o valor do volume de uma lata de óleo, utilizando a
//equação: Volume = PI * raio2 * altura. Implemente no software
//(VISUALG).