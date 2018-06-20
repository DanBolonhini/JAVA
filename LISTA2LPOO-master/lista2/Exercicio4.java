package Lista2;

import java.util.Scanner;


public class Exercicio4 {

    public static void main(String[] args) {

        Scanner guardar = new Scanner(System.in);
        float n1, n2, n3;
        String opcao;

        System.out.println("Informe o 1º número:");
        n1 = guardar.nextFloat();
        System.out.println("Informe o 2º número:");
        n2 = guardar.nextFloat();
        System.out.println("Informe o 3º número:");
        n3 = guardar.nextFloat();

        System.out.println("Digite: C para crescente e D para decrescente.");
        opcao = guardar.next();

        if (opcao.equalsIgnoreCase("c")) {

            if (((n1 < n2) && (n1 < n3) && (n2 < n3))) {
                System.out.println("A ordem crescente é:" + n1 + "," + n2 + "," + n3);
            } else if (((n1 < n2) && (n1 < n3) && (n3 < n2))) {
                System.out.println("A ordem crescente é:" + n1 + "," + n3 + "," + n2);
            } else if ((n2 < n1) && (n2 < n3) && (n1 < n3)) {
                System.out.println("A ordem crescente é:" + n2 + "," + n1 + "," + n3);
            } else if ((n2 < n1) && (n2 < n3) && (n3 < n1)) {
                System.out.println("A ordem crescente é:" + n2 + "," + n3 + "," + n1);
            } else if ((n3 < n1) && (n3 < n2) && (n1 < n2)) {
                System.out.println("A ordem crescente é:" + n3 + "," + n1 + "," + n2);
            } else if ((n3 < n1) && (n3 < n2) && (n2 < n1)) {
                System.out.println("A ordem crescente é:" + n3 + "," + n2 + "," + n1);
            }

        } else if (opcao.equalsIgnoreCase("d")) {
            if (((n1 > n2) && (n1 > n3) && (n2 > n3))) {
                System.out.println("A ordem decrescente é:" + n1 + "," + n2 + "," + n3);
            } else if (((n1 > n2) && (n1 > n3) && (n3 > n2))) {
                System.out.println("A ordem decrescente é:" + n1 + "," + n3 + "," + n2);
            } else if ((n2 > n1) && (n2 > n3) && (n1 > n3)) {
                System.out.println("A ordem decrescente é:" + n2 + "," + n1 + "," + n3);
            } else if ((n2 > n1) && (n2 > n3) && (n3 > n1)) {
                System.out.println("A ordem decrescente é:" + n2 + "," + n3 + "," + n1);
            } else if ((n3 > n1) && (n3 > n2) && (n1 > n2)) {
                System.out.println("A ordem decrescente é:" + n3 + "," + n1 + "," + n2);
            } else if ((n3 > n1) && (n3 > n2) && (n2 > n1)) {
                System.out.println("A ordem decrescente é:" + n3 + "," + n2 + "," + n1);
            }
        }

    }

}