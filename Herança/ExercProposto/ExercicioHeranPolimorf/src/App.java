import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        List<Funcionario> listaFuncionarios = new ArrayList<>();

        System.out.print("Digite o numero de funcionarios: ");
        Scanner sc = new Scanner(System.in);
        int num_funcionarios = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < num_funcionarios; i++) {
            System.out.printf("Funcionario %d\n", i + 1);
            System.out.print("Funcionario terceirizado? (s/n) ");
            String pergunta = sc.nextLine();
            if (pergunta.equals("n")) {

                System.out.print("Nome: ");
                String nomeFunc = sc.nextLine();
                System.out.print("Horas trabalhadas: ");
                Integer horasFunc = sc.nextInt();
                sc.nextLine();
                System.out.print("Valor por horas: ");
                Double valorHoraFunc = sc.nextDouble();
                sc.nextLine();
                Funcionario funcionario = new Funcionario(nomeFunc, horasFunc, valorHoraFunc);
                listaFuncionarios.add(funcionario);

            } else if (pergunta.equals("s")) {

                System.out.print("Nome: ");
                String nomeFunc = sc.nextLine();
                System.out.print("Horas trabalhadas: ");
                Integer horasFunc = sc.nextInt();
                sc.nextLine();
                System.out.print("Valor por horas: ");
                Double valorHoraFunc = sc.nextDouble();
                sc.nextLine();
                System.out.print("Dispesa adicional: ");
                Double dispesaAdcFunc = sc.nextDouble();
                sc.nextLine();

                Funcionario funcionario = new FuncionarioTerceirizado(nomeFunc, horasFunc, valorHoraFunc,
                        dispesaAdcFunc);
                listaFuncionarios.add(funcionario);
            }
        }

        System.out.println();
        System.out.println("PAGAMENTO");
        for (Funcionario funcionario : listaFuncionarios) {
            System.out.println(funcionario.getNome() + "- $ " + funcionario.pagamento());
        }

        sc.close();
    }
}
