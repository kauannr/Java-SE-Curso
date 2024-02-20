import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Aula:  Listas");

        List<String> listaAprovados = new ArrayList<>();

        listaAprovados.add("João");
        listaAprovados.add("Maria");
        listaAprovados.add("José");
        listaAprovados.add("Caike");
        listaAprovados.add("Cesar");
        listaAprovados.add("Caio");

        double nota1, nota2, nota3;

        System.out.println("notas do novo aluno: ");
        Scanner sc = new Scanner(System.in);
        nota1 = sc.nextDouble();
        nota2 = sc.nextDouble();
        nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.println("Aluno aprovado");
            listaAprovados.add("Kauan");
        } else {
            System.out.println("Novo aluno não aprovado!\n");
        }

        System.out.println("Alunos aprovados:");
        System.out.println(listaAprovados.size() + ", " + listaAprovados);

        // NOVA LISTA
        List<String> novaLista = listaAprovados.stream().filter(x -> x.charAt(0) == 'c' ||
                x.charAt(0) == 'C').collect(Collectors.toList());

        System.out.println("Nova lista filtrada:");
        System.out.println(novaLista);

        // PRIMEIRO NOME PROCURADO COM LETRA TAL
        String nomeProcurado = listaAprovados.stream().filter(x -> x.charAt(0) == 'z' ||
                x.charAt(0) == 'z').findFirst().orElse(null);
        System.out.println(nomeProcurado);

        if (nomeProcurado == null) {
            System.out.println("Nome não encontrado");
        }

        sc.close();
    }
}
