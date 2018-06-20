package Lista2;

import java.util.Scanner;

public class Exercicio3 {
/**
 *
 * @author Danilo
 */
    public static void main(String[] args) {
        Scanner guardar = new Scanner(System.in);

        float numero1, numero2, numero3, media;

        System.out.println("Digite uma nota: ");
        numero1 = guardar.nextFloat();

        System.out.println("Digite outra nota: ");
        numero2 = guardar.nextFloat();

        System.out.println("Digite mais uma nota:");
        numero3 = guardar.nextFloat();

        if ((numero1 > numero2) && (numero1 > numero3)) {
            System.out.println("A maior nota é: " + numero1);
        } else if ((numero2 > numero1) && (numero2 > numero3)) {
            System.out.println("A maior nota é: " + numero2);

        } else if ((numero3 > numero1) && (numero3 > numero2)) {
            System.out.println("A maior nota é: " + numero3);
        }
        media = ((numero1 + numero2 + numero3) / 3);
        System.out.println("A média das notas são: " + media);

    }
}