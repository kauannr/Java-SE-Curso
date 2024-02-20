import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private Date moment;
    private StatusPedido status;
    private Cliente cliente;

    List<ItemPedido> listaItem = new ArrayList<>();

    public Pedido(Date moment, StatusPedido status, Cliente cliente) {
        this.moment = moment;
        this.status = status;
        this.cliente = cliente;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public void addItem(ItemPedido item) {
        listaItem.add(item);
    }

    public void removeItem(ItemPedido item) {
        listaItem.remove(item);
    }

    public List<ItemPedido> getListaItem() {
        return listaItem;
    }

    public double Total() {
        double soma = 0;
        for (ItemPedido c : listaItem) {
            soma = soma + c.subTotal();
        }

        return soma;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nSUMARIO DO PEDIDO\n");
        sb.append("Momento do pedido: " + getMoment() + "\n");
        sb.append("Status do pedido: " + getStatus() + "\n");
        sb.append("Cliente: " + cliente.getNome() + " " + cliente.getDataNasci() + " - " + cliente.getEmail() + "\n");
        sb.append("Itens do pedido:\n");
        sb.append(listaItem);
        sb.append("Preco total: " + Total());

        return sb.toString();
    }
}
