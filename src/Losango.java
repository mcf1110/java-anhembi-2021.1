public class Losango extends Quadrilatero{

    public Losango(String nome, double dMaior, double dMenor) {
        super(nome, dMaior, dMenor);
    }

    @Override
    public double calcularArea() {
        return super.calcularArea()/2;
    }
}
