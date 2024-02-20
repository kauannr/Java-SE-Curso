import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        List<Object> listObj = new ArrayList<>();
        listObj.add("Kauan");
        listObj.add(2002);

        List<? super Object> listCuringa = listObj;
        listCuringa.add(1);
        listCuringa.add(15.15);
        listCuringa.add("4");
        System.out.println(listCuringa);

        // Integer number = listCuringa.get(0); < Dá erro de comilação

    }
}
