public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Testanto o for each");

        String[] vectPessoas = new String[] { "Maria" , "José", "Eduardo" }; 

        for (String string : vectPessoas) {
            System.out.println(string);
        }
    }
}
