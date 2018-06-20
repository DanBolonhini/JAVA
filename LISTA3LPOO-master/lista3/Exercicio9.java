package Lista3;

import java.util.Scanner;

/**
 *
 * @author Danilo
 */
public class Exercicio9 {

    public static void main(String[] args) {

        Scanner guardar = new Scanner(System.in);

        int primo = 0, n;

        System.out.println("Digite um numero: ");
        n = guardar.nextInt();

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                primo = 1;
            }
        }
        if (primo == 0) {
            System.out.println("Primo!");
        } else {
            System.out.println("Não é primo!");
        }
    }
}