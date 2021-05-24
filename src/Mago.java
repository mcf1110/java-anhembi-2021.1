public class Mago extends Heroi implements Curavel {
    public Mago(String nome, int vida, String nomeDoAtaque) {
        super(nome, vida, nomeDoAtaque);
    }


    @Override
    public void curar() {
        this.diminuirVida(-10);
    }
}
