package lista2;

import java.util.Scanner;
/**
 *
 * @author Danilo
 */
public class Exercicio1{
    
    public static void main(String[] args) {
        
       double n = 0; 
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Informe um número: ");
        n = input.nextDouble();
        
        if(n % 2==0){
            System.out.println("O Número é PAR!");
        }else{
            System.out.println("O Número é IMPAR!");
        }
        
        if ( n  < 0){
            System.out.println("O número é NEGATIVO");
        }else{
            System.out.println("O número é POSITIVO");
        }
        
    }
}

//Faça um algoritmo que leia um número e mostre uma mensagem indicando se
//este número é par ou ímpar e se é positivo ou negativo