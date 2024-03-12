package conta;

import cliente.Cliente;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 001;
    private static int SEQUENCIAL = 1;

    protected Cliente cliente;
    protected Integer agencia;
    protected int conta;
    protected Double saldo;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.agencia = Conta.AGENCIA_PADRAO;
        this.conta = Conta.SEQUENCIAL++;
        saldo = 0.0;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta destino) {
        this.sacar(valor);
        destino.depositar(valor);
    }
    
    @Override
    public void imprimirExtrato() {
        System.out.println("==== EXTRATO ====");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Agencia: " + agencia);
        System.out.println("Conta: " + conta);
        System.out.printf("Saldo: %.2f\n", saldo);
    }

    public Integer getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public Double getSaldo() {
        return saldo;
    }


}
