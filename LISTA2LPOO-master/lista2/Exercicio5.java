package Lista2;

import java.util.Scanner;

/**
 *
 * @author Danilo
 */
public class Exercicio5 {

    public static void main(String[] args) {

        Scanner guardar = new Scanner(System.in);
        float n1, n2, n3;

        System.out.println("Informe o 1º número:");
        n1 = guardar.nextFloat();
        System.out.println("Informe o 2º número:");
        n2 = guardar.nextFloat();
        System.out.println("Informe o 3º número:");
        n3 = guardar.nextFloat();
        
        System.out.println("MENU DE OPÇÕES");
        System.out.println("1 - Calcular média ");
        System.out.println("2 - Calcular soma ");
        System.out.println("3 - Calcular multiplicação ");
        System.out.println("Escolha uma das opções :");

        int opcao = guardar.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("A média dos números é: " + ((n1 + n2 + n3) / 3));
                break;
            case 2:
                System.out.println("A soma dos números é:" + (n1 + n2 + n3));
                break;
            case 3:
                System.out.println("A multiplicação dos números é:" + (n1 * n2 * n3));
                break;
        }
    }

}
