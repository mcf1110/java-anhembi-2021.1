public class Veterinario extends Funcionario {
    private int horasTrabalhadas;

    public Veterinario(String nome, int RG, int CPF, int horasTrabalhadas) {
        super(nome, RG, CPF);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularSalario() {
        return 120 * horasTrabalhadas;
    }
}
