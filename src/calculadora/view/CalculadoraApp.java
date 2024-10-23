package calculadora.view;

import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        double acumulador = 0;

        System.out.println("--------------------");
        System.out.println("| " + acumulador +"              |");
        System.out.println("|------------------|");
        System.out.println("| OPERAÇÕES:       |");
        System.out.println("| ( + ) Soma       |");
        System.out.println("| ( - ) Subtração  |");
        System.out.println("| ( * ) - Multip   |");
        System.out.println("| ( / )- Divisão   |");
        System.out.println("| ( C )- Zerar     |");
        System.out.println("|------------------|");

        System.out.print("| "  );
        double numero = teclado.nextDouble();
        acumulador = acumulador + numero;

        System.out.print("| " + acumulador + " ");
        String opSelect = teclado.next();

        if(opSelect.equals("+")){
            while(opSelect.equals("+")){
                System.out.print("| " + acumulador + " + ");
                numero = teclado.nextDouble();

                // Essa parte ainda não está funcionando conforme o esperado.
                somar(numero, acumulador);
                acumulador = acumulador + numero;

                System.out.println("RESULTADO: " + acumulador);
                System.out.println("-");

                System.out.println("Digite o sinal da operação desejada");
                opSelect = teclado.next();
            }
        }

        if(opSelect.equals("-")){
            System.out.print("| " + acumulador + " - ");
            numero = teclado.nextDouble();

            // Essa parte ainda não está funcionando conforme o esperado.
            somar(numero, acumulador);
            acumulador = acumulador - numero;

            System.out.println("RESULTADO: " + acumulador);
            System.out.println("-");


            System.out.println("Digite o sinal da operação desejada");
            opSelect = teclado.next();
        }





    }

    private static double somar(double numero, double valorTotal) {
        double soma = numero + valorTotal;
        return soma;
    }

    private static double subtrair(double numero, double valorTotal){
        double subtracao = numero - valorTotal;
        return subtracao;
    }

    private static double multiplicar(double numero, double valorTotal){
        double multiplicacao = numero * valorTotal;
        return multiplicacao;
    }

    private static double dividir(double numero, double valorTotal){
        double divisao = numero / valorTotal;
        return divisao;
    }
}
