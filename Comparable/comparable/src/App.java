import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        String caminhoDoc = "C:/Users/kauan/Downloads/CURSO UDEMY/CURSO UDEMY/Comparable/doc.txt";
        List<Funcionario> lista = new ArrayList<>();

        // criando o leitor do documento:
        try (BufferedReader br = new BufferedReader(new FileReader(caminhoDoc))) {

            String docFuncionario = br.readLine();

            // laço pra ler enquanto tiver coisas no arquivo:
            while (docFuncionario != null) {
                // cortando a string a partir da virgula:
                String[] vString = docFuncionario.split(",");
                lista.add(new Funcionario(vString[0], Double.parseDouble(vString[1]))); // pega cada nome e coloca na
                                                                                        // string
                docFuncionario = br.readLine();
            }
            Collections.sort(lista); // Ordena

            for (Funcionario funcionario : lista) {
                System.out.println(funcionario.getNome() + ", " + String.format("%.2f", funcionario.getSalario()));
            }

        } catch (Exception e) {
            System.out.println("Erro. " + e.getMessage());
        }
    }
}
