import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // 1
        System.out.println("Escreva um programa que repita a leitura de uma senha até que ela seja válida.");
        String senhaCORRETA = "2002";
        String senhaDIGITADA;

        Scanner sc = new Scanner(System.in);

        System.out.print("Senha: ");
        senhaDIGITADA = sc.next();

        while (senhaCORRETA.compareToIgnoreCase(senhaDIGITADA) != 0) {
            System.out.println("Senha incorreta");
            senhaDIGITADA = sc.next();
        }

        System.out.println("Senha correta!");

        // 2
        int alcool = 0, gasolina = 0, diesel = 0, fim = 4, numDigitado;

        System.out.println("Digire o tipo de combustivel");
        numDigitado = sc.nextInt();

        while (numDigitado != fim) {
            if (numDigitado == 1) {
                alcool++;
            } else if (numDigitado == 2) {
                gasolina++;
            } else if (numDigitado == 3) {
                diesel++;
            }
            numDigitado = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO!");
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Alcool: " + alcool);
        System.out.println("Diesel: " + diesel);
        sc.close();

    }
}
