public class Estudante {
    private String curso;
    private String nome;
    private int horasEstudoSemana;

    public Estudante(String curso, String nome, int horasEstudoSemana) {
        this.curso = curso;
        this.nome = nome;
        this.horasEstudoSemana = horasEstudoSemana;
    }

    public int getHorasEstudoSemana() {
        return horasEstudoSemana;
    }
}
