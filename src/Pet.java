public abstract class Pet implements Identificavel {
    protected String nome;
    protected int id;

    public Pet(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public abstract void falar();

    public String getIdentificacao() {
        return nome + " - " + id;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                '}';
    }
}
