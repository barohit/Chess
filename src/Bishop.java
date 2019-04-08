
public class Bishop extends Piece {

	public Bishop(String color) {
		super(color);
	}

	final String identity = "Bishop";

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

	protected boolean canCapture(Square s) {
		boolean result = true;
		if (getChessBoard().oppositeColor(s.getPiece(), this) == true) {

			if (Math.abs(s.getRowValue() - getCurrentPosition().getRowValue()) == Math
					.abs(s.getColumnValue() - getCurrentPosition().getColumnValue())) {
				if (s.getRowValue() > getCurrentPosition().getRowValue()
						&& s.getColumnValue() > getCurrentPosition().getColumnValue()) {
					int i = getCurrentPosition().getRowValue();
					int j = getCurrentPosition().getColumnValue();
					while (i < s.getRowValue() && j < s.getColumnValue()) {
						if (!(getChessBoard().getChessBoardArray()[i][j].getPiece().equals(this))
								&& !(getChessBoard().getChessBoardArray()[i][j].getPiece().getIdentity()
										.equals("Empty"))) {
							result = false;

						}
						i++;
						j++;
					}
				}

				if (s.getRowValue() > getCurrentPosition().getRowValue()
						&& s.getColumnValue() < getCurrentPosition().getColumnValue()) {
					int i = getCurrentPosition().getRowValue();
					int j = getCurrentPosition().getColumnValue();
					while (i < s.getRowValue() && j > s.getColumnValue()) {
						if (!(getChessBoard().getChessBoardArray()[i][j].getPiece().equals(this))
								&& !(getChessBoard().getChessBoardArray()[i][j].getPiece().getIdentity()
										.equals("Empty"))) {
							result = false;

						}
						i++;
						j--;
					}
				}

				if (s.getRowValue() < getCurrentPosition().getRowValue()
						&& s.getColumnValue() > getCurrentPosition().getColumnValue()) {
					int i = getCurrentPosition().getRowValue();
					int j = getCurrentPosition().getColumnValue();
					while (i > s.getRowValue() && j < s.getColumnValue()) {
						if (!(getChessBoard().getChessBoardArray()[i][j].getPiece().equals(this))
								&& !(getChessBoard().getChessBoardArray()[i][j].getPiece().getIdentity()
										.equals("Empty"))) {
							result = false;

						}
						i--;
						j++;
					}
				}

				if (s.getRowValue() < getCurrentPosition().getRowValue()
						&& s.getColumnValue() < getCurrentPosition().getColumnValue()) {
					int i = getCurrentPosition().getRowValue();
					int j = getCurrentPosition().getColumnValue();
					while (i > s.getRowValue() && j > s.getColumnValue()) {
						if (!(getChessBoard().getChessBoardArray()[i][j].getPiece().equals(this))
								&& !(getChessBoard().getChessBoardArray()[i][j].getPiece().getIdentity()
										.equals("Empty"))) {
							result = false;

						}
						i--;
						j--;
					}
				}

			} else {
				result = false;
			}

		} else {
			result = false;
		}
		return result;
	}

	protected void move(Square s) {
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
