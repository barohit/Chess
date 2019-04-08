
public class Knight extends Piece {

	public Knight(String color) {
		super(color);
	}

	final String identity = "Knight";

	public String getIdentity() {
		return identity;
	}

	protected boolean canMove(Square s) {
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

		boolean result = true;
		if (getChessBoard().oppositeColor(this, s.getPiece()) == true) {
			if ((Math.abs(s.getRowValue() - getCurrentPosition().getRowValue()) == 2
					&& Math.abs(s.getColumnValue() - getCurrentPosition().getColumnValue()) == 1)
					|| (Math.abs(s.getRowValue() - getCurrentPosition().getRowValue()) == 1
							&& Math.abs(s.getColumnValue() - getCurrentPosition().getColumnValue()) == 2)) {
				result = true;
			} else {
				result = false;
			}
		} else {
			result = false;
		}

		return result;
	}

	public void Move(Square s) {
		if (canMove(s) == true) {
			Square tempPosition = this.getCurrentPosition();
			s.setPiece(this);
			getChessBoard().getChessBoardArray()[tempPosition.getRowValue()][tempPosition.getColumnValue()]
					.setEmptyPiece();
		} else {
			System.out.println("Error, invalid move");
		}
	}
}
