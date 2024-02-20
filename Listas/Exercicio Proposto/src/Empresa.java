import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Empresa {
    public static void main(String[] args) throws Exception {

        System.out.println("Exercicio lista de funcionários");

        System.out.print("Quantos funcionários serão cadastrados? ");
        int qntFuncionarios;
        Scanner sc = new Scanner(System.in);
        qntFuncionarios = sc.nextInt();
        sc.nextLine();
        System.out.println();

        List<Funcionario> funcionarios = new ArrayList<>();

        // Atributos do funcionário:
        String nome;
        int id;
        double salario;

        // Laço pra cadastrar os n funcionários:
        for (int i = 0; i < qntFuncionarios; i++) {
            System.out.printf("Funcionário %d:", i + 1);
            System.out.print("\nNome: ");
            nome = sc.nextLine();

            System.out.print("ID: ");
            id = sc.nextInt();

            System.out.print("Salário: ");
            salario = sc.nextDouble();
            sc.nextLine();

            System.out.println();

            funcionarios.add(new Funcionario(nome, id, salario));
        }

        System.out.println("---Lista de Funcionários---");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }

        // ADICIONANDO AUMENTO EM UM FUNCIONÁRIO
        System.out.print("Digite o id do funcionário que receberá o aumento: ");
        int idAumento = sc.nextInt();
        sc.nextLine();

        Integer posicao = procuraID(funcionarios, idAumento);

        if (posicao == null) {
            System.out.println("ID de funcionário não existente");
        } else {
            funcionarios.get(posicao).AdicionarAumento(); // Pega o funcionario na posição ' posicao ' e aumenta
        }

        sc.close();
    }

    public static Integer procuraID(List<Funcionario> listPesquisa, int idProcurado) {

        for (int i = 0; i < listPesquisa.size(); i++) {

            if (listPesquisa.get(i).getId() == idProcurado) {
                return i;
            }
        }
        return null;
    }
}
