import cliente.ClienteFisico;
import cliente.ClienteJuridico;
import conta.Conta;
import conta.ContaCorrente;
import conta.ContaPoupanca;

public class App {
    public static void main(String[] args) throws Exception {
        Conta cj = new ContaCorrente(new ClienteJuridico("Via express", "2323212121212"));
        Conta cp = new ContaPoupanca(new ClienteFisico("Guilherme", "l2121212112"));
        Conta cc = new ContaCorrente(new ClienteFisico("Julia", "879879879879"));
        cc.depositar(100);
        cc.transferir(50, cp);
        cj.depositar(5000);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
        cj.imprimirExtrato();


    }
}
