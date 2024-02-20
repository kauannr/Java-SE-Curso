import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        String caminho = "C:\\Users\\kauan\\Downloads\\CURSO UDEMY\\CURSO UDEMY\\Trabalhando com arquivos\\txt.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
            String linha = br.readLine();

            while (linha != null) {
                System.out.println(linha);
                linha = br.readLine();
            }
        } catch (Exception e) {
            System.out.println("Erro1: " + e.getMessage());
        }
    }
}
