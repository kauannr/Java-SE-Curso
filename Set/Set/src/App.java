import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Set<String> set = new TreeSet<>();
         * set.add("José");
         * set.add("Maria");
         * set.add("Joao");
         * 
         * for (String string : set) {
         * System.out.println(string);
         * }
         */

        Set<Integer> s1 = new TreeSet<>(Arrays.asList(5, 4, 3, 10, 8, 7));
        Set<Integer> s2 = new TreeSet<>(Arrays.asList(9, 12, 11, 10, 8, 6));

        // União
        Set<Integer> s3 = new TreeSet<>(s1);
        s3.addAll(s2);
        System.out.println(s3);

        // Interseção
        Set<Integer> s4 = new TreeSet<>(s1);
        s4.retainAll(s2);
        System.out.println(s4);

        // Diferença
        Set<Integer> s5 = new TreeSet<>(s1);
        s5.removeAll(s2);
        System.out.println(s5);

    }
}
