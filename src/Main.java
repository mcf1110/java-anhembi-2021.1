import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("Digite o nome: ");
            String nome = entrada.nextLine();
            alunos.add(new Aluno(nome));
        }

        for (Aluno a : alunos) {
            System.out.println(a);
        }
    }
}
