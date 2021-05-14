public class Estagiario extends Estudante implements  Funcionario{
    private int horasTrabalhoSemana;

    public Estagiario(String curso, String nome, int horasEstudoSemana, int horasTrabalhoSemana) {
        super(curso, nome, horasEstudoSemana);
        this.horasTrabalhoSemana = horasTrabalhoSemana;
    }

    public int horasDedicacao(){
        return horasTrabalhoSemana + getHorasEstudoSemana();
    }

    @Override
    public double calcularSalario() {
        return horasTrabalhoSemana*10;
    }
}
