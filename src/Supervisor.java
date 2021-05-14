public class Supervisor implements Funcionario{
    private int qtdeSupervisionados;
    private double salarioBase;

    public Supervisor(int qtdeSupervisionados, double salarioBase) {
        this.qtdeSupervisionados = qtdeSupervisionados;
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario() {
        return salarioBase * qtdeSupervisionados;
    }
}
