package cliente;

public class ClienteJuridico extends Cliente {
    private String cnpj;

    public ClienteJuridico(String nome, String cnpj) {
        super.setNome(nome);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
}
