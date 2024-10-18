package heranca;

public class ClientePF extends Cliente {

    private String cpf;

    public ClientePF(String nome, String endereco, int idade, String cpf){
        super(nome,endereco,idade);
        this.cpf = cpf;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

}
