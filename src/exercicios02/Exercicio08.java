package exercicios02;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args){

        // Programa que lë o número da entrada padrão e um incremento, e imprima os números de 0 até o número limite. Pulando na quantidade de incrementos.

        Scanner teclado = new Scanner(System.in);

        int contador = 0;

        System.out.println("Digite o número do limite");
        int limite = teclado.nextInt();
        System.out.println("Digite o número em que será incrementado");
        int incr = teclado.nextInt();

        while(contador <= limite){
            System.out.println(contador);
            contador = contador + incr;
        }

    }
}
