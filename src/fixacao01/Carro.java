package fixacao01;

public class Carro extends Automovel {

    private int qntRodas;

    public Carro(String nome, String modelo, String cor, String marca, int ano, int qntRodas){
        super(nome, modelo, cor, marca, ano);
        this.qntRodas = qntRodas;
    }

    public int getQntRodas(){
        return qntRodas;
    }

    public void setQntRodas(int qntRodas){
        this.qntRodas = qntRodas;
    }

}
