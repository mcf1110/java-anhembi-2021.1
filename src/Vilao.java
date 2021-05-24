public class Vilao extends Personagem{

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
}
