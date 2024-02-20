import java.util.Date;

public class Compra {
    private int id;
    private Date momento;
    private StatusPedido statusPedido;

    public Compra(int id, Date momento, StatusPedido statusPedido) {
        this.id = id;
        this.momento = momento;
        this.statusPedido = statusPedido;
    }

    public Compra() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(StatusPedido statusPedido) {
        this.statusPedido = statusPedido;
    }

    @Override
    public String toString() {
        return "Compra:\n" +
                "ID = " + id + "\n" +
                "MOMENTO = " + momento + "\n" +
                "statusPedido = " + statusPedido + "\n";
    }
}
