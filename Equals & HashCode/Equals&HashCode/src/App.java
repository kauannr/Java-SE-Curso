import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        Cliente c1 = new Cliente("jose", "jose@gmail.com");
        Cliente c2 = new Cliente("dudu", "dudu@gmail.com");
        Cliente c3 = new Cliente("jose", "jose@gmail.com");

        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));

        System.out.println(c1.hashCode());
        System.out.println(c3.hashCode());

        if (c1.hashCode() == c3.hashCode()) {
            System.out.println(c1.equals(c3) + " HashCode e Equals Confirmado");
        }

        List<Integer> listInt = new ArrayList<>();
        listInt.add(1);
        listInt.add(2);
        listInt.add(2);
        listInt.add(3);
        listInt.add(4);
        listInt.add(2);

        for (int i = 0; i < listInt.size(); i++) {

            int currentHashCode = listInt.get(i).hashCode();

            // Exemplo de comparação com todos os outros elementos da lista
            for (int j = i + 1; j < listInt.size(); j++) {

                int otherHashCode = listInt.get(j).hashCode();

                if (currentHashCode == otherHashCode) {
                    // Lógica a ser executada se os hash codes são iguais
                    System.out.println(
                            "Elemento na posição " + i + " tem o mesmo hashCode que o elemento na posição " + j);
                    System.out.println("Confirmação do equals\n");
                }
            }
        }

    }
}
