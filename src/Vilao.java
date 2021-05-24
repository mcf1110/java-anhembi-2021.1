public class Vilao extends Personagem implements Curavel{

    public Vilao(String nome, int vida) {
        super(nome, vida);
    }

    @Override
    public void atacar(Personagem p) {
        if(!temEnergia()){
            return;
        }
        p.diminuirVida(10);
        this.consumirEnergia(15);
    }

    @Override
    public void curar() {
        this.diminuirVida(-10);
    }
}
