import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        List<Figura> listFigura = new ArrayList<>();
        listFigura.add(new Circulo(2.0));
        listFigura.add(new Retangulo(3.0, 2.0));

        List<Circulo> listCirculo = new ArrayList<>();
        listCirculo.add(new Circulo(2.0));
        listCirculo.add(new Circulo(3.0));

        System.out.println("Area total da lista: " + areaTtotal(listFigura));
        System.out.println("Area total da lista: " + areaTtotal(listCirculo));

    }

    public static Double areaTtotal(List<? extends Figura> list) {
        double soma = 0d;
        for (Figura f : list) {
            soma += f.Area();
        }
        return soma;
    }
}
