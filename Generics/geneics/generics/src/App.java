import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Quantidade de valores: ");
        Scanner sc = new Scanner(System.in);
        int quant = sc.nextInt();

        PrintService<String> ps = new PrintService<>();

        for (int i = 0; i < quant; i++) {
            String valor = sc.next();
            ps.Adicionar(valor);
        }
        ps.Imprimir();
        System.out.println("Primeiro: " + ps.Primeiro());

        sc.close();
    }
}
