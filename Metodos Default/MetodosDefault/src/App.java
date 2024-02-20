import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Digite o valor: ");
        Scanner sc = new Scanner(System.in);
        Double valor = sc.nextDouble();
        System.out.print("Digite a quantidade de meses: ");
        Integer meses = sc.nextInt();

        ServicoTaxa serv1 = new ServicoTaxaBrazil(2.0);

        Double pagamento = serv1.Pagamento(valor, meses);

        System.out.println("Pagamento depois de " + meses + " meses: ");
        System.out.println(String.format("%.2f", pagamento));

        sc.close();
    }
}
