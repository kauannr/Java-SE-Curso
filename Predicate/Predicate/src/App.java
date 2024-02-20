import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) throws Exception {
        List<Produto> list = new ArrayList<>();

        list.add(new Produto("Tv", 900d));
        list.add(new Produto("Mouse", 50d));
        list.add(new Produto("Tablet", 350.50d));
        list.add(new Produto("HD Case", 80.90d));

        Predicate<Produto> predicate = p -> p.getPreco() > 100d;
        // list.removeIf(p -> p.getPreco() > 100);
        list.removeIf(predicate);

        for (Produto produto : list) {
            System.out.println(produto);
        }
    }
}
