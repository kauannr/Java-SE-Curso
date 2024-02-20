import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Numeros multiplos.");
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        if (n1 > n2) {
            if (n1 % n2 == 0) {
                System.out.println("São multiplos");
            } else {
                System.out.println("Não são multiplos");
            }
        } else {
            if (n2 % n1 == 0) {
                System.out.println("São multiplos");
            } else {
                System.out.println("Não são multiplos");
            }
        }
        System.out.println("\n");

        System.out.println("1 = X-Tudo 10R$");
        System.out.println("2 = Hamburguer 5$");
        System.out.println("3 = Cachorro quente 5$");
        System.out.println("4 = Pastel 2$");
        System.out.println("5 = Suco 1R$");
        int codigo, quantidade, valorConta;
        codigo = sc.nextInt();
        quantidade = sc.nextInt();
        if (codigo == 1) {
            valorConta = 10 * quantidade;
            System.out.printf("Valor total: %d R$", valorConta);
        } else if (codigo == 2) {
            valorConta = 5 * quantidade;
            System.out.printf("Valor total: %d R$", valorConta);
        } else if (codigo == 3) {
            valorConta = 5 * quantidade;
            System.out.printf("Valor total: %d R$", valorConta);
        } else if (codigo == 4) {
            valorConta = 2 * quantidade;
            System.out.printf("Valor total: %d R$", valorConta);
        } else if (codigo == 5) {
            valorConta = 1 * quantidade;
            System.out.printf("Valor total: %d R$", valorConta);
        }
        System.out.println("\n");

        float valor;
        System.out.println("intervalo:");
        valor = sc.nextFloat();
        if ((valor >= 0) && (valor <= 25)) {
            System.out.println("intervalo: (0,25)");
        } else if ((valor > 25) && (valor <= 50)) {
            System.out.println("intervalo: (25,50)");
        } else if ((valor > 50) && (valor <= 75)) {
            System.out.println("intervalo: (50,75)");
        } else if ((valor > 75) && (valor <= 100)) {
            System.out.println("intervalo: (75,100)");
        } else {
            System.out.println("Fora de intervalo");
        }
        System.out.println("\n");

        double salario, impostoTotal;
        System.out.println("Salário:");
        salario = sc.nextDouble();

        if (salario <= 2000.0) {
            impostoTotal = 0.0;
        } else if (salario <= 3000.0) {
            impostoTotal = (salario - 2000.0) * 0.08;
        } else if (salario <= 4500.0) {
            impostoTotal = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
        } else {
            impostoTotal = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if (impostoTotal == 0.0) {
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f%n", impostoTotal);
        }

        sc.close();
    }
}
