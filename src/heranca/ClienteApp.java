package heranca;

public class ClienteApp {
    public static void main(String[] args){

        ClientePF clientepf01 = new ClientePF("Usuario PF Numero Um", "Rua Nupo, 07", 24, "000.000.000-00");
        ClientePF clientepf02 = new ClientePF("Usuario PF Numero Dois", "Avenida Ponu, 57", 37, "100.100.100-89");

        ClientePJ clientepj01 = new ClientePJ("Usuario PJ Numero Um", "Estrada Bandeira", 18, "242424-00");
        ClientePJ clientepj02 = new ClientePJ("Usuario PJ Numero Dois", "Estrada Azul America", 50, "24321-00");

        System.out.println("CLIENTE PESSOA FISICA 01");
        System.out.println("NOME: " + clientepf01.getNome());
        System.out.println("IDADE: " + clientepf01.getIdade());
        System.out.println("ENDEREÇO: " + clientepf01.getEndereco());
        System.out.println("CPF: " + clientepf01.getCpf());

        System.out.println("-------------------------------");

        System.out.println("CLIENTE PESSOA FISICA 02");
        System.out.println("NOME: " + clientepf02.getNome());
        System.out.println("IDADE: " + clientepf02.getIdade());
        System.out.println("ENDEREÇO: " + clientepf02.getEndereco());
        System.out.println("CPF: " + clientepf02.getCpf());

        System.out.println("-------------------------------");

        System.out.println("CLIENTE PESSOA JURIDICA 01");
        System.out.println("NOME: " + clientepj01.getNome());
        System.out.println("IDADE: " + clientepj01.getIdade());
        System.out.println("ENDEREÇO: " + clientepj01.getEndereco());
        System.out.println("CPF: " + clientepj01.getCnpj());

        System.out.println("-------------------------------");

        System.out.println("CLIENTE PESSOA JURIDICA 02");
        System.out.println("NOME: " + clientepj02.getNome());
        System.out.println("IDADE: " + clientepj02.getIdade());
        System.out.println("ENDEREÇO: " + clientepj02.getEndereco());
        System.out.println("CPF: " + clientepj02.getCnpj());
    }
}
