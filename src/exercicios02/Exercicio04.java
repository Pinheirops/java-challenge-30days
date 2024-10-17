package exercicios02;

public class Exercicio04 {
    public static void main(String[] args){

        // Programa que imprime os números multiplos de 7 e 11 no intervalo de 64 a 256.

        int contador = 64;

        while(contador <= 256){
            if((contador % 7 == 0) || (contador % 11 == 0)){
                System.out.println(contador);
            }
            contador++;

        }

    }
}
