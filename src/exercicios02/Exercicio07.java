package exercicios02;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args){

        // Programa que leia um número da entrada padrão e imprima os números até o número definido pulando de dois em dois.

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor do limitador");
        int limitador = teclado.nextInt();

        int contador = 0;

        while(contador <= limitador){
            System.out.println(contador);
            contador = contador + 2;
        }

    }
}
