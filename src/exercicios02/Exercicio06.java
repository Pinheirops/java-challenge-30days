package exercicios02;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args){

        // Programa que leia um número da entrada padrão e imprima os números de 0 até o número inserido.

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe até qual número deve ser feita a contagem.");
        int limitador = teclado.nextInt();

        for(int i = 0; i <= limitador; i++){
            System.out.println(i);
        }

    }
}
