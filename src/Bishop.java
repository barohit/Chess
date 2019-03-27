
public class Bishop extends Piece {

	public Bishop(String color) {
		super(color);
	}

	final String identity = "Bishop";

	public String getIdentity() {
		return identity;
	}

	public boolean canMove(Square s) {
		boolean result = true;
		if (getChessBoard().oppositeColor(s.getPiece(), this) == true) {
			ChessBoard temp = getChessBoard();
			Square returnPosition = getCurrentPosition();
			Piece tempPiece = s.getPiece();
			temp.getChessBoardArray()[s.getRowValue()][s.getColumnValue()].setPiece(this);
			temp.getChessBoardArray()[returnPosition.getRowValue()][returnPosition.getColumnValue()].setPiece(null);
			if (getChessBoard().kingInCheck(getColor(), temp) == false) {
				getChessBoard().getChessBoardArray()[returnPosition.getRowValue()][returnPosition.getColumnValue()]
						.setPiece(this);
				getChessBoard().getChessBoardArray()[s.getRowValue()][s.getColumnValue()].setPiece(tempPiece);

				if (Math.abs(s.getRowValue() - getCurrentPosition().getRowValue()) == Math
						.abs(s.getColumnValue() - getCurrentPosition().getColumnValue())) {
					if (s.getRowValue() > getCurrentPosition().getRowValue()
							&& s.getColumnValue() > getCurrentPosition().getColumnValue()) {
						int i = 0;
						while (getCurrentPosition().getRowValue() < s.getRowValue()
								&& getCurrentPosition().getColumnValue() < s.getColumnValue()) {
							if (!(getChessBoard().getChessBoardArray()[getCurrentPosition().getRowValue()
									+ i][getCurrentPosition().getColumnValue() + i].getPiece().equals(this)
									&& !(getChessBoard().getChessBoardArray()[getCurrentPosition().getRowValue()
											+ i][getCurrentPosition().getColumnValue() + i].getPiece().equals(null)))) {
								result = false;

							}
							i++;
						}
					}

					if (s.getRowValue() > getCurrentPosition().getRowValue()
							&& s.getColumnValue() < getCurrentPosition().getColumnValue()) {
						int i = 0;
						while (getCurrentPosition().getRowValue() < s.getRowValue()
								&& getCurrentPosition().getColumnValue() > s.getColumnValue()) {
							if (!(getChessBoard().getChessBoardArray()[getCurrentPosition().getRowValue()
									+ i][getCurrentPosition().getColumnValue() - i].getPiece().equals(this)
									&& !(getChessBoard().getChessBoardArray()[getCurrentPosition().getRowValue()
											+ i][getCurrentPosition().getColumnValue() - i].getPiece().equals(null)))) {
								result = false;

							}
							i++;
						}
					}

					if (s.getRowValue() < getCurrentPosition().getRowValue()
							&& s.getColumnValue() > getCurrentPosition().getColumnValue()) {
						int i = 0;
						while (getCurrentPosition().getRowValue() > s.getRowValue()
								&& getCurrentPosition().getColumnValue() < s.getColumnValue()) {
							if (!(getChessBoard().getChessBoardArray()[getCurrentPosition().getRowValue()
									- i][getCurrentPosition().getColumnValue() + i].getPiece().equals(this)
									&& !(getChessBoard().getChessBoardArray()[getCurrentPosition().getRowValue()
											- i][getCurrentPosition().getColumnValue() + i].getPiece().equals(null)))) {
								result = false;

							}
							i++;
						}
					}

					if (s.getRowValue() < getCurrentPosition().getRowValue()
							&& s.getColumnValue() < getCurrentPosition().getColumnValue()) {
						int i = 0;
						while (getCurrentPosition().getRowValue() > s.getRowValue()
								&& getCurrentPosition().getColumnValue() > s.getColumnValue()) {
							if (!(getChessBoard().getChessBoardArray()[getCurrentPosition().getRowValue()
									- i][getCurrentPosition().getColumnValue() - i].getPiece().equals(this)
									&& !(getChessBoard().getChessBoardArray()[getCurrentPosition().getRowValue()
											+ i][getCurrentPosition().getColumnValue() + i].getPiece().equals(null)))) {
								result = false;

							}
							i++;
						}
					}

				}

			} else
				result = false;
			getChessBoard().getChessBoardArray()[returnPosition.getRowValue()][returnPosition.getColumnValue()]
					.setPiece(this);
			getChessBoard().getChessBoardArray()[s.getRowValue()][s.getColumnValue()].setPiece(tempPiece);

		} else
			result = false;
		return result;
	}

