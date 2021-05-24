import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Heroi h = new Heroi("Superman", 200, "Olho laser");
        Vilao v = new Vilao("Lex-Luthor", 50);
        Random gerador = new Random(42);

        do {
            if (gerador.nextInt(100) <= 50) {
                h.atacar(v);
                h.falarNomeDoAtaque();
            }

            if (v.temVida() && gerador.nextInt(100) <= 40) {
                v.atacar(h);
            }
            System.out.println(h);
            System.out.println(v);
            System.out.println("------");
        } while (v.temVida() && h.temVida());
    }
}
