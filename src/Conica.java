public abstract class Conica extends FiguraGeometrica{
    private double distanciaCentro1, distanciaCentro2;

    public Conica(String nome, double distanciaCentro1, double distanciaCentro2) {
        super(nome);
        this.distanciaCentro1 = distanciaCentro1;
        this.distanciaCentro2 = distanciaCentro2;
    }

    @Override
    public double calcularArea() {
        return Math.PI * distanciaCentro1 * distanciaCentro2;
    }

    @Override
    public String mostrarLados() {
        return "Não tenho lados";
    }
}
