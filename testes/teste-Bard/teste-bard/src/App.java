import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        String palavra = "chave";
        Scanner sc = new Scanner(System.in);
        String palavra2;
        palavra2 = sc.nextLine();

        while (true) {
            try {
                System.out.println("Digite seu id");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.println("Digite a palavra");
                palavra2 = sc.nextLine();
                if (palavra2 != palavra) {
                    throw new exception("Palavra errada, digite novamente ");
                }
            } catch (Exception e) {
                System.out.println("erro " + e.getMessage());
                sc.nextLine();
            }
        }
    }
}
