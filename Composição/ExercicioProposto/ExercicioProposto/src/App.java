import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Exercicio de fixacao\n");

        System.out.println("Digite os dados do cliente.");
        System.out.print("Nome: ");
        Scanner sc = new Scanner(System.in);
        String nomeClinte = sc.nextLine();

        System.out.print("Email: ");
        String emailCliente = sc.nextLine();

        System.out.print("Data de nascimento (DD/MM/YYYY): ");
        String dataCliente = sc.nextLine();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Status do pedido: ");
        String status = sc.nextLine();

        Cliente cliente1 = new Cliente(nomeClinte, emailCliente, formato.parse(dataCliente));
        Pedido pedido = new Pedido(new Date(), StatusPedido.valueOf(status), cliente1);

        System.out.print("Quantidade de pedidos: ");

        int quantPedidos = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < quantPedidos; i++) {
            System.out.printf("Dados do pedido %d:\n", i + 1);
            System.out.print("Nome: ");
            String nomeProduto = sc.nextLine();
            System.out.print("Preco: ");
            Double precoProduto = sc.nextDouble();
            sc.nextLine();
            Produto produto = new Produto(nomeProduto, precoProduto);
            System.out.print("Quantidade: ");
            int quantProduto = sc.nextInt();
            sc.nextLine();
            ItemPedido itemPedido = new ItemPedido(quantProduto, precoProduto, produto);
            pedido.listaItem.add(itemPedido);

        }
        System.out.println(pedido.getListaItem());
    }
}
