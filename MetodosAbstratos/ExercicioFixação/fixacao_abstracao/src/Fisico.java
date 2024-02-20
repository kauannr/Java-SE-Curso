public class Fisico extends Contribuinte {

    private Double gastos_saude;

    public Fisico(String nome, Double renda_anual, Double gastos_saude) {
        super(nome, renda_anual);
        this.gastos_saude = gastos_saude;
    }

    @Override
    public Double impostoPago() {
        Double imposto = 0d;

        if (getRenda_anual() < 20000d) {
            imposto = (15d / 100d) * getRenda_anual();
        } else {
            imposto = (25d / 100d) * getRenda_anual();
        }

        if (getGastos_saude() > 0) {
            imposto = imposto - ((50d / 100d) * getGastos_saude());
        }
        if (imposto < 0) {
            return 0d;
        }

        return imposto;
    }

    public Double getGastos_saude() {
        return gastos_saude;
    }

    public void setGastos_saude(Double gastos_saude) {
        this.gastos_saude = gastos_saude;
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

}
