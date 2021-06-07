public class WrongCharacterException extends TicTacToeException {
    @Override
    public String getMessage() {
        return "An invalid character was provided.";
    }
}
