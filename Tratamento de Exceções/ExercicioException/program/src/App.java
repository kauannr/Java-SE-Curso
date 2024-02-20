import java.util.Scanner;

import model.entities.Conta;
import model.exceptions.Domainexception;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com os dados da conta:");
        System.out.print("Numero: ");
        Integer numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Proprietario: ");
        String proprietario = sc.nextLine();
        System.out.print("Saldo inicial: ");
        Double saldoInicial = sc.nextDouble();
        sc.nextLine();
        System.out.print("Limite de saque: ");
        Double limiteSaque = sc.nextDouble();
        sc.nextLine();

        Conta conta = new Conta(numero, proprietario, saldoInicial, limiteSaque);

        System.out.print("\nDigite o valor do saque: ");
        Double valorSaque = sc.nextDouble();
        sc.nextLine();

        try {
            conta.sacar(valorSaque);
            System.out.println("Novo saldo: " + conta.getSaldo());

        } catch (Domainexception e) {
            e.printStackTrace();
        } catch (RuntimeException e) {
            System.out.println("Erro inesperado");
        }
        sc.close();

    }
}
