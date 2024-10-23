package calculadora.view;

import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("OPERAÇÕES");
        System.out.println("+ - Soma");
        System.out.println("- - Subtração");
        System.out.println("* - Multiplicação");
        System.out.println("/ - Divisão");
        System.out.println("C - Zerar");

        System.out.println("Entre com um número");
        double numero = teclado.nextInt();
        double acumulador = numero;

        System.out.println("DISPLAY: " + acumulador);

        System.out.println("Digite o sinal da operação desejada");
        String opSelect = teclado.next();

        if(opSelect.equals("+")){
            while(opSelect.equals("+")){
                System.out.print(acumulador + " + ");
                numero = teclado.nextInt();
                somar(numero, acumulador);
                acumulador = acumulador + numero;
                System.out.println("DISPLAY: " + acumulador);
                System.out.println("Digite o sinal da operação desejada");
                opSelect = teclado.next();
            }
        }





    }

    private static double somar(double numero, double valorTotal) {
        double soma = numero + valorTotal;
        return soma;
    }
}
