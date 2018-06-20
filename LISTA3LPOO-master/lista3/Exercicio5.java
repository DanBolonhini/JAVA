package Lista3;

import java.util.Scanner;

/**
 *
 * @author Danilo
 */
public class Exercicio5 {

    public static void main(String[] args) {

        Scanner guardar = new Scanner(System.in);

        int n, sPar = 0, sImpar = 0;

        System.out.println("Digite um número maior que 1000 para encerrar: ");
        n = guardar.nextInt();

        while (n <= 1000) {
            double resto = n % 2;
            if (resto == 0) {
                sPar = sPar + n;

            } else {
                sImpar = sImpar + n;

            }
            System.out.println("Digite um número maior a 1000 para encerrar: ");
            n = guardar.nextInt();
        }

        System.out.println("A soma total dos números pares:" + sPar);
        System.out.println("A soma total dos números impares:" + sImpar);

    }

}