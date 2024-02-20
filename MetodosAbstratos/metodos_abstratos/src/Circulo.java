public final class Circulo extends Forma {

    public Circulo(Cor cor, Double raio) {
        super(cor);
        this.raio = raio;
    }

    private Double raio;

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public Double area() {
        return Math.PI * raio * raio;
    }

}
