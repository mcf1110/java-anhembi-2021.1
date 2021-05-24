import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Heroi h = new Mago("Aragorn", 200, "Andúril");
        Vilao v = new Vilao("Sauron", 50);
        Random gerador = new Random(42);

        do {
            if (gerador.nextInt(100) <= 50) {
                h.atacar(v);
                h.falarNomeDoAtaque();
            }

            if (v.temVida() && gerador.nextInt(100) <= 40) {
                v.atacar(h);
            }

            if (h instanceof Curavel && gerador.nextInt(100) <= 5) {
                System.out.println("Heroi curou!");
                ((Curavel) h).curar();
            }

            if (v instanceof Curavel && gerador.nextInt(100) <= 5) {
                System.out.println("Vilao curou!");
                v.curar();
            }

            System.out.println(h);
            System.out.println(v);
            System.out.println("------");
        } while (v.temVida() && h.temVida());
    }
}
