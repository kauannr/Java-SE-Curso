import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Metodos abstratos");

        System.out.print("Digite o numero de formas: ");
        List<Forma> lista = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int num_formas = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < num_formas; i++) {
            System.out.print("Retangulo ou Circulo? ");
            char resposta = sc.nextLine().charAt(0);
            if (resposta == 'r') {
                System.out.print("Cor (PRETO/AZUL/VERMELHO): ");
                String cor = sc.nextLine();
                System.out.print("Largura: ");
                Double largura = sc.nextDouble();
                sc.nextLine();
                System.out.print("Altura ");
                Double altura = sc.nextDouble();
                sc.nextLine();
                Forma forma1 = new Retangulo(Cor.valueOf(cor), largura, altura);
                lista.add(forma1);

            } else if (resposta == 'c') {
                System.out.print("Cor (PRETO/AZUL/VERMELHO): ");
                String cor = sc.nextLine();
                System.out.print("Raio: ");
                Double raio = sc.nextDouble();
                sc.nextLine();
                Forma forma = new Circulo(Cor.valueOf(cor), raio);
                lista.add(forma);
            }
        }
        System.out.println("\nAreas das formas: ");
        for (Forma forma : lista) {
            System.out.println(String.format(".2f", forma.area()));
        }
        sc.close();
    }
}
