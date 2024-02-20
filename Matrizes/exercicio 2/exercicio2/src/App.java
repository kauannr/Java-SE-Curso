import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Exercicio 2: Matrizes");

        int N;
        System.out.print("Digite a ordem da matriz: ");
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        sc.nextLine();

        System.out.print("Preencha a matriz: ");
        int[][] matriz = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n--Percorrendo a matriz--: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.println(matriz[i][j]);
            }
        }

        System.out.println("\n--Percorrendo a diagonal--");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[i][i]);
        }

        sc.close();
    }
}
