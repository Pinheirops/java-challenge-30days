package fixacao01;

public class Automovel {

    private String nome;
    private String marca;
    private String modelo;
    private String tipo;
    private int ano;

    public Automovel(String nome, String marca, String modelo, String tipo, int ano){
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.ano = ano;
    }


    public int getAno(){
       return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }



}
