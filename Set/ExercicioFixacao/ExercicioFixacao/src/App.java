import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos alunos para o curso A?: ");
        int n = sc.nextInt();
        sc.nextLine();

        Set<Integer> setA = new HashSet<>();
        for (int i = 0; i < n; i++) {
            setA.add(sc.nextInt());
            sc.nextLine();
        }

        System.out.print("Quantos alunos para o curso B?: ");
        Set<Integer> setB = new HashSet<>();
        n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            setB.add(sc.nextInt());
            sc.nextLine();
        }

        System.out.print("Quantos alunos para o curso C?: ");
        Set<Integer> setC = new HashSet<>();
        n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            setC.add(sc.nextInt());
            sc.nextLine();
        }

        Set<Integer> setTtotal = new HashSet<>(setA);
        setTtotal.addAll(setB);
        setTtotal.addAll(setC);
        System.out.println("Total de alunos: " + setTtotal.size());
        sc.close();

    }
}
