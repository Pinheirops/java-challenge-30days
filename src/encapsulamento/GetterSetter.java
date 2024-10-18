package encapsulamento;

public class GetterSetter {
    public static void main(String[] args){

        Carro carro01 = new Carro(12345, "Mercedez");
        System.out.println(carro01.getMarca());
        System.out.println(carro01.getChassi());

        carro01.setMarca("Toyota");
        carro01.setChassi(011334);
        System.out.println(" ");
        System.out.println("O chassi do carro é: " + carro01.getChassi());
        System.out.println("A marca do carro é: " + carro01.getMarca());
    }
}
