public class ItemPedido {
    private Integer quantidade;
    private double preco;

    public ItemPedido(Integer quantidade, double preco) {
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double subTotal() {
        return getPreco() * getQuantidade();
    }

}
