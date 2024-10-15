package exercicios;

import java.util.Scanner;

public class ConversaoTempo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double C, K, Re, Ra, F;

        System.out.println("Qual a temperatura que está fazendo hoje?");
//        double C = scanner.nextDouble();
        C = 2.43;
        System.out.println("Então em Celsius está fazendo: " + C);

        F = C * 1.8 + 32;
        K = C + 273.15;
        Re = C * 0.8;
        Ra = C * 1.8 + 32 + 459.67;

        System.out.println("Em Fahrenheit a temperatura está em: " + F);
        System.out.println("Em Kelvin a temperatura está em: " + K);
        System.out.println("Em Réaumur a temperatura está em: " + Re);
        System.out.println("Em Rankine a temperatura está em: " + Ra);


    }
}
