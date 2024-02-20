import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Switch Case e While.\n");

        System.out.print("Numero de repetições do programa: ");
        int contador = sc.nextInt();

        while (contador != 0) {
            int diaSemana;
            System.out.print("Dia da semana:");
            diaSemana = sc.nextInt();

            switch (diaSemana) {
                case 1: {
                    System.out.println("Segunda feira");
                    break;
                }
                case 2: {
                    System.out.println("Terça feira");
                    break;
                }
                case 3: {
                    System.out.println("Quarta feira");
                    break;
                }
                case 4: {
                    System.out.println("Quinta feira");
                    break;
                }
                case 5: {
                    System.out.println("Sexta feira");
                    break;
                }
                case 6: {
                    System.out.println("Sábado");
                    break;
                }
                case 7: {
                    System.out.println("Domingo");
                    break;
                }
                default: {
                    System.out.println("Dia inexistente");
                }

            }

            int idade;
            System.out.print("Idade: ");
            idade = sc.nextInt();
            System.out.println((idade > 18) ? "Maior de idade" : "Menor de idade");

            contador--;
        }
        sc.close();
    }
}
