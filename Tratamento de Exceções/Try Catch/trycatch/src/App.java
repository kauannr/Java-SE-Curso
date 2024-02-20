import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] vect = sc.nextLine().split(" ");
        try {
            int posicao = sc.nextInt();
            sc.nextLine();

            System.out.println(vect[posicao]);
        } catch (IndexOutOfBoundsException exception) {
            System.out.println(exception + "Exceção de tamanho");
        }

        System.out.println("***FIM DO PROGRAMA***");
    }

}
