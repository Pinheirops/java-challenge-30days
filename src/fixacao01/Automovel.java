package fixacao01;

public class Automovel {

    private String nome;
    private String marca;
    private String modelo;
    private String cor;
    private int ano;

    public Automovel(String nome, String marca, String modelo, String cor, int ano){
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
    }

    public int getAno(){
       return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }


}
