import java.security.InvalidParameterException;

public interface ServicoTaxa {

    public Double getTaxaJuros();

    default Double Pagamento(Double quantia, Integer meses) {
        if (meses < 1) {
            throw new InvalidParameterException("Quantidade de meses inválida");
        }
        return quantia * Math.pow(1d + (getTaxaJuros() / 100d), meses);
    }

}
