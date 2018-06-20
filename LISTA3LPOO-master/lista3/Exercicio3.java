package Lista3;


/**
 *
 * @author Danilo
 */
public class Exercicio3 {

    public static void main(String[] args) {

        int n1 = 1, n2 = 1, i = 0;
        double sFinal = 0;

        for (n2 = 1; n2 < 51; n2++) {
            double numero1 = n1, numero2 = n2;
            sFinal = sFinal + (numero1 / numero2);

            System.out.println("Resultado:" + n1 + "/" + n2 + "=" + sFinal);
            n1 = n1 + 2;

        }
        System.out.println("Soma: " + sFinal);
    }

}