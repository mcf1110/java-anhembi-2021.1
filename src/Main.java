import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Identificavel> identificaveis = new ArrayList<>();
        identificaveis.add(new Cachorro("Milk", 1));
        identificaveis.add(new Gato("Amelia", 2));
        identificaveis.add(new Cachorro("Bob", 3));
        identificaveis.add(new Peixe("Nemo", 4));
        identificaveis.add(new Galinha("Francisca", 5));

        identificaveis.add(new Vendedor("Isaias", 123456, 987654321, 1));
        identificaveis.add(new Vendedor("Isaias", 123456, 777777777, 1));
        identificaveis.add(new Veterinario("Vinicius, o Profeta", 456789, 456789123, 42));

        for (int i = 0; i < identificaveis.size(); i++) {
            System.out.println(identificaveis.get(i).getIdentificacao());
        }
    }
}