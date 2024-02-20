import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        String caminho = "C:\\Users\\kauan\\Downloads\\CURSO UDEMY\\CURSO UDEMY\\Set\\Exercicio2\\text.txt";
        File file = new File(caminho);
        if (!file.exists()) {
            file.createNewFile();
        }

        System.out.println("Digite nomes pra o arquivo:");
        Set<String> set = new HashSet<>();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            Scanner sc = new Scanner(System.in);

            for (int i = 0; i < 3; i++) {
                set.add(sc.nextLine());
            }
            for (String string : set) {
                bw.write(string);
                bw.newLine();
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
        }

    }
}
