public class WrongPositionException extends TicTacToeException {
    @Override
    public String getMessage() {
        return "The selected position was invalid";
    }
}
