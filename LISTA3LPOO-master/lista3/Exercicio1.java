package Lista3;

import java.util.Scanner;

/**
 *
 * @author Danilo
 */
public class Exercicio1 {

    
    public static void main(String[] args) {
        Scanner guardar = new Scanner(System.in);
        
        double n, nMaior=0, nMenor = 0;
        
        System.out.println("Digite o 1º valor:");
        
            n=guardar.nextDouble();
            nMenor=n;
        for (int in = 2; in < 16; in++) {
            
            System.out.println("Digite o "+ in +" valor: ");
            n=guardar.nextDouble();
            
            if (n>nMaior) {
                nMaior=n;
            }
            
            if (n < nMenor) {
                nMenor=n;
            }
        }
        System.out.println("maior:" + nMaior);
        System.out.println("menor:" + nMenor);
    }

}