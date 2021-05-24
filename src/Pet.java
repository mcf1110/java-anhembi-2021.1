public abstract class Pet {
    private String nome;
    public abstract void mostrarCaracteristicas();

    public Pet(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
