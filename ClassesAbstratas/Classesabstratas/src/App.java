import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        List<Conta> lista = new ArrayList<>();

        Conta conta1 = new BusinessConta(123, "Ed", 200d, 100d);
        Conta conta2 = new ContaPoupanca(456, "Bob", 500d, 10d);

        lista.add(conta1);
        lista.add(conta2);

        for (Conta conta : lista) {
            System.out.println(conta.getSaldo());
        }

        for (Conta conta : lista) {
            conta.depositar(100d);
        }

        for (Conta conta : lista) {
            System.out.println(conta.getSaldo());
        }
    }
}
