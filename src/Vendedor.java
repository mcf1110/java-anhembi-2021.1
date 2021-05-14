public class Vendedor extends Funcionario {
    private double salario;

    public Vendedor(String nome, int RG, int CPF, double salario) {
        super(nome, RG, CPF);
        this.salario = salario;
    }

    @Override
    public double calcularSalario() {
        return salario;
    }
}
