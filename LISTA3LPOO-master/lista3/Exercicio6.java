package Lista3;

import java.util.Scanner;

/**
 *
 * @author Danilo
 */
public class Exercicio6 {

    
    public static void main(String[] args) {

        Scanner guardar = new Scanner(System.in);

        double v1, v2, v3, soma, pdto, media;

        System.out.println("Digite o 1º valor:");
        v1 = guardar.nextDouble();
        System.out.println("Digite o 2º valor:");
        v2 = guardar.nextDouble();
        System.out.println("Digite o 3º valor:");
        v3 = guardar.nextDouble();

        while ((v1 < v2) && (v2 < v3) && (v1 < v3)) {
            soma = (v1 + v2 + v3);
            pdto = (v1 * v2 * v3);
            media = (v1 + v2 + v3) / 3;

            System.out.println("A soma:" + soma);
            System.out.println("O produto:" + pdto);
            System.out.println("A média:" + media);

            System.out.println("Digite o 1º valor:");
            v1 = guardar.nextDouble();
            System.out.println("Digite o 2º valor:");
            v2 = guardar.nextDouble();
            System.out.println("Digite o 3º valor:");
            v3 = guardar.nextDouble();

        }
    }

}