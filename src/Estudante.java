public abstract class Estudante {
    private String curso, nome;
    private int horasEstudoSemana;

    public Estudante(String curso, String nome, int horasEstudoSemana) {
        this.curso = curso;
        this.nome = nome;
        this.horasEstudoSemana = horasEstudoSemana;
    }

    protected int getHorasEstudoSemana() {
        return horasEstudoSemana;
    }
}
