import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        List<Produto> list = new ArrayList<>();

        list.add(new Produto("Tv", 900d));
        list.add(new Produto("Mouse", 50.00));
        list.add(new Produto("Tablet", 350.50));
        list.add(new Produto("HD Case", 80.90));

        // Predicate<Produto> predicate = p -> p.getPreco() > 100d;
        list.removeIf(p -> p.getPreco() < 100);

        // Consumer<Produto> consumer = p -> p.setPreco(p.getPreco() * 1.1);
        // list.forEach(consumer);
        list.forEach(p -> p.setPreco(p.getPreco() * 1.1));
        list.forEach(System.out::println);

        // Function<Produto, String> func = p -> p.getNome().toUpperCase();
        List<String> list2 = list.stream().map(p -> p.getNome().toUpperCase()).collect(Collectors.toList());
        System.out.println("list2:");
        list2.forEach(System.out::println);

        ProdutoServico produtoServico = new ProdutoServico();
        double soma = produtoServico.somaFiltrada(list, p -> p.getNome().charAt(0) == 'T');
        System.out.println(soma);
    }
}
