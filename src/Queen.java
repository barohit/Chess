
public class Queen extends Piece {

	public Queen(String color) {
		super(color);
	}

	final String identity = "Queen";

	public String getIdentity() {
		return identity;
	}

	protected boolean canMove(Square s) { // same as all other pieces
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

	public boolean canCapture(Square s) { // essentially a combination of the rook and bishop's logic. 

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

			} else if (s.getColumnValue() == getCurrentPosition().getColumnValue()) {
				if (s.getRowValue() > getCurrentPosition().getRowValue()) {
					int i = getCurrentPosition().getRowValue();
					while (i < s.getRowValue()) {
						if (!(getChessBoard().getChessBoardArray()[i][getCurrentPosition().getColumnValue()].getPiece()
								.equals(this))
								&& !(getChessBoard().getChessBoardArray()[i][getCurrentPosition().getColumnValue()]
										.getPiece().getIdentity().equals("Empty"))) {
							result = false;
						}
						i++;
					}
				}

				if (s.getRowValue() < getCurrentPosition().getRowValue()) {
					int i = getCurrentPosition().getRowValue();
					while (i > s.getRowValue()) {
						if (!(getChessBoard().getChessBoardArray()[i][getCurrentPosition().getColumnValue()].getPiece()
								.equals(this))
								&& !(getChessBoard().getChessBoardArray()[i][getCurrentPosition().getRowValue()]
										.getPiece().getIdentity().equals("Empty"))) {
							result = false;
						}
						i--;
					}
				}
			}

			else if (s.getRowValue() == getCurrentPosition().getRowValue()) {
				if (s.getColumnValue() > getCurrentPosition().getColumnValue()) {
					int i = getCurrentPosition().getColumnValue();
					while (i < s.getColumnValue()) {
						if (!(getChessBoard().getChessBoardArray()[getCurrentPosition().getRowValue()][i].getPiece()
								.equals(this))
								&& !(getChessBoard().getChessBoardArray()[getCurrentPosition().getRowValue()][i]
										.getPiece().getIdentity().equals("Empty"))) {
							result = false;
						}
						i++;
					}
				}

				if (s.getColumnValue() < getCurrentPosition().getColumnValue()) {
					int i = getCurrentPosition().getColumnValue();
					while (i > s.getRowValue()) {
						if (!(getChessBoard().getChessBoardArray()[getCurrentPosition().getRowValue()][i].getPiece()
								.equals(this))
								&& !(getChessBoard().getChessBoardArray()[getCurrentPosition().getColumnValue()][i]
										.getPiece().getIdentity().equals("Empty"))) {
							result = false;
						}
						i--;
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
