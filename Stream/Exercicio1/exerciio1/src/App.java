import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import java.util.stream.*;;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o caminho do arquivo:");
        String caminho = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {

            List<Produto> listaProduto = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String vector[] = line.split(",");
                listaProduto.add(new Produto(vector[0], Double.parseDouble(vector[1])));

                line = br.readLine();
            }

            Double average = listaProduto.stream().map(x -> x.getPreco()).reduce(0d,
                    (x, y) -> x + y) / listaProduto.size();
            System.out.println("average price: " + String.format("%.2f", average));

            Comparator<String> comp = (s1, s2) -> s1.compareToIgnoreCase(s2);
            List<String> listaNomes = listaProduto.stream()
                    .filter(p -> p.getPreco() < average)
                    .map(p -> p.getNome())
                    .sorted(comp.reversed()).collect(Collectors.toList());
            System.out.println(listaNomes);

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        sc.close();
    }
}
