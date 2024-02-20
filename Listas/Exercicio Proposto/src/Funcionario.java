import java.util.Scanner;

public class Funcionario {

    private String nome;
    private int id;
    private double salario;

    public Funcionario(String nome, int id, double salario) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
    }

    public String toString() {
        return "Nome: " + nome + "\n" +
                "ID: " + id + "\n" +
                "Salário: " + salario + "\n";
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void AdicionarAumento() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a porcentagem de aumento: ");
        double porcentagem = sc.nextDouble();
        sc.nextLine();

        System.out.println();
        System.out.println("Aumento de " + porcentagem + " por cento adicionado ao funcionario " + getNome());
        System.out.println("Salário antigo: " + getSalario());
        salario = salario + ((porcentagem / 100d) * salario);
        System.out.println("Novo salario: " + getSalario());

        sc.close();
    }

}
