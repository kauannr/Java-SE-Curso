import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Produto> list = new ArrayList<>();

        list.add(new Produto("TV", 2000d));
        list.add(new Produto("TV", 2100d));
        list.add(new Produto("Notebook", 4000d));
        list.add(new Produto("Tablet", 1000d));
        list.add(new Produto("Zinco", 0d));

        Comparator<Produto> meuComp = (p1, p2) -> {
            if (p1.getNome().compareToIgnoreCase(p2.getNome()) == 0) {
                return -p1.getPreco().compareTo(p2.getPreco());
            }
            return p1.getNome().compareToIgnoreCase(p2.getNome());

        };
        // list.sort((p1, p2) -> p1.getNome().compareToIgnoreCase(p2.getNome()));
        list.sort(meuComp);

        for (Produto produto : list) {
            System.out.println(produto);
        }

    }
}
