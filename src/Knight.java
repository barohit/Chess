
public class Knight extends Piece {

	public Knight(String color) {
		super(color);
	}

	final String identity = "Knight";

	public String getIdentity() {
		return identity;
	}

	public boolean canMove(Square s) {
		boolean result = true;
		if (getChessBoard().oppositeColor(this, s.getPiece()) == true) {
			ChessBoard temp = getChessBoard(); // for evaluation
			Piece tempPiece = s.getPiece(); // to put this back in s's spot after
			Square tempPosition = getCurrentPosition(); // to put this Knight back after
			temp.getChessBoardArray()[s.rowValue][s.columnValue].setPiece(this);
			temp.getChessBoardArray()[tempPosition.getRowValue()][tempPosition.getColumnValue()].setPiece(null);
			if (getChessBoard().kingInCheck(getColor(), temp) == false) {
				temp.getChessBoardArray()[s.rowValue][s.columnValue].setPiece(tempPiece);
				temp.getChessBoardArray()[tempPosition.getRowValue()][tempPosition.getColumnValue()].setPiece(this);

				if ((Math.abs(s.getRowValue() - getCurrentPosition().getRowValue()) == 2
						&& Math.abs(s.getColumnValue() - getCurrentPosition().getColumnValue()) == 1)
						|| (Math.abs(s.getRowValue() - getCurrentPosition().getRowValue()) == 1
								&& Math.abs(s.getColumnValue() - getCurrentPosition().getColumnValue()) == 2)) {
					result = true;
				}

			} else
				result = false;

			temp.getChessBoardArray()[s.rowValue][s.columnValue].setPiece(tempPiece);
			temp.getChessBoardArray()[tempPosition.getRowValue()][tempPosition.getColumnValue()].setPiece(this);
		}

		else
			result = false;

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
			Square tempPosition = getCurrentPosition();
			s.setPiece(this);
			tempPosition.setPiece(null);
		}
	}
}
