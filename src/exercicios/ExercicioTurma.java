package exercicios;

import java.util.Scanner;

public class ExercicioTurma {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        String sexo;
        int qntMulheres = 0, qntHomens = 0;
        int contador = 1;
        float altura, media = 0, maiorAltura = 0, menorAltura = 0;

            while(contador <= 10){
               System.out.println(" DIGITE O SEXO - MASCULINO[M] | FEMININO[F]");
               sexo = teclado.next();
               System.out.println("DIGITE A ALTURA");
               altura = teclado.nextFloat();

               if (sexo.equals("M")){
                   qntHomens++;
                   contador++;
                   media = media + altura;
               } else if (sexo.equals("F")){
                   qntMulheres++;
                   contador++;
               } else {
                       System.out.println("RESPOSTA INVALIDA - TENTE NOVAMENTE");
               }

                if (altura > maiorAltura){
                    maiorAltura = altura;
                    menorAltura = altura;
                }

                if (altura < menorAltura){
                    menorAltura = altura;
                }
            }

            media = media /qntHomens;

            System.out.println("");
            System.out.println("A quantidade de MULHERES ao final é: " + qntMulheres);

            System.out.println("");
            System.out.println("A MAIOR altura da turma é: " + maiorAltura);
            System.out.println("A MENOR altura da turma é: " + menorAltura);

            System.out.println("");
            System.out.print("A média da altura dos homens é: " + media);

        teclado.close();
    }
}
