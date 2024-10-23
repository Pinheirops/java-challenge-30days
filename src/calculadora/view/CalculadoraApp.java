package calculadora.view;

import java.util.Scanner;
import calculadora.model.operacoes;

public class CalculadoraApp {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("OPERAÇÕES");
        System.out.println("+ - Soma");
        System.out.println("- - Subtração");
        System.out.println("* - Multiplicação");
        System.out.println("/ - Divisão");
        System.out.println("C - Zerar");


        double numero = teclado.nextInt();
        double contador = numero;
        System.out.println("DISPLAY: " + contador);
        String opSelect = teclado.next();
        if(opSelect.equals("+")){
            System.out.print(contador + " + ");
            numero = teclado.nextInt();
            operacoes.somar(numero, contador);
        }





    }
}
