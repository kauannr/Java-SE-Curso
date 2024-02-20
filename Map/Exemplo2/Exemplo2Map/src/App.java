import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        Map<Produto, Double> estoque = new HashMap<>();

        Produto p1 = new Produto("Tv", 900d);
        Produto p2 = new Produto("Notebook", 1200d);
        Produto p3 = new Produto("Tablet", 400d);
        
        Produto pTeste = new Produto("Tv", 900d);

        estoque.put(p1, 10000d);
        estoque.put(p2, 20000d);
        estoque.put(p3, 1500d);
        System.out.println("Contém a chave do pTeste: " + estoque.containsKey(pTeste));

    }
}
