package calculadora.view;

import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        // exibe as operações da calculadora
        intro();

            // entrada do primeiro valor para o calculo
            System.out.print("| ");
            double valor01 = teclado.nextDouble();
            double cont = valor01;
            System.out.print(cont);
            String opSelect = null;
            double valor02 = 0;

            do {
                // entrada do operador selecionado
                opSelect = teclado.next();

                if(!opSelect.equals("C")){
                    // entrada do segundo valor para o calculo
                    System.out.print("| ");
                    valor02 = teclado.nextDouble();
                }

                if (opSelect.equals("+")) {
                    cont = somar(cont, valor02);
                    System.out.print("= " + cont);
                } else if(opSelect.equals("-")){
                    cont = subtrair(cont, valor02);
                    System.out.print("= " + cont);
                } else if(opSelect.equals("*")){
                    cont = multiplicar(cont, valor02);
                    System.out.print("= "  + cont);
                } else if(opSelect.equals("/")){
                    cont = dividir(cont, valor02);
                    System.out.print("= " + cont);
                } else if(opSelect.equals("C")) {
                    cont = 0;
                    System.out.print("= " + cont);
                }else{
                    System.out.print("OPERAÇÃO INVÁLIDA - TENTE NOVAMENTE");
                }


            }while (opSelect.equals("+") || opSelect.equals("-") || opSelect.equals("*") || opSelect.equals("/") || (opSelect.equals("C")));

    }

    public static void intro(){
        System.out.println("| OPERAÇÕES:");
        System.out.println("( + ) - Soma");
        System.out.println("( - ) - Subtração");
        System.out.println("( * ) - Multip");
        System.out.println("( / ) - Divisão");
        System.out.println("( C ) - Zerar");
    }

    public static double somar(double num1, double num2) {
        double soma = num1 + num2;
        return soma;
    }

    public static double subtrair(double num1, double num2){
        double subtracao = num1 - num2;
        return subtracao;
    }


    public static double multiplicar(double num1, double num2){
        double multiplicacao = num1 * num2;
        return multiplicacao;
    }

    public static double dividir(double num1, double num2){
        double divisao = num1 / num2;
        return divisao;
    }

}