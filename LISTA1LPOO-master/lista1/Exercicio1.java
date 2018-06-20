
package lista;

import java.util.Scanner;

/**
 *
 * @author Danilo
 */
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        double n1, n2;
        
        System.out.println("Digite um número: ");
        n1 = input.nextDouble();
        
        System.out.println("Digite outro número: ");
        n2 = input.nextDouble ();
        
        System.out.println("A Soma é:"+(n1 + n2));
        System.out.println("A Diferença é:" + (n1 - n2));
        System.out.println("A Multiplicação é:" +(n1/n2));
        System.out.println("A Média do valor é:" +(n1 + n2)/2);
    }
    
}