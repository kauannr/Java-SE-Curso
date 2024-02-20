
public final class FuncionarioTerceirizado extends Funcionario {

    private Double despesaAdicional;

    public FuncionarioTerceirizado(String nome, Integer horasTrabalhadas, Double valorPHora, Double dispesaAdicional) {
        super(nome, horasTrabalhadas, valorPHora);
        this.despesaAdicional = dispesaAdicional;
    }

    public FuncionarioTerceirizado() {
        super();
    }

    @Override
    public Integer getHorasTrabalhadas() {

        return super.getHorasTrabalhadas();

    }

    @Override
    public String getNome() {

        return super.getNome();
    }

    @Override
    public Double getValorPHora() {

        return super.getValorPHora();
    }

    @Override
    public void setHorasTrabalhadas(Integer horasTrabalhadas) {

        super.setHorasTrabalhadas(horasTrabalhadas);
    }

    @Override
    public void setNome(String nome) {

        super.setNome(nome);
    }

    @Override
    public void setValorPHora(Double valorPHora) {

        super.setValorPHora(valorPHora);
    }

    @Override
    public String toString() {

        return super.toString();
    }

    @Override
    public double pagamento() {

        return super.pagamento() + ((110d / 100d) * despesaAdicional);
    }

}
