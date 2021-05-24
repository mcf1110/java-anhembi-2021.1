public class Cachorro extends Pet{
    private float peso;

    public Cachorro(String nome, float peso) {
        super(nome);
        this.peso = peso;
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("O cachorro " + getNome() + " pesa " + peso + "kg.");
    }
}
