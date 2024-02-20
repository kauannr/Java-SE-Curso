import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Exercicio proposto 1. Empresa\n");

        System.out.print("Entre com o nome do departamento: ");
        Scanner sc = new Scanner(System.in);
        String depart = sc.nextLine();
        System.out.println();

        System.out.println("Insira os dados do trabalhador");
        System.out.print("Nome: ");
        String nomeTrabalhador = sc.nextLine();
        System.out.print("Nivel de trabalho: ");
        String EnumNivelTrabalho = sc.nextLine();
        System.out.print("Salario Base: ");
        double salarioBTrabalhador = sc.nextDouble();
        sc.nextLine();

        // Criar trabalhador
        Trabalhador trabalhador1 = new Trabalhador(nomeTrabalhador, NivelTrabalho.valueOf(EnumNivelTrabalho),
                salarioBTrabalhador, new Departamento(depart));

        System.out.print("Numero de contratos do trabalhador " + trabalhador1.getNome() + ": ");
        int numeroContratos = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numeroContratos; i++) {
            System.out.printf("Dados do contrato %d", i + 1);
            System.out.println();

            System.out.print("Data (DD/MM/YYYY): ");
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

            Date dataContrato1 = formato.parse(sc.nextLine());
            System.out.println();

            System.out.print("Valor por hora: ");
            double vHoraContrato = sc.nextDouble();
            System.out.print("Duração: (Horas): ");
            int duracaoContrato = sc.nextInt();
            sc.nextLine();

            trabalhador1.addContrato(new ContratoHora(dataContrato1, vHoraContrato, duracaoContrato));
        }

        System.out.print("Entre com o mes e o ano para calcular o rendimento (MM/yyyy): ");
        String mesEAno = sc.nextLine();
        // recorto a String
        int mes = Integer.parseInt(mesEAno.substring(0, 2));
        int ano = Integer.parseInt(mesEAno.substring(3));
        System.out.println("Nome: " + trabalhador1.getNome());
        System.out.println("Departamento: " + trabalhador1.getDepartamento().getNome());
        System.out.println("Renda de " + mesEAno + ": " + trabalhador1.renda(ano, mes));

    }
}
