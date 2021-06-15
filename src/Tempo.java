public abstract class Tempo {
    private int valor;
    private final int limite;

    public Tempo(int valor, int limite) {
        this.valor = valor;
        this.limite = limite;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getLimite() {
        return limite;
    }
}
