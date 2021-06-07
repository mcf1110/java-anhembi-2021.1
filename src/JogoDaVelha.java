public class JogoDaVelha {
    private char[] tabuleiro = new char[9];

    JogoDaVelha() {
        for (int i = 0; i < 9; i++) {
            tabuleiro[i] = ' ';
        }
    }

    public void jogar(int posicao, char jogada)
            throws WrongPositionException, OccupiedPositionException, WrongCharacterException {
        if (posicao < 0 || posicao > 8) {
            throw new WrongPositionException();
        }
        if (tabuleiro[posicao] != ' ') {
            throw new OccupiedPositionException();
        }
        if (jogada != 'X' && jogada != 'O') {
            throw new WrongCharacterException();
        }
        tabuleiro[posicao] = jogada;
    }

    public void getStatus() {
        for (int i = 0; i < 9; i++) {
            System.out.print(tabuleiro[i]);
            System.out.print(" ");
            if (i % 3 == 2) {
                System.out.println();
            }
        }
    }

    public boolean possuiPosicaoLivre() {
        for (int i = 0; i < 9; i++) {
            if (tabuleiro[i] == ' ') {
                return true;
            }
        }
        return false;
    }
}
