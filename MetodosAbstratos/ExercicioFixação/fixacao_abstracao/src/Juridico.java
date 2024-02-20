public class Juridico extends Contribuinte {

    private Integer num_funcionarios;

    public Juridico(String nome, Double renda_anual, Integer num_funcionarios) {
        super(nome, renda_anual);
        this.num_funcionarios = num_funcionarios;
    }

    @Override
    public Double impostoPago() {
        if (getNum_funcionarios() > 10) {
            return ((14d / 10d) * getRenda_anual());
        } else {
            return ((16d / 10d) * getRenda_anual());
        }
    }

    @Override
    public String getNome() {

        return super.getNome();
    }

    @Override
    public Double getRenda_anual() {

        return super.getRenda_anual();
    }

    @Override
    public void setNome(String nome) {

        super.setNome(nome);
    }

    @Override
    public void setRenda_anual(Double renda_anual) {

        super.setRenda_anual(renda_anual);
    }

    public Integer getNum_funcionarios() {
        return num_funcionarios;
    }

    public void setNum_funcionarios(Integer num_funcionarios) {
        this.num_funcionarios = num_funcionarios;
    }
}
