public class Galinha extends Pet {
    public Galinha(String nome, int id) {
        super(nome, id);
    }

    @Override
    public void falar() {
        System.out.println("Popó");
    }

}
