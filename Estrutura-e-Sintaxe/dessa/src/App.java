import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        String s1, s2, s3;
        int numero;
        Scanner scan = new Scanner(System.in);
        numero = scan.nextInt();
        scan.nextLine();
        s1 = scan.nextLine();
        s2 = scan.nextLine();
        s3 = scan.nextLine();

        System.out.println("SAÍDA DE DADOS:");
        System.out.println(numero);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("OPERAÇÕES MATEMATICAS:");
        /*
         * sqrt: raiz quadrada
         * pow: potencia
         * abs: valor absoluto
         */
        double A, B, C;
        A = Math.sqrt(100);
        B = Math.pow(10, 3);
        C = Math.abs(-10.5);
        System.out.println("Resultado das operações:");
        System.out.println("Raiz quadrada de 100 = " + A);
        System.out.println("10 Elevado a 3 =  " + B);
        System.out.println("Valor absoluto de -10,5 = " + C);

        scan.close();
    }
}
