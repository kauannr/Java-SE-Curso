public class BusinessConta extends Conta {

    private Double limiteEmprestimo;

    public Double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(Double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public BusinessConta(Integer numero, String titular, Double saldo, Double limiteEmprestimo) {
        super(numero, titular, saldo);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public void emprestimo(Double valor) {
        if (valor <= limiteEmprestimo) {
            saldo = saldo + valor - 10;
        }
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " Limite emprestimo: " + getLimiteEmprestimo() + "\n";
    }

}
