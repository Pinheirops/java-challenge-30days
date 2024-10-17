package exercicios02;

public class Exercicio03 {
    public static void main(String[] args){

        // Programa que conta de 1 a 300 imprimindo apenas os números pares.

        int contador = 1;

        while(contador <= 300){
            if(contador % 2 == 0){
                System.out.println(contador);
            }
            contador++;
        }

    }
}
