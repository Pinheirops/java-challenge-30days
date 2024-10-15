package exercicios;

import java.util.Scanner;

public class MediaSalarial {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double salario1, salario2, salario3, salario4, media;

        System.out.println("Qual é o valor do salario do colaborador 01? ");
        salario1 = teclado.nextDouble();

        System.out.println("Qual é o valor do salario do colaborador 02? ");
        salario2 = teclado.nextDouble();

        System.out.println("Qual é o valor do salario do colaborador 03? ");
        salario3 = teclado.nextDouble();

        System.out.println("Qual é o valor do salario do colaborador 04? ");
        salario4 = teclado.nextDouble();

        System.out.println("Qual é a média salarial dos colaboradores dessa empresa?");
        media = (salario1 + salario2 + salario3 + salario4) / 4;
        System.out.println("A média salarial é de: " + media);
    }
}
