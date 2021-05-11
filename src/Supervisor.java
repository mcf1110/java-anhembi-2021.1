public class Supervisor implements Funcionario{
    private int qtdSupervisionados;
    double salarioBase;

    public Supervisor(int qtdSupervisionados, double salarioBase) {
        this.qtdSupervisionados = qtdSupervisionados;
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario() {
        return salarioBase * qtdSupervisionados;
    }
}
