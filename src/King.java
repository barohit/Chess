
public class King extends Piece {

	public King(String color) {
		super(color);
	}

	final String identity = "King";

	public String getIdentity() {
		return identity;
	}

	public boolean canMove(Square s) {
		boolean result = false;
		if (Math.abs(s.getRowValue() - getCurrentPosition().getRowValue()) == 1
				&& Math.abs(s.getColumnValue() - getCurrentPosition().getColumnValue()) == 1) {
			if (s.getChessBoard().oppositeColor(s.getPiece(), this) == true) {
				ChessBoard temp = getChessBoard();
				Square returnPosition = getCurrentPosition();
				temp.getChessBoardArray()[s.getRowValue()][s.getColumnValue()].setPiece(this);
				temp.getChessBoardArray()[returnPosition.getRowValue()][returnPosition.getColumnValue()].setPiece(null);
				if (getChessBoard().kingInCheck(getColor(), temp) == false) {
					result = true;
				}
				temp.getChessBoardArray()[returnPosition.getRowValue()][returnPosition.getColumnValue()].setPiece(this);
				temp.getChessBoardArray()[s.getRowValue()][s.getColumnValue()].setPiece(null);
			}
		}
		return result;
	}

	public boolean canCapture(Square s) {
		boolean result = false;
		if (Math.abs(s.getRowValue() - getCurrentPosition().getRowValue()) == 1
				&& Math.abs(s.getColumnValue() - getCurrentPosition().getColumnValue()) == 1) {
			if (s.getChessBoard().oppositeColor(s.getPiece(), this) == true) {
				ChessBoard temp = getChessBoard();
				Square returnPosition = getCurrentPosition();
				temp.getChessBoardArray()[s.getRowValue()][s.getColumnValue()].setPiece(this);
				temp.getChessBoardArray()[returnPosition.getRowValue()][returnPosition.getColumnValue()].setPiece(null);
				if (getChessBoard().kingInCheck(getColor(), temp) == false) {
					result = true;
				}
				temp.getChessBoardArray()[returnPosition.getRowValue()][returnPosition.getColumnValue()].setPiece(this);
				temp.getChessBoardArray()[s.getRowValue()][s.getColumnValue()].setPiece(null);
			}
		}
		return result;
	}

	public void move(Square s) {
		if (canMove(s) == true) {
			Square temp = getCurrentPosition();
			getChessBoard().getChessBoardArray()[s.getRowValue()][s.getColumnValue()].setPiece(this);
			temp.setPiece(null);

		}
	}
}
