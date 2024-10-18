package heranca;

public class ClientePJ extends Cliente{

    private String cnpj;

    public ClientePJ(String nome, String endereco, int idade, String cnpj){
        super(nome,endereco,idade);
        this.cnpj = cnpj;
    }

    public String getCnpj(){
        return cnpj;
    }

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

}
