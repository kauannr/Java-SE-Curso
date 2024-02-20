import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Abrindo o arquivo de texto já existente
        File file = new File(
                "C:\\Users\\kauan\\Downloads\\CURSO UDEMY\\CURSO UDEMY\\Trabalhando com arquivos\\text.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
