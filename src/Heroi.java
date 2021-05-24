public abstract class Heroi extends  Personagem{
    private String nomeDoAtaque;

    public Heroi(String nome, int vida, String nomeDoAtaque) {
        super(nome, vida);
        this.nomeDoAtaque = nomeDoAtaque;
    }

    @Override
    public void atacar(Personagem p) {
        if(!temEnergia()){
            return;
        }
        p.diminuirVida(10);
        this.consumirEnergia(20);
    }

    public void falarNomeDoAtaque(){
        System.out.println(this.nomeDoAtaque + "!");
    }
}
