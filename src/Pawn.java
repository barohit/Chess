
public class Pawn extends Piece {

	public Pawn(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	final String identity = "Pawn";

	public String getIdentity() {
		return identity;
	}

	protected boolean canMove(Square enemyPosition) {
		boolean result = false;
		if ((getColor().equals("white")
				&& getChessBoard().getChessBoardArray()[getCurrentPosition().getRowValue() + 1][getCurrentPosition()
						.getColumnValue()].getRowValue() <= 7)
				&& getChessBoard().getChessBoardArray()[getCurrentPosition().getRowValue() + 1][getCurrentPosition()
						.getColumnValue()].getPiece().equals(null)) {
			ChessBoard temp = new ChessBoard();
			temp = chessBoard;
			temp.getChessBoardArray()[getCurrentPosition().getRowValue()][getCurrentPosition().getColumnValue()]
					.setPiece(null);
			if (temp.kingInCheck(getColor(), temp) == false) {
				result = true;
			}

		} else {
			if (getColor().equals("white") && getChessBoard().oppositeColor(this, enemyPosition.getPiece())
					&& (enemyPosition.getRowValue() - 1 == getCurrentPosition().getRowValue()
							&& Math.abs(enemyPosition.getColumnValue() - 1) == getCurrentPosition().getColumnValue())) {
				ChessBoard temp = chessBoard;
				temp.getChessBoardArray()[getCurrentPosition().getRowValue()][getCurrentPosition().getColumnValue()]
						.setPiece(null);
				if (temp.kingInCheck(getColor(), temp) == false) {
					result = true;
				}
			}

			else if (getColor().equals("black") && getChessBoard().oppositeColor(this, enemyPosition.getPiece())
					&& (enemyPosition.getRowValue() + 1 == getCurrentPosition().getRowValue()
							&& Math.abs(enemyPosition.getColumnValue() - 1) == getCurrentPosition().getColumnValue())) {
				ChessBoard temp2 = chessBoard;
				temp2.getChessBoardArray()[getCurrentPosition().getRowValue()][getCurrentPosition().getColumnValue()]
						.setPiece(null);
				if (temp2.kingInCheck(getColor(), temp2) == false) {
					result = true;
				}
			}
		}
		return result;
	}

	protected void moveTwo() {
		if ((getColor().equals("white") && (getCurrentPosition().getRow() == 2))) {

			// these two lines update the current position's row value.
			if (getChessBoard().getChessBoardArray()[getCurrentPosition().getRowValue() + 2][getCurrentPosition()
					.getColumnValue()].getPiece().equals(null)
					&& getChessBoard().getChessBoardArray()[getCurrentPosition().getRowValue() + 1][getCurrentPosition()
							.getColumnValue()].getPiece().equals(null)) {

				getChessBoard().getChessBoardArray()[getCurrentPosition().getRowValue() + 2][currentPosition
						.getColumnValue()].setPiece(this);
				getChessBoard().getChessBoardArray()[currentPosition.getRowValue() - 2][currentPosition
						.getColumnValue()].setPiece(null);
			}
		} else if ((getColor().equals("black") && (getCurrentPosition().getRow() == 7))) {

			if (getChessBoard().getChessBoardArray()[getCurrentPosition().getRowValue() - 2][getCurrentPosition()
					.getColumnValue()].getPiece().equals(null)
					&& getChessBoard().getChessBoardArray()[getCurrentPosition().getRowValue() - 1][getCurrentPosition()
							.getColumnValue()].getPiece().equals(null)) {

				getChessBoard().getChessBoardArray()[getCurrentPosition().getRowValue() - 2][getCurrentPosition()
						.getColumnValue()].setPiece(this);
				getChessBoard().getChessBoardArray()[currentPosition.getRowValue() + 2][currentPosition
						.getColumnValue()].setPiece(null);
			}
		}
	}

	protected void moveOne() {
		if ((getColor().equals("white"))) {
			if (getChessBoard().getChessBoardArray()[getCurrentPosition().getRowValue() + 1][getCurrentPosition()
					.getColumnValue()].getPiece().equals(null)) {
				getChessBoard().getChessBoardArray()[getCurrentPosition().getRowValue() + 1][getCurrentPosition()
						.getColumnValue()].setPiece(this);
				getChessBoard().getChessBoardArray()[getCurrentPosition().getRowValue() - 1][getCurrentPosition()
						.getColumnValue()].setPiece(null);
			}
		}

		else if ((getColor().equals("black"))) {
			/*
			 * next two lines move change the piece of the end square to this pawn, and that
			 * of the old square to empty
			 */
			if (getChessBoard().getChessBoardArray()[getCurrentPosition().getRowValue() - 1][getCurrentPosition()
					.getColumnValue()].getPiece().equals(null)) {
				this.getChessBoard().getChessBoardArray()[currentPosition.getRowValue() - 1][currentPosition
						.getColumnValue()].currentPiece = this;
				this.getChessBoard().getChessBoardArray()[currentPosition.getRowValue() + 1][currentPosition
						.getColumnValue()].currentPiece = null;
			}
		}
	}

	protected void capture(Square enemyPosition) {
		ChessBoard temp = chessBoard;
		temp.getChessBoardArray()[getCurrentPosition().getRowValue()][getCurrentPosition().getColumnValue()]
				.setPiece(null);

		if (getChessBoard().kingInCheck(getColor(), temp) == false) {
			if (getColor().equals("white") && getChessBoard().oppositeColor(this, enemyPosition.getPiece())
					&& (enemyPosition.getRowValue() - 1 == getCurrentPosition().getRowValue()
							&& Math.abs(enemyPosition.getColumnValue() - 1) == getCurrentPosition().getColumnValue())) {

				Square temp2 = getCurrentPosition();
				getChessBoard().getChessBoardArray()[enemyPosition.getRowValue()][enemyPosition.getColumnValue()]
						.setPiece(this);
				getChessBoard().getChessBoardArray()[(temp2.getRowValue())][temp2.getColumnValue()].setPiece(null);

			}

			if (getColor().equals("black") && getChessBoard().oppositeColor(this, enemyPosition.getPiece())
					&& (enemyPosition.getRowValue() + 1 == getCurrentPosition().getRowValue()
							&& Math.abs(enemyPosition.getColumnValue() - 1) == getCurrentPosition().getColumnValue())) {

				Square temp2 = getCurrentPosition();
				getChessBoard().getChessBoardArray()[enemyPosition.getRowValue()][enemyPosition.getColumnValue()]
						.setPiece(this);
				getChessBoard().getChessBoardArray()[(temp2.getRowValue())][temp2.getColumnValue()].setPiece(null);

			}
		}

	}

	protected boolean canCapture(Square enemyPosition) {
		boolean result = false;
		if (getColor().equals("white") && getChessBoard().oppositeColor(this, enemyPosition.getPiece())
				&& (enemyPosition.getRowValue() - 1 == getCurrentPosition().getRowValue()
						&& Math.abs(enemyPosition.getColumnValue() - 1) == getCurrentPosition().getColumnValue())) {
			result = true;

		}

		else if (getColor().equals("black") && getChessBoard().oppositeColor(this, enemyPosition.getPiece())
				&& (enemyPosition.getRowValue() + 1 == getCurrentPosition().getRowValue()
						&& Math.abs(enemyPosition.getColumnValue() - 1) == getCurrentPosition().getColumnValue())) {

			result = true;

		}
		return result;
	}

}
