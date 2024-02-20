import java.util.Date;

public class Cliente {

    private String nome;
    private String email;
    private Date dataNasci;

    public Cliente(String nome, String email, Date dataNasci) {
        this.nome = nome;
        this.email = email;
        this.dataNasci = dataNasci;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataNasci() {
        return dataNasci;
    }

    public void setDataNasci(Date dataNasci) {
        this.dataNasci = dataNasci;
    }

}
