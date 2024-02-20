import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        String[] palavras = new String[] {
                "Kauan", "Maria", "José"
        };
        String caminho = "C:\\Users\\kauan\\Downloads\\CURSO UDEMY\\CURSO UDEMY\\Trabalhando com arquivos\\BufferedWrite\\texto.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho, false))) {
            for (String palavra : palavras) {
                bw.write(palavra);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
