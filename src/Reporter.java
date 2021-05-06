public class Reporter {
    private String nome;

    public Reporter(String nome) {
        this.nome = nome;
    }

    void trabalhar(){
        System.out.println(nome + " está trabalhando");
    }

    void tomarRaioDaMorte(){
        System.out.println(nome + " já era!");
    }
}
