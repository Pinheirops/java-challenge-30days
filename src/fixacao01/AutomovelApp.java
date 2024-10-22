package fixacao01;

import java.util.Scanner;

public class AutomovelApp {
    public static void main(String[] args){

        // criar um objeto scanner para entrada de dados.
        Scanner teclado = new Scanner(System.in);

        // criar objetos das classes modelos.
        Carro broncoSport = new Carro("BRONCO SPORT", "GT", "Cinza", "FORD", 2015, 4);
        Carro maverick = new Carro("MAVERICK", "Street", "Azul", "FORD", 2024, 4);
        Carro mustang = new Carro("MUSTANG", "Off road", "Vermelho", "FORD", 2012, 4);

        Moto adv150 = new Moto("ADV 150", "Casual", "Vermelho", "HONDA", 2017, 2);
        Moto meteor650  = new Moto("SUPER METEOR 650", "Motor road", "Preto", "Royal Enfield", 2022, 2);

        // APP
        System.out.println("ESCOLHA UMA CATEGORIA?");
        System.out.println("1 - CARRO");
        System.out.println("2 - MOTO");
        int categoria = teclado.nextInt();

        while (categoria != 1 && categoria != 2){
            System.out.println("VALOR INVALIDO, TENTE NOVAMENTE");
            System.out.println("-------------------------------");
            System.out.println("ESCOLHA UMA CATEGORIA?");
            System.out.println("1 - CARRO");
            System.out.println("2 - MOTO");
            categoria = teclado.nextInt();
        }

        if(categoria == 1) {
            System.out.println("CATEGORIA SELECIONA: CARRO");
            System.out.println("--------------------------");
            System.out.println("SELECIONE O CARRO");
            System.out.println("1 - BRONCO SPORT");
            System.out.println("2 - MUSTANG");
            System.out.println("3 - MAVERICK");
            int selectCarro = teclado.nextInt();

            if (selectCarro == 1){
                System.out.println("NOME: " + broncoSport.getNome());
                System.out.println("FABRICANTE: " + broncoSport.getMarca());
                System.out.println("MODELO: " + broncoSport.getModelo());
                System.out.println("COR: " + broncoSport.getCor());
                System.out.println("ANO: " + broncoSport.getAno());
            } else if (selectCarro == 2){
                System.out.println("NOME: " + mustang.getNome());
                System.out.println("FABRICANTE: " + mustang.getMarca());
                System.out.println("MODELO: " + mustang.getModelo());
                System.out.println("COR: " + mustang.getCor());
                System.out.println("ANO: " + mustang.getAno());
            } else if (selectCarro == 3){
                System.out.println("NOME: " + maverick.getNome());
                System.out.println("FABRICANTE: " + maverick.getMarca());
                System.out.println("MODELO: " + maverick.getModelo());
                System.out.println("COR: " + maverick.getCor());
                System.out.println("ANO: " + maverick.getAno());
            }

        } else if(categoria == 2) {
            System.out.println("CATEGORIA SELECIONADA: MOTO");
            System.out.println("--------------------------");
            System.out.println("SELECIONE A MOTO");
            System.out.println("1 - SUPER METEOR 650");
            System.out.println("2 - ADV 150");
            int selectMoto = teclado.nextInt();

            if (selectMoto == 1) {
                System.out.println("NOME: " + meteor650.getNome());
                System.out.println("FABRICANTE: " + meteor650.getMarca());
                System.out.println("MODELO: " + meteor650.getModelo());
                System.out.println("COR: " + meteor650.getCor());
                System.out.println("ANO: " + meteor650.getAno());
            } else if (selectMoto == 2) {
                System.out.println("NOME: " + adv150.getNome());
                System.out.println("FABRICANTE: " + adv150.getMarca());
                System.out.println("MODELO: " + adv150.getModelo());
                System.out.println("COR: " + adv150.getCor());
                System.out.println("ANO: " + adv150.getAno());
            }
        }


    }
}
