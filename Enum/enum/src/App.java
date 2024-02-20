import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Enums");

        Compra compra1 = new Compra(123, new Date(), StatusPedido.PROCESSANDO);
        System.out.println(compra1);
    }
}
