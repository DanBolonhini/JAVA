package Lista2;

import java.util.Scanner;
/**
 *
 * @author Danilo
 */
public class Exercicio2 {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        float l1, l2, l3;
        System.out.println("Digite um número para ser o L1 do Triângulo: ");
        l1 = leitura.nextFloat();
        System.out.println("Digite mais um número para ser o L2 do Triângulo: ");
        l2 = leitura.nextFloat();
        System.out.println("Digite outro número para ser o L3 do Triângulo: ");
        l3 = leitura.nextFloat();
        if ((l1 + l2 > l3) && (l2 + l3 > l1) && (l3 + l1 > l2)) {
            //( L1+L2 > L3; L2+L3 >L1 e L3+L1 > L2)  
            System.out.println("Os valores formam um triângulo");
        } else {
            System.out.println("Os valores não formam um triângulo");
        }

        if ((l1 == l2 && l1 != l3) || (l1 == l3 && l1 != l2) || (l3 == l2 && l3 != l1)) {
            System.out.println("Triângulo Isóceles");

        } else if ((l1 != l3) && (l1 != l2) && (l3 != l1)) {
            System.out.println("Triângulo Escaleno");

        } else if ((l1 == l2 && l1 == l3)) {
            System.out.println("Triângulo Equilátero");

        }

    }
}
