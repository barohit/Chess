
public class EmptyPiece extends Piece {

	final String pieceColor = "clear"; // opposite color method in chessboard will always return true
	final String identity = "Empty";

	public EmptyPiece(int i, char a) {
		this.getCurrentPosition().setColumn(a);
		this.getCurrentPosition().setRow(i);
	}

	public EmptyPiece() {
		// TODO Auto-generated constructor stub
	}

	public String getIdentity() {
		return identity;
	}

	protected boolean canMove(Square s) {
		return false; // change this later.
	}

	protected boolean canCapture(Square s) {
		return false;
	}

	protected void move(Square square) {
		// TODO Auto-generated method stub

	}
}
