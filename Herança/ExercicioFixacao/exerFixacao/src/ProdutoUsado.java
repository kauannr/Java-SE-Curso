import java.util.Date;

public class ProdutoUsado extends Produto {

    private Date dataFabricacao;

    public ProdutoUsado(String nome, Double preco, Date dataFabr) {
        super(nome, preco);
        this.dataFabricacao = dataFabr;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
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

    @Override
    public String etiquetaDePreco() {
        return getNome() + " (usado) $ " + getPreco() + "(Data de fabricação: " + getDataFabricacao() + ")";
    }
}
