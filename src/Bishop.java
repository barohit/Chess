
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
		if (canCapture(s) == false) { // simplifies the evaluation process
			result = false;
		} else {
			//  next three statements needed to reset board after evaluation 
			ChessBoard temp = getChessBoard();
			Square returnPosition = getCurrentPosition();
			Piece tempPiece = s.getPiece(); 
			
			
			temp.getChessBoardArray()[s.getRowValue()][s.getColumnValue()].setPiece(this);
			temp.getChessBoardArray()[returnPosition.getRowValue()][returnPosition.getColumnValue()].setEmptyPiece();
			if (getChessBoard().kingInCheck(getColor(), temp) == false) { // makes sure moving doesn't put King in check
				getChessBoard().getChessBoardArray()[returnPosition.getRowValue()][returnPosition.getColumnValue()]
						.setPiece(this);
				getChessBoard().getChessBoardArray()[s.getRowValue()][s.getColumnValue()].setPiece(tempPiece);
				// above two statements reset the board 
			} else {
				result = false;
			}
			// next two statements reset the board in the event that the else clause executes
			getChessBoard().getChessBoardArray()[returnPosition.getRowValue()][returnPosition.getColumnValue()]
					.setPiece(this);
			getChessBoard().getChessBoardArray()[s.getRowValue()][s.getColumnValue()].setPiece(tempPiece);
		}
		return result;
	}

	protected boolean canCapture(Square s) {
		boolean result = true;
		if (getChessBoard().oppositeColor(s.getPiece(), this) == true) { 
			// opposite color will return true in the event of an empty piece

			if (Math.abs(s.getRowValue() - getCurrentPosition().getRowValue()) == Math
					.abs(s.getColumnValue() - getCurrentPosition().getColumnValue())) {
				/* above if statement is needed to make sure square is actually on a diagonal
				 next four blocks of if statements will see if the piece is diagonally above
				 and to the right, diagonally above and to the left, diagonally below and to 
				 the right, or diagonally below and to the left */
				if (s.getRowValue() > getCurrentPosition().getRowValue()
						&& s.getColumnValue() > getCurrentPosition().getColumnValue()) {
					/* rest of the logic will see if every square on the diagnol in between
					 is actually empty, same for all four */
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

	protected void move(Square s) { /* all of the conditional logic is set above. The changing of squares is
		 self-explanatory */
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
