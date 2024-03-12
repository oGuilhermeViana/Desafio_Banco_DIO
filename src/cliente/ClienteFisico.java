package cliente;

public class ClienteFisico extends Cliente {
    private String cpf;

    public ClienteFisico(String nome, String cpf) {
        super.setNome(nome);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

}
