import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Date;
import java.time.Instant;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o caminho do arquivo: ");
        String caminho = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
            Set<Login> set = new HashSet<>();
            String linha = br.readLine();

            while (linha != null) {

                String[] vector = linha.split(" ");
                String nomeUsuario = vector[0];
                Date momentoUsuario = Date.from(Instant.parse(vector[1]));
                set.add(new Login(nomeUsuario, momentoUsuario));
                linha = br.readLine();

            }

            System.out.println("Total de usuários: " + set.size());
            System.out.println("Usuários: ");
            for (Login login : set) {
                System.out.println(login.getNome());
            }

        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }
        sc.close();
    }
}
