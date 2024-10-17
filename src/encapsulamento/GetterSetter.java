package encapsulamento;

public class GetterSetter {
    public static void main(String[] args){

        Carro carro01 = new Carro(12345, "Mercedez");
        System.out.println(carro01.getMarca());
        System.out.println(carro01.getChassi());

    }
}
