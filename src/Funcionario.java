public abstract class Funcionario implements Identificavel {
    private String nome;
    private int RG;
    private int CPF;

    public Funcionario(String nome, int RG, int CPF) {
        this.nome = nome;
        this.RG = RG;
        this.CPF = CPF;
    }

    public abstract double calcularSalario();

    public String getIdentificacao() {
        return nome + " - " + CPF;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", RG=" + RG +
                ", CPF=" + CPF +
                ", salario=" + calcularSalario() +
                '}';
    }
}
