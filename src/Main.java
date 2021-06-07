import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        JogoDaVelha jogoDaVelha = new JogoDaVelha();
        Scanner sc = new Scanner(System.in);
        do {
            jogoDaVelha.getStatus();
            System.out.print("Digite a posição: ");
            int posicao = sc.nextInt();
            sc.nextLine();
            System.out.print("Digite a jogada: ");
            char jogada = sc.nextLine().charAt(0);
            try{
                jogoDaVelha.jogar(posicao, jogada);
            } catch (TicTacToeException e) {
                System.out.println(e.getMessage());
            }

        } while(jogoDaVelha.possuiPosicaoLivre());
    }

}
