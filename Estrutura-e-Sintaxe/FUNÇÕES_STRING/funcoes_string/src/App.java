import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("///Convertendo em minusculo///");
        Scanner sc = new Scanner(System.in);

        String original = "KAUAN Ferreira    ";
        String convertidaMinus = original.toLowerCase();

        System.out.println("String original: " + original);
        System.out.println("String convertida: " + convertidaMinus + "\n");

        // 2
        System.out.println("///Convertendo em maiusculo///");
        String convertidaMaius = original.toUpperCase();
        System.out.println("String convertida: " + convertidaMaius + "\n");

        // 3
        System.out.println("///Removendo espaços em branco///");
        String semEspaco = original.trim();
        System.out.println("String sem espaço: " + "-" + semEspaco + "-" + "\n");

        // 4
        System.out.println("///Recortando a String///");
        String recortada = original.substring(5);
        System.out.println("Recortada: " + recortada + "\n");

        // 5
        System.out.println("///Substituindo a String///");
        String substituida;
        substituida = original.replace("KAUAN", "jose");
        System.out.println("String substituida: " + substituida + "\n");

        // 6
        System.out.println("///Localizando uma String///");
        int numString;
        numString = original.indexOf("e");
        System.out.println("Posição: " + numString + "\n");
        numString = original.lastIndexOf("e");
        System.out.println("Posição: " + numString + "\n");

        // 7
        System.out.println("///Separando uma String///");
        String[] vect = original.split(" ");
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        sc.close();
    }
}
