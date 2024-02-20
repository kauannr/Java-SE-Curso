import java.text.SimpleDateFormat;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Exerciciio StringBuilder\n");

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Post post1 = new Post(formato.parse("21/06/2018 13:05:44"), "Traveling New Zealand",
                "I'm going to visit this wonderful country", 12);

        Post post2 = new Post(formato.parse("28/07/2018 23:14:19"), "Good nigth guys",
                "See you tomorrow", 5);

        post1.addList(new Coment("Have a niceo trip"));
        post1.addList(new Coment("Wow that's awesome!"));

        post2.addList(new Coment("Good night"));
        post2.addList(new Coment("May the Force be with you"));

        System.out.println(post1);
    }
}
