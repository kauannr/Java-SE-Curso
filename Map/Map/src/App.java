import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("nome", "Jose");
        cookies.put("email", "jose@gmail.com");
        cookies.put("Cel", "88994");

        System.out.println("Todos os cookies:");
        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }

    }
}
