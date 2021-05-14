public class Peixe extends Pet {
    public Peixe(String nome, int id) {
        super(nome, id);
    }

    @Override
    public void falar() {
        System.out.println("Glub glub");
    }
}
