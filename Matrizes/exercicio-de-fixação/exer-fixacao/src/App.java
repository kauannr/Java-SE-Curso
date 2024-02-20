
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Exercicio de fixação: Matrizes");

        int L, C;
        System.out.print("Digite a ordem de linhas e colunas: ");
        Scanner sc = new Scanner(System.in);
        L = sc.nextInt();
        C = sc.nextInt();

        System.out.print("Preencha a matriz: ");
        int[][] matriz = new int[L][C];
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Percorrendo a matriz: ");
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++) {
                System.out.println(matriz[i][j]);
            }
        }

        System.out.println("Digite o numero procurado: ");
        int x = sc.nextInt();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                // Usa e desenha uma matriz 3x4 pra entender

                if (matriz[i][j] == x) {
                    System.out.println(x + " na posicao " + i + "," + j);
                    if (j > 0) { // Se j>0, meu elemento não é o primeiro da matriz, então tem alguém antes dele
                        System.out.println("Esquerda: " + matriz[i][j - 1]);
                    }
                    if (i > 0) { // Se i>0 então meu elemento não tá na primeira linha, logo, tem alguém acima
                                 // dele
                        System.out.println("Acima: " + matriz[i - 1][j]);
                    }
                    if (j < matriz[i].length - 1) { // Se j estiver numa posição menor do que o tamanhoTotal<1, então
                                                    // tem alguém afrente dele
                        System.out.println("Direita: " + matriz[i][j + 1]);
                    }
                    if (i < matriz.length - 1) { // E se o i estiver numa posição menor que o numero total de linhas-1,
                                                 // então tem alguém abaixo
                        System.out.println("Abaixo: " + matriz[i + 1][j]);
                    }

                }
            }
        }
        sc.close();
    }
}