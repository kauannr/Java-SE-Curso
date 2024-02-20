public class ServicoTaxaBrazil implements ServicoTaxa {

    private Double taxaJuros;

    public ServicoTaxaBrazil(Double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    @Override
    public Double getTaxaJuros() {
        return taxaJuros;
    }

}
