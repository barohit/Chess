
public class Pawn extends Piece {

	public Pawn(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	final String identity = "Pawn";

	public String getIdentity() {
		return identity;
	}

	protected boolean canMove(Square s) { /* this method doesn't use the can capture method like every other
		 piece because the pawns move and capture differently */
		boolean result = false;
		if (s.getColumnValue() == this.getCurrentPosition().getColumnValue()) {
			if (getColor().equals("white")) { // the actual row is dependent upon piece color
				if (getCurrentPosition().getRowValue() == 1 && s.getRowValue() == 3) {
					// above checks to see if the piece is on the starting row
					if (getChessBoard().getChessBoardArray()[2][getCurrentPosition().getColumnValue()].getPiece()
							.getIdentity().equals("Empty")
							&& getChessBoard().getChessBoardArray()[3][getCurrentPosition().getColumnValue()].getPiece()
									.getIdentity().equals("Empty")) {
						ChessBoard temp = new ChessBoard();
						temp = chessBoard;
						Square returnPosition = getCurrentPosition();
						Piece tempPiece = s.getPiece();
						temp.getChessBoardArray()[s.getRowValue()][s.getColumnValue()].setPiece(this);
						temp.getChessBoardArray()[getCurrentPosition().getRowValue()][getCurrentPosition()
								.getColumnValue()].setEmptyPiece(); 
						if (temp.kingInCheck(getColor(), temp) == false) {
							result = true;
						} // above several lines checks to see if moving the pawn places the king in check
						getChessBoard().getChessBoardArray()[returnPosition.getRowValue()][returnPosition
								.getColumnValue()].setPiece(this);
						getChessBoard().getChessBoardArray()[s.getRowValue()][s.getColumnValue()].setPiece(tempPiece);
					}
				} else if (s.getRowValue() - 1 == getCurrentPosition().getRowValue()
						&& s.getPiece().getIdentity().equals("Empty")) {// now we are seeing if the move input is only one square away
					ChessBoard temp = new ChessBoard();
					temp = chessBoard;
					Square returnPosition = getCurrentPosition();
					Piece tempPiece = s.getPiece();
					temp.getChessBoardArray()[s.getRowValue()][s.getColumnValue()].setPiece(this);
					temp.getChessBoardArray()[getCurrentPosition().getRowValue()][getCurrentPosition().getColumnValue()]
							.setEmptyPiece();
					if (temp.kingInCheck(getColor(), temp) == false) {
						result = true;
					}
					getChessBoard().getChessBoardArray()[returnPosition.getRowValue()][returnPosition.getColumnValue()]
							.setPiece(this);
					getChessBoard().getChessBoardArray()[s.getRowValue()][s.getColumnValue()].setPiece(tempPiece);
				}
			} else if (getColor().equals("black")) { // same logic but opposite color
				if (getCurrentPosition().getRowValue() == 6 && s.getRowValue() == 4) {
					if (getChessBoard().getChessBoardArray()[5][getCurrentPosition().getColumnValue()].getPiece()
							.getIdentity().equals("Empty")
							&& getChessBoard().getChessBoardArray()[4][getCurrentPosition().getColumnValue()].getPiece()
									.getIdentity().equals("Empty")) {
						ChessBoard temp = new ChessBoard();
						temp = chessBoard;
						Square returnPosition = getCurrentPosition();
						Piece tempPiece = s.getPiece();
						temp.getChessBoardArray()[s.getRowValue()][s.getColumnValue()].setPiece(this);
						temp.getChessBoardArray()[getCurrentPosition().getRowValue()][getCurrentPosition()
								.getColumnValue()].setEmptyPiece();
						if (temp.kingInCheck(getColor(), temp) == false) {
							result = true;
						}
						getChessBoard().getChessBoardArray()[returnPosition.getRowValue()][returnPosition
								.getColumnValue()].setPiece(this);
						getChessBoard().getChessBoardArray()[s.getRowValue()][s.getColumnValue()].setPiece(tempPiece);
					}
				} else if (s.getRowValue() + 1 == getCurrentPosition().getRowValue()
						&& s.getPiece().getIdentity().equals("Empty")) {
					ChessBoard temp = new ChessBoard();
					temp = chessBoard;
					Square returnPosition = getCurrentPosition();
					Piece tempPiece = s.getPiece();
					temp.getChessBoardArray()[s.getRowValue()][s.getColumnValue()].setPiece(this);
					temp.getChessBoardArray()[getCurrentPosition().getRowValue()][getCurrentPosition().getColumnValue()]
							.setEmptyPiece();
					if (temp.kingInCheck(getColor(), temp) == false) {
						result = true;
					}
					getChessBoard().getChessBoardArray()[returnPosition.getRowValue()][returnPosition.getColumnValue()]
							.setPiece(this);
					getChessBoard().getChessBoardArray()[s.getRowValue()][s.getColumnValue()].setPiece(tempPiece);
				}
			}
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

	protected void capture(Square enemyPosition) { // this required a separate method because of the difference
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

	protected boolean canCapture(Square s) { // decides whether or not pawn can capture, distinct from movement. 
		boolean result = false;
		if (getChessBoard().oppositeColor(this, s.getPiece())) {
			if (getColor().equals("white") && (s.getRowValue() - 1 == getCurrentPosition().getRowValue()
					&& Math.abs(s.getColumnValue() - getCurrentPosition().getColumnValue()) == 1)) {
				result = true;
			} else if ((getColor().equals("black") && getChessBoard().oppositeColor(this, s.getPiece()))
					&& (s.getRowValue() + 1 == getCurrentPosition().getRowValue()
							&& Math.abs(s.getColumnValue() - getCurrentPosition().getColumnValue()) == 1)) {

				result = true;

			}
		}
		return result;
	}
}
