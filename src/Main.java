import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Estagiario("SI", "Paulo", 20, 30));
        funcionarios.add(new Estagiario("SI", "Isaias", 20, 30));
        funcionarios.add(new Estagiario("SI", "Gabriel", 20, 30));
        funcionarios.add(new Supervisor(3, 1000));

        for (int i = 0; i < funcionarios.size(); i++) {
            System.out.println(funcionarios.get(i).calcularSalario());
        }
    }
}
