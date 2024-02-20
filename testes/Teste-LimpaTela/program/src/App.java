import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        List<String> listaNomes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        listaNomes.add("joao");
        listaNomes.add("maria");
        listaNomes.add("jose");

        while (true) {
            try {
                System.out.println("\033[H\033[2J");
                System.out.flush();
                System.out.println(listaNomes);
                System.out.print("Novo nome: ");
                String novoNome = sc.nextLine();
                listaNomes.add(novoNome);
                System.out.println(listaNomes);
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }

        }

    }
}
