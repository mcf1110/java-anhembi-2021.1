public abstract class Personagem {
    private String nome;
    private int vida;
    private int energia = 100;

    public Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public int getVida() {
        return vida;
    }

    public void diminuirVida(int vida) {
        this.vida -= vida;
    }

    protected void consumirEnergia(int perc) {
        this.energia -= perc;
    }

    protected boolean temEnergia() {
        return this.energia > 0;
    }

    public boolean temVida(){
        return this.vida > 0;
    }

    public abstract void atacar(Personagem p);

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", vida=" + vida +
                ", energia=" + energia +
                '}';
    }
}
