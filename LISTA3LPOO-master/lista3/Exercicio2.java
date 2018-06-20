package Lista3;

/**
 *
 * @author Danilo
 */
public class Exercicio2 {

    public static void main(String[] args) {

        for (int pNumero = 0; pNumero < 10; pNumero++) {

            System.out.println("A tabuada do número é:" + pNumero);

            for (int sNumero = 0; sNumero < 11; sNumero++) {

                System.out.println(pNumero + "X" + sNumero + "=" + (sNumero * pNumero));
            }
        }
    }
}