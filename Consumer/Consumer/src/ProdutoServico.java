import java.util.*;
import java.util.function.*;

public class ProdutoServico {
    public Double somaFiltrada(List<Produto> list, Predicate<Produto> criterio) {
        Double soma = 0d;
        for (Produto produto : list) {
            if (criterio.test(produto) == true) {
                soma += produto.getPreco();
            }
        }
        return soma;
    }
}
