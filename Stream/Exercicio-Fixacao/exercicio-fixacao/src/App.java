import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o caminho do arquivo: ");
        String caminho = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {

            List<Employee> listEmployees = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String vector[] = line.split(",");
                listEmployees.add(new Employee(vector[0], vector[1], Double.parseDouble(vector[2])));
                line = br.readLine();
            }

            System.out.println("Digite o salario: ");
            Double salary = sc.nextDouble();
            sc.nextLine();
            System.out.println("Email da pessoa cujo salario é maior que " + salary + ":");
            List<String> emails = listEmployees.stream()
                    .filter(emp -> emp.getSalary() > salary)
                    .map(emp -> emp.getEmail())
                    .sorted().collect(Collectors.toList());
            emails.forEach(System.out::println);

            System.out.print("Soma dos salarios das pessoas cujo nome começa com 'M': ");
            Double soma = listEmployees.stream()
                    .filter(emp -> emp.getName().charAt(0) == 'M')
                    .map(emp -> emp.getSalary())
                    .reduce(0d, (x, y) -> x + y);
            System.out.println(soma);

        } catch (Exception e) {
            System.out.println("Erro. " + e.getMessage());
        }
        sc.close();
    }
}
