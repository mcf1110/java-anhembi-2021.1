public class Aluno {
    private static int ultimoRA = 0;
    private int RA;
    private String nome;

    public Aluno(String nome) {
        ultimoRA++;
        this.nome = nome;
        this.RA = ultimoRA;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "RA=" + RA +
                ", nome='" + nome + '\'' +
                '}';
    }
}
