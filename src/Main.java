import java.text.NumberFormat;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Estagiario("CD", "Giovanna P", 20, 30));
        funcionarios.add(new Estagiario("ADS", "Giovanna M", 20, 30));
        funcionarios.add(new Estagiario("ADS", "Thiago", 0, 30));
        funcionarios.add(new Supervisor(3, 800));
        NumberFormat fmt = NumberFormat.getCurrencyInstance();

        for (Funcionario f : funcionarios) {
            System.out.println(fmt.format(f.calcularSalario()));
        }
    }
}