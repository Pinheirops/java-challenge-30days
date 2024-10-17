package exercicios02;

import java.util.Scanner;

public class MedidaParede {
    public static void main(String[] args){

        // Uma parede em formato retangular precisa ser coberta com azulejos, tambẽm retangulares.
        // Escreva um programa que leia as medidas e calcule quantos azulejos são necessários para cobrir a parede.

        Scanner teclado = new Scanner(System.in);

        double alturaParede, larguraParede, alturaAzulejo, larguraAzulejo, quantidade;

        System.out.println("Qual é a altura da parede?");
        alturaParede = teclado.nextDouble();
        System.out.println("Qual é a largura da parede?");
        larguraParede = teclado.nextDouble();

        System.out.println("Qual é a altura do azulejo?");
        alturaAzulejo = teclado.nextDouble();
        System.out.println("Qual é a largura do azulejo?");
        larguraAzulejo = teclado.nextDouble();

        quantidade = (alturaParede * larguraParede) / (alturaAzulejo * larguraAzulejo);

        System.out.println("A quantidade de azulejos necessários para cobrir a parede é: " + quantidade);
    }
}
