import java.util.Scanner;

public class App {
        public static void main(String[] args) throws Exception {
                System.out.println(
                                "Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa");
                int n1, n2, result;
                Scanner scan = new Scanner(System.in);
                n1 = scan.nextInt();
                n2 = scan.nextInt();
                result = n1 + n2;
                System.out.println("Soma = " + result + "\n");

                System.out.println(
                                "Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos.");
                double raio, area;
                raio = scan.nextDouble();
                area = 3.14159 * Math.pow(raio, 2);
                System.out.println("A = " + area + "\n");

                System.out.println(
                                "Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).");
                int A, B, C, D, diferenca;
                A = scan.nextInt();
                B = scan.nextInt();
                C = scan.nextInt();
                D = scan.nextInt();
                diferenca = (A * B - C * D);
                System.out.println("DIFERENÇA = " + diferenca + "\n");

                System.out.println(
                                "Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.");
                double numFuncionario, cargaH, salarioH, salarioTotal;
                numFuncionario = scan.nextDouble();
                cargaH = scan.nextDouble();
                salarioH = scan.nextDouble();
                salarioTotal = salarioH * cargaH;
                System.out.println("Numero = " + numFuncionario);
                System.out.println("Salario = " + salarioTotal + "\n");

                System.out.println("Faça a área do triângulo retângulo que tem A por base e C por altura.");
                float aBase, cAltura, areaTriangulo;
                aBase = scan.nextFloat();
                cAltura = scan.nextFloat();
                areaTriangulo = (aBase * cAltura) / 2;
                System.out.println("AREA = " + areaTriangulo);
                scan.close();

        }
}