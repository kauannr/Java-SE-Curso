public class Retangulo implements Figura {

    private Double altura;
    private Double largura;

    public Retangulo(Double largura, Double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    @Override
    public Double Area() {
        // TODO Auto-generated method stub
        return getAltura() * getLargura();
    }

}
