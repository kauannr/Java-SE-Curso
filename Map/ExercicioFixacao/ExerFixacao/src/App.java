import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o caminho do arquivo: ");
        String caminho = sc.nextLine();

        Map<String, Integer> mapVotos = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
            String linha = br.readLine();

            while (linha != null) {
                String[] vector = linha.split(",");
                String nome = vector[0];
                Integer numVotos = Integer.parseInt(vector[1]);

                if (mapVotos.containsKey(nome) == false) {
                    mapVotos.put(nome, numVotos);
                } else {
                    // Se já tiver o mesmo nome no Map
                    int votosAdicionais = mapVotos.get(nome); // Pra o valor que 'nome' aponta
                    mapVotos.put(nome, numVotos + votosAdicionais);
                }

                linha = br.readLine();
            }
            for (String key : mapVotos.keySet()) {
                System.out.println(key + ": " + mapVotos.get(key));
            }
        } catch (Exception e) {
            System.out.println("Erro " + e.getMessage());
        }
        sc.close();
    }
}
