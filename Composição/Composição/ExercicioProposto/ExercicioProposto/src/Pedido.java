import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    private Date moment;
    private StatusPedido status;

    List<ItemPedido> listaItem = new ArrayList<>();

    public Pedido(Date moment, StatusPedido status) {
        this.moment = moment;
        this.status = status;
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

}
