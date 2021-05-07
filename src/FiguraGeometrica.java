public abstract class FiguraGeometrica {
    private String nome;

    public FiguraGeometrica(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract double calcularArea();

    public abstract String mostrarLados();
}
