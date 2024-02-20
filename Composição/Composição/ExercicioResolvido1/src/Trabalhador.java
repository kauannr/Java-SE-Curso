import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trabalhador {

    private String nome;
    private NivelTrabalho nivelTrabalho;
    private double salarioBase;

    private Departamento departamento;

    private List<ContratoHora> contratos = new ArrayList<>();

    public Trabalhador(String nome, NivelTrabalho nivelTrabalho, double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.nivelTrabalho = nivelTrabalho;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelTrabalho getNivelTrabalho() {
        return nivelTrabalho;
    }

    public void setNivelTrabalho(NivelTrabalho nivelTrabalho) {
        this.nivelTrabalho = nivelTrabalho;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public List<ContratoHora> getContratos() {
        return contratos;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public void addContrato(ContratoHora contrato) {
        contratos.add(contrato);
    }

    public void removeContrato(ContratoHora contrato) {
        if (contratos != null) {
            contratos.remove(contrato);
        }
    }

    public double renda(int ano, int mes) {
        double soma = salarioBase;
        Calendar calendario = Calendar.getInstance();

        for (ContratoHora c : contratos) {
            calendario.setTime(c.getData());

            int c_ano = calendario.get(Calendar.YEAR);
            int c_mes = 1 + calendario.get(Calendar.MONTH);
            if (ano == c_ano && mes == c_mes) {
                soma += c.valorTotal();
            }
        }
        return soma;
    }

}
