import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        List<Contribuinte> lista = new ArrayList<>();

        System.out.print("Digite o nuemro de contribuintes: ");
        Scanner sc = new Scanner(System.in);
        int contribuintes = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < contribuintes; i++) {
            System.out.printf("Dados do contribuinte %d:\n", i + 1);
            System.out.print("Fisico ou Juridico (f/j)?: ");
            char resposta = sc.nextLine().charAt(0);
            if (resposta == 'f') {
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Renda anual: ");
                Double renda = sc.nextDouble();
                sc.nextLine();
                System.out.print("Gastos com saude: ");
                Double saude = sc.nextDouble();
                sc.nextLine();
                lista.add(new Fisico(nome, renda, saude));

            } else if (resposta == 'j') {
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Renda anual: ");
                Double renda = sc.nextDouble();
                sc.nextLine();
                System.out.print("Numero de funcionarios: ");
                int funcionario = sc.nextInt();
                sc.nextLine();
                lista.add(new Juridico(nome, renda, funcionario));
            }
        }

        System.out.println("\nTAXAS PAGAS: ");
        for (Contribuinte contribuinte : lista) {
            System.out.println(contribuinte.getNome() + " $ " + contribuinte.impostoPago());
        }

        System.out.print("\nIMPOSTOS TOTAIS: $ ");
        Double soma = 0d;
        for (Contribuinte contribuinte : lista) {
            soma = soma + contribuinte.impostoPago();
        }
        System.out.println(soma);

        sc.close();
    }
}
