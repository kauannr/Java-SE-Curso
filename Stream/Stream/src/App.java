import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> listString = Arrays.asList("Jose", "Maria", "Joao");
        Stream<String> strm1 = listString.stream();
        System.out.println(Arrays.toString(strm1.toArray()));

        Stream<Integer> strm2 = Stream.of(1, 2, 3, 4, 5);
        System.out.println(Arrays.toString(strm2.toArray()));

        Stream<Integer> strm3 = Stream.iterate(0, x -> x + 2);
        System.out.println(Arrays.toString(strm3.limit(10).toArray()));

        Stream<Integer> strm4 = Stream.iterate(new Integer[] { 0, 1 }, x -> new Integer[] { x[1], x[0] + x[1] })
                .map(p -> p[0]);
        System.out.println(Arrays.toString(strm4.limit(10).toArray()));

        List<Integer> strm5 = listString.stream().map(s -> s.length()).collect(Collectors.toList());
        System.out.println(strm5);

        int soma = strm5.stream().reduce(0, (x, y) -> x + y);
        System.out.println(soma);

        List<Integer> strm6 = Arrays.asList(2, 4, 5, 7, 8).stream().filter(x -> x % 2 == 0).map(x -> x * 10)
                .collect(Collectors.toList());
        System.out.println(Arrays.toString(strm6.toArray()));
    }
}
