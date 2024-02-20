public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Aula: Herança");

        Conta conta1 = new BusinessConta(123, "Jose", 100.00, 200.0);
        BusinessConta businessConta1 = new BusinessConta(321, "Kauan", 200.0, 70.0);

        // UPCASTING (da subclasse para a super classe)
        conta1 = businessConta1;
        businessConta1.setTitular("Joazin88");
        System.out.println(conta1);

        // DOWNCASTING (da superclasse para a subclasse)
        Conta conta2 = new BusinessConta(456, "maria", 300.00, 50.0);

        BusinessConta businessConta2 = (BusinessConta) conta2;
        businessConta2.setLimiteEmprestimo(100.0);
        System.out.println(businessConta2);

    }
}
