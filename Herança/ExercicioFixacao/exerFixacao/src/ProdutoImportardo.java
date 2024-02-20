public class ProdutoImportardo extends Produto {

    private Double taxaAlfandega;

    public ProdutoImportardo(String nome, Double preco, Double taxaAlfandega) {
        super(nome, preco);
        this.taxaAlfandega = taxaAlfandega;
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public Double getPreco() {
        return super.getPreco();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public void setPreco(Double preco) {
        super.setPreco(preco);
    }

    public Double getTaxaAlfandega() {
        return taxaAlfandega;
    }

    public void setTaxaAlfandega(Double taxaAlfandega) {
        this.taxaAlfandega = taxaAlfandega;
    }

    @Override
    public String etiquetaDePreco() {
        return getNome() + " $ " + getPreco() + "(Taxa da alfandega: $ " + getTaxaAlfandega() + ")";
    }

    public Double precoTotal() {
        return getPreco() * taxaAlfandega;
    }

}
