package encapsulamento;

public class Carro {

    private int chassi;
    private String marca;

    public Carro(int chassi, String marca){
        this.chassi = chassi;
        this.marca = marca;
    }

    public String getMarca(){
        return marca;
    }

    public int getChassi(){
        return chassi;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setChassi(int chassi){
        this.chassi = chassi;
    }

}
