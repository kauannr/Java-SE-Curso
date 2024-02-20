import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);

        List<? extends Number> listCuringa = list;
        System.out.println(listCuringa);

        listCuringa.remove(0);
        System.out.println(listCuringa);

        // listCuringa.add(100); < Dá erro de compilação

    }
}
