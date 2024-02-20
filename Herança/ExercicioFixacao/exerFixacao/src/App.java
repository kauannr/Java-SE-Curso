import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        List<Produto> listaProdutos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de pedidos: ");
        int quantPedidos = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < quantPedidos; i++) {
            System.out.printf("Dados do pedido %d\n", i + 1);
            System.out.println("Comum, Usado ou Importado? (c/u/i): ");
            char resposta = sc.nextLine().charAt(0);
            if (resposta == 'c') {
                System.out.print("Nome do produto: ");
                String nomeProduto = sc.nextLine();
                System.out.println("Preço: ");
                Double precoProduto = sc.nextDouble();
                sc.nextLine();
                Produto produto = new Produto(nomeProduto, precoProduto);
                listaProdutos.add(produto);

            } else if (resposta == 'i') {
                System.out.print("Nome do produto: ");
                String nomeProduto = sc.nextLine();
                System.out.println("Preço: ");
                Double precoProduto = sc.nextDouble();
                sc.nextLine();
                System.out.println("Taxa da alfandega: ");
                Double taxa = sc.nextDouble();
                sc.nextLine();
                Produto produto = new ProdutoImportardo(nomeProduto, precoProduto, taxa);
                listaProdutos.add(produto);

            } else if (resposta == 'u') {
                System.out.print("Nome do produto: ");
                String nomeProduto = sc.nextLine();
                System.out.println("Preço: ");
                Double precoProduto = sc.nextDouble();
                sc.nextLine();
                System.out.println("Data de fabricação (dd/MM/yyyy): ");
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

                Date date = formato.parse(sc.nextLine());
                Produto p = new ProdutoUsado(nomeProduto, precoProduto, date);
                listaProdutos.add(p);
            }
        }
        System.out.println("\nETIQUETAS: ");
        for (Produto p : listaProdutos) {
            // Completar
            System.out.println(p.etiquetaDePreco());
        }
        sc.close();
    }
}