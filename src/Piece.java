
public class Piece {

	public Piece() {
		pieceColor = "clear";
	}

	public Piece(String color) {
		pieceColor = color;
	}

	final String pieceColor;
	String identity;
	Square currentPosition;
	ChessBoard chessBoard;

	protected String getIdentity() {
		return identity;
	}

	protected Square getCurrentPosition() {
		return currentPosition;
	}

	protected void setCurrentPosition(Square s) {
		currentPosition = s;
	}

	protected String getColor() {
		return pieceColor;
	}

	protected void setChessBoard(ChessBoard board) {
		chessBoard = board;
	}

	protected ChessBoard getChessBoard() {
		return this.chessBoard;
	}

	protected boolean canMove(Square s) {
		return true; // change this later.
	}

	protected boolean canCapture(Square s) {
		return true;
	}

	protected void move(Square square) {
		// TODO Auto-generated method stub

	}
}
