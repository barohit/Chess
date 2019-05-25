
public class King extends Piece {

	public King(String color) {
		super(color);
	}

	final String identity = "King";
	boolean hasMoved = false;

	public String getIdentity() {
		return identity;
	}

	protected boolean canMove(Square s) { 
		/* similar to canMove method from every other piece, but has to check that the resulting
		 * square does not put the King in check
		 */
		boolean result = true;
		if (canCapture(s) == false) {
			result = false;
		} else {
			ChessBoard temp = getChessBoard();
			Square returnPosition = getCurrentPosition();
			Piece tempPiece = s.getPiece();
			temp.getChessBoardArray()[s.getRowValue()][s.getColumnValue()].setPiece(this);
			temp.getChessBoardArray()[returnPosition.getRowValue()][returnPosition.getColumnValue()].setEmptyPiece();
			if (getChessBoard().kingInCheck(getColor(), temp) == false) {
				getChessBoard().getChessBoardArray()[returnPosition.getRowValue()][returnPosition.getColumnValue()]
						.setPiece(this);
				getChessBoard().getChessBoardArray()[s.getRowValue()][s.getColumnValue()].setPiece(tempPiece);

			} else {
				result = false;
			}
			getChessBoard().getChessBoardArray()[returnPosition.getRowValue()][returnPosition.getColumnValue()]
					.setPiece(this);
			getChessBoard().getChessBoardArray()[s.getRowValue()][s.getColumnValue()].setPiece(tempPiece);
		}
		return result;
	}

	public boolean canCapture(Square s) {
		boolean result = false;

		if (s.getChessBoard().oppositeColor(s.getPiece(), this) == true) {
			if (Math.abs(s.getRowValue() - getCurrentPosition().getRowValue()) <= 1
					&& Math.abs(s.getColumnValue() - getCurrentPosition().getColumnValue()) <= 1) {
				result = true; // just checks to see if any square one diagonal or one square 
				// vertically or horizontally from the current square is occupied
			}
		}
		return result;
	}

	public void move(Square s) {
		if (canMove(s) == true) {
			Square tempPosition = this.getCurrentPosition();
			s.setPiece(this);
			getChessBoard().getChessBoardArray()[tempPosition.getRowValue()][tempPosition.getColumnValue()]
					.setEmptyPiece();
			hasMoved = true;
		} else {
			System.out.println("Error, invalid move");
		}
	}

	public boolean getHasMoved() {
		return hasMoved;
	}

}
