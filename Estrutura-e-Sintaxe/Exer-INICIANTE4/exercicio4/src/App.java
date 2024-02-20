import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // 1
        System.out.println(
                "Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.");
        int X;
        Scanner sc = new Scanner(System.in);
        X = sc.nextInt();
        for (int i = 0; i <= X; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        // 2
        int N;
        int dentro = 0, fora = 0;
        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            if ((x >= 10) && (x <= 20)) {
                dentro++;
            } else {
                fora++;
            }
        }
        System.out.println(dentro + " dentro\n");
        System.out.println(fora + " fora\n");

        // 3
        System.out.println(
                "Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal. e faça a média deles");
        int qntTESTES;
        float n1 = 0, n2 = 0, n3 = 0, result = 0;
        qntTESTES = sc.nextInt();
        for (int i = 0; i < qntTESTES; i++) {
            n1 = sc.nextFloat();
            n2 = sc.nextFloat();
            n3 = sc.nextFloat();
            result = (n1 + n2 + n3) / 3;
            System.out.printf("Média: %.1f", result);
        }
        sc.close();
    }
}