	protected boolean canCapture(Square s) {
		boolean result = true;
		if (getChessBoard().oppositeColor(s.getPiece(), this) == true) {

			if (Math.abs(s.getRowValue() - getCurrentPosition().getRowValue()) == Math
					.abs(s.getColumnValue() - getCurrentPosition().getColumnValue())) {
				if (s.getRowValue() > getCurrentPosition().getRowValue()
						&& s.getColumnValue() > getCurrentPosition().getColumnValue()) {
					int i = 0;
					while (getCurrentPosition().getRowValue() < s.getRowValue()
							&& getCurrentPosition().getColumnValue() < s.getColumnValue()) {
						if (!(getChessBoard().getChessBoardArray()[getCurrentPosition().getRowValue()
								+ i][getCurrentPosition().getColumnValue() + i].getPiece().equals(this)
								&& !(getChessBoard().getChessBoardArray()[getCurrentPosition().getRowValue()
										+ i][getCurrentPosition().getColumnValue() + i].getPiece().equals(null)))) {
							result = false;

						}
						i++;
					}
				}

				if (s.getRowValue() > getCurrentPosition().getRowValue()
						&& s.getColumnValue() < getCurrentPosition().getColumnValue()) {
					int i = 0;
					while (getCurrentPosition().getRowValue() < s.getRowValue()
							&& getCurrentPosition().getColumnValue() > s.getColumnValue()) {
						if (!(getChessBoard().getChessBoardArray()[getCurrentPosition().getRowValue()
								+ i][getCurrentPosition().getColumnValue() - i].getPiece().equals(this)
								&& !(getChessBoard().getChessBoardArray()[getCurrentPosition().getRowValue()
										+ i][getCurrentPosition().getColumnValue() - i].getPiece().equals(null)))) {
							result = false;

						}
						i++;
					}
				}

				if (s.getRowValue() < getCurrentPosition().getRowValue()
						&& s.getColumnValue() > getCurrentPosition().getColumnValue()) {
					int i = 0;
					while (getCurrentPosition().getRowValue() > s.getRowValue()
							&& getCurrentPosition().getColumnValue() < s.getColumnValue()) {
						if (!(getChessBoard().getChessBoardArray()[getCurrentPosition().getRowValue()
								- i][getCurrentPosition().getColumnValue() + i].getPiece().equals(this)
								&& !(getChessBoard().getChessBoardArray()[getCurrentPosition().getRowValue()
										- i][getCurrentPosition().getColumnValue() + i].getPiece().equals(null)))) {
							result = false;

						}
						i++;
					}
				}

				if (s.getRowValue() < getCurrentPosition().getRowValue()
						&& s.getColumnValue() < getCurrentPosition().getColumnValue()) {
					int i = 0;
					while (getCurrentPosition().getRowValue() > s.getRowValue()
							&& getCurrentPosition().getColumnValue() > s.getColumnValue()) {
						if (!(getChessBoard().getChessBoardArray()[getCurrentPosition().getRowValue()
								- i][getCurrentPosition().getColumnValue() - i].getPiece().equals(this)
								&& !(getChessBoard().getChessBoardArray()[getCurrentPosition().getRowValue()
										+ i][getCurrentPosition().getColumnValue() + i].getPiece().equals(null)))) {
							result = false;

						}
						i++;
					}
				}

			} else {
				result = false;
			}

		} else
			result = false;
		return result;
	}

	protected void move(Square s) {
		if (canMove(s) == true) {
			Square tempPosition = getCurrentPosition();
			s.setPiece(this);
			tempPosition.setPiece(null);
		}
	}
}
