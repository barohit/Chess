public class Rook extends Piece {

	public Rook(String color) {
		super(color);
	}

	final String identity = "Rook";

	public String getIdentity() {
		return identity;
	}

	protected boolean canMove(Square s) {
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

				if (s.getColumnValue() == getCurrentPosition().getColumnValue()) {
					if (s.getRowValue() > getCurrentPosition().getRowValue()) {
						int i = getCurrentPosition().getRowValue();
						while (i < s.getRowValue()) {
							if (!(getChessBoard().getChessBoardArray()[getCurrentPosition().getRowValue()][i].getPiece()
									.equals(this))
									&& !(getChessBoard().getChessBoardArray()[getCurrentPosition().getRowValue()][i]
											.getPiece().equals(null))) {
								result = false;
							}
							i++;
						}
					}

					if (s.getRowValue() < getCurrentPosition().getRowValue()) {
						int i = getCurrentPosition().getRowValue();
						while (i > s.getRowValue()) {
							if (!(getChessBoard().getChessBoardArray()[getCurrentPosition().getRowValue()][i].getPiece()
									.equals(this))
									&& !(getChessBoard().getChessBoardArray()[getCurrentPosition().getRowValue()][i]
											.getPiece().equals(null))) {
								result = false;
							}
							i--;
						}
					}
				}

				if (s.getRowValue() == getCurrentPosition().getRowValue()) {
					if (s.getColumnValue() > getCurrentPosition().getColumnValue()) {
						int i = getCurrentPosition().getColumnValue();
						while (i < s.getRowValue()) {
							if (!(getChessBoard().getChessBoardArray()[i][getCurrentPosition().getColumnValue()]
									.getPiece().equals(this))
									&& !(getChessBoard().getChessBoardArray()[i][getCurrentPosition().getColumnValue()]
											.getPiece().equals(null))) {
								result = false;
							}
							i++;
						}
					}

					if (s.getColumnValue() < getCurrentPosition().getColumnValue()) {
						int i = getCurrentPosition().getRowValue();
						while (i > s.getRowValue()) {
							if (!(getChessBoard().getChessBoardArray()[i][getCurrentPosition().getColumnValue()]
									.getPiece().equals(this))
									&& !(getChessBoard().getChessBoardArray()[i][getCurrentPosition().getColumnValue()]
											.getPiece().equals(null))) {
								result = false;
							}
							i--;
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
			if (s.getColumnValue() == getCurrentPosition().getColumnValue()) {
				if (s.getRowValue() > getCurrentPosition().getRowValue()) {
					int i = getCurrentPosition().getRowValue();
					while (i < s.getRowValue()) {
						if (!(getChessBoard().getChessBoardArray()[getCurrentPosition().getRowValue()][i].getPiece()
								.equals(this))
								&& !(getChessBoard().getChessBoardArray()[getCurrentPosition().getRowValue()][i]
										.getPiece().equals(null))) {
							result = false;
						}
						i++;
					}
				}

				if (s.getRowValue() < getCurrentPosition().getRowValue()) {
					int i = getCurrentPosition().getRowValue();
					while (i > s.getRowValue()) {
						if (!(getChessBoard().getChessBoardArray()[getCurrentPosition().getRowValue()][i].getPiece()
								.equals(this))
								&& !(getChessBoard().getChessBoardArray()[getCurrentPosition().getRowValue()][i]
										.getPiece().equals(null))) {
							result = false;
						}
						i--;
					}
				}
			}

			else if (s.getRowValue() == getCurrentPosition().getRowValue()) {
				if (s.getColumnValue() > getCurrentPosition().getColumnValue()) {
					int i = getCurrentPosition().getColumnValue();
					while (i < s.getRowValue()) {
						if (!(getChessBoard().getChessBoardArray()[i][getCurrentPosition().getColumnValue()].getPiece()
								.equals(this))
								&& !(getChessBoard().getChessBoardArray()[i][getCurrentPosition().getColumnValue()]
										.getPiece().equals(null))) {
							result = false;
						}
						i++;
					}
				}

				if (s.getColumnValue() < getCurrentPosition().getColumnValue()) {
					int i = getCurrentPosition().getRowValue();
					while (i > s.getRowValue()) {
						if (!(getChessBoard().getChessBoardArray()[i][getCurrentPosition().getColumnValue()].getPiece()
								.equals(this))
								&& !(getChessBoard().getChessBoardArray()[i][getCurrentPosition().getColumnValue()]
										.getPiece().equals(null))) {
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
			Square tempPosition = getCurrentPosition();
			s.setPiece(this);
			tempPosition.setPiece(null);
		}
	}
}
