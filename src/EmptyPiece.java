
public class EmptyPiece extends Piece {

	String identity = "blank";
	int placeholderidentityrow;
	char placeholderidentitycolumn;
	final String pieceColor = "clear";

	public EmptyPiece(int i, char a) {
		int placeholderidentityrow = i;
		char placeholderidentitycolumn = a;
	}

	public EmptyPiece() {
		// TODO Auto-generated constructor stub
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
