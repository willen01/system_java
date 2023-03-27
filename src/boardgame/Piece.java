package boardgame;

public class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
    }

    // só é acessivel na camada de boardgame e por subclasse de Piace
    protected Board getBoard() {
        return board;
    }
}
