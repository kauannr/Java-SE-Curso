
public class Funcionario {

    private String nome;
    private Integer horasTrabalhadas;
    private Double valorPHora;

    public Funcionario() {
    }

    public Funcionario(String nome, Integer horasTrabalhadas, Double valorPHora) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPHora = valorPHora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Double getValorPHora() {
        return valorPHora;
    }

    public void setValorPHora(Double valorPHora) {
        this.valorPHora = valorPHora;
    }

    public double pagamento() {
        return valorPHora * horasTrabalhadas;
    }

    @Override
    public String toString() {
        return "Funcionario:\n Nome = " + nome + ", Horas Trabalhadas = " + horasTrabalhadas + ", Valor P Hora = "
                + valorPHora
                + " Pagamento: " + pagamento() + "\n";
    }

}
