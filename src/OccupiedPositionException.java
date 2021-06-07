public class OccupiedPositionException extends TicTacToeException{

    @Override
    public String getMessage() {
        return "The selected position is already in use";
    }
}
