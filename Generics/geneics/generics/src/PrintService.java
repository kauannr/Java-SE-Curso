import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
    private List<T> lista = new ArrayList<>();

    public void Adicionar(T n) {
        lista.add(n);
    }

    public void Imprimir() {
        System.out.println(lista);
    }

    public T Primeiro() {
        if (lista.isEmpty()) {
            throw new IllegalStateException("Lista vazia");
        }
        return lista.get(0);
    }
}
