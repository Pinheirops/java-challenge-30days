package exercicios02;

public class Exercicio05 {
    public static void main(String[] args){

        // Programa que imprime os números ímpares no intervalo de 531 a 750.

        int contador = 531;

        while(contador <= 750){
            if(contador % 2 != 0){
                System.out.println(contador);
            }
            contador++;

        }

    }

}
