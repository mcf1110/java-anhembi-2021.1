public class Gato extends Pet{
    private String corDoPelo;

    public Gato(String nome, String corDoPelo) {
        super(nome);
        this.corDoPelo = corDoPelo;
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("O gato " + getNome() + " tem o pelo " + corDoPelo);
    }
}
