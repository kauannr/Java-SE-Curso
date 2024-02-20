import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Entre com o nome da pasta: ");
        Scanner sc = new Scanner(System.in);
        String strPasta = sc.nextLine();

        File pasta = new File(strPasta);
        File[] pastas = pasta.listFiles(File::isDirectory);
        System.out.println("PASTAS: ");
        for (File past : pastas) {
            System.out.println(past);
        }

        File[] arquivos = pasta.listFiles(File::isFile);
        System.out.println("ARQUIVOS: ");
        for (File arquivo : arquivos) {
            System.out.println(arquivo);
        }

        boolean sucesso = new File(strPasta + "\\Subpasta").mkdir();
        System.out.println("Pasta criada com sucesso. " + sucesso);

        sc.close();
    }

}
